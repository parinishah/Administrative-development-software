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
import javax.swing.JButton;
import javax.swing.border.MatteBorder;

@SuppressWarnings("serial")
public class ModNRI_AcademicDetails_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField NADtxt12thRollNumberunique;
	private JTextField NADtxtOverallGrade;
	private JButton NADbtnBackGuardianDetails;
	private JButton NADbtnNextNRIStudentDetails;
	
	SearchModifyActionListener modsearchlisten;
	SearchFromFrameActionListener searchframelisten;
	

	public JTextField getNADtxt12thRollNumberunique() 
	{
		return NADtxt12thRollNumberunique;
	}

	public JTextField getNADtxtOverallGrade() 
	{
		return NADtxtOverallGrade;
	}

	public JButton getNADbtnBackGuardianDetails() 
	{
		return NADbtnBackGuardianDetails;
	}

	public JButton getNADbtnNextNRIStudentDetails() 
	{
		return NADbtnNextNRIStudentDetails;
	}

	
	public void setNADtxt12thRollNumberunique(String snADtxt12thRollNumberunique) 
	{
		this.NADtxt12thRollNumberunique.setText(snADtxt12thRollNumberunique);
	}

	public void setNADtxtOverallGrade(String snADtxtOverallGrade) 
	{
		this.NADtxtOverallGrade.setText(snADtxtOverallGrade);
	}

	/*
	public void setNADbtnBackGuardianDetails(JButton nADbtnBackGuardianDetails) {
		NADbtnBackGuardianDetails = nADbtnBackGuardianDetails;
	}
	*/

	/*
	public void setNADbtnNextNRIStudentDetails(JButton nADbtnNextNRIStudentDetails) {
		NADbtnNextNRIStudentDetails = nADbtnNextNRIStudentDetails;
	}
	*/

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
	public ModNRI_AcademicDetails_GUI() 
	{
		//setType(Type.UTILITY);
		setTitle("MODIFY NRI ACADEMIC DETAILS");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 450, 300);
		
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		this.setBounds(0, 0,screen.width,screen.height - 30);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		panel.setBounds(373, 180, 628, 333);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel NADlblNRIAcademicDetails = new JLabel("NRI Academic Details");
		NADlblNRIAcademicDetails.setHorizontalAlignment(SwingConstants.CENTER);
		NADlblNRIAcademicDetails.setForeground(Color.BLACK);
		NADlblNRIAcademicDetails.setFont(new Font("Tahoma", Font.BOLD, 22));
		NADlblNRIAcademicDetails.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 0, 0), null, null, Color.BLUE));
		NADlblNRIAcademicDetails.setBounds(12, 13, 591, 70);
		panel.add(NADlblNRIAcademicDetails);
		
		JLabel NADlbl12thRollNumberunique = new JLabel("12th Roll Number/Unique ID :");
		NADlbl12thRollNumberunique.setHorizontalAlignment(SwingConstants.CENTER);
		NADlbl12thRollNumberunique.setFont(new Font("Tahoma", Font.PLAIN, 17));
		NADlbl12thRollNumberunique.setBounds(32, 118, 224, 31);
		panel.add(NADlbl12thRollNumberunique);
		
		JLabel NADlblOverallGrade = new JLabel("Overall Grade  :");
		NADlblOverallGrade.setHorizontalAlignment(SwingConstants.CENTER);
		NADlblOverallGrade.setFont(new Font("Tahoma", Font.PLAIN, 17));
		NADlblOverallGrade.setBounds(46, 180, 140, 36);
		panel.add(NADlblOverallGrade);
		
		NADtxt12thRollNumberunique = new JTextField();
		NADtxt12thRollNumberunique.setToolTipText("Enter 12 Board Roll Number");
		NADtxt12thRollNumberunique.setColumns(10);
		NADtxt12thRollNumberunique.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		NADtxt12thRollNumberunique.setBounds(291, 121, 243, 28);
		panel.add(NADtxt12thRollNumberunique);
		
		NADtxtOverallGrade = new JTextField();
		NADtxtOverallGrade.setToolTipText("Enter 12 Board Roll Number");
		NADtxtOverallGrade.setColumns(10);
		NADtxtOverallGrade.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		NADtxtOverallGrade.setBounds(210, 181, 324, 30);
		panel.add(NADtxtOverallGrade);
		
		NADbtnBackGuardianDetails = new JButton("Back");
		NADbtnBackGuardianDetails.setFont(new Font("Tahoma", Font.PLAIN, 16));
		NADbtnBackGuardianDetails.setBounds(126, 274, 176, 36);
		panel.add(NADbtnBackGuardianDetails);
		
		NADbtnNextNRIStudentDetails = new JButton("Next");
		NADbtnNextNRIStudentDetails.setFont(new Font("Tahoma", Font.PLAIN, 16));
		NADbtnNextNRIStudentDetails.setBounds(343, 274, 182, 36);
		panel.add(NADbtnNextNRIStudentDetails);
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
	
	public void setAction(SearchModifyActionListener searchm)
	{
		modsearchlisten = searchm;
		//searchframelisten = sr;
		this.NADbtnNextNRIStudentDetails.addActionListener(modsearchlisten);
		this.NADbtnBackGuardianDetails.addActionListener(modsearchlisten);
	}
	
	public void setAction(SearchFromFrameActionListener sr)
	{
		//modsearchlisten = searchm;
		searchframelisten = sr;
		this.NADbtnBackGuardianDetails.addActionListener(searchframelisten);
		this.NADbtnNextNRIStudentDetails.addActionListener(searchframelisten);
	}
}
