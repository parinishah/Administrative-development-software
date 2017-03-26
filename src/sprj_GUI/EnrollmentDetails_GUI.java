package sprj_GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import com.toedter.calendar.JYearChooser;


import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;

import sprj_Listener.EnterNewStudentActionListener;
import sprj_Listener.SearchFromFrameActionListener;

import javax.swing.JTextField;
import javax.swing.JCheckBox;

@SuppressWarnings("serial")
public class EnrollmentDetails_GUI extends JFrame {

	private JPanel contentPane;
	private JYearChooser EDYearofJoining;
	private JButton EDbtnBack;
	private JButton EDbtnSubmit;
	@SuppressWarnings("rawtypes")
	private JComboBox EDcmbBranch;
	private JButton EDbtnSearchMod;
	private JTextField EDtxtUniqueNumber;
	private JCheckBox EDchckbx12Marksheet;  
	private JCheckBox EDchckbx10Marksheet;	 
	private JCheckBox EDchckbxJeeMarksheet;	 
	private JCheckBox EDchckbxSchoolLeavingCertificate;  
	private JCheckBox EDchckbxMeritRankReciepts;  
	private JCheckBox EDchckbx20000Receipts;  
	private JCheckBox EDchckbxAllotmentLetter; 
	private JCheckBox EDchckbxPassportSizePhotos3; 
	private JCheckBox EDchckbxAffidavit;  
	private JCheckBox EDchckbxCopyOfPassport; 
	private JCheckBox EDchckbxNriProofCertificate; 
	private JCheckBox EDchckbxLastEducationalCertificate; 
	private JCheckBox EDchckbxMigrationCertificate; 
	
	EnterNewStudentActionListener enterlisten;
	SearchFromFrameActionListener searchframelisten;
	
	
	public JCheckBox getJEDchckbx12Marksheet() {
		return EDchckbx12Marksheet;
	}

	public JCheckBox getJEDchckbx10Marksheet() {
		return EDchckbx10Marksheet;
	}

	public JCheckBox getJEDchckbxJeeMarksheet() {
		return EDchckbxJeeMarksheet;
	}

	public JCheckBox getJEDchckbxSchoolLeavingCertificate() {
		return EDchckbxSchoolLeavingCertificate;
	}

	public JCheckBox getJEDchckbxMeritRankReciepts() {
		return EDchckbxMeritRankReciepts;
	}

	public JCheckBox getJEDchckbx20000Receipts() {
		return EDchckbx20000Receipts;
	}

	public JCheckBox getJEDchckbxAllotmentLetter() {
		return EDchckbxAllotmentLetter;
	}

	public JCheckBox getJEDchckbxPassportSizePhotos3() {
		return EDchckbxPassportSizePhotos3;
	}

	public JCheckBox getJEDchckbxAffidavit() {
		return EDchckbxAffidavit;
	}

	public JCheckBox getJEDchckbxCopyOfPassport() {
		return EDchckbxCopyOfPassport;
	}

	public JCheckBox getJEDchckbxNriProofCertificate() {
		return EDchckbxNriProofCertificate;
	}

	public JCheckBox getJEDchckbxLastEducationalCertificate() {
		return EDchckbxLastEducationalCertificate;
	}

	public JCheckBox getJEDchckbxMigrationCertificate() {
		return EDchckbxMigrationCertificate;
	}
	
	
	
	public String getEDchckbx12Marksheet() {
		if(EDchckbx12Marksheet.isSelected())
			return "Submitted";
		else 
			return "#";
	}

	public String  getEDchckbx10Marksheet() {
		if(EDchckbx10Marksheet.isSelected())
			return "Submitted";
		else 
			return "#";
			
	}

	public String getEDchckbxJeeMarksheet() {
		if(EDchckbxJeeMarksheet.isSelected())
			return "Submitted";
		else 
			return "#";
				
	}

	public String getEDchckbxSchoolLeavingCertificate() {
		if(EDchckbxSchoolLeavingCertificate.isSelected())
			return "Submitted";
		else 
			return "#";
	}

	public String getEDchckbxMeritRankReciepts() 
	{
		if(EDchckbxMeritRankReciepts.isSelected())
			return "Submitted";
		else 
			return "#";
	}

