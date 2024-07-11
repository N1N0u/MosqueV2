package interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import com.raven.datechooser.DateChooser;

import classes.Employees;
import crud.EmployeesCrud;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UpdDelEmp extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField id;
	private JTextField name;
	private JTextField lastname;
	private JTextField birthDay;
	private JTextField occupation;
	static int row;
	private EmployeesCrud ec;
	private Employees emp;
	
	/**
	 * @wbp.nonvisual location=400,324
	 */
	private final DateChooser dateChooser = new DateChooser();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdDelEmp frame = new UpdDelEmp(row);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param selectedRow 
	 */
	public UpdDelEmp(int selectedRow) {
		this.row=selectedRow;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 381, 497);
		setVisible(true);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JButton btnNewButton = new JButton("حذف");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int idDel=Integer.valueOf(id.getText());
				ec=new EmployeesCrud();
				try {
					ec.DelEmp(idDel);
					dispose();
					EmployesGui.UpdateTable();
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Sakkal Majalla", Font.BOLD, 26));
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("تعديل");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				emp=new Employees();
				emp.setIdE(Integer.parseInt(id.getText()));
				emp.setNomE(name.getText());
				emp.setPrenomE(lastname.getText());
				emp.setDateNaisE(birthDay.getText());
				emp.setPosteE(occupation.getText());
				ec=new EmployeesCrud();
				try {
					ec.UpdateEmp(emp);
					dispose();
					EmployesGui.UpdateTable();
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton_1.setFont(new Font("Sakkal Majalla", Font.BOLD, 26));
		panel.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(10, 0, 0, 0));
		
		JLabel lblNewLabel = new JLabel("رقم التعريف");
		lblNewLabel.setFont(new Font("Sakkal Majalla", Font.BOLD, 26));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel);
		
		id = new JTextField();
		id.setEditable(false);
		id.setHorizontalAlignment(SwingConstants.CENTER);
		id.setFont(new Font("Sakkal Majalla", Font.BOLD, 26));
		panel_1.add(id);
		id.setColumns(10);
		id.setText(String.valueOf(row));
		
		JLabel lblNewLabel_1 = new JLabel("الاسم");
		lblNewLabel_1.setFont(new Font("Sakkal Majalla", Font.BOLD, 26));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_1);
		
		name = new JTextField();
		name.setHorizontalAlignment(SwingConstants.CENTER);
		name.setFont(new Font("Sakkal Majalla", Font.BOLD, 26));
		name.setColumns(10);
		panel_1.add(name);
		
		JLabel lblNewLabel_1_1 = new JLabel("اللقب");
		lblNewLabel_1_1.setFont(new Font("Sakkal Majalla", Font.BOLD, 26));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_1_1);
		
		lastname = new JTextField();
		lastname.setHorizontalAlignment(SwingConstants.CENTER);
		lastname.setFont(new Font("Sakkal Majalla", Font.BOLD, 26));
		lastname.setColumns(10);
		panel_1.add(lastname);
		
		JLabel lblNewLabel_1_2 = new JLabel("تاريخ الميلاد");
		lblNewLabel_1_2.setFont(new Font("Sakkal Majalla", Font.BOLD, 26));
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_1_2);
		
	
		birthDay = new JTextField();
		birthDay.setHorizontalAlignment(SwingConstants.CENTER);
		birthDay.setFont(new Font("Sakkal Majalla", Font.BOLD, 26));
		birthDay.setColumns(10);
		panel_1.add(birthDay);
		
		dateChooser.setTextRefernce(birthDay);
		
		JLabel lblNewLabel_1_3 = new JLabel("المنصب");
		lblNewLabel_1_3.setFont(new Font("Sakkal Majalla", Font.BOLD, 26));
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_1_3);
		
		occupation = new JTextField();
		occupation.setHorizontalAlignment(SwingConstants.CENTER);
		occupation.setFont(new Font("Sakkal Majalla", Font.BOLD, 26));
		occupation.setColumns(10);
		panel_1.add(occupation);
		try {
			Fill();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void Fill() throws SQLException
	{
		ec=new EmployeesCrud();
		emp=ec.getEmpById(row);
		name.setText(emp.getNomE());
		lastname.setText(emp.getPrenomE());
		birthDay.setText(emp.getDateNaisE());
		occupation.setText(emp.getPosteE());
		
	}

}
