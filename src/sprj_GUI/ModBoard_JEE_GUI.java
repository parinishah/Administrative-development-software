
package sprj_GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import com.toedter.calendar.JYearChooser;

import sprj_Listener.SearchFromFrameActionListener;
import sprj_Listener.SearchModifyActionListener;
import javax.swing.border.MatteBorder;

@SuppressWarnings("serial")
public class ModBoard_JEE_GUI extends JFrame 
{

	private JPanel contentPane;
	private JTextField ADtxtBoardRollNum12th;
	private JTextField ADtxtOverallPercentage12th;
	private JTextField ADtxtJEEPercentile;
	private JTextField ADtxtPCMPercentage12th;
	private JTextField ADtxtPCMPercentile12th;
	private JTextField ADtxtSchoolName;
	private JTextField ADtxtJEEScore;
	private JTextField ADtxtJEERollNumber;
	private JTextField ADtxtAcpcRank;
	private JButton ADbtnAdmissionType;
	private JButton ADbtnNext;
	private JYearChooser ADyearChooser10th;
	private JYearChooser ADyearChooser12th;
	@SuppressWarnings("rawtypes")
	private JComboBox ADcmbSchoolBoard; 
	
	SearchModifyActionListener modsearchlisten;
	SearchFromFrameActionListener searchframelisten;
	
	public int getADcmb10passing()
	{
		return this.ADyearChooser10th.getYear();
	}
	
	public int getADcmb12passing()
	{
		return this.ADyearChooser12th.getYear();
	}
	