	public String getEDchckbx20000Receipts() {
		if(EDchckbx20000Receipts.isSelected())
			return "Submitted";
		else 
			return "#";
	}

	public String getEDchckbxAllotmentLetter() {
		if(EDchckbxAllotmentLetter.isSelected())
			return "Submitted";
		else 
			return "#";
	}

	public String getEDchckbxAffidavit() {
		if(EDchckbxAffidavit.isSelected())
			return "Submitted";
		else 
			return "#";
	}

	public String getEDchckbxCopyOfPassport() {
		if(EDchckbxCopyOfPassport.isSelected())
			return "Submitted";
		else 
			return "#";

	}

	public String getEDchckbxNriProofCertificate() {
		if(EDchckbxNriProofCertificate.isSelected())
			return "Submitted";
		else 
			return "#";
	}

	public String getEDchckbxPassportSize() {
		if(EDchckbxPassportSizePhotos3.isSelected())
			return "Submitted";
		else 
			return "#";
	}

	public String getEDchckbxLastEducationalCertificate() {
		if(EDchckbxLastEducationalCertificate.isSelected())
			return "Submitted";
		else 
			return "#";
	}

	public String getEDchckbxMigrationCertificate() {
		if(EDchckbxMigrationCertificate.isSelected())
			return "Submitted";
		else 
			return "#";
	}

	public void setEDcmbBranch(String eDBranch) 
	{
		EDcmbBranch.setSelectedItem(eDBranch);
	}

	public void setEDchckbx12Marksheet(JCheckBox eDchckbx12Marksheet) {
		EDchckbx12Marksheet = eDchckbx12Marksheet;
	}

	public void setEDchckbx10Marksheet(JCheckBox eDchckbx10Marksheet) {
		EDchckbx10Marksheet = eDchckbx10Marksheet;
	}

	public void setEDchckbxJeeMarksheet(JCheckBox eDchckbxJeeMarksheet) {
		EDchckbxJeeMarksheet = eDchckbxJeeMarksheet;
	}

	public void setEDchckbxSchoolLeavingCertificate(JCheckBox eDchckbxSchoolLeavingCertificate) {
		EDchckbxSchoolLeavingCertificate = eDchckbxSchoolLeavingCertificate;
	}

	public void setEDchckbxMeritRankReciepts(JCheckBox eDchckbxMeritRankReciepts) {
		EDchckbxMeritRankReciepts = eDchckbxMeritRankReciepts;
	}

	public void setEDchckbx20000Receipts(JCheckBox eDchckbx20000Receipts) {
		EDchckbx20000Receipts = eDchckbx20000Receipts;
	}

	public void setEDchckbxAllotmentLetter(JCheckBox eDchckbxAllotmentLetter) {
		EDchckbxAllotmentLetter = eDchckbxAllotmentLetter;
	}

	public void setEDchckbxAffidavit(JCheckBox eDchckbxAffidavit) {
		EDchckbxAffidavit = eDchckbxAffidavit;
	}

	public void setEDchckbxCopyOfPassport(JCheckBox eDchckbxCopyOfPassport) {
		EDchckbxCopyOfPassport = eDchckbxCopyOfPassport;
	}

	public void setEDchckbxNriProofCertificate(JCheckBox eDchckbxNriProofCertificate) {
		EDchckbxNriProofCertificate = eDchckbxNriProofCertificate;
	}

	public void setEDchckbxPassportSize(JCheckBox eDchckbxPassportSize) {
		EDchckbxPassportSizePhotos3 = eDchckbxPassportSize;
	}

	public void setEDchckbxLastEducationalCertificate(JCheckBox eDchckbxLastEducationalCertificate) {
		EDchckbxLastEducationalCertificate = eDchckbxLastEducationalCertificate;
	}

	public void setEDchckbxMigrationCertificate(JCheckBox eDchckbxMigrationCertificate) {
		EDchckbxMigrationCertificate = eDchckbxMigrationCertificate;
	}

	public JButton getEDbtnSearchMod() {
		return EDbtnSearchMod;
	}

	public void setEDbtnSearchMod(JButton eDbtnSearchMod) {
		EDbtnSearchMod = eDbtnSearchMod;
	}

	
	public JTextField getEDtxtUniqueNumber() {
		return EDtxtUniqueNumber;
	}

