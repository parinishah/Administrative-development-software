package sprj_GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Window.Type;

import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;
import javax.swing.JRadioButton;
import com.toedter.calendar.JYearChooser;


import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;

import sprj_Listener.EnterNewStudentActionListener;
import sprj_Listener.SearchFromFrameActionListener;
import sprj_Listener.SearchModifyActionListener;
import javax.swing.border.MatteBorder;
import javax.swing.JCheckBox;

@SuppressWarnings({ "unused", "serial" })
public class ModEnrollmentDetails_GUI extends JFrame {

	private JPanel contentPane;;
	private JButton EDbtnBack;
	private JButton EDbtnSubmit;
	private JRadioButton EDrdbtnConfirm;
	private JRadioButton EDrdbtnCancel;
	
	SearchModifyActionListener modsearchlisten;
	SearchFromFrameActionListener searchframelisten;
	private JPanel panel_2;
	private JCheckBox EDchckbx12Marksheet;
	private JCheckBox EDchckbx10Marksheet;
	private JCheckBox EDchckbxJeeMarksheet;
	private JCheckBox EDchckbxSchoolLeavingCertificate;
	private JCheckBox EDchckbxMeritRankReciepts;
	private JCheckBox EDchckbx20000Receipts;
	private JCheckBox EDchckbxAllotmentLetter;
	private JCheckBox EDchckbxAffidavit;
	private JCheckBox EDchckbxCopyOfPassport;
	private JCheckBox EDchckbxNriProofCertificate;
	private JCheckBox EDchckbxPassportSizePhotos3;
	private JCheckBox EDchckbxLastEducationalCertificate;
	private JCheckBox EDchckbxMigrationCertificate;
	
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

	public void setEDchckbx12Marksheet(String eDchckbx12Marksheet) 
	{
		if(eDchckbx12Marksheet.equals("Submitted"))
			EDchckbx12Marksheet.setSelected(true);
		else
			EDchckbx12Marksheet.setSelected(false);
	}

	public void setEDchckbx10Marksheet(String eDchckbx10Marksheet) {
		if(eDchckbx10Marksheet.equals("Submitted"))
			EDchckbx10Marksheet.setSelected(true);
		else
			EDchckbx10Marksheet.setSelected(false);
		 
	}

	public void setEDchckbxJeeMarksheet(String eDchckbxJeeMarksheet) {
		if(eDchckbxJeeMarksheet.equals("Submitted"))
			EDchckbxJeeMarksheet.setSelected(true);
		else
			EDchckbxJeeMarksheet.setSelected(false);
	}

	public void setEDchckbxSchoolLeavingCertificate(String eDchckbxSchoolLeavingCertificate) {
		if(eDchckbxSchoolLeavingCertificate.equals("Submitted"))
			EDchckbxSchoolLeavingCertificate.setSelected(true);
		else
			EDchckbxSchoolLeavingCertificate.setSelected(false);
	}

	public void setEDchckbxMeritRankReciepts(String eDchckbxMeritRankReciepts) {
		if(eDchckbxMeritRankReciepts.equals("Submitted"))
			EDchckbxMeritRankReciepts.setSelected(true);
		else
			EDchckbxMeritRankReciepts.setSelected(false);
		//EDchckbxMeritRankReciepts = eDchckbxMeritRankReciepts;
	}

	public void setEDchckbx20000Receipts(String eDchckbx20000Receipts) {
		if(eDchckbx20000Receipts.equals("Submitted"))
			EDchckbx20000Receipts.setSelected(true);
		else
			EDchckbx20000Receipts.setSelected(false);
		
		//EDchckbx20000Receipts = eDchckbx20000Receipts;
	}

	public void setEDchckbxAllotmentLetter(String eDchckbxAllotmentLetter) {
		if(eDchckbxAllotmentLetter.equals("Submitted"))
			EDchckbxAllotmentLetter.setSelected(true);
		else
			EDchckbxAllotmentLetter.setSelected(false);
		//EDchckbxAllotmentLetter = eDchckbxAllotmentLetter;
	}

	public void setEDchckbxAffidavit(String eDchckbxAffidavit) {
		if(eDchckbxAffidavit.equals("Submitted"))
			EDchckbxAffidavit.setSelected(true);
		else
			EDchckbxAffidavit.setSelected(false);
		//EDchckbxAffidavit = eDchckbxAffidavit;
	}

	public void setEDchckbxCopyOfPassport(String eDchckbxCopyOfPassport) {
		if(eDchckbxCopyOfPassport.equals("Submitted"))
			EDchckbxCopyOfPassport.setSelected(true);
		else
			EDchckbxCopyOfPassport.setSelected(false);
		
		//EDchckbxCopyOfPassport = eDchckbxCopyOfPassport;
	}

