package sprj_GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;

import sprj_Listener.LoginActionListener;
import sprj_Listener.ManageAccountActionListener;

import java.awt.Component;

@SuppressWarnings("serial")
public class Login_GUI extends JFrame {

	@SuppressWarnings("unused")
	private JPanel contentPane;
	private JTextField  LogintxtLoginId;
	private JPasswordField LogintxtPassword;
	private JButton btnlogin;
	private JButton MenubtnManageAccounts; 
	private ManageAccounts_GUI manage;
	private DeleteAccount_GUI deleteaccount;
	private AddAccount_GUI addaccount;
	private ChangePassword_GUI changepass;
	private Error_GUI error;
	

	private Menu_GUI menu;
	
	LoginActionListener loginlisten;
	ManageAccountActionListener managelisten;
	
	public JButton getMenubtnManageAccounts() 
	{
		return MenubtnManageAccounts;
	}

	public void setMenubtnManageAccounts(JButton menubtnManageAccounts) 
	{
		MenubtnManageAccounts = menubtnManageAccounts;
	}
	public JTextField getLogintxtLoginId() {
		return LogintxtLoginId;
	}

	public JPasswordField getLogintxtPassword() {
		return LogintxtPassword;
	}
	
	public JButton getLoginbtnlogin()
	{
		return this.btnlogin;
	}

	public void setLogintxtLoginId(JTextField logintxtLoginId) {
		LogintxtLoginId = logintxtLoginId;
	}

	public void setLogintxtPassword(JPasswordField logintxtPassword) {
		LogintxtPassword = logintxtPassword;
	}

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_GUI frame = new Login_GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login_GUI() 
	{
		menu = new Menu_GUI(this);
		
		error = new Error_GUI();
		
		manage = new ManageAccounts_GUI();
		deleteaccount = new DeleteAccount_GUI(); 
		changepass = new ChangePassword_GUI();
		addaccount = new AddAccount_GUI();
		
		this.setTitle("Login Frame");
		this.setBounds(100, 100, 450, 418);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		
		JPanel mainpanel = new JPanel();
		mainpanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		mainpanel.setBounds(0, 0, 434, 371);
		this.getContentPane().add(mainpanel);
		mainpanel.setLayout(null);
		
		JPanel loginpanel = new JPanel();
		loginpanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		loginpanel.setBackground(SystemColor.controlShadow);
		loginpanel.setBounds(31, 163, 371, 156);
		mainpanel.add(loginpanel);
		loginpanel.setLayout(null);
		
		btnlogin = new JButton("Login");
		
		btnlogin.setBounds(141, 114, 98, 23);
		loginpanel.add(btnlogin);
		btnlogin.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblloginid = new JLabel("Login ID :");
		lblloginid.setBounds(62, 33, 98, 20);
		loginpanel.add(lblloginid);
		lblloginid.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		LogintxtLoginId = new JTextField();
		LogintxtLoginId.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 0, 0), null, null, new Color(0, 0, 255)));
		LogintxtLoginId.setBounds(155, 35, 149, 20);
		loginpanel.add( LogintxtLoginId);
		LogintxtLoginId.setColumns(10);
		
		JLabel lblpassword = new JLabel("Password:");
		lblpassword.setBounds(62, 70, 65, 14);
		loginpanel.add(lblpassword);
		lblpassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		LogintxtPassword = new JPasswordField();
		LogintxtPassword.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		LogintxtPassword.setBounds(155, 66, 150, 20);
		loginpanel.add(LogintxtPassword);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 0, 0), Color.RED, Color.BLUE, new Color(0, 0, 255)));
		panel.setAlignmentY(Component.TOP_ALIGNMENT);
		panel.setBackground(Color.WHITE);
		panel.setForeground(Color.BLACK);
		panel.setBounds(10, 11, 414, 91);
		mainpanel.add(panel);
		panel.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("AHMEDABAD");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 189, 36);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setOpaque(true);
		
		JLabel lblUniversity = new JLabel("UNIVERSITY");
		lblUniversity.setForeground(Color.BLUE);
		lblUniversity.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblUniversity.setHorizontalAlignment(SwingConstants.CENTER);
		lblUniversity.setOpaque(true);
		lblUniversity.setBackground(Color.WHITE);
		lblUniversity.setBounds(10, 47, 189, 40);
		panel.add(lblUniversity);
		
		JLabel lblSchoolOf = new JLabel("SCHOOL OF ENGINEERING");
		lblSchoolOf.setOpaque(true);
		lblSchoolOf.setBackground(Color.WHITE);
		lblSchoolOf.setHorizontalAlignment(SwingConstants.CENTER);
		lblSchoolOf.setFont(new Font("Baskerville Old Face", Font.PLAIN, 16));
		lblSchoolOf.setBounds(198, 7, 214, 40);
		panel.add(lblSchoolOf);
		
		JLabel lblAndAppliedSciences = new JLabel("AND APPLIED SCIENCES");
		lblAndAppliedSciences.setOpaque(true);
		lblAndAppliedSciences.setBackground(Color.WHITE);
		lblAndAppliedSciences.setHorizontalAlignment(SwingConstants.CENTER);
		lblAndAppliedSciences.setFont(new Font("Baskerville Old Face", Font.PLAIN, 16));
		lblAndAppliedSciences.setBounds(198, 47, 206, 40);
		panel.add(lblAndAppliedSciences);
		
		JLabel lblNewLabel_1 = new JLabel("ADMINISTRATIVE LOGIN");
		lblNewLabel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(new Color(32, 178, 170));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(97, 113, 244, 38);
		mainpanel.add(lblNewLabel_1);
		
		MenubtnManageAccounts = new JButton("Manage Accounts");
		MenubtnManageAccounts.setFont(new Font("Tahoma", Font.PLAIN, 15));
		MenubtnManageAccounts.setBounds(247, 333, 155, 25);
		mainpanel.add(MenubtnManageAccounts);
		
		loginlisten = new LoginActionListener(this, menu);
		this.btnlogin.addActionListener(loginlisten);
		
		
		managelisten = new ManageAccountActionListener(this, manage, addaccount, deleteaccount, changepass, error);
		manage.setAction(managelisten);
		addaccount.setAction(managelisten);
		deleteaccount.setAction(managelisten);
		changepass.setAction(managelisten);
		error.setAction(managelisten);
		this.MenubtnManageAccounts.addActionListener(managelisten);
		
		
		
	}
	
	public void clear()
	{
		this.LogintxtLoginId.setText("");
		this.LogintxtPassword.setText("");
	}
}