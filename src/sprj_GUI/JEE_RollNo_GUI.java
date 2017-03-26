package sprj_GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import sprj_Listener.EnterNewStudentActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.Font;

@SuppressWarnings("serial")
public class JEE_RollNo_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtEnterJEEroll;
	private JButton btnJEEroll;
	private JButton btnJEEback;
	
	EnterNewStudentActionListener enterlisten;
	
	
	public JTextField getTxtEnterJEEroll() {
		return txtEnterJEEroll;
	}

	public JButton getBtnJEEroll() {
		return btnJEEroll;
	}
	
	public JButton getbtnJEEback() {
		return btnJEEback;
	}

	public void setTxtEnterJEEroll(JTextField txtEnterJEEroll) {
		this.txtEnterJEEroll = txtEnterJEEroll;
	}

	public void setBtnJEEroll(JButton btnJEEroll) {
		this.btnJEEroll = btnJEEroll;
	}
	

	/**
	 * Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JEE_RollNo_GUI frame = new JEE_RollNo_GUI();
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
	public JEE_RollNo_GUI() {
		setTitle("SEARCH BY JEE ROLL NUMBER");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 382, 208);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 11, 366, 158);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblEnterJEEroll = new JLabel("Enter JEE Roll Number:");
		lblEnterJEEroll.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEnterJEEroll.setBounds(22, 55, 160, 20);
		panel.add(lblEnterJEEroll);
		
		txtEnterJEEroll = new JTextField();
		txtEnterJEEroll.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		txtEnterJEEroll.setBounds(188, 56, 129, 23);
		panel.add(txtEnterJEEroll);
		txtEnterJEEroll.setColumns(10);
		
		btnJEEroll = new JButton("Submit");
		btnJEEroll.setBounds(171, 106, 89, 23);
		panel.add(btnJEEroll);
		
		btnJEEback = new JButton("Back");
		btnJEEback.setBounds(59, 106, 89, 23);
		panel.add(btnJEEback);
	}
	
	public void clear()
	{
		this.txtEnterJEEroll.setText("");
	}
	
	
	public void setAction(EnterNewStudentActionListener enter)
	{
		enterlisten = enter;
		this.btnJEEroll.addActionListener(enterlisten);
		this.btnJEEback.addActionListener(enterlisten);
	}
}
