package sprj_GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import sprj_Listener.SearchFromFrameActionListener;
import sprj_Listener.SearchModifyActionListener;

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
import javax.swing.border.MatteBorder;

@SuppressWarnings("serial")
public class ModNRIStudent_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField NRItxtNationality;
	private JTextField NRItxtNriStatus;
	private JTextArea NRItextAreaAddress;
	private JButton btnNextEnrollmentDetails;
	private JButton btnBackAcademicDetails ;
	
	SearchModifyActionListener modsearchlisten;
	SearchFromFrameActionListener searchframelisten;
	
	private JPanel panel_1;
	
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
	
	public void setNRItxtNationality(String snRItxtNationality)
	{
		NRItxtNationality.setText(snRItxtNationality);
	}

	public void setNRItxtNriStatus(String snRItxtNriStatus) 
	{
		NRItxtNriStatus.setText(snRItxtNriStatus);
	}

	public void setNRItextAreaAddress(String snRItextAreaAddress) 
	{
		NRItextAreaAddress.setText(snRItextAreaAddress);
	}

	public JButton getBtnNextEnrollmentDetails() 
	{
		return btnNextEnrollmentDetails;
	}

	public JButton getBtnBackAcademicDetails() 
	{
		return btnBackAcademicDetails;
	}

	/*
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
	*/

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
	public ModNRIStudent_GUI() {
		//setType(Type.UTILITY);
		this.setLocationRelativeTo(null);
		setTitle("MODIFY NRI STUDENT DETAILS");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 450, 300);
		
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		this.setBounds(0, 0,screen.width,screen.height - 30);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		panel_1.setBounds(459, 166, 586, 365);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNriSudent = new JLabel("MODIFY NRI - STUDENT DETAILS");
		lblNriSudent.setHorizontalAlignment(SwingConstants.CENTER);
		lblNriSudent.setForeground(Color.BLACK);
		lblNriSudent.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNriSudent.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		lblNriSudent.setBounds(10, 11, 554, 55);
		panel_1.add(lblNriSudent);
		
		JPanel panel = new JPanel();
		panel.setBounds(20, 77, 544, 201);
		panel_1.add(panel);
		panel.setLayout(null);
		
		JLabel NRIlblNationality = new JLabel("Nationality:");
		NRIlblNationality.setHorizontalAlignment(SwingConstants.RIGHT);
		NRIlblNationality.setFont(new Font("Tahoma", Font.PLAIN, 18));
		NRIlblNationality.setBounds(10, 35, 100, 28);
		panel.add(NRIlblNationality);
		
		NRItxtNationality = new JTextField();
		NRItxtNationality.setToolTipText("Enter Student's Nationality");
		NRItxtNationality.setColumns(10);
		NRItxtNationality.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		NRItxtNationality.setBounds(132, 35, 108, 33);
		panel.add(NRItxtNationality);
		
		JLabel NRIlblNriStatus = new JLabel("NRI- Status:");
		NRIlblNriStatus.setHorizontalAlignment(SwingConstants.RIGHT);
		NRIlblNriStatus.setFont(new Font("Tahoma", Font.PLAIN, 18));
		NRIlblNriStatus.setBounds(260, 35, 118, 28);
		panel.add(NRIlblNriStatus);
		
		NRItxtNriStatus = new JTextField();
		NRItxtNriStatus.setToolTipText("Enter Student's NRI Status(Eg: Citizenship/ PR/ GreenCard holder)");
		NRItxtNriStatus.setColumns(10);
		NRItxtNriStatus.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		NRItxtNriStatus.setBounds(388, 35, 133, 33);
		panel.add(NRItxtNriStatus);
		
		JLabel NRIlblAddress = new JLabel("Address:");
		NRIlblAddress.setFont(new Font("Tahoma", Font.PLAIN, 18));
		NRIlblAddress.setBounds(10, 109, 79, 28);
		panel.add(NRIlblAddress);
		
		NRItextAreaAddress = new JTextArea();
		NRItextAreaAddress.setToolTipText("Enter Student's NRI Address");
		NRItextAreaAddress.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		NRItextAreaAddress.setBounds(91, 109, 430, 73);
		panel.add(NRItextAreaAddress);
		
		btnNextEnrollmentDetails = new JButton("Next");
		btnNextEnrollmentDetails.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNextEnrollmentDetails.setBounds(329, 303, 180, 33);
		panel_1.add(btnNextEnrollmentDetails);
		
		btnBackAcademicDetails = new JButton("Back");
		btnBackAcademicDetails.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnBackAcademicDetails.setBounds(88, 303, 180, 28);
		panel_1.add(btnBackAcademicDetails);
		
		
	}
	public boolean NRIStudgetTextEmpty()
	{
		if(this.NRItxtNationality.getText().isEmpty() || this.NRItxtNriStatus.getText().isEmpty() 
				|| this.NRItextAreaAddress.getText().isEmpty())
			return true;
		else 
			return false;
	}
	
	public void setAction(SearchModifyActionListener searchm)
	{
		modsearchlisten = searchm;
		//searchframelisten = sr;
		this.btnBackAcademicDetails.addActionListener(modsearchlisten);
		this.btnNextEnrollmentDetails.addActionListener(modsearchlisten);
	}
	
	public void setAction(SearchFromFrameActionListener sr)
	{
		//modsearchlisten = searchm;
		searchframelisten = sr;
		this.btnBackAcademicDetails.addActionListener(searchframelisten);
		this.btnNextEnrollmentDetails.addActionListener(searchframelisten);
	}
	
	public void clear()
	{
		this.NRItextAreaAddress.setText("");
		this.NRItxtNationality.setText("");
		this.NRItxtNriStatus.setText("");
	}
}