	public void setEDchckbxNriProofCertificate(String eDchckbxNriProofCertificate) {
		if(eDchckbxNriProofCertificate.equals("Submitted"))
			EDchckbxNriProofCertificate.setSelected(true);
		else
			EDchckbxNriProofCertificate.setSelected(false);
		//EDchckbxNriProofCertificate = eDchckbxNriProofCertificate;
	}

	public void setEDchckbxPassportSize(String eDchckbxPassportSize) {
		if(eDchckbxPassportSize.equals("Submitted"))
			EDchckbxPassportSizePhotos3.setSelected(true);
		else
			EDchckbxPassportSizePhotos3.setSelected(false);
		//EDchckbxPassportSize = eDchckbxPassportSize;
	}

	public void setEDchckbxLastEducationalCertificate(String eDchckbxLastEducationalCertificate) {
		if(eDchckbxLastEducationalCertificate.equals("Submitted"))
			EDchckbxLastEducationalCertificate.setSelected(true);
		else
			EDchckbxLastEducationalCertificate.setSelected(false);
		//EDchckbxLastEducationalCertificate = eDchckbxLastEducationalCertificate;
	}

	public void setEDchckbxMigrationCertificate(String eDchckbxMigrationCertificate) {
		if(eDchckbxMigrationCertificate.equals("Submitted"))
			EDchckbxMigrationCertificate.setSelected(true);
		else
			EDchckbxMigrationCertificate.setSelected(false);
		//EDchckbxMigrationCertificate = eDchckbxMigrationCertificate;
	}
	
	public void setEDAdmissionStatus(String eDrdbtnValue) 
	{
		if(eDrdbtnValue.equals("CONFIRM"))
			EDrdbtnConfirm.setSelected(true);
	}	

	
	public String getEDAdmissionStatus()
	{
		if(EDrdbtnConfirm.isSelected())
			return "CONFIRM";
		
		else
			return "CANCEL";
	}

	
	public JButton getEDbtnBack() {
		return EDbtnBack;
	}

