package interfaces;
import Toaster.Toaster;
import Utils.*;
import classes.User;
import crud.UserCrud;

import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;

import javax.swing.*;

public class Login extends JFrame {

    private final Toaster toaster;
    private TextFieldUsername un;
    private  TextFieldPassword pw;
    public static void main(String[] args) {
        new Login();
    }

    private Login() {
        JPanel mainJPanel = getMainJPanel();

        addLogo(mainJPanel);

        addSeparator(mainJPanel);

        addUsernameTextField(mainJPanel);

        addPasswordTextField(mainJPanel);

        addLoginButton(mainJPanel);

 

        getContentPane().add(mainJPanel);
        this.pack();
        this.setVisible(true);
        this.toFront();

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(screenSize.width / 2 - getWidth() / 2, screenSize.height / 2 - getHeight() / 2);

        toaster = new Toaster(mainJPanel);
    }

    private JPanel getMainJPanel() {
      //  this.setUndecorated(true);

        Dimension size = new Dimension(800, 400);

        JPanel panel1 = new JPanel();
        panel1.setSize(size);
        panel1.setPreferredSize(size);
        panel1.setBackground(UIUtils.COLOR_BACKGROUND);
        panel1.setLayout(null);

        MouseAdapter ma = new MouseAdapter() {
            int lastX, lastY;

            @Override
            public void mousePressed(MouseEvent e) {
                lastX = e.getXOnScreen();
                lastY = e.getYOnScreen();
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                int x = e.getXOnScreen();
                int y = e.getYOnScreen();
                setLocation(getLocationOnScreen().x + x - lastX, getLocationOnScreen().y + y - lastY);
                lastX = x;
                lastY = y;
            }
        };

        panel1.addMouseListener(ma);
        panel1.addMouseMotionListener(ma);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        return panel1;
    }

    private void addSeparator(JPanel panel1) {
        JSeparator separator1 = new JSeparator();
        separator1.setOrientation(SwingConstants.VERTICAL);
        separator1.setForeground(UIUtils.COLOR_OUTLINE);
        panel1.add(separator1);
        separator1.setBounds(371, 80, 1, 240);
    }

    private void addLogo(JPanel panel1) {
        JLabel label1 = new JLabel();
        label1.setFocusable(false);
        label1.setIcon(new ImageIcon("res//mosque.jpg"));
        panel1.add(label1);
        label1.setBounds(10, 80, 351, 240);
    }

    private void addUsernameTextField(JPanel panel1) {
        un = new TextFieldUsername();
        un.setFont(new Font("Sakkal Majalla", Font.BOLD, 26));

        un.setBounds(423, 109, 250, 44);
        un.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (un.getText().equals(UIUtils.PLACEHOLDER_TEXT_USERNAME)) {
                    un.setText("");
                }
                un.setForeground(Color.white);
                un.setBorderColor(UIUtils.COLOR_INTERACTIVE);
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (un.getText().isEmpty()) {
                    un.setText(UIUtils.PLACEHOLDER_TEXT_USERNAME);
                }
                un.setForeground(UIUtils.COLOR_OUTLINE);
                un.setBorderColor(UIUtils.COLOR_OUTLINE);
            }
        });

        panel1.add(un);
    }

    private void addPasswordTextField(JPanel panel1) {
        pw = new TextFieldPassword();
        pw.setFont(new Font("Sakkal Majalla", Font.BOLD, 26));

        pw.setBounds(423, 168, 250, 44);
        pw.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                pw.setForeground(Color.white);
                pw.setBorderColor(UIUtils.COLOR_INTERACTIVE);
            }

            @Override
            public void focusLost(FocusEvent e) {
                pw.setForeground(UIUtils.COLOR_OUTLINE);
                pw.setBorderColor(UIUtils.COLOR_OUTLINE);
            }
        });

        pw.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (e.getKeyChar() == KeyEvent.VK_ENTER)
					try {
						loginEventHandler();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
            }
        });

        panel1.add(pw);
    }

    private void addLoginButton(JPanel panel1) {
        final Color[] loginButtonColors = {UIUtils.COLOR_INTERACTIVE, Color.white};

        JLabel loginButton = new JLabel() {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = UIUtils.get2dGraphics(g);
                super.paintComponent(g2);

                Insets insets = getInsets();
                int w = getWidth() - insets.left - insets.right;
                int h = getHeight() - insets.top - insets.bottom;
                g2.setColor(loginButtonColors[0]);
                g2.fillRoundRect(insets.left, insets.top, w, h, UIUtils.ROUNDNESS, UIUtils.ROUNDNESS);

                FontMetrics metrics = g2.getFontMetrics(UIUtils.FONT_GENERAL_UI);
                int x2 = (getWidth() - metrics.stringWidth(UIUtils.BUTTON_TEXT_LOGIN)) / 2;
                int y2 = ((getHeight() - metrics.getHeight()) / 2) + metrics.getAscent();
                g2.setFont(UIUtils.FONT_GENERAL_UI);
                g2.setColor(loginButtonColors[1]);
                g2.drawString(UIUtils.BUTTON_TEXT_LOGIN, x2, y2);
            }
        };
        loginButton.setFont(new Font("Sakkal Majalla", Font.BOLD, 26));

        loginButton.addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                try {
					loginEventHandler();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                loginButtonColors[0] = UIUtils.COLOR_INTERACTIVE_DARKER;
                loginButtonColors[1] = UIUtils.OFFWHITE;
                loginButton.repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                loginButtonColors[0] = UIUtils.COLOR_INTERACTIVE;
                loginButtonColors[1] = Color.white;
                loginButton.repaint();
            }
        });

        loginButton.setBackground(UIUtils.COLOR_BACKGROUND);
        loginButton.setBounds(423, 247, 250, 44);
        loginButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        panel1.add(loginButton);
    }

   

    private void loginEventHandler() throws SQLException {
        //toaster.warn("Login event");
    	String uString=un.getText();
    	String pString=pw.getText();
    	if(uString.equals("") || pString.equals(""))
    	{
    		toaster.error("الرجاء إدخال كافة المعلومات");
    	}
    	else 
    	{
    		UserCrud uc=new UserCrud();
    		User user=uc.getUser(uString, pString);
    		if(user==null)
    		{
    			toaster.warn("اسم المستخدم أو كلمة المرور خاطئة");
    		}
    		else 
    		{
    			Main main=new Main();
    			this.dispose();
    			main.setVisible(true);
    			
    			
			}
    		
		}
    }
}