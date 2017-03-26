package sprj_GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.border.MatteBorder;

import sprj_Listener.ManageAccountActionListener;

@SuppressWarnings("serial")
public class AddAccount_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField AAtxtLoginId;
	private JPasswordField AAPassword;
	private JPasswordField AARePassword;
	private JButton AAbtnBack;
	private JButton AAbtnSubmit;

	
	private ManageAccountActionListener manage;
	
	public JTextField getAAtxtLoginId() {
		return AAtxtLoginId;
	}

	public JPasswordField getAAPassword() {
		return AAPassword;
	}

	public JPasswordField getAARePassword() {
		return AARePassword;
	}

	public JButton getAAbtnBack() {
		return AAbtnBack;
	}

	public JButton getAAbtnSubmit() {
		return AAbtnSubmit;
	}

	public void setAAtxtLoginId(JTextField aAtxtLoginId) {
		AAtxtLoginId = aAtxtLoginId;
	}

	public void setAAPassword(JPasswordField aAPassword) {
		AAPassword = aAPassword;
	}

	public void setAARePassword(JPasswordField aARePassword) {
		AARePassword = aARePassword;
	}

	public void setAAbtnBack(JButton aAbtnBack) {
		AAbtnBack = aAbtnBack;
	}

	public void setAAbtnSubmit(JButton aAbtnSubmit) {
		AAbtnSubmit = aAbtnSubmit;
	}

	/**
	 * Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddAccount_GUI frame = new AddAccount_GUI();
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
	public AddAccount_GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Add Account");
		setBounds(100, 100, 460, 339);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setAlignmentY(Component.TOP_ALIGNMENT);
		panel.setBounds(20, 65, 404, 227);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblAddAccount = new JLabel("Add Account");
		lblAddAccount.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblAddAccount.setOpaque(true);
		lblAddAccount.setBackground(new Color(32, 178, 170));
		lblAddAccount.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddAccount.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblAddAccount.setBounds(10, 11, 424, 43);
		contentPane.add(lblAddAccount);
		
		JLabel label = new JLabel("Login Id: ");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label.setBounds(90, 26, 93, 25);
		panel.add(label);
		
		AAtxtLoginId = new JTextField();
		AAtxtLoginId.setColumns(10);
		AAtxtLoginId.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		AAtxtLoginId.setBounds(191, 28, 180, 24);
		panel.add(AAtxtLoginId);
		
		JLabel lblPassword = new JLabel("Password: ");
		lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPassword.setBounds(70, 74, 113, 25);
		panel.add(lblPassword);
		
		AAPassword = new JPasswordField();
		AAPassword.setEchoChar('*');
		AAPassword.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		AAPassword.setBounds(191, 75, 180, 27);
		panel.add(AAPassword);
		
		JLabel lblReconfirmPassword = new JLabel("Re-enter Password:");
		lblReconfirmPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblReconfirmPassword.setBounds(26, 122, 157, 25);
		panel.add(lblReconfirmPassword);
		
		AARePassword = new JPasswordField();
		AARePassword.setEchoChar('*');
		AARePassword.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		AARePassword.setBounds(191, 123, 180, 27);
		panel.add(AARePassword);
		
		AAbtnBack = new JButton("Back");
		AAbtnBack.setFont(new Font("Tahoma", Font.PLAIN, 13));
		AAbtnBack.setBounds(90, 179, 89, 27);
		panel.add(AAbtnBack);
		
		AAbtnSubmit = new JButton("Submit");
		AAbtnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 13));
		AAbtnSubmit.setBounds(264, 176, 89, 32);
		panel.add(AAbtnSubmit);
		
		
	}
	
	public void setAction(ManageAccountActionListener man)
	{
		manage = man;
		this.AAbtnBack.addActionListener(manage);
		this.AAbtnSubmit.addActionListener(manage);
	}
	
	public void clear()
	{
		this.AAPassword.setText("");
		this.AARePassword.setText("");
		this.AAtxtLoginId.setText("");
	}
}
