package sprj_GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JYearChooser;

import sprj_Listener.EnterNewStudentActionListener;
import sprj_Listener.JEECheckKeyListener;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;

@SuppressWarnings("serial")
public class UnconfirmedAdmissionDetails_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField UADtxtJeeRollNo;
	private JTextField UADtxtFirstName;
	private JTextField UADtxtLastName;
	private JButton UADbtnSubmitMainFrame;
	private JButton UADbtnBackMainFrame;
	@SuppressWarnings("rawtypes")
	private JComboBox UADcomboBoxCategory;
	@SuppressWarnings("rawtypes")
	private JComboBox UADcomboBoxBranch;
	private JYearChooser UADyearJoin;
	private JRadioButton rdbtnMale;
	private JRadioButton rdbtnFemale;
	
	private EnterNewStudentActionListener enterlisten;
	private JEECheckKeyListener jeelisten;
	private JPanel panel_1;
	private JTextField UAFathersName;
	private JTextField UAACPCRank;
	
	
	public JTextField getUADtxtJeeRollNo() {
		return UADtxtJeeRollNo;
	}

	public JTextField getUADtxtFirstName() {
		return UADtxtFirstName;
	}


	public JTextField getUADtxtACPCrank()
	{
		return this.UAACPCRank;
	}

	public JTextField getUADtxtFatherName()
	{
		return this.UAFathersName;
	}

	public JTextField getUADtxtLastName() {
		return UADtxtLastName;
	}

	public JButton getUADbtnSubmitMainFrame() {
		return UADbtnSubmitMainFrame;
	}
	
	public JButton getUADbtnBackMainFrame()
	{
		return UADbtnBackMainFrame;
	}
	
	public String getUADcmbbranch()
	{
		//System.out.println(this.UADcomboBoxBranch.getSelectedItem());
		return (String)this.UADcomboBoxBranch.getSelectedItem();
		
	}
	
	public int getUADyearjoin()
	{
		return this.UADyearJoin.getYear();
	}
	
	public String getUADcmbcategory()
	{
		return (String)this.UADcomboBoxCategory.getSelectedItem();
	}
	
	public String getUADgender()
	{
		if(this.rdbtnFemale.isSelected())
			return "Female";
		
		else if(this.rdbtnMale.isSelected())
			return "Male";
		
		else
			return "";
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getUADcombobranch()
	{
		return this.UADcomboBoxBranch;
	}
	
	public void setUADtxtJeeRollNo(JTextField uADtxtJeeRollNo) {
		UADtxtJeeRollNo = uADtxtJeeRollNo;
	}

	public void setUADtxtFirstName(JTextField uADtxtFirstName) {
		UADtxtFirstName = uADtxtFirstName;
	}


	public void setUADtxtLastName(JTextField uADtxtLastName) {
		UADtxtLastName = uADtxtLastName;
	}

	public void setUADbtnSubmitMainFrame(JButton uADbtnSubmitMainFrame) {
		UADbtnSubmitMainFrame = uADbtnSubmitMainFrame;
	}
	
	public void setUADbtnBackMainFrame(JButton uADbtnBackMainFrame)
	{
		UADbtnBackMainFrame = uADbtnBackMainFrame;
	}


	/**
	 * Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UnconfirmedAdmissionDetails_GUI frame = new UnconfirmedAdmissionDetails_GUI();
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
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public UnconfirmedAdmissionDetails_GUI() {
		setLocationRelativeTo(null);
		setTitle("UNCONFIRMED ADMISSION DETAILS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		this.setBounds(0, 0, screen.width, screen.height-30);
		
		//setBounds(100, 100, 529, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		panel_1.setBounds(365, 110, 657, 400);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setAlignmentX(5.0f);
		panel.setBounds(33, 72, 609, 259);
		panel_1.add(panel);
		panel.setLayout(null);
		
		JLabel UADlblFirstName = new JLabel("First Name:");
		UADlblFirstName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		UADlblFirstName.setBounds(20, 54, 90, 29);
		panel.add(UADlblFirstName);
		
		UADtxtFirstName = new JTextField();
		UADtxtFirstName.setToolTipText("Enter First Name");
		UADtxtFirstName.setColumns(10);
		UADtxtFirstName.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		UADtxtFirstName.setBounds(120, 51, 171, 29);
		panel.add(UADtxtFirstName);
		
		JLabel UADlblCategory = new JLabel("Category:");
		UADlblCategory.setFont(new Font("Tahoma", Font.PLAIN, 16));
		UADlblCategory.setBounds(309, 151, 73, 27);
		panel.add(UADlblCategory);
		
		JLabel UADlblLastName = new JLabel("Last Name:");
		UADlblLastName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		UADlblLastName.setBounds(321, 54, 90, 29);
		panel.add(UADlblLastName);
		
		UADtxtLastName = new JTextField();
		UADtxtLastName.setToolTipText("Enter Last Name");
		UADtxtLastName.setColumns(10);
		UADtxtLastName.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		UADtxtLastName.setBounds(421, 54, 141, 29);
		panel.add(UADtxtLastName);
		
		
		/*UADyearJoin = new JYearChooser();
		UADyearJoin.setBounds(409, 12, 47, 20);
		panel.add(UADyearJoin);*/
		
		JLabel UADlblJoiningYear = new JLabel("Year of Joining:");
		UADlblJoiningYear.setFont(new Font("Tahoma", Font.PLAIN, 16));
		UADlblJoiningYear.setBounds(317, 12, 141, 29);
		panel.add(UADlblJoiningYear);
		
		
		UADcomboBoxCategory = new JComboBox();
		UADcomboBoxCategory.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		UADcomboBoxCategory.setModel(new DefaultComboBoxModel(new String[] {"", "General", "SC/ST", "OBC", "SEBC","EBC", "TFW", "Free Ship Card" ,"Others"}));
		UADcomboBoxCategory.setBounds(392, 147, 141, 36);
		panel.add(UADcomboBoxCategory);
		
		JLabel UADlblJeeRollNo = new JLabel("JEE Roll No:");
		UADlblJeeRollNo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		UADlblJeeRollNo.setBounds(10, 12, 93, 29);
		panel.add(UADlblJeeRollNo);
		
		UADtxtJeeRollNo = new JTextField();
		UADtxtJeeRollNo.setToolTipText("Enter JEE Roll Number");
		UADtxtJeeRollNo.setColumns(10);
		UADtxtJeeRollNo.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		UADtxtJeeRollNo.setBounds(126, 12, 132, 32);
		panel.add(UADtxtJeeRollNo);
		
		JLabel UADlblBranch = new JLabel("Branch:");
		UADlblBranch.setFont(new Font("Tahoma", Font.PLAIN, 16));
		UADlblBranch.setBounds(32, 150, 58, 29);
		panel.add(UADlblBranch);
		
		UADcomboBoxBranch = new JComboBox();
		UADcomboBoxBranch.setModel(new DefaultComboBoxModel(new String[] {"", "ICT", "MECH", "CHEM"}));
		UADcomboBoxBranch.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		UADcomboBoxBranch.setBounds(100, 148, 158, 36);
		panel.add(UADcomboBoxBranch);
		
		UADyearJoin = new JYearChooser();
		UADyearJoin.setBounds(472, 12, 113, 31);
		panel.add(UADyearJoin);
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblGender.setBounds(0, 94, 68, 29);
		panel.add(lblGender);
		
		rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnMale.setBounds(76, 99, 58, 23);
		panel.add(rdbtnMale);
		
		rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnFemale.setBounds(141, 98, 86, 23);
		panel.add(rdbtnFemale);
		
		ButtonGroup uadgend = new ButtonGroup();
		uadgend.add(rdbtnFemale);
		uadgend.add(rdbtnMale);
		
		JLabel lblFathersName = new JLabel("Father's Name:");
		lblFathersName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFathersName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblFathersName.setBounds(279, 103, 123, 29);
		panel.add(lblFathersName);
		
		UAFathersName = new JTextField();
		UAFathersName.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		UAFathersName.setBounds(421, 94, 141, 32);
		panel.add(UAFathersName);
		UAFathersName.setColumns(10);
		
		JLabel lblAcpcRank = new JLabel("ACPC Rank:");
		lblAcpcRank.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAcpcRank.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAcpcRank.setBounds(165, 218, 104, 29);
		panel.add(lblAcpcRank);
		
		UAACPCRank = new JTextField();
		UAACPCRank.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		UAACPCRank.setBounds(276, 217, 123, 31);
		panel.add(UAACPCRank);
		UAACPCRank.setColumns(10);
		
		JLabel lblUnconfirmedAdmissionDetails = new JLabel("UNCONFIRMED ADMISSION DETAILS");
		lblUnconfirmedAdmissionDetails.setHorizontalAlignment(SwingConstants.CENTER);
		lblUnconfirmedAdmissionDetails.setForeground(Color.BLACK);
		lblUnconfirmedAdmissionDetails.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblUnconfirmedAdmissionDetails.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		lblUnconfirmedAdmissionDetails.setBounds(23, 11, 609, 50);
		panel_1.add(lblUnconfirmedAdmissionDetails);
		
		UADbtnSubmitMainFrame = new JButton("Submit");
		UADbtnSubmitMainFrame.setFont(new Font("Tahoma", Font.PLAIN, 18));
		UADbtnSubmitMainFrame.setBounds(403, 342, 138, 30);
		panel_1.add(UADbtnSubmitMainFrame);
		
		UADbtnBackMainFrame = new JButton("Back");
		UADbtnBackMainFrame.setFont(new Font("Tahoma", Font.PLAIN, 18));
		UADbtnBackMainFrame.setBounds(144, 342, 151, 30);
		panel_1.add(UADbtnBackMainFrame);
		
		
	}
	
	public void setAction(EnterNewStudentActionListener enter, Error_GUI er)
	{
		enterlisten = enter;
		jeelisten = new JEECheckKeyListener(this, er);
		this.UADbtnSubmitMainFrame.addActionListener(enterlisten);
		this.UADbtnBackMainFrame.addActionListener(enterlisten);
		this.UADcomboBoxBranch.addItemListener(jeelisten);
		
	}
	
	public boolean UADgetTextEmpty()
	{
		if(UADtxtFirstName.getText().isEmpty() || 
				UADtxtJeeRollNo.getText().isEmpty() || UADtxtLastName.getText().isEmpty()
				|| this.UADcomboBoxBranch.getSelectedItem().equals("") || this.UADcomboBoxCategory.getSelectedItem().equals(""))
			return true;
		else 
			return false;
	}
	
	public void clear()
	{
		this.UADtxtJeeRollNo.setText("");
		this.UADtxtFirstName.setText("");
		this.UADyearJoin.setYear(2016);
		this.UADtxtJeeRollNo.setText("");
		this.UAFathersName.setText("");
		this.UAACPCRank.setText("");
		this.UADtxtLastName.setText("");
		this.UADcomboBoxBranch.setSelectedIndex(0);
		this.UADcomboBoxCategory.setSelectedIndex(0);
	}
}
