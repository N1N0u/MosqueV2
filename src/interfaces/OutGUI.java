package interfaces;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Locale;
import java.util.Vector;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.Timer;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Toaster.Toaster;
import Utils.TextFieldUsername;
import classes.Incomes;
import classes.OutCome;
import crud.IncomeCrud;
import crud.OutcomeCrud;
import table.Table;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;


public class OutGUI extends javax.swing.JPanel {
	OutcomeCrud oc;
	OutCome otc;
	Toaster toaster;
	
    Date date=new Date(System.currentTimeMillis());
    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd EEEE",Locale.getDefault());
    DateTimeFormatter dtfArabic = DateTimeFormatter.ofPattern("EEEE yyyy/MM/dd", Locale.FRANCE).localizedBy(new Locale("ar"));
      SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
      JLabel timeLabel;
    // Change the ZoneId as per your requirement e.g. ZoneId.of("Asia/Dubai")
    LocalDate date2 = LocalDate.now(ZoneId.systemDefault());
    String da2=date2.format(dtfArabic);
    
    String da=sdf.format(date);
    private Table table;
    private TextFieldUsername nom;
    private TextFieldUsername prenom;
    private TextFieldUsername mon;
    public OutGUI() throws SQLException {

     
        setOpaque(false);
        setLayout(new BorderLayout(0, 0));
        
        JPanel panel = new JPanel();
        add(panel, BorderLayout.SOUTH);
        panel.setLayout(new GridLayout(0, 3, 0, 0));
        
         timeLabel = new JLabel(" ");
      
        timeLabel.setFont(new Font("Sakkal Majalla", Font.BOLD, 26));
        timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(timeLabel);
     
        
        JLabel lblNewLabel_1 = new JLabel(" صمم من قبل:");
        lblNewLabel_1.setFont(new Font("Sakkal Majalla", Font.BOLD, 26));
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(lblNewLabel_1);
        
        JLabel lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setText("يوم: "+ da2);
        lblNewLabel_2.setFont(new Font("Sakkal Majalla", Font.BOLD, 26));
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(lblNewLabel_2);
        
        JPanel panel_1 = new JPanel();
        add(panel_1, BorderLayout.CENTER);
        
        JPanel panel_2 = new JPanel();
        panel_2.setBackground(new Color(0, 0, 128));
        
        JPanel panel_3 = new JPanel();
        panel_3.setBackground(new Color(0, 255, 0));
        GroupLayout gl_panel_1 = new GroupLayout(panel_1);
        gl_panel_1.setHorizontalGroup(
        	gl_panel_1.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panel_1.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
        			.addGap(20))
        );
        gl_panel_1.setVerticalGroup(
        	gl_panel_1.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panel_1.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
        				.addComponent(panel_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(panel_3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE))
        			.addGap(28))
        );
        panel_3.setLayout(new BorderLayout(0, 0));
        
        JPanel panel_5 = new JPanel();
        panel_3.add(panel_5, BorderLayout.NORTH);
        
        JLabel lblNewLabel_3 = new JLabel("إخراج جديد");
        lblNewLabel_3.setFont(new Font("Sakkal Majalla", Font.BOLD, 26));
        panel_5.add(lblNewLabel_3);
        
        JPanel panel_6 = new JPanel();
        panel_3.add(panel_6, BorderLayout.CENTER);
        panel_6.setLayout(new GridLayout(7, 0, 0, 0));
        
        JLabel lblNewLabel_4 = new JLabel("اللقب");
        lblNewLabel_4.setFont(new Font("Sakkal Majalla", Font.BOLD, 26));
        lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
        panel_6.add(lblNewLabel_4);
        
        nom = new TextFieldUsername();
        nom.setHorizontalAlignment(SwingConstants.CENTER);
        nom.setFont(new Font("Sakkal Majalla", Font.BOLD, 26));
        panel_6.add(nom);
        nom.setColumns(10);
        
        JLabel lblNewLabel_5 = new JLabel("الاسم");
        lblNewLabel_5.setFont(new Font("Sakkal Majalla", Font.BOLD, 26));
        lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
        panel_6.add(lblNewLabel_5);
        
        prenom = new TextFieldUsername();
        prenom.setHorizontalAlignment(SwingConstants.CENTER);
        prenom.setFont(new Font("Sakkal Majalla", Font.BOLD, 26));
        panel_6.add(prenom);
        prenom.setColumns(10);
        
        JLabel lblNewLabel_6 = new JLabel("المبلغ");
        lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_6.setFont(new Font("Sakkal Majalla", Font.BOLD, 26));
        panel_6.add(lblNewLabel_6);
        
        mon = new TextFieldUsername();
        mon.setHorizontalAlignment(SwingConstants.CENTER);
        mon.setFont(new Font("Sakkal Majalla", Font.BOLD, 26));
        panel_6.add(mon);
        mon.setColumns(10);
        
        JButton btnNewButton = new JButton("تأكيد");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		String n=nom.getText();
        		String p=prenom.getText();
        		String m=mon.getText();
        		
        		if(n.equals("") || p.equals("") || m.equals(""))
        		{
        			toaster=new Toaster(panel_5);
        			toaster.warn("الرجاء إدخال كافة المعلومات");
        		}
        		else if(!isNumeric(m))
        		{
        			toaster=new Toaster(panel_5);
        			toaster.warn("الرجاء التحقق من المبلغ");
        		}
        		else 
        		{
        			otc=new OutCome();
        			otc.setMontant(m);
        			otc.setNomS(n);
        			otc.setPrenomS(p);
        			Date date=new Date(System.currentTimeMillis());
        			SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy/MM/dd");
        			String datString=simpleDateFormat.format(date);
        			otc.setDateS(datString);
        			oc=new OutcomeCrud();
        			try {
						oc.AddOutcome(otc);
						nom.setText("");
						prenom.setText("");
						mon.setText("");
						UpdateTable();
					} catch (ClassNotFoundException | SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
        	}
        });
        btnNewButton.setFont(new Font("Sakkal Majalla", Font.BOLD, 26));
        panel_6.add(btnNewButton);
        panel_2.setLayout(new BorderLayout(0, 0));
        
        JPanel panel_4 = new JPanel();
        panel_2.add(panel_4, BorderLayout.NORTH);
        
        JLabel lblNewLabel = new JLabel("قائمة المخرجات");
        lblNewLabel.setFont(new Font("Sakkal Majalla", Font.BOLD, 26));
        panel_4.add(lblNewLabel);
        
        table = new Table();
        table.setFont(new Font("Sakkal Majalla", Font.BOLD, 26));
        table.setModel(new DefaultTableModel(
        	new Object[][] {
        	},
        	new String[] {
        		"\u0627\u0644\u0645\u0628\u0644\u063A", "\u0627\u0644\u0627\u0633\u0645", "\u0627\u0644\u0644\u0642\u0628", "\u0627\u0644\u062A\u0627\u0631\u064A\u062E", "\u0631\u0642\u0645 \u0627\u0644\u0639\u0645\u0644\u064A\u0629"
        	}
        ) {
        	Class[] columnTypes = new Class[] {
        		String.class, String.class, String.class, String.class, Integer.class
        	};
        	public Class getColumnClass(int columnIndex) {
        		return columnTypes[columnIndex];
        	}
        	boolean[] columnEditables = new boolean[] {
        		false, false, false, false, false
        	};
        	public boolean isCellEditable(int row, int column) {
        		return columnEditables[column];
        	}
        });
        panel_2.add(new JScrollPane(table), BorderLayout.CENTER);
        panel_1.setLayout(gl_panel_1);
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateTimeAndDate();
            }

			
        });
        timer.start();
        UpdateTable();
    }
    private void updateTimeAndDate() {
        // Get the current time and format it
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat timeFormatter = new SimpleDateFormat("HH:mm:ss");
        String time = timeFormatter.format(calendar.getTime());
        // Update the time and date labels
        timeLabel.setText(time);
    }
    
    public void UpdateTable() throws SQLException
    {
    	DefaultTableModel model=(DefaultTableModel) table.getModel();
    	model.setRowCount(0);
    	oc=new OutcomeCrud();
    	Vector vector=oc.getAllOutCums();
    	for(int i=0;i<vector.size();i++)
    	{
    		OutCome inc=(OutCome) vector.get(i);
    		Object[]row=new Object[]{inc.getMontant(),inc.getPrenomS(),inc.getNomS(),inc.getDateS(),inc.getIdS()};
    		model.addRow(row);
    	}
    }
    
    public boolean isNumeric(String number)
    {
    	boolean numeric = true;
        try {
            Double num = Double.parseDouble(number);
          
        } catch (NumberFormatException e) {
            numeric = false;
        }
        return numeric;
    }
}
