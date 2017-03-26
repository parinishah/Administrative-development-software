package sprj_GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import sprj_Listener.EnterNewStudentActionListener;
import sprj_Listener.SearchFromFrameActionListener;

import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class NRIStudent_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField NRItxtNationality;
	private JTextField NRItxtNriStatus;
	private JTextArea NRItextAreaAddress;
	private JButton btnNextEnrollmentDetails;
	private JButton btnBackAcademicDetails ;
	
	EnterNewStudentActionListener enterlisten;
	SearchFromFrameActionListener searchframelisten;
	
	public JButton getNRIbtnSearchModify() {
		return NRIbtnSearchModify;
	}

	public void setNRIbtnSearchModify(JButton nRIbtnSearchModify) {
		NRIbtnSearchModify = nRIbtnSearchModify;
	}

	private JButton NRIbtnSearchModify;
	private JPanel panel_1;
	private JTextField NRItxtUniqueNumber;
	
	public JTextField getNRItxtUniqueNumber() {
		return NRItxtUniqueNumber;
	}

	public void setNRItxtUniqueNumber(JTextField nRItxtUniqueNumber) {
		NRItxtUniqueNumber = nRItxtUniqueNumber;
	}

	/**
	 * Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NriStudent_GUI frame = new NriStudent_GUI();
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
	public JTextField getNRItxtNationality() 
	{
		return NRItxtNationality;
	}

	public JTextField getNRItxtNriStatus() 
	{
		return NRItxtNriStatus;
	}

	public JTextArea getNRItextAreaAddress() 
	{
		return NRItextAreaAddress;
	}

	public JButton getBtnNextEnrollmentDetails() 
	{
		return btnNextEnrollmentDetails;
	}

	public JButton getBtnBackAcademicDetails() 
	{
		return btnBackAcademicDetails;
	}

	public void setNRItxtNationality(JTextField nRItxtNationality)
	{
		NRItxtNationality = nRItxtNationality;
	}

	public void setNRItxtNriStatus(JTextField nRItxtNriStatus) 
	{
		NRItxtNriStatus = nRItxtNriStatus;
	}

	public void setNRItextAreaAddress(JTextArea nRItextAreaAddress) 
	{
		NRItextAreaAddress = nRItextAreaAddress;
	}

	public void setBtnNextEnrollmentDetails(JButton btnNextEnrollmentDetails)
	{
		this.btnNextEnrollmentDetails = btnNextEnrollmentDetails;
	}

	public void setBtnBackAcademicDetails(JButton btnBackAcademicDetails) 
	{
		this.btnBackAcademicDetails = btnBackAcademicDetails;
	}

	/**
	 * Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NRIStudent_GUI frame = new NRIStudent_GUI();
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
	public NRIStudent_GUI() {
		this.setLocationRelativeTo(null);
		setTitle("NRI STUDENT DETAILS");
		
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(0, 0, screen.width, screen.height-30);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		panel_1.setBounds(416, 145, 548, 320);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNriSudent = new JLabel("NRI - STUDENT DETAILS");
		lblNriSudent.setHorizontalAlignment(SwingConstants.CENTER);
		lblNriSudent.setForeground(Color.BLACK);
		lblNriSudent.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNriSudent.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		lblNriSudent.setBounds(10, 11, 277, 40);
		panel_1.add(lblNriSudent);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 103, 528, 147);
		panel_1.add(panel);
		panel.setLayout(null);
		
		JLabel NRIlblNationality = new JLabel("Nationality:");
		NRIlblNationality.setFont(new Font("Tahoma", Font.PLAIN, 15));
		NRIlblNationality.setBounds(21, 12, 89, 27);
		panel.add(NRIlblNationality);
		
		NRItxtNationality = new JTextField();
		NRItxtNationality.setToolTipText("Enter Student's Nationality");
		NRItxtNationality.setColumns(10);
		NRItxtNationality.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		NRItxtNationality.setBounds(120, 11, 114, 33);
		panel.add(NRItxtNationality);
		NRItxtNationality.requestFocus();
		
		JLabel NRIlblNriStatus = new JLabel("NRI- Status:");
		NRIlblNriStatus.setFont(new Font("Tahoma", Font.PLAIN, 15));
		NRIlblNriStatus.setBounds(283, 12, 91, 27);
		panel.add(NRIlblNriStatus);
		
		NRItxtNriStatus = new JTextField();
		NRItxtNriStatus.setToolTipText("Enter Student's NRI Status(Eg: Citizenship/ PR/ GreenCard holder)");
		NRItxtNriStatus.setColumns(10);
		NRItxtNriStatus.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		NRItxtNriStatus.setBounds(384, 11, 106, 33);
		panel.add(NRItxtNriStatus);
		
		JLabel NRIlblAddress = new JLabel("Address:");
		NRIlblAddress.setFont(new Font("Tahoma", Font.PLAIN, 15));
		NRIlblAddress.setBounds(23, 63, 63, 27);
		panel.add(NRIlblAddress);
		
		NRItextAreaAddress = new JTextArea();
		NRItextAreaAddress.setToolTipText("Enter Student's NRI Address");
		NRItextAreaAddress.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		NRItextAreaAddress.setBounds(96, 66, 407, 59);
		panel.add(NRItextAreaAddress);
		
		btnNextEnrollmentDetails = new JButton("Next (Enrollment Details)");
		btnNextEnrollmentDetails.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNextEnrollmentDetails.setBounds(278, 268, 197, 29);
		panel_1.add(btnNextEnrollmentDetails);
		
		btnBackAcademicDetails = new JButton("Back (Academic Details)");
		btnBackAcademicDetails.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnBackAcademicDetails.setBounds(71, 271, 197, 29);
		panel_1.add(btnBackAcademicDetails);
		
		NRIbtnSearchModify = new JButton("Modify");
		NRIbtnSearchModify.setFont(new Font("Tahoma", Font.PLAIN, 13));
		NRIbtnSearchModify.setBounds(368, 57, 90, 25);
		panel_1.add(NRIbtnSearchModify);
		
		JLabel lblEnterUniqueNumber = new JLabel("Enter Unique Number:");
		lblEnterUniqueNumber.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEnterUniqueNumber.setBounds(299, 11, 128, 25);
		panel_1.add(lblEnterUniqueNumber);
		
		NRItxtUniqueNumber = new JTextField();
		NRItxtUniqueNumber.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		NRItxtUniqueNumber.setBounds(430, 11, 108, 29);
		panel_1.add(NRItxtUniqueNumber);
		NRItxtUniqueNumber.setColumns(10);
		
		
	}
	public boolean NRIStudgetTextEmpty()
	{
		if(this.NRItxtNationality.getText().isEmpty() || this.NRItxtNriStatus.getText().isEmpty() 
				|| this.NRItextAreaAddress.getText().isEmpty())
			return true;
		else 
			return false;
	}
	
	public void setAction(EnterNewStudentActionListener enter, SearchFromFrameActionListener slis)
	{
		enterlisten = enter;
		searchframelisten = slis;
		this.btnBackAcademicDetails.addActionListener(enterlisten);
		this.btnNextEnrollmentDetails.addActionListener(enterlisten);
		this.NRIbtnSearchModify.addActionListener(searchframelisten);
	}
	
	public void clear()
	{
		this.NRItextAreaAddress.setText("");
		this.NRItxtNationality.setText("");
		this.NRItxtNriStatus.setText("");
	}
}
