package sprj_GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
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
import javax.swing.JButton;

@SuppressWarnings("serial")
public class NRI_AcademicDetails_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField NADtxt12thRollNumberunique;
	private JTextField NADtxtOverallGrade;
	private JButton NADbtnBackGuardianDetails;
	private JButton NADbtnNextNRIStudentDetails;
	
	EnterNewStudentActionListener enterlisten;
	SearchFromFrameActionListener searchframelisten;
	
	private JButton NADbtnSearchMod;
	public JTextField getNADtxtUniqueNumber() {
		return NADtxtUniqueNumber;
	}

	public void setNADtxtUniqueNumber(JTextField nADtxtUniqueNumber) {
		NADtxtUniqueNumber = nADtxtUniqueNumber;
	}

	private JLabel NADlblUniqueNumber;
	private JTextField NADtxtUniqueNumber;
	

	public JButton getNADbtnSearchMod() {
		return NADbtnSearchMod;
	}

	public void setNADbtnSearchMod(JButton nADbtnSearchMod) {
		NADbtnSearchMod = nADbtnSearchMod;
	}

	public JTextField getNADtxt12thRollNumberunique() {
		return NADtxt12thRollNumberunique;
	}

	public JTextField getNADtxtOverallGrade() {
		return NADtxtOverallGrade;
	}

	public JButton getNADbtnBackGuardianDetails() {
		return NADbtnBackGuardianDetails;
	}

	public JButton getNADbtnNextNRIStudentDetails() {
		return NADbtnNextNRIStudentDetails;
	}
	
	public void setNADtxt12thRollNumberunique(String snADtxt12thRollNumberunique) {
		NADtxt12thRollNumberunique.setText(snADtxt12thRollNumberunique);
	}

	public void setNADtxtOverallGrade(String snADtxtOverallGrade) {
		NADtxtOverallGrade.setText(snADtxtOverallGrade);
	}
	public void setNADbtnNextNRIStudentDetails(JButton nADbtnNextNRIStudentDetails) {
		NADbtnNextNRIStudentDetails = nADbtnNextNRIStudentDetails;
	}


	public void setNADtxt12thRollNumberunique(JTextField nADtxt12thRollNumberunique) {
		NADtxt12thRollNumberunique = nADtxt12thRollNumberunique;
	}

	public void setNADtxtOverallGrade(JTextField nADtxtOverallGrade) {
		NADtxtOverallGrade = nADtxtOverallGrade;
	}

	public void setNADbtnBackGuardianDetails(JButton nADbtnBackGuardianDetails) {
		NADbtnBackGuardianDetails = nADbtnBackGuardianDetails;
	}



	/**
	 * Launch the application.
	 *	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NRI_AcademicDetails_GUI frame = new NRI_AcademicDetails_GUI();
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
	public NRI_AcademicDetails_GUI() 
	{
		//setType(Type.UTILITY);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		this.setBounds(0, 0, screen.width, screen.height-30);
		
		setTitle("NRI ACADEMIC DETAILS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 527, 300);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		panel.setBounds(418, 169, 615, 351);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel NADlblNRIAcademicDetails = new JLabel("NRI ACADEMIC DETAILS");
		NADlblNRIAcademicDetails.setHorizontalAlignment(SwingConstants.CENTER);
		NADlblNRIAcademicDetails.setForeground(Color.BLACK);
		NADlblNRIAcademicDetails.setFont(new Font("Tahoma", Font.BOLD, 15));
		NADlblNRIAcademicDetails.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 0, 0), null, null, Color.BLUE));
		NADlblNRIAcademicDetails.setBounds(12, 13, 322, 57);
		panel.add(NADlblNRIAcademicDetails);
		
		JLabel NADlbl12thRollNumberunique = new JLabel("12th Roll Number/Unique ID :");
		NADlbl12thRollNumberunique.setHorizontalAlignment(SwingConstants.CENTER);
		NADlbl12thRollNumberunique.setFont(new Font("Tahoma", Font.PLAIN, 17));
		NADlbl12thRollNumberunique.setBounds(52, 132, 232, 30);
		panel.add(NADlbl12thRollNumberunique);
		
		JLabel NADlblOverallGrade = new JLabel("Overall Grade  :");
		NADlblOverallGrade.setHorizontalAlignment(SwingConstants.CENTER);
		NADlblOverallGrade.setFont(new Font("Tahoma", Font.PLAIN, 17));
		NADlblOverallGrade.setBounds(66, 192, 132, 30);
		panel.add(NADlblOverallGrade);
		
		NADtxt12thRollNumberunique = new JTextField();
		NADtxt12thRollNumberunique.setToolTipText("Enter 12 Board Roll Number");
		NADtxt12thRollNumberunique.setColumns(10);
		NADtxt12thRollNumberunique.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		NADtxt12thRollNumberunique.setBounds(294, 135, 163, 30);
		panel.add(NADtxt12thRollNumberunique);
		NADtxt12thRollNumberunique.requestFocus();
		
		NADtxtOverallGrade = new JTextField();
		NADtxtOverallGrade.setToolTipText("Enter 12 Board Roll Number");
		NADtxtOverallGrade.setColumns(10);
		NADtxtOverallGrade.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		NADtxtOverallGrade.setBounds(269, 196, 163, 28);
		panel.add(NADtxtOverallGrade);
		
		NADbtnBackGuardianDetails = new JButton("Back (Guardian Details)");
		
		NADbtnBackGuardianDetails.setFont(new Font("Tahoma", Font.PLAIN, 17));
		NADbtnBackGuardianDetails.setBounds(53, 303, 226, 25);
		panel.add(NADbtnBackGuardianDetails);
		
		NADbtnNextNRIStudentDetails = new JButton("Next (NRI Student Details)");
		
		NADbtnNextNRIStudentDetails.setFont(new Font("Tahoma", Font.PLAIN, 17));
	
		NADbtnNextNRIStudentDetails.setBounds(325, 303, 267, 25);
		panel.add(NADbtnNextNRIStudentDetails);
		
		NADbtnSearchMod = new JButton("Modify");
		
		
		NADbtnSearchMod.setFont(new Font("Tahoma", Font.PLAIN, 15));
		NADbtnSearchMod.setBounds(446, 48, 90, 22);
		panel.add(NADbtnSearchMod);
		
		NADlblUniqueNumber = new JLabel("Enter Unique Number:");
		NADlblUniqueNumber.setFont(new Font("Tahoma", Font.PLAIN, 15));
		NADlblUniqueNumber.setBounds(344, 13, 145, 24);
		panel.add(NADlblUniqueNumber);
		
		NADtxtUniqueNumber = new JTextField();
		NADtxtUniqueNumber.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		NADtxtUniqueNumber.setBounds(499, 13, 106, 20);
		panel.add(NADtxtUniqueNumber);
		NADtxtUniqueNumber.setColumns(10);
	}
	
	public boolean getNRIacadTextEmpty()
	{
		if(this.NADtxt12thRollNumberunique.getText().isEmpty() || this.NADtxtOverallGrade.getText().isEmpty())
			return true;
		
		else
			return false;
	}
	
	public void clear()
	{
		this.NADtxt12thRollNumberunique.setText("");
		this.NADtxtOverallGrade.setText("");
	}
	
	public void setAction(EnterNewStudentActionListener enter, SearchFromFrameActionListener slis)
	{
		enterlisten = enter;
		searchframelisten = slis;
		this.NADbtnNextNRIStudentDetails.addActionListener(enterlisten);
		this.NADbtnBackGuardianDetails.addActionListener(enterlisten);
		this.NADbtnSearchMod.addActionListener(searchframelisten);
	}
}