	public void setEDtxtUniqueNumber(JTextField eDtxtUniqueNumber) {
		EDtxtUniqueNumber = eDtxtUniqueNumber;
	}

	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	
	public JYearChooser getEDYearofJoining() {
		return EDYearofJoining;
	}

	public String getEDBranch()
	{
		return (String)this.EDcmbBranch.getSelectedItem();
	}

	
	public int getEDcmbyearjoin()
	{
		return this.EDYearofJoining.getYear();
	}
	
	public JButton getEDbtnBack() {
		return EDbtnBack;
	}

	public JButton getEDbtnSubmit() {
		return EDbtnSubmit;
	}


	public void setEDYearofJoining(JYearChooser eDYearofJoining) {
		EDYearofJoining = eDYearofJoining;
	}

	public void setEDbtnBack(JButton eDbtnBack) {
		EDbtnBack = eDbtnBack;
	}

	public void setEDbtnSubmit(JButton eDbtnSubmit) {
		EDbtnSubmit = eDbtnSubmit;
	}

	/**
	 * Launch the application.S
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EnrollmentDetails_GUI frame = new EnrollmentDetails_GUI();
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
	@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
	public EnrollmentDetails_GUI() 
	{
		//setType(Type.UTILITY);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(0, 0, screen.width, screen.height-30);
		
		setLocationRelativeTo(null);
		setTitle("ENROLLMENT DETAILS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 564, 295);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("ColorChooser.background"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		panel_1.setBounds(358, 73, 726, 538);
		panel_1.setLayout(null);
		contentPane.add(panel_1);
		
		JLabel lblEnrollmentDeta = new JLabel("ENROLLMENT DETAILS");
		lblEnrollmentDeta.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		lblEnrollmentDeta.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnrollmentDeta.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEnrollmentDeta.setBounds(12, 11, 338, 62);
		panel_1.add(lblEnrollmentDeta);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Branch Preferred", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(35, 101, 612, 68);
		panel_1.add(panel);
		
		
		panel.setLayout(null);
		
		EDcmbBranch = new JComboBox();
		EDcmbBranch.setBounds(253, 27, 97, 30);
		panel.add(EDcmbBranch);
		EDcmbBranch.setModel(new DefaultComboBoxModel(new String[] {"", "ICT", "MECH", "CHEM"}));
		EDcmbBranch.requestFocus();
		
		JLabel lblBranch = new JLabel("Branch :");
		lblBranch.setBounds(159, 24, 84, 30);
		panel.add(lblBranch);
		lblBranch.setFont(new Font("Tahoma", Font.PLAIN, 17));
	
		
		ButtonGroup EDbg = new ButtonGroup();
		
		JLabel lblYearOfJoining = new JLabel("Year of Joining:");
		lblYearOfJoining.setHorizontalAlignment(SwingConstants.RIGHT);
		lblYearOfJoining.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblYearOfJoining.setBounds(182, 418, 151, 23);
		panel_1.add(lblYearOfJoining);
		
		
		EDbtnBack = new JButton("Back");
		
		
		EDbtnBack.setFont(new Font("Tahoma", Font.PLAIN, 17));
		EDbtnBack.setBounds(206, 475, 100, 35);
		panel_1.add(EDbtnBack);
		
		EDbtnSubmit = new JButton("Submit");
		
		
		EDbtnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 17));
		EDbtnSubmit.setBounds(337, 475, 122, 35);
		panel_1.add(EDbtnSubmit);
		
		/*EDYearofJoining = new JYearChooser();
		EDYearofJoining.setBounds(181, 148, 71, 23);
		contentPane.add(EDYearofJoining);*/
		
		EDbtnSearchMod = new JButton("Modify");
		EDbtnSearchMod.setFont(new Font("Tahoma", Font.PLAIN, 17));
		EDbtnSearchMod.setBounds(483, 67, 100, 23);
		panel_1.add(EDbtnSearchMod);
		
		/*JYearChooser yearChooser = new JYearChooser();
		yearChooser.setBounds(185, 180, 62, 20);*/
		//panel_1.add(yearChooser);
		
		JLabel EDlblUniqueNumber = new JLabel("Enter Unique Number:");
		EDlblUniqueNumber.setFont(new Font("Tahoma", Font.PLAIN, 17));
		EDlblUniqueNumber.setBounds(360, 22, 165, 28);
		panel_1.add(EDlblUniqueNumber);
		