	public JButton getEDbtnSubmit() {
		return EDbtnSubmit;
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
	public ModEnrollmentDetails_GUI() 
	{
		//setType(Type.UTILITY);
		
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		this.setBounds(0, 0,screen.width,screen.height - 30);
		
		setLocationRelativeTo(null);
		setTitle("ENROLLMENT DETAILS");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//contentPane.setBounds(100, 100, 450, 248);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 153, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		panel_1.setBounds(389, 29, 686, 429);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblEnrollmentDeta = new JLabel("ENROLLMENT DETAILS");
		lblEnrollmentDeta.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		lblEnrollmentDeta.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnrollmentDeta.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEnrollmentDeta.setBounds(25, 11, 635, 48);
		panel_1.add(lblEnrollmentDeta);
		
		ButtonGroup EDbg = new ButtonGroup();
		
		
		EDbtnBack = new JButton("Back");
		EDbtnBack.setFont(new Font("Tahoma", Font.PLAIN, 14));
		EDbtnBack.setBounds(210, 383, 89, 31);
		panel_1.add(EDbtnBack);
		
		EDbtnSubmit = new JButton("Submit");
		EDbtnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		EDbtnSubmit.setBounds(363, 383, 138, 31);
		panel_1.add(EDbtnSubmit);
		
		JPanel panel = new JPanel();
		panel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Admission Status", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 77, 656, 79);
		panel_1.add(panel);
		panel.setLayout(null);
		
		EDrdbtnConfirm = new JRadioButton("Confirm");
		EDrdbtnConfirm.setFont(new Font("Tahoma", Font.PLAIN, 17));
		EDrdbtnConfirm.setBounds(165, 30, 131, 34);
		panel.add(EDrdbtnConfirm);
		EDbg.add(EDrdbtnConfirm);
		
		EDrdbtnCancel = new JRadioButton("Cancel");
		EDrdbtnCancel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		EDrdbtnCancel.setBounds(441, 30, 131, 34);
		panel.add(EDrdbtnCancel);
		EDbg.add(EDrdbtnCancel);
		
		panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Doccuments Submitted", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(10, 161, 656, 211);
		panel_1.add(panel_2);
		
		EDchckbx12Marksheet = new JCheckBox("12 Marksheet");
		EDchckbx12Marksheet.setFont(new Font("Tahoma", Font.PLAIN, 13));
		EDchckbx12Marksheet.setBounds(176, 28, 108, 23);
		panel_2.add(EDchckbx12Marksheet);
		
		EDchckbx10Marksheet = new JCheckBox("10 Marksheet");
		EDchckbx10Marksheet.setFont(new Font("Tahoma", Font.PLAIN, 13));
		EDchckbx10Marksheet.setBounds(34, 28, 108, 23);
		panel_2.add(EDchckbx10Marksheet);
		
		EDchckbxJeeMarksheet = new JCheckBox("JEE Marksheet");
		EDchckbxJeeMarksheet.setFont(new Font("Tahoma", Font.PLAIN, 13));
		EDchckbxJeeMarksheet.setBounds(314, 28, 116, 23);
		panel_2.add(EDchckbxJeeMarksheet);
		
		EDchckbxSchoolLeavingCertificate = new JCheckBox("School Leaving Certificate");
		EDchckbxSchoolLeavingCertificate.setFont(new Font("Tahoma", Font.PLAIN, 13));
		EDchckbxSchoolLeavingCertificate.setBounds(462, 28, 177, 23);
		panel_2.add(EDchckbxSchoolLeavingCertificate);
		
		EDchckbxMeritRankReciepts = new JCheckBox("Merit Rank Reciepts");
		EDchckbxMeritRankReciepts.setFont(new Font("Tahoma", Font.PLAIN, 13));
		EDchckbxMeritRankReciepts.setBounds(24, 83, 147, 23);
		panel_2.add(EDchckbxMeritRankReciepts);
		
		EDchckbx20000Receipts = new JCheckBox("20000/- Receipts ");
		EDchckbx20000Receipts.setFont(new Font("Tahoma", Font.PLAIN, 13));
		EDchckbx20000Receipts.setBounds(251, 83, 135, 23);
		panel_2.add(EDchckbx20000Receipts);
		
		EDchckbxAllotmentLetter = new JCheckBox("Allotment Letter");
		EDchckbxAllotmentLetter.setFont(new Font("Tahoma", Font.PLAIN, 13));
		EDchckbxAllotmentLetter.setBounds(439, 83, 126, 23);
		panel_2.add(EDchckbxAllotmentLetter);
		
		EDchckbxAffidavit = new JCheckBox("Affidavit");
		EDchckbxAffidavit.setFont(new Font("Tahoma", Font.PLAIN, 13));
		EDchckbxAffidavit.setBounds(24, 125, 97, 23);
		panel_2.add(EDchckbxAffidavit);
		
		EDchckbxCopyOfPassport = new JCheckBox("Copy of Passport");
		EDchckbxCopyOfPassport.setFont(new Font("Tahoma", Font.PLAIN, 13));
		EDchckbxCopyOfPassport.setBounds(251, 126, 135, 23);
		panel_2.add(EDchckbxCopyOfPassport);
		
		EDchckbxNriProofCertificate = new JCheckBox("NRI Proof Certificate");
		EDchckbxNriProofCertificate.setFont(new Font("Tahoma", Font.PLAIN, 13));
		EDchckbxNriProofCertificate.setBounds(439, 126, 152, 23);
		panel_2.add(EDchckbxNriProofCertificate);
		
		EDchckbxPassportSizePhotos3 = new JCheckBox("3 Passport Size Photos");
		EDchckbxPassportSizePhotos3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		EDchckbxPassportSizePhotos3.setBounds(24, 166, 161, 23);
		panel_2.add(EDchckbxPassportSizePhotos3);
		
		EDchckbxLastEducationalCertificate = new JCheckBox("Last Educational Certificate");
		EDchckbxLastEducationalCertificate.setFont(new Font("Tahoma", Font.PLAIN, 13));
		EDchckbxLastEducationalCertificate.setBounds(251, 166, 179, 23);
		panel_2.add(EDchckbxLastEducationalCertificate);
		
		EDchckbxMigrationCertificate = new JCheckBox("Migration Certificate");
		EDchckbxMigrationCertificate.setFont(new Font("Tahoma", Font.PLAIN, 13));
		EDchckbxMigrationCertificate.setBounds(439, 166, 152, 23);
		panel_2.add(EDchckbxMigrationCertificate);
		
		
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
	
	public boolean EDgetTextEmpty()
	{
		if(!(this.EDrdbtnConfirm.isSelected() || this.EDrdbtnCancel.isSelected()))
			return true;
		
		else
			return false;
	}
	
	public void setAction(SearchModifyActionListener searchm)
	{
		modsearchlisten = searchm;
		//searchframelisten = sr;
		this.EDbtnBack.addActionListener(modsearchlisten);
		this.EDbtnSubmit.addActionListener(modsearchlisten);
		
	}
	
	public void setAction(SearchFromFrameActionListener sr)
	{
		//modsearchlisten = searchm;
		searchframelisten = sr;
		this.EDbtnBack.addActionListener(searchframelisten);
		this.EDbtnSubmit.addActionListener(searchframelisten);
		
	}
}
