package sprj_GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import sprj_Listener.EnterNewStudentActionListener;
import sprj_Listener.GenerateCopyActionListener;
import sprj_Listener.MegaSearchActionListener;
import sprj_Listener.MenuActionListener;
import sprj_Listener.SearchActionListener;
import sprj_Listener.SearchFromFrameActionListener;
import sprj_Listener.SearchModifyActionListener;

import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class Menu_GUI extends JFrame {

	private JPanel contentPane;
	private PersonalDetails_GUI person;
	private SearchDetails_GUI search;
	private SearchModify_GUI searchmod;
	private SearchModify_GUI searchmodmain;
	private NRIStudent_GUI NRIstud;
	private NRISponsoredDetails_GUI NRIspons;
	private GuardianDetails_GUI guard;
	private Board_JEE_GUI board_jee;
	private AdmissionType_GUI admiss;
	private Error_GUI error;
	private EnrollmentDetails_GUI enroll;
	private UnconfirmedAdmissionDetails_GUI unconfirm;
	private JEE_RollNo_GUI searchjee;
	private NRI_AcademicDetails_GUI NRIacademic;
	private DisplayASingleStud_GUI dispsing;
	
	private ModBoard_JEE_GUI modboard_jee;
	private ModEnrollmentDetails_GUI modenroll;
	private ModGuardianDetails_GUI modguard;
	private ModNRI_AcademicDetails_GUI modNRIacademic;
	private ModNRISponsoredDetails_GUI modNRIspons;
	private ModNRIStudent_GUI modNRIstud;
	private ModPersonalDetails_GUI modperson;
	
	private ModBoard_JEE_GUI modboard_jee1;
	private ModEnrollmentDetails_GUI modenroll1;
	private ModGuardianDetails_GUI modguard1;
	private ModNRI_AcademicDetails_GUI modNRIacademic1;
	private ModNRISponsoredDetails_GUI modNRIspons1;
	private ModNRIStudent_GUI modNRIstud1;
	private ModPersonalDetails_GUI modperson1;
	
	
	private MegaSearch_GUI megasearch;
	
	private GenerateCopy_GUI generatecopy;
	
	
	
	Login_GUI login;
	
	private JButton btnUnconfirmedAdmission;
	private JButton btnSearchEntry;
	private JButton btnModifyEntry;
	private JButton btnConfirmedAdmission;
	private JButton btnLogout;
	private JButton btnGenerateACopy;
	private JButton btnSearchMultipleEntries;

	
	
	public JButton getBtnGenerateACopy() {
		return btnGenerateACopy;
	}

	public JButton getBtnSearchMultipleEntries() {
		return btnSearchMultipleEntries;
	}

	public void setBtnGenerateACopy(JButton btnGenerateACopy) {
		this.btnGenerateACopy = btnGenerateACopy;
	}

	public void setBtnSearchMultipleEntries(JButton btnSearchMultipleEntries) {
		this.btnSearchMultipleEntries = btnSearchMultipleEntries;
	}

	public Error_GUI getMenuError()
	{
		return this.error;
	}

	public JButton getBtnConfirmedAdmission() {
		return btnConfirmedAdmission;
	}

	public void setBtnConfirmedAdmission(JButton btnConfirmedAdmission) {
		this.btnConfirmedAdmission = btnConfirmedAdmission;
	}

	public JButton getbtnUnconfirmedAdmission()
	{
		return btnUnconfirmedAdmission;
	}

	public JButton getBtnSearchEntry() 
	{
		return btnSearchEntry;
	}

	public JButton getBtnModifyEntry() 
	{
		return btnModifyEntry;
	}

	public JButton getBtnLogout()
	{
		return this.btnLogout;
	}
	
	public void setbtnUnconfirmedAdmission(JButton btnUnconfirmedAdmission) 
	{
		this.btnUnconfirmedAdmission = btnUnconfirmedAdmission;
	}

	public void setBtnSearchEntry(JButton btnSearchEntry) 
	{
		this.btnSearchEntry = btnSearchEntry;
	}

	public void setBtnModifyEntry(JButton btnModifyEntry) 
	{
		this.btnModifyEntry = btnModifyEntry;
	}

	
	/* Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu_GUI frame = new Menu_GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	
	 // Create the frame.
	 
	public Menu_GUI(Login_GUI log) 
	{
		
		login = log;
		person = new PersonalDetails_GUI();
		search = new SearchDetails_GUI();
		//searchmodmain = new SearchModify_GUI();
		board_jee = new Board_JEE_GUI();
		guard = new GuardianDetails_GUI();
		admiss = new AdmissionType_GUI();
		NRIspons = new NRISponsoredDetails_GUI();
		NRIstud = new NRIStudent_GUI();
		enroll = new EnrollmentDetails_GUI();
		error = new Error_GUI();
		unconfirm = new UnconfirmedAdmissionDetails_GUI();
		searchjee = new JEE_RollNo_GUI();
		//searchmod = new SearchModify_GUI();
		searchmodmain = new SearchModify_GUI();
		NRIacademic = new NRI_AcademicDetails_GUI();
		dispsing = new DisplayASingleStud_GUI();
		
		modperson = new ModPersonalDetails_GUI();
		modguard = new ModGuardianDetails_GUI();
		modboard_jee = new ModBoard_JEE_GUI();
		modenroll = new ModEnrollmentDetails_GUI();
		modNRIspons = new ModNRISponsoredDetails_GUI();
		modNRIstud = new ModNRIStudent_GUI();
		modNRIacademic = new ModNRI_AcademicDetails_GUI();
		
		modperson1 = new ModPersonalDetails_GUI();
		modguard1 = new ModGuardianDetails_GUI();
		modboard_jee1 = new ModBoard_JEE_GUI();
		modenroll1 = new ModEnrollmentDetails_GUI();
		modNRIspons1 = new ModNRISponsoredDetails_GUI();
		modNRIstud1 = new ModNRIStudent_GUI();
		modNRIacademic1 = new ModNRI_AcademicDetails_GUI();
		
		megasearch = new MegaSearch_GUI();
		
		generatecopy = new GenerateCopy_GUI();
		
	
		
		
		setTitle("MENU");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 376, 415);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 367, 61);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblWelcomeToAdmin = new JLabel("Welcome To Admin");
		lblWelcomeToAdmin.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeToAdmin.setForeground(Color.BLACK);
		lblWelcomeToAdmin.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblWelcomeToAdmin.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		lblWelcomeToAdmin.setBounds(10, 11, 340, 40);
		panel.add(lblWelcomeToAdmin);
		
		btnUnconfirmedAdmission = new JButton("Unconfirmed (for ACPC)");
		btnUnconfirmedAdmission.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnUnconfirmedAdmission.setBounds(73, 74, 226, 23);
		contentPane.add(btnUnconfirmedAdmission);
		
		btnSearchEntry = new JButton("Search Entry");
		btnSearchEntry.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSearchEntry.setBounds(73, 158, 226, 23);
		contentPane.add(btnSearchEntry);
		
		btnModifyEntry = new JButton("Modify Entry");
		btnModifyEntry.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnModifyEntry.setBounds(73, 201, 226, 23);
		contentPane.add(btnModifyEntry);
		
		btnConfirmedAdmission = new JButton("Confirmed Admission");
		btnConfirmedAdmission.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnConfirmedAdmission.setBounds(73, 114, 226, 23);
		contentPane.add(btnConfirmedAdmission);
		
		btnLogout = new JButton("Logout");
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLogout.setBounds(73, 332, 226, 23);
		contentPane.add(btnLogout);
		
		btnSearchMultipleEntries = new JButton("Search Multiple Entries");
		btnSearchMultipleEntries.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSearchMultipleEntries.setBounds(73, 247, 226, 23);
		contentPane.add(btnSearchMultipleEntries);
		
		btnGenerateACopy = new JButton("Generate A Copy Of Data");
		btnGenerateACopy.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnGenerateACopy.setBounds(73, 290, 226, 23);
		contentPane.add(btnGenerateACopy);
		
		MenuActionListener menulisten = new MenuActionListener(this, login, admiss, search, unconfirm, searchmodmain, megasearch, generatecopy);
		SearchActionListener searchlisten = new SearchActionListener(search, this, error, dispsing);
		SearchModifyActionListener modsearchlisten = new SearchModifyActionListener(this, searchmodmain, modperson, modguard, modboard_jee, modNRIspons, modNRIstud, modNRIacademic, modenroll, error);
		EnterNewStudentActionListener enterlisten = new EnterNewStudentActionListener(this, person, unconfirm, searchjee, guard, admiss, board_jee, NRIspons, NRIstud, NRIacademic, enroll, searchmod, error);
		SearchFromFrameActionListener searchframelisten = new SearchFromFrameActionListener(person, guard, board_jee, NRIspons, NRIstud, NRIacademic, enroll, modperson1, modguard1, modboard_jee1, modNRIspons1, modNRIstud1, modNRIacademic1, modenroll1, error);
		MegaSearchActionListener megasearchlisten = new MegaSearchActionListener(this, megasearch);
		GenerateCopyActionListener generateaction = new GenerateCopyActionListener(this, generatecopy);
		
		
		this.btnUnconfirmedAdmission.addActionListener(menulisten);
		this.btnSearchEntry.addActionListener(menulisten);
		this.btnConfirmedAdmission.addActionListener(menulisten);
		this.btnLogout.addActionListener(menulisten);
		this.btnModifyEntry.addActionListener(menulisten);
		this.btnSearchMultipleEntries.addActionListener(menulisten);
		this.btnGenerateACopy.addActionListener(menulisten);
		
		person.setAction(enterlisten, searchframelisten);
		//this.btnLogout.addActionListener(enterlisten);
		guard.setAction(enterlisten, searchframelisten);
		admiss.setAction(enterlisten);
		board_jee.setAction(enterlisten, searchframelisten);
		NRIspons.setAction(enterlisten, searchframelisten);
		NRIstud.setAction(enterlisten, searchframelisten);
		error.setAction(enterlisten);
		enroll.setAction(enterlisten, searchframelisten);
		
		unconfirm.setAction(enterlisten, error);
		searchjee.setAction(enterlisten);
		search.setAction(searchlisten);
		NRIacademic.setAction(enterlisten, searchframelisten);
		dispsing.setAction(searchlisten);
		//searchmod.setAction(modsearchlisten);
		searchmodmain.setAction(modsearchlisten);
		
		modperson.setAction(modsearchlisten);
		modguard.setAction(modsearchlisten);
		modboard_jee.setAction(modsearchlisten);
		modNRIspons.setAction(modsearchlisten);
		modNRIstud.setAction(modsearchlisten);
		modNRIacademic.setAction(modsearchlisten);
		modenroll.setAction(modsearchlisten);
		
		modperson1.setAction(searchframelisten);
		modguard1.setAction(searchframelisten);
		modboard_jee1.setAction(searchframelisten);
		modNRIspons1.setAction(searchframelisten);
		modNRIstud1.setAction(searchframelisten);
		modNRIacademic1.setAction(searchframelisten);
		modenroll1.setAction(searchframelisten);
		
		megasearch.setAction(megasearchlisten);
		
		generatecopy.setAction(generateaction);
		
	}
}
