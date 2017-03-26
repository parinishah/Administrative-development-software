package sprj_GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.border.MatteBorder;

import sprj_Listener.ManageAccountActionListener;

@SuppressWarnings("serial")
public class ChangePassword_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField CPtxtLoginId;
	private JPasswordField CPOldPassword;
	private JPasswordField CPNewPassword;
	private JButton CPbtnBack;
	private JButton CPbtnSubmit;

	private ManageAccountActionListener manage;
	
	public JTextField getCPtxtLoginId() {
		return CPtxtLoginId;
	}

	public JPasswordField getCPOldPassword() {
		return CPOldPassword;
	}

	public JPasswordField getCPNewPassword() {
		return CPNewPassword;
	}

	public JButton getCPbtnBack() {
		return CPbtnBack;
	}

	public JButton getCPbtnSubmit() {
		return CPbtnSubmit;
	}

	public void setCPtxtLoginId(JTextField cPtxtLoginId) {
		CPtxtLoginId = cPtxtLoginId;
	}

	public void setCPOldPassword(JPasswordField cPOldPassword) {
		CPOldPassword = cPOldPassword;
	}

	public void setCPNewPassword(JPasswordField cPNewPassword) {
		CPNewPassword = cPNewPassword;
	}

	public void setCPbtnBack(JButton cPbtnBack) {
		CPbtnBack = cPbtnBack;
	}

	public void setCPbtnSubmit(JButton cPbtnSubmit) {
		CPbtnSubmit = cPbtnSubmit;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChangePassword_GUI frame = new ChangePassword_GUI();
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
	public ChangePassword_GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Change Password");
		setBounds(100, 100, 450, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(20, 67, 392, 220);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblChangeThePassword = new JLabel("Change Password");
		lblChangeThePassword.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblChangeThePassword.setOpaque(true);
		lblChangeThePassword.setBackground(new Color(32, 178, 170));
		lblChangeThePassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblChangeThePassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblChangeThePassword.setBounds(10, 11, 414, 42);
		contentPane.add(lblChangeThePassword);
		
		JLabel lblUsername = new JLabel("Login Id: ");
		lblUsername.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblUsername.setBounds(61, 21, 93, 25);
		panel.add(lblUsername);
		
		CPtxtLoginId = new JTextField();
		CPtxtLoginId.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		CPtxtLoginId.setBounds(162, 23, 180, 24);
		panel.add(CPtxtLoginId);
		CPtxtLoginId.setColumns(10);
		
		JLabel lblOldPassword = new JLabel("Old Password: ");
		lblOldPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblOldPassword.setBounds(41, 69, 113, 25);
		panel.add(lblOldPassword);
		
		CPOldPassword = new JPasswordField();
		CPOldPassword.setEchoChar('*');
		CPOldPassword.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		CPOldPassword.setBounds(162, 70, 180, 27);
		panel.add(CPOldPassword);
		
		JLabel lblNewPassword = new JLabel("New Password:");
		lblNewPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewPassword.setBounds(41, 117, 113, 25);
		panel.add(lblNewPassword);
		
		CPNewPassword = new JPasswordField();
		CPNewPassword.setEchoChar('*');
		CPNewPassword.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		CPNewPassword.setBounds(162, 118, 180, 27);
		panel.add(CPNewPassword);
		
		CPbtnSubmit = new JButton("Submit");
		CPbtnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 13));
		CPbtnSubmit.setBounds(237, 173, 89, 32);
		panel.add(CPbtnSubmit);
		
		CPbtnBack = new JButton("Back");
		CPbtnBack.setFont(new Font("Tahoma", Font.PLAIN, 13));
		CPbtnBack.setBounds(85, 176, 89, 27);
		panel.add(CPbtnBack);
		
		
	}
	
	public void setAction(ManageAccountActionListener man)
	{
		manage = man;
		this.CPbtnBack.addActionListener(manage);
		this.CPbtnSubmit.addActionListener(manage);
	}
	
	public void clear()
	{
		this.CPtxtLoginId.setText("");
		this.CPOldPassword.setText("");
		this.CPNewPassword.setText("");
	}
}