		EDtxtUniqueNumber = new JTextField();
		EDtxtUniqueNumber.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		EDtxtUniqueNumber.setBounds(535, 23, 106, 29);
		panel_1.add(EDtxtUniqueNumber);
		EDtxtUniqueNumber.setColumns(10);
		
		panel_2 = new JPanel();
		panel_2.setBounds(337, 418, 81, 23);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		EDYearofJoining = new JYearChooser();
		EDYearofJoining.setBounds(0, 0, 81, 23);
		panel_2.add(EDYearofJoining);
		
		panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Doccuments Submitted", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_3.setBounds(35, 186, 656, 211);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		EDchckbx12Marksheet = new JCheckBox("12  Marksheet");
		EDchckbx12Marksheet.setFont(new Font("Tahoma", Font.PLAIN, 13));
		EDchckbx12Marksheet.setBounds(176, 28, 108, 23);
		panel_3.add(EDchckbx12Marksheet);
		
		EDchckbx10Marksheet = new JCheckBox("10 Marksheet");
		EDchckbx10Marksheet.setFont(new Font("Tahoma", Font.PLAIN, 13));
		EDchckbx10Marksheet.setBounds(34, 28, 108, 23);
		panel_3.add(EDchckbx10Marksheet);
		
		EDchckbxJeeMarksheet = new JCheckBox("JEE Marksheet");
		EDchckbxJeeMarksheet.setFont(new Font("Tahoma", Font.PLAIN, 13));
		EDchckbxJeeMarksheet.setBounds(314, 28, 116, 23);
		panel_3.add(EDchckbxJeeMarksheet);
		
		EDchckbxSchoolLeavingCertificate = new JCheckBox("School Leaving Certificate");
		EDchckbxSchoolLeavingCertificate.setFont(new Font("Tahoma", Font.PLAIN, 13));
		EDchckbxSchoolLeavingCertificate.setBounds(462, 28, 177, 23);
		panel_3.add(EDchckbxSchoolLeavingCertificate);
		
		EDchckbxMeritRankReciepts = new JCheckBox("Merit Rank Reciepts");
		EDchckbxMeritRankReciepts.setFont(new Font("Tahoma", Font.PLAIN, 13));
		EDchckbxMeritRankReciepts.setBounds(24, 83, 147, 23);
		panel_3.add(EDchckbxMeritRankReciepts);
		
		EDchckbx20000Receipts = new JCheckBox("20000/- Receipts ");
		EDchckbx20000Receipts.setFont(new Font("Tahoma", Font.PLAIN, 13));
		EDchckbx20000Receipts.setBounds(251, 83, 135, 23);
		panel_3.add(EDchckbx20000Receipts);
		
		EDchckbxAllotmentLetter = new JCheckBox("Allotment Letter");
		EDchckbxAllotmentLetter.setFont(new Font("Tahoma", Font.PLAIN, 13));
		EDchckbxAllotmentLetter.setBounds(439, 83, 126, 23);
		panel_3.add(EDchckbxAllotmentLetter);
		
		EDchckbxAffidavit = new JCheckBox("Affidavit");
		EDchckbxAffidavit.setFont(new Font("Tahoma", Font.PLAIN, 13));
		EDchckbxAffidavit.setBounds(24, 125, 97, 23);
		panel_3.add(EDchckbxAffidavit);
		
		EDchckbxCopyOfPassport = new JCheckBox("Copy of Passport");
		EDchckbxCopyOfPassport.setFont(new Font("Tahoma", Font.PLAIN, 13));
		EDchckbxCopyOfPassport.setBounds(251, 126, 135, 23);
		panel_3.add(EDchckbxCopyOfPassport);
		
		EDchckbxNriProofCertificate = new JCheckBox("NRI Proof Certificate");
		EDchckbxNriProofCertificate.setFont(new Font("Tahoma", Font.PLAIN, 13));
		EDchckbxNriProofCertificate.setBounds(439, 126, 152, 23);
		panel_3.add(EDchckbxNriProofCertificate);
		
		EDchckbxPassportSizePhotos3 = new JCheckBox("3 Passport Size Photos");
		EDchckbxPassportSizePhotos3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		EDchckbxPassportSizePhotos3.setBounds(24, 166, 161, 23);
		panel_3.add(EDchckbxPassportSizePhotos3);
		
