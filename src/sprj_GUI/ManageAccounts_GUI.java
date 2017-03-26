package sprj_GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.JPasswordField;
import javax.swing.border.MatteBorder;

import sprj_Listener.ManageAccountActionListener;

@SuppressWarnings("serial")
public class ManageAccounts_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField AdmintxtLoginID;
	private JPasswordField AdmintxtPassword;
	private JButton AdminbtnAddAccount;
	private JButton AdminbtnChangePassword;
	private JButton AdminbtnDeleteAccount;
	private JButton AdminbtnBack;
	
	ManageAccountActionListener manage;

	public JTextField getAdmintxtLoginID() 
	{
		return AdmintxtLoginID;
	}

	public JPasswordField getAdmintxtPassword() 
	{
		return AdmintxtPassword;
	}

	public JButton getAdminbtnAddAccount() 
	{
		return AdminbtnAddAccount;
	}

	public JButton getAdminbtnChangePassword() 
	{
		return AdminbtnChangePassword;
	}

	public JButton getAdminbtnDeleteAccount() 
	{
		return AdminbtnDeleteAccount;
	}

	public void setAdmintxtLoginID(JTextField admintxtLoginID) 
	{
		AdmintxtLoginID = admintxtLoginID;
	}

	public void setAdmintxtPassword(JPasswordField admintxtPassword) 
	{
		AdmintxtPassword = admintxtPassword;
	}

	public void setAdminbtnAddAccount(JButton adminbtnAddAccount) 
	{
		AdminbtnAddAccount = adminbtnAddAccount;
	}

	public void setAdminbtnChangePassword(JButton adminbtnChangePassword) 
	{
		AdminbtnChangePassword = adminbtnChangePassword;
	}

	public void setAdminbtnDeleteAccount(JButton adminbtnDeleteAccount) 
	{
		AdminbtnDeleteAccount = adminbtnDeleteAccount;
	}

	public JButton getAdminbtnBack()
	{
		return AdminbtnBack;
	}

	public void setAdminbtnBack(JButton adminbtnBack) 
	{
		AdminbtnBack = adminbtnBack;
	}

	/**
	 * Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageAccounts_GUI frame = new ManageAccounts_GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	 * Create the frame.
	 */
	
	public ManageAccounts_GUI() 
	{
		setTitle("Manage Accounts");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 401);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAdministrativeLogin = new JLabel("Administrative Login");
		lblAdministrativeLogin.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblAdministrativeLogin.setOpaque(true);
		lblAdministrativeLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdministrativeLogin.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAdministrativeLogin.setBackground(new Color(32, 178, 170));
		lblAdministrativeLogin.setBounds(94, 13, 244, 38);
		contentPane.add(lblAdministrativeLogin);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBackground(SystemColor.controlShadow);
		panel.setBounds(28, 64, 371, 277);
		contentPane.add(panel);
		
		AdminbtnAddAccount = new JButton("Add Account");
		AdminbtnAddAccount.setFont(new Font("Tahoma", Font.BOLD, 14));
		AdminbtnAddAccount.setBounds(108, 110, 172, 23);
		panel.add(AdminbtnAddAccount);
		
		JLabel label_1 = new JLabel("Login ID :");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBounds(62, 33, 98, 20);
		panel.add(label_1);
		
		AdmintxtLoginID = new JTextField();
		AdmintxtLoginID.setColumns(10);
		AdmintxtLoginID.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 0, 0), null, null, new Color(0, 0, 255)));
		AdmintxtLoginID.setBounds(155, 35, 149, 20);
		panel.add(AdmintxtLoginID);
		
		JLabel label_2 = new JLabel("Password:");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_2.setBounds(62, 70, 65, 14);
		panel.add(label_2);
		
		AdmintxtPassword = new JPasswordField();
		AdmintxtPassword.setEchoChar('*');
		AdmintxtPassword.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		AdmintxtPassword.setBounds(155, 66, 150, 20);
		panel.add(AdmintxtPassword);
		
		AdminbtnChangePassword = new JButton("Change Password");
		AdminbtnChangePassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		AdminbtnChangePassword.setBounds(108, 200, 172, 23);
		panel.add(AdminbtnChangePassword);
		
		AdminbtnDeleteAccount = new JButton("Delete Account");
		AdminbtnDeleteAccount.setFont(new Font("Tahoma", Font.BOLD, 14));
		AdminbtnDeleteAccount.setBounds(108, 153, 172, 23);
		panel.add(AdminbtnDeleteAccount);
		
		AdminbtnBack = new JButton("Back");
		AdminbtnBack.setFont(new Font("Tahoma", Font.BOLD, 14));
		AdminbtnBack.setBounds(108, 241, 172, 23);
		panel.add(AdminbtnBack);
	}
	
	public void setAction(ManageAccountActionListener man)
	{
		manage = man;
		this.AdminbtnAddAccount.addActionListener(manage);
		this.AdminbtnBack.addActionListener(manage);
		this.AdminbtnChangePassword.addActionListener(manage);
		this.AdminbtnDeleteAccount.addActionListener(manage);
	}
	
	public void clear()
	{
		this.AdmintxtLoginID.setText("");
		this.AdmintxtPassword.setText("");
	}
}
