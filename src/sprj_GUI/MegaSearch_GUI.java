package sprj_GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.Dimension;

import sprj_Listener.MegaSearchActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class MegaSearch_GUI extends JFrame {

	private JPanel contentPane;
	private JRadioButton MSrdbtnIct;
	private JRadioButton MSrdbtnMech;
	private JRadioButton MSrdbtnChem;
	private JCheckBox MSchkboxFirstName;
	private JCheckBox MSchkboxAll;
	private JCheckBox MSchkboxLastName;
	private JCheckBox MSchkboxJEERollNum;
	private JCheckBox MSchkboxGender;
	private JCheckBox MSchkboxACPCRank;
	private JCheckBox MSchkboxJEEScore;
	private JCheckBox MSchkboxAdmStatus;
	private JCheckBox MSchkboxAdmType;
	private JCheckBox MSchkboxBoard;
	private JCheckBox MSchkboxFatherIncome;
	private JCheckBox MSchkboxCategory;
	private JCheckBox MSchkboxEmailId;
	private JCheckBox chckbxContactp;
	private JCheckBox chckbxAddress;
	private JCheckBox chckbxContacts;
	

	private JCheckBox chckbxYearOfJoining;
	
	private JButton MSbtnBack;
	private JButton MSbtnSubmit;
	
	ButtonGroup buttonbranch;
	
	
	MegaSearchActionListener megasearch;
		
	public JCheckBox getChckbxAddress() {
		return chckbxAddress;
	}

	public JCheckBox getChckbxContacts() {
		return chckbxContacts;
	}

	public void setChckbxAddress(JCheckBox chckbxAddress) {
		this.chckbxAddress = chckbxAddress;
	}

	public void setChckbxContacts(JCheckBox chckbxContacts) {
		this.chckbxContacts = chckbxContacts;
	}

	public JRadioButton getMSrdbtnIct() {
		return MSrdbtnIct;
	}

	public JRadioButton getMSrdbtnMech() {
		return MSrdbtnMech;
	}

	public JRadioButton getMSrdbtnChem() {
		return MSrdbtnChem;
	}

	
	public JCheckBox getChckbxContactp() {
		return chckbxContactp;
	}

	public JCheckBox getChckbxYearOfJoining() {
		return chckbxYearOfJoining;
	}

	public void setChckbxContactp(JCheckBox chckbxContactp) {
		this.chckbxContactp = chckbxContactp;
	}

	public void setChckbxYearOfJoining(JCheckBox chckbxYearOfJoining) {
		this.chckbxYearOfJoining = chckbxYearOfJoining;
	}
	
	public JCheckBox getMSchkboxFirstName() {
		return MSchkboxFirstName;
	}

	public JCheckBox getMSchkboxAll() {
		return MSchkboxAll;
	}

	public JCheckBox getMSchkboxLastName() {
		return MSchkboxLastName;
	}

	public JCheckBox getMSchkboxJEERollNum() {
		return MSchkboxJEERollNum;
	}

	public JCheckBox getMSchkboxGender() {
		return MSchkboxGender;
	}

	public JCheckBox getMSchkboxACPCRank() {
		return MSchkboxACPCRank;
	}

	public JCheckBox getMSchkboxJEEScore() {
		return MSchkboxJEEScore;
	}

	public JCheckBox getMSchkboxAdmStatus() {
		return MSchkboxAdmStatus;
	}

	public JCheckBox getMSchkboxAdmType() {
		return MSchkboxAdmType;
	}

	public JCheckBox getMSchkboxBoard() {
		return MSchkboxBoard;
	}

	public JCheckBox getMSchkboxFatherIncome() {
		return MSchkboxFatherIncome;
	}

	public JCheckBox getMSchkboxCategory() {
		return MSchkboxCategory;
	}

	public JCheckBox getMSchkboxEmailId() {
		return MSchkboxEmailId;
	}

	public JButton getMSbtnBack() {
		return MSbtnBack;
	}

	public JButton getMSbtnSubmit() {
		return MSbtnSubmit;
	}

	public void setMSrdbtnIct(JRadioButton mSrdbtnIct) {
		MSrdbtnIct = mSrdbtnIct;
	}

	public void setMSrdbtnMech(JRadioButton mSrdbtnMech) {
		MSrdbtnMech = mSrdbtnMech;
	}

	public void setMSrdbtnChem(JRadioButton mSrdbtnChem) {
		MSrdbtnChem = mSrdbtnChem;
	}

	public void setMSchkboxFirstName(JCheckBox mSchkboxFirstName) {
		MSchkboxFirstName = mSchkboxFirstName;
	}

	public void setMSchkboxAll(JCheckBox mSchkboxAll) {
		MSchkboxAll = mSchkboxAll;
	}

	public void setMSchkboxLastName(JCheckBox mSchkboxLastName) {
		MSchkboxLastName = mSchkboxLastName;
	}

	public void setMSchkboxJEERollNum(JCheckBox mSchkboxJEERollNum) {
		MSchkboxJEERollNum = mSchkboxJEERollNum;
	}

	public void setMSchkboxGender(JCheckBox mSchkboxGender) {
		MSchkboxGender = mSchkboxGender;
	}

	public void setMSchkboxACPCRank(JCheckBox mSchkboxACPCRank) {
		MSchkboxACPCRank = mSchkboxACPCRank;
	}

	public void setMSchkboxJEEScore(JCheckBox mSchkboxJEEScore) {
		MSchkboxJEEScore = mSchkboxJEEScore;
	}

	public void setMSchkboxAdmStatus(JCheckBox mSchkboxAdmStatus) {
		MSchkboxAdmStatus = mSchkboxAdmStatus;
	}

	public void setMSchkboxAdmType(JCheckBox mSchkboxAdmType) {
		MSchkboxAdmType = mSchkboxAdmType;
	}

	public void setMSchkboxBoard(JCheckBox mSchkboxBoard) {
		MSchkboxBoard = mSchkboxBoard;
	}

	public void setMSchkboxFatherIncome(JCheckBox mSchkboxFatherIncome) {
		MSchkboxFatherIncome = mSchkboxFatherIncome;
	}

	public void setMSchkboxCategory(JCheckBox mSchkboxCategory) {
		MSchkboxCategory = mSchkboxCategory;
	}

	public void setMSchkboxEmailId(JCheckBox mSchkboxEmailId) {
		MSchkboxEmailId = mSchkboxEmailId;
	}

	public void setMSbtnBack(JButton mSbtnBack) {
		MSbtnBack = mSbtnBack;
	}

	public void setMSbtnSubmit(JButton mSbtnSubmit) {
		MSbtnSubmit = mSbtnSubmit;
	}

	/**
	 * Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MegaSearch_GUI frame = new MegaSearch_GUI();
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
	public MegaSearch_GUI() {
		//setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 729, 450);
		
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		this.setBounds(0, 0,screen.width,screen.height - 30);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		panel_2.setBounds(297, 104, 751, 547);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BRANCH");
		lblNewLabel.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(304, 11, 151, 33);
		panel_2.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("COLUMN-FIELDS");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(293, 135, 183, 33);
		panel_2.add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		panel.setBounds(38, 55, 679, 66);
		panel_2.add(panel);
		panel.setLayout(null);
		
		MSrdbtnIct = new JRadioButton("ICT");
		MSrdbtnIct.setFont(new Font("Tahoma", Font.PLAIN, 15));
		MSrdbtnIct.setBounds(159, 17, 109, 23);
		panel.add(MSrdbtnIct);
		
		MSrdbtnMech = new JRadioButton("MECH");
		MSrdbtnMech.setFont(new Font("Tahoma", Font.PLAIN, 15));
		MSrdbtnMech.setBounds(319, 17, 109, 23);
		panel.add(MSrdbtnMech);
		
		MSrdbtnChem = new JRadioButton("CHEM");
		MSrdbtnChem.setFont(new Font("Tahoma", Font.PLAIN, 15));
		MSrdbtnChem.setBounds(472, 17, 109, 23);
		panel.add(MSrdbtnChem);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		panel_1.setBounds(38, 193, 679, 280);
		panel_2.add(panel_1);
		panel_1.setLayout(null);
		
		MSchkboxFirstName = new JCheckBox("First Name");
		MSchkboxFirstName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		MSchkboxFirstName.setBounds(122, 22, 97, 23);
		panel_1.add(MSchkboxFirstName);
		
		MSchkboxLastName = new JCheckBox("Last Name");
		MSchkboxLastName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		MSchkboxLastName.setBounds(292, 22, 97, 23);
		panel_1.add(MSchkboxLastName);
		
		MSchkboxJEERollNum = new JCheckBox("JEE Roll Number");
		MSchkboxJEERollNum.setFont(new Font("Tahoma", Font.PLAIN, 14));
		MSchkboxJEERollNum.setBounds(445, 22, 128, 23);
		panel_1.add(MSchkboxJEERollNum);
		
		MSchkboxGender = new JCheckBox("Gender");
		MSchkboxGender.setFont(new Font("Tahoma", Font.PLAIN, 14));
		MSchkboxGender.setBounds(445, 62, 97, 23);
		panel_1.add(MSchkboxGender);
		
		MSchkboxACPCRank = new JCheckBox("ACPC Rank");
		MSchkboxACPCRank.setFont(new Font("Tahoma", Font.PLAIN, 14));
		MSchkboxACPCRank.setBounds(292, 62, 97, 23);
		panel_1.add(MSchkboxACPCRank);
		
		MSchkboxJEEScore = new JCheckBox("JEE Score");
		MSchkboxJEEScore.setFont(new Font("Tahoma", Font.PLAIN, 14));
		MSchkboxJEEScore.setBounds(120, 62, 97, 23);
		panel_1.add(MSchkboxJEEScore);
		
		MSchkboxAdmStatus = new JCheckBox("Admission Status");
		MSchkboxAdmStatus.setFont(new Font("Tahoma", Font.PLAIN, 14));
		MSchkboxAdmStatus.setBounds(120, 112, 141, 23);
		panel_1.add(MSchkboxAdmStatus);
		
		MSchkboxAdmType = new JCheckBox("Admission Type");
		MSchkboxAdmType.setFont(new Font("Tahoma", Font.PLAIN, 14));
		MSchkboxAdmType.setBounds(292, 112, 141, 23);
		panel_1.add(MSchkboxAdmType);
		
		MSchkboxBoard = new JCheckBox("Board");
		MSchkboxBoard.setFont(new Font("Tahoma", Font.PLAIN, 14));
		MSchkboxBoard.setBounds(445, 112, 97, 23);
		panel_1.add(MSchkboxBoard);
		
		MSchkboxFatherIncome = new JCheckBox("Father Income");
		MSchkboxFatherIncome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		MSchkboxFatherIncome.setBounds(120, 152, 151, 23);
		panel_1.add(MSchkboxFatherIncome);
		
		MSchkboxCategory = new JCheckBox("Category");
		MSchkboxCategory.setFont(new Font("Tahoma", Font.PLAIN, 14));
		MSchkboxCategory.setBounds(292, 152, 97, 23);
		panel_1.add(MSchkboxCategory);
		
		MSchkboxEmailId = new JCheckBox("E-mail");
		MSchkboxEmailId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		MSchkboxEmailId.setBounds(445, 152, 97, 23);
		panel_1.add(MSchkboxEmailId);
		
		MSchkboxAll = new JCheckBox("All");
		MSchkboxAll.setFont(new Font("Tahoma", Font.PLAIN, 16));
		MSchkboxAll.setBounds(318, 250, 97, 23);
		panel_1.add(MSchkboxAll);
		
		chckbxYearOfJoining = new JCheckBox("Year of joining");
		chckbxYearOfJoining.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxYearOfJoining.setBounds(183, 189, 128, 23);
		panel_1.add(chckbxYearOfJoining);
		
		chckbxContactp = new JCheckBox("Contact(P)");
		chckbxContactp.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxContactp.setBounds(386, 189, 105, 23);
		panel_1.add(chckbxContactp);
		
		chckbxAddress = new JCheckBox("Address");
		chckbxAddress.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxAddress.setBounds(183, 222, 97, 23);
		panel_1.add(chckbxAddress);
		
		chckbxContacts = new JCheckBox("Contact(S)");
		chckbxContacts.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxContacts.setBounds(386, 224, 97, 23);
		panel_1.add(chckbxContacts);
		
		MSbtnBack = new JButton("Back");
		MSbtnBack.setFont(new Font("Tahoma", Font.PLAIN, 17));
		MSbtnBack.setBounds(201, 503, 151, 33);
		panel_2.add(MSbtnBack);
		
		MSbtnSubmit = new JButton("Submit");
		MSbtnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 17));
		MSbtnSubmit.setBounds(460, 503, 151, 33);
		panel_2.add(MSbtnSubmit);
		
	
		buttonbranch = new ButtonGroup();
		buttonbranch.add(MSrdbtnChem);
		buttonbranch.add(MSrdbtnIct);
		buttonbranch.add(MSrdbtnMech);
		
	}
	
	public void setAction(MegaSearchActionListener ms)
	{
		megasearch = ms;
		
		this.MSbtnBack.addActionListener(megasearch);
		this.MSbtnSubmit.addActionListener(megasearch);
		this.MSchkboxAll.addActionListener(megasearch);
		
		this.MSchkboxACPCRank.addActionListener(megasearch);
		this.MSchkboxAdmStatus.addActionListener(megasearch);
		this.MSchkboxAdmType.addActionListener(megasearch);
		//this.MSchkboxAll.addActionListener(megasearch);
		this.MSchkboxBoard.addActionListener(megasearch);
		this.MSchkboxCategory.addActionListener(megasearch);
		this.MSchkboxEmailId.addActionListener(megasearch);
		this.MSchkboxFatherIncome.addActionListener(megasearch);
		this.MSchkboxFirstName.addActionListener(megasearch);
		this.MSchkboxJEERollNum.addActionListener(megasearch);
		this.MSchkboxGender.addActionListener(megasearch);
		this.MSchkboxJEEScore.addActionListener(megasearch);
		this.MSchkboxLastName.addActionListener(megasearch);
	}
	
	public void clear()
	{
		this.MSchkboxACPCRank.setSelected(false);
		this.MSchkboxAdmStatus.setSelected(false);
		this.MSchkboxAdmType.setSelected(false);
		this.MSchkboxAll.setSelected(false);
		this.MSchkboxBoard.setSelected(false);
		this.MSchkboxCategory.setSelected(false);
		this.MSchkboxEmailId.setSelected(false);
		this.MSchkboxFatherIncome.setSelected(false);
		this.MSchkboxFirstName.setSelected(false);
		this.MSchkboxJEERollNum.setSelected(false);
		this.MSchkboxGender.setSelected(false);
		this.MSchkboxJEEScore.setSelected(false);
		this.MSchkboxLastName.setSelected(false);
		this.chckbxContactp.setSelected(false);
		this.chckbxYearOfJoining.setSelected(false);
		this.chckbxAddress.setSelected(false);
		this.chckbxContacts.setSelected(false);
	}
	
	public void clearunall()
	{
		this.MSchkboxACPCRank.setSelected(false);
		this.MSchkboxAdmStatus.setSelected(false);
		this.MSchkboxAdmType.setSelected(false);
		//this.MSchkboxAll.setSelected(false);
		this.MSchkboxBoard.setSelected(false);
		this.MSchkboxCategory.setSelected(false);
		this.MSchkboxEmailId.setSelected(false);
		this.MSchkboxFatherIncome.setSelected(false);
		this.MSchkboxFirstName.setSelected(false);
		this.MSchkboxJEERollNum.setSelected(false);
		this.MSchkboxGender.setSelected(false);
		this.MSchkboxJEEScore.setSelected(false);
		this.MSchkboxLastName.setSelected(false);
		this.chckbxContactp.setSelected(false);
		this.chckbxYearOfJoining.setSelected(false);
		this.chckbxAddress.setSelected(false);
		this.chckbxContacts.setSelected(false);
	}
	
	public boolean MSRCHempty()
	{
		if(!(this.MSchkboxACPCRank.isSelected() ||
		this.MSchkboxAdmStatus.isSelected() ||
		this.MSchkboxAdmType.isSelected() ||
		this.MSchkboxAll.isSelected() ||
		this.MSchkboxBoard.isSelected() ||
		this.MSchkboxCategory.isSelected() ||
		this.MSchkboxEmailId.isSelected() ||
		this.MSchkboxFatherIncome.isSelected() ||
		this.MSchkboxFirstName.isSelected() ||
		this.MSchkboxJEERollNum.isSelected() ||
		this.MSchkboxGender.isSelected() ||
		this.MSchkboxJEEScore.isSelected() ||
		this.chckbxYearOfJoining.isSelected() ||
		this.chckbxContactp.isSelected() ||
		this.MSchkboxLastName.isSelected() ||
		this.chckbxAddress.isSelected() ||
		this.chckbxContacts.isSelected()))
			return true;
		
		else
			return false;
	}
}