		EDchckbxLastEducationalCertificate = new JCheckBox("Last Educational Certificate");
		EDchckbxLastEducationalCertificate.setFont(new Font("Tahoma", Font.PLAIN, 13));
		EDchckbxLastEducationalCertificate.setBounds(251, 166, 179, 23);
		panel_3.add(EDchckbxLastEducationalCertificate);
		
		EDchckbxMigrationCertificate = new JCheckBox("Migration Certificate");
		EDchckbxMigrationCertificate.setFont(new Font("Tahoma", Font.PLAIN, 13));
		EDchckbxMigrationCertificate.setBounds(439, 166, 152, 23);
		panel_3.add(EDchckbxMigrationCertificate);

	}
	
	public boolean EDgetTextEmpty()
	{
		if(this.EDYearofJoining.equals("") || this.EDcmbBranch.getSelectedItem().equals("") || this.EDcmbBranch.getSelectedItem().equals(""))
			return true;
		
		else
			return false;
	}
	
	public boolean checkboxempty()
	{
		if(!(this.EDchckbx10Marksheet.isSelected() || this.EDchckbx12Marksheet.isSelected() | this.EDchckbx20000Receipts.isSelected()
			|| this.EDchckbxAffidavit.isSelected() || this.EDchckbxAllotmentLetter.isSelected() || this.EDchckbxCopyOfPassport.isSelected()
			|| this.EDchckbxJeeMarksheet.isSelected() || this.EDchckbxLastEducationalCertificate.isSelected() || this.EDchckbxMeritRankReciepts.isSelected()
			|| this.EDchckbxMigrationCertificate.isSelected() || this.EDchckbxNriProofCertificate.isSelected() || this.EDchckbxPassportSizePhotos3.isSelected()
			|| this.EDchckbxSchoolLeavingCertificate.isSelected()))
			return true;
		
		else
			return false;
	}
	
	public void setAction(EnterNewStudentActionListener enter, SearchFromFrameActionListener slis)
	{
		enterlisten = enter;
		searchframelisten = slis;
		this.EDbtnBack.addActionListener(enterlisten);
		this.EDbtnSubmit.addActionListener(enterlisten);
		this.EDbtnSearchMod.addActionListener(searchframelisten);
	}
	
	public void setEnabledAll()
	{
		EDchckbx12Marksheet.setEnabled(true);  
		EDchckbx10Marksheet.setEnabled(true);	 
		EDchckbxJeeMarksheet.setEnabled(true);	 
		EDchckbxSchoolLeavingCertificate.setEnabled(true);  
		EDchckbxMeritRankReciepts.setEnabled(true);  
		EDchckbx20000Receipts.setEnabled(true);  
		EDchckbxAllotmentLetter.setEnabled(true); 
		EDchckbxPassportSizePhotos3.setEnabled(true); 
		EDchckbxAffidavit.setEnabled(true);  
		EDchckbxCopyOfPassport.setEnabled(true); 
		EDchckbxNriProofCertificate.setEnabled(true); 
		EDchckbxLastEducationalCertificate.setEnabled(true); 
		EDchckbxMigrationCertificate.setEnabled(true);
	}
	
	public void clearcheckbox()
	{
		EDchckbx12Marksheet.setSelected(false);  
		EDchckbx10Marksheet.setSelected(false);	 
		EDchckbxJeeMarksheet.setSelected(false);	 
		EDchckbxSchoolLeavingCertificate.setSelected(false);  
		EDchckbxMeritRankReciepts.setSelected(false);  
		EDchckbx20000Receipts.setSelected(false);  
		EDchckbxAllotmentLetter.setSelected(false); 
		EDchckbxPassportSizePhotos3.setSelected(false); 
		EDchckbxAffidavit.setSelected(false);  
		EDchckbxCopyOfPassport.setSelected(false); 
		EDchckbxNriProofCertificate.setSelected(false); 
		EDchckbxLastEducationalCertificate.setSelected(false); 
		EDchckbxMigrationCertificate.setSelected(false);
	}
	
	public void clear()
	{
		this.EDYearofJoining.setYear(2016);
		this.EDcmbBranch.setSelectedItem("");
	}
}
