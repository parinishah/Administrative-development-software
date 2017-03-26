package sprj_GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

import sprj_Listener.ManageAccountActionListener;

@SuppressWarnings("serial")
public class DeleteAccount_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField DAtxtLoginID;
	private JPasswordField DAtxtPassword;
	private JButton DAbtnDeleteAccount; 
	private JButton DAbtnBack;
	
	private ManageAccountActionListener manage;

	public JTextField getDAtxtLoginID() 
	{
		return DAtxtLoginID;
	}

	public JPasswordField getDAtxtPassword() 
	{
		return DAtxtPassword;
	}

	public JButton getDAbtnDeleteAccount()
	{
		return DAbtnDeleteAccount;
	}

	public JButton getDAbtnBack()
	{
		return DAbtnBack;
	}

	public void setDAtxtLoginID(JTextField dAtxtLoginID)
	{
		DAtxtLoginID = dAtxtLoginID;
	}

	public void setDAtxtPassword(JPasswordField dAtxtPassword)
	{
		DAtxtPassword = dAtxtPassword;
	}

	public void setDAbtnDeleteAccount(JButton dAbtnDeleteAccount)
	{
		DAbtnDeleteAccount = dAbtnDeleteAccount;
	}

	public void setDAbtnBack(JButton dAbtnBack) 
	{
		DAbtnBack = dAbtnBack;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteAccount_GUI frame = new DeleteAccount_GUI();
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
	public DeleteAccount_GUI() {
		setTitle("Delete Account");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 301);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 64, 408, 178);
		panel.setLayout(null);
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBackground(SystemColor.controlShadow);
		contentPane.add(panel);
		
		JLabel label = new JLabel("Login ID :");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBounds(73, 13, 98, 20);
		panel.add(label);
		
		DAtxtLoginID = new JTextField();
		DAtxtLoginID.setColumns(10);
		DAtxtLoginID.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 0, 0), null, null, new Color(0, 0, 255)));
		DAtxtLoginID.setBounds(166, 15, 149, 20);
		panel.add(DAtxtLoginID);
		
		JLabel label_1 = new JLabel("Password:");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBounds(73, 50, 65, 14);
		panel.add(label_1);
		
		DAtxtPassword = new JPasswordField();
		DAtxtPassword.setEchoChar('*');
		DAtxtPassword.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		DAtxtPassword.setBounds(166, 46, 150, 20);
		panel.add(DAtxtPassword);
		
		DAbtnDeleteAccount = new JButton("Delete Account");
		DAbtnDeleteAccount.setFont(new Font("Tahoma", Font.BOLD, 14));
		DAbtnDeleteAccount.setBounds(120, 92, 172, 23);
		panel.add(DAbtnDeleteAccount);
		
		DAbtnBack = new JButton("Back");
		DAbtnBack.setFont(new Font("Tahoma", Font.BOLD, 14));
		DAbtnBack.setBounds(120, 128, 172, 23);
		panel.add(DAbtnBack);
		
		JLabel lblDeleteAccount = new JLabel("Delete Account");
		lblDeleteAccount.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblDeleteAccount.setBounds(34, 13, 365, 38);
		contentPane.add(lblDeleteAccount);
		lblDeleteAccount.setOpaque(true);
		lblDeleteAccount.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeleteAccount.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDeleteAccount.setBackground(new Color(32, 178, 170));
	}
	
	public void setAction(ManageAccountActionListener man)
	{
		manage = man;
		this.DAbtnBack.addActionListener(manage);
		this.DAbtnDeleteAccount.addActionListener(manage);
	}
	
	public void clear()
	{
		this.DAtxtLoginID.setText("");
		this.DAtxtPassword.setText("");
	}

}