	public String getADcmbschlbrd()
	{
		return (String)this.ADcmbSchoolBoard.getSelectedItem();
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getADcmbSchoolBoard() 
	{
		return ADcmbSchoolBoard;
	}

	public JTextField getADtxtBoardRollNum12th() 
	{
		return ADtxtBoardRollNum12th;
	}

	public JTextField getADtxtOverallPercentage12th()
	{
		return ADtxtOverallPercentage12th;
	}

	public JTextField getADtxtJEEPercentile() 
	{
		return ADtxtJEEPercentile;
	}

	public JTextField getADtxtPCMPercentage12th() 
	{
		return ADtxtPCMPercentage12th;
	}

	public JTextField getADtxtPCMPercentile12th() 
	{
		return ADtxtPCMPercentile12th;
	}

	public JTextField getADtxtSchoolName() 
	{
		return ADtxtSchoolName;
	}

	public JTextField getADtxtJEEScore() 
	{
		return ADtxtJEEScore;
	}

	public JTextField getADtxtJEERollNumber() 
	{
		return ADtxtJEERollNumber;
	}

	public JTextField getADtxtAcpcRank() 
	{
		return ADtxtAcpcRank;
	}

	
	public void setADtxtBoardRollNum12th(String saDtxtBoardRollNum12th) 
	{
		this.ADtxtBoardRollNum12th.setText(saDtxtBoardRollNum12th);
	}

	public void setADtxtOverallPercentage12th(String saDtxtOverallPercentage12th) 
	{
		this.ADtxtOverallPercentage12th.setText(saDtxtOverallPercentage12th);
	}

	public void setADtxtJEEPercentile(String saDtxtJEEPercentile) 
	{
		this.ADtxtJEEPercentile.setText(saDtxtJEEPercentile);
	}

	public void setADtxtPCMPercentage12th(String saDtxtPCMPercentage12th) 
	{
		this.ADtxtPCMPercentage12th.setText(saDtxtPCMPercentage12th);
	}

	public void setADtxtPCMPercentile12th(String saDtxtPCMPercentile12th) 
	{
		this.ADtxtPCMPercentile12th.setText(saDtxtPCMPercentile12th);
	}

	public void setADtxtSchoolName(String saDtxtSchoolName) 
	{
		this.ADtxtSchoolName.setText(saDtxtSchoolName);
	}

	public void setADtxtJEEScore(String saDtxtJEEScore) 
	{
		this.ADtxtJEEScore.setText(saDtxtJEEScore);
	}

	public void setADtxtJEERollNumber(String saDtxtJEERollNumber) 
	{
		this.ADtxtJEERollNumber.setText(saDtxtJEERollNumber);
	}

	public void setADtxtAcpcRank(String saDtxtAcpcRank) 
	{
		this.ADtxtAcpcRank.setText(saDtxtAcpcRank);
	}

	public void setADyearChooser10th(int iaDyearChooser10th) 
	{
		this.ADyearChooser10th.setYear(iaDyearChooser10th);
	}

	public void setADyearChooser12th(int iaDyearChooser12th) 
	{
		this.ADyearChooser12th.setYear(iaDyearChooser12th);
	}
	
	public void setADcmbSchoolBoard(String saDcmbSchoolBoard) 
	{
		ADcmbSchoolBoard.setSelectedItem(saDcmbSchoolBoard);
	}
	
	
	public JButton getADbtnBackGardianDetails() 
	{
		return ADbtnAdmissionType;
	}

	public JButton getADbtnNextEnrollmentDetails() 
	{
		return ADbtnNext;
	}

	public JYearChooser getADyearChooser10th() 
	{
		return ADyearChooser10th;
	}

	public JYearChooser getADyearChooser12th() 
	{
		return ADyearChooser12th;
	}

	/*public void setADtxtBoardRollNum12th(JTextField aDtxtBoardRollNum12th) 
	{
		ADtxtBoardRollNum12th = aDtxtBoardRollNum12th;
	}

	public void setADtxtOverallPercentage12th(JTextField aDtxtOverallPercentage12th) 
	{
		ADtxtOverallPercentage12th = aDtxtOverallPercentage12th;
	}

	public void setADtxtJEEPercentile(JTextField aDtxtJEEPercentile) 
	{
		ADtxtJEEPercentile = aDtxtJEEPercentile;
	}

	public void setADtxtPCMPercentage12th(JTextField aDtxtPCMPercentage12th) 
	{
		ADtxtPCMPercentage12th = aDtxtPCMPercentage12th;
	}

	public void setADtxtPCMPercentile12th(JTextField aDtxtPCMPercentile12th) 
	{
		ADtxtPCMPercentile12th = aDtxtPCMPercentile12th;
	}

	public void setADtxtSchoolName(JTextField aDtxtSchoolName) 
	{
		ADtxtSchoolName = aDtxtSchoolName;
	}

	public void setADtxtJEEScore(JTextField aDtxtJEEScore) 
	{
		ADtxtJEEScore = aDtxtJEEScore;
	}

	public void setADtxtJEERollNumber(JTextField aDtxtJEERollNumber) 
	{
		ADtxtJEERollNumber = aDtxtJEERollNumber;
	}

	public void setADtxtAcpcRank(JTextField aDtxtAcpcRank) 
	{
		ADtxtAcpcRank = aDtxtAcpcRank;
	}

	public void setADbtnBackGardianDetails(JButton aDbtnBackGardianDetails) 
	{
		ADbtnAdmissionType = aDbtnBackGardianDetails;
	}

	public void setADbtnNextEnrollmentDetails(JButton aDbtnNextEnrollmentDetails) 
	{
		ADbtnNext = aDbtnNextEnrollmentDetails;
	}

	public void setADyearChooser10th(JYearChooser aDyearChooser10th) 
	{
		ADyearChooser10th = aDyearChooser10th;
	}

	public void setADyearChooser12th(JYearChooser aDyearChooser12th) 
	{
		ADyearChooser12th = aDyearChooser12th;
	}
	
	public void setADcmbSchoolBoard(JComboBox aDcmbSchoolBoard) 
	{
		ADcmbSchoolBoard = aDcmbSchoolBoard;
	}

	/**
	 * Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Board_JEE_GUI frame = new Board_JEE_GUI();
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
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public ModBoard_JEE_GUI() 
	{
		//setType(Type.UTILITY);
		
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		this.setBounds(0, 0,screen.width,screen.height - 30);
		
		setLocationRelativeTo(null);
		setTitle("MODIFY ACADEMIC DETAILS");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 956, 620);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 153, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel ADpanelPreviousAcademicDetails = new JPanel();
		ADpanelPreviousAcademicDetails.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		ADpanelPreviousAcademicDetails.setBounds(219, 76, 938, 573);
		contentPane.add(ADpanelPreviousAcademicDetails);
		ADpanelPreviousAcademicDetails.setLayout(null);
		
		JPanel ADpanelAcademicDetails = new JPanel();
		ADpanelAcademicDetails.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "MODIFY ACADEMIC DETAILS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		ADpanelAcademicDetails.setBounds(12, 94, 914, 416);
		ADpanelPreviousAcademicDetails.add(ADpanelAcademicDetails);
		ADpanelAcademicDetails.setLayout(null);
		
		JLabel ADlblPassingYear10th = new JLabel("Passing Year :");
		ADlblPassingYear10th.setHorizontalAlignment(SwingConstants.CENTER);
		ADlblPassingYear10th.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ADlblPassingYear10th.setBounds(12, 63, 114, 30);
		ADpanelAcademicDetails.add(ADlblPassingYear10th);
		
		JLabel ADlblBoard10th = new JLabel("10th Board");
		ADlblBoard10th.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		ADlblBoard10th.setHorizontalAlignment(SwingConstants.CENTER);
		ADlblBoard10th.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ADlblBoard10th.setBounds(12, 32, 86, 30);
		ADpanelAcademicDetails.add(ADlblBoard10th);
		
		JLabel ADlblBoard12th = new JLabel("12th Board");
		ADlblBoard12th.setHorizontalAlignment(SwingConstants.CENTER);
		ADlblBoard12th.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ADlblBoard12th.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		ADlblBoard12th.setBounds(12, 106, 86, 30);
		ADpanelAcademicDetails.add(ADlblBoard12th);
		
		JLabel ADlblPassingYear12th = new JLabel("Passing Year :");
		ADlblPassingYear12th.setHorizontalAlignment(SwingConstants.CENTER);
		ADlblPassingYear12th.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ADlblPassingYear12th.setBounds(12, 138, 114, 41);
		ADpanelAcademicDetails.add(ADlblPassingYear12th);
		
		JLabel ADlblBoardRollNum12th = new JLabel("Board Roll Number :");
		ADlblBoardRollNum12th.setHorizontalAlignment(SwingConstants.CENTER);
		ADlblBoardRollNum12th.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ADlblBoardRollNum12th.setBounds(12, 202, 148, 30);
		ADpanelAcademicDetails.add(ADlblBoardRollNum12th);
		
		JLabel ADlblOverallPercentage12th = new JLabel("Overall Percentage :");
		ADlblOverallPercentage12th.setHorizontalAlignment(SwingConstants.CENTER);
		ADlblOverallPercentage12th.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ADlblOverallPercentage12th.setBounds(309, 149, 148, 30);
		ADpanelAcademicDetails.add(ADlblOverallPercentage12th);
		
		JLabel ADlblJEEPercentile = new JLabel("JEE Percentile :");
		ADlblJEEPercentile.setHorizontalAlignment(SwingConstants.CENTER);
		ADlblJEEPercentile.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ADlblJEEPercentile.setBounds(473, 356, 109, 30);
		ADpanelAcademicDetails.add(ADlblJEEPercentile);
		
		JLabel ADlblPCMTheoryPercentage12th = new JLabel("PCM Theory Percentage :");
		ADlblPCMTheoryPercentage12th.setHorizontalAlignment(SwingConstants.CENTER);
		ADlblPCMTheoryPercentage12th.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ADlblPCMTheoryPercentage12th.setBounds(597, 149, 185, 30);
		ADpanelAcademicDetails.add(ADlblPCMTheoryPercentage12th);
		
		JLabel ADlblSchoolName = new JLabel("School Name :");
		ADlblSchoolName.setHorizontalAlignment(SwingConstants.CENTER);
		ADlblSchoolName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ADlblSchoolName.setBounds(309, 256, 114, 30);
		ADpanelAcademicDetails.add(ADlblSchoolName);
		
		JLabel ADlblJEEScore = new JLabel("JEE Score :");
		ADlblJEEScore.setHorizontalAlignment(SwingConstants.CENTER);
		ADlblJEEScore.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ADlblJEEScore.setBounds(267, 356, 80, 30);
		ADpanelAcademicDetails.add(ADlblJEEScore);
		
		JLabel ADlblPCMTheoryPercentile12th = new JLabel("PCM Theory Percentile :");
		ADlblPCMTheoryPercentile12th.setHorizontalAlignment(SwingConstants.CENTER);
		ADlblPCMTheoryPercentile12th.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ADlblPCMTheoryPercentile12th.setBounds(476, 202, 175, 30);
		ADpanelAcademicDetails.add(ADlblPCMTheoryPercentile12th);
		
		JLabel ADlblJEERollNumber = new JLabel("JEE Roll Number :");
		ADlblJEERollNumber.setHorizontalAlignment(SwingConstants.CENTER);
		ADlblJEERollNumber.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ADlblJEERollNumber.setBounds(10, 356, 133, 30);
		ADpanelAcademicDetails.add(ADlblJEERollNumber);
		
		JLabel ADlblAcpcRank = new JLabel("ACPC Rank :");
		ADlblAcpcRank.setHorizontalAlignment(SwingConstants.CENTER);
		ADlblAcpcRank.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ADlblAcpcRank.setBounds(715, 356, 101, 30);
		ADpanelAcademicDetails.add(ADlblAcpcRank);
		
		JLabel ADlblJeeAndAcpc = new JLabel("JEE And ACPC");
		ADlblJeeAndAcpc.setHorizontalAlignment(SwingConstants.CENTER);
		ADlblJeeAndAcpc.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ADlblJeeAndAcpc.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		ADlblJeeAndAcpc.setBounds(12, 313, 112, 30);
		ADpanelAcademicDetails.add(ADlblJeeAndAcpc);
		
		ADtxtBoardRollNum12th = new JTextField();
		ADtxtBoardRollNum12th.setToolTipText("Enter 12 Board Roll Number");
		ADtxtBoardRollNum12th.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		ADtxtBoardRollNum12th.setBounds(175, 207, 163, 22);
		ADpanelAcademicDetails.add(ADtxtBoardRollNum12th);
		ADtxtBoardRollNum12th.setColumns(10);
		
		ADtxtOverallPercentage12th = new JTextField();
		ADtxtOverallPercentage12th.setToolTipText("Enter overall percentage for 12th");
		ADtxtOverallPercentage12th.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		ADtxtOverallPercentage12th.setColumns(10);
		ADtxtOverallPercentage12th.setBounds(469, 154, 116, 22);
		ADpanelAcademicDetails.add(ADtxtOverallPercentage12th);
		
		ADtxtJEEPercentile = new JTextField();
		ADtxtJEEPercentile.setToolTipText("Enter JEE Percentile");
		ADtxtJEEPercentile.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		ADtxtJEEPercentile.setColumns(10);
		ADtxtJEEPercentile.setBounds(582, 362, 123, 22);
		ADpanelAcademicDetails.add(ADtxtJEEPercentile);
		
		ADtxtPCMPercentage12th = new JTextField();
		ADtxtPCMPercentage12th.setToolTipText("Enter PCM theory Percentage");
		ADtxtPCMPercentage12th.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		ADtxtPCMPercentage12th.setColumns(10);
		ADtxtPCMPercentage12th.setBounds(786, 154, 116, 22);
		ADpanelAcademicDetails.add(ADtxtPCMPercentage12th);
		
		ADtxtPCMPercentile12th = new JTextField();
		ADtxtPCMPercentile12th.setToolTipText("Enter PCM theory Percentile");
		ADtxtPCMPercentile12th.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		ADtxtPCMPercentile12th.setColumns(10);
		ADtxtPCMPercentile12th.setBounds(652, 208, 175, 22);
		ADpanelAcademicDetails.add(ADtxtPCMPercentile12th);
		
		ADtxtSchoolName = new JTextField();
		ADtxtSchoolName.setToolTipText("Enter School Name");
		ADtxtSchoolName.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		ADtxtSchoolName.setColumns(10);
		ADtxtSchoolName.setBounds(424, 261, 478, 22);
		ADpanelAcademicDetails.add(ADtxtSchoolName);
		
		ADtxtJEEScore = new JTextField();
		ADtxtJEEScore.setToolTipText("Enter JEE Score");
		ADtxtJEEScore.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		ADtxtJEEScore.setColumns(10);
		ADtxtJEEScore.setBounds(350, 362, 116, 22);
		ADpanelAcademicDetails.add(ADtxtJEEScore);
		
		ADtxtJEERollNumber = new JTextField();
		ADtxtJEERollNumber.setToolTipText("Enter JEE RollNum ");
		ADtxtJEERollNumber.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		ADtxtJEERollNumber.setColumns(10);
		ADtxtJEERollNumber.setBounds(141, 362, 116, 22);
		ADpanelAcademicDetails.add(ADtxtJEERollNumber);
		
		ADtxtAcpcRank = new JTextField();
		ADtxtAcpcRank.setToolTipText("Enter ACPC Rank");
		ADtxtAcpcRank.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		ADtxtAcpcRank.setColumns(10);
		ADtxtAcpcRank.setBounds(816, 362, 86, 22);
		ADpanelAcademicDetails.add(ADtxtAcpcRank);
		
		ADyearChooser10th = new JYearChooser();
		ADyearChooser10th.setBounds(126, 71, 93, 22);
		ADpanelAcademicDetails.add(ADyearChooser10th);
		
		ADyearChooser12th = new JYearChooser();
		ADyearChooser12th.setBounds(126, 149, 93, 22);
		ADpanelAcademicDetails.add(ADyearChooser12th);
		
		JLabel ADlblSchoolBoard = new JLabel("School Board :");
		ADlblSchoolBoard.setHorizontalAlignment(SwingConstants.CENTER);
		ADlblSchoolBoard.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ADlblSchoolBoard.setBounds(12, 256, 114, 30);
		ADpanelAcademicDetails.add(ADlblSchoolBoard);
		
		ADcmbSchoolBoard = new JComboBox();
		ADcmbSchoolBoard.setModel(new DefaultComboBoxModel(new String[] {"", "GSEB", "CBSE", "ICSE", "IB", "OTHERS"}));
		ADcmbSchoolBoard.setToolTipText("Select School Board");
		ADcmbSchoolBoard.setBounds(141, 257, 109, 30);
		ADpanelAcademicDetails.add(ADcmbSchoolBoard);
	
		JLabel ADlblAcademicDetails = new JLabel("MODIFY ACADEMIC DETAILS");
		ADlblAcademicDetails.setHorizontalAlignment(SwingConstants.CENTER);
		ADlblAcademicDetails.setForeground(Color.BLACK);
		ADlblAcademicDetails.setFont(new Font("Tahoma", Font.BOLD, 24));
		ADlblAcademicDetails.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 0, 0), null, null, Color.BLUE));
		ADlblAcademicDetails.setBounds(75, 13, 790, 57);
		ADpanelPreviousAcademicDetails.add(ADlblAcademicDetails);
		
		ADbtnAdmissionType = new JButton("Back");
		ADbtnAdmissionType.setBounds(211, 526, 194, 31);
		ADpanelPreviousAcademicDetails.add(ADbtnAdmissionType);
		
		ADbtnNext = new JButton("Next");
		ADbtnNext.setBounds(552, 526, 194, 31);
		ADpanelPreviousAcademicDetails.add(ADbtnNext);
	}
	public boolean ADgetTextEmpty()
	{
		if(ADtxtAcpcRank.getText().isEmpty() || ADtxtBoardRollNum12th.getText().isEmpty() || ADtxtJEERollNumber.getText().isEmpty() 
				|| ADtxtJEEScore.getText().isEmpty() || ADtxtOverallPercentage12th.getText().isEmpty() 
				|| ADtxtPCMPercentage12th.getText().isEmpty() || ADtxtPCMPercentile12th.getText().isEmpty() 
				|| ADtxtSchoolName.getText().isEmpty() || ADcmbSchoolBoard.getSelectedItem().equals(""))
			return true;
		else 
			return false;
	}
	
	public void setAction(SearchModifyActionListener searchm)
	{
		modsearchlisten = searchm;
		//searchframelisten = sr;
		this.ADbtnNext.addActionListener(modsearchlisten);
		this.ADbtnAdmissionType.addActionListener(modsearchlisten);
	}
	
	public void setAction(SearchFromFrameActionListener sr)
	{
		//modsearchlisten = searchm;
		searchframelisten = sr;
		this.ADbtnAdmissionType.addActionListener(searchframelisten);
		this.ADbtnNext.addActionListener(searchframelisten);
	}
	
	public void clear()
	{
		this.ADtxtAcpcRank.setText("");
		this.ADtxtBoardRollNum12th.setText("");
		this.ADtxtJEEPercentile.setText("");
		this.ADtxtJEERollNumber.setText("");
		this.ADtxtJEEScore.setText("");
		this.ADtxtOverallPercentage12th.setText("");
		this.ADtxtPCMPercentage12th.setText("");
		this.ADtxtPCMPercentile12th.setText("");
		this.ADtxtSchoolName.setText("");
		this.ADcmbSchoolBoard.setSelectedItem("NONE");
		this.ADyearChooser10th.setYear(2014);
		this.ADyearChooser12th.setYear(2016);
	}
}
