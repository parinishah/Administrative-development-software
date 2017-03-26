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

import sprj_Listener.EnterNewStudentActionListener;
import sprj_Listener.SearchFromFrameActionListener;

import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;

@SuppressWarnings("serial")
public class GuardianDetails_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField GDtxtFatherName;
	private JTextField GDtxtFatherContact;
	private JTextField GDtxtFatherOccupation;
	@SuppressWarnings("rawtypes")
	private JComboBox GDcomboBoxFatherIncome;
	private JTextField GDtxtFatherQualification;
	private JTextField GDtxtFatherEmail;
	private JTextField GDtxtMotherName;
	private JTextField GDtxtMotherContact;
	private JTextField GDtxtMotherOccupation;
	@SuppressWarnings("rawtypes")
	private JComboBox GDcomboBoxMotherIncome;
	private JTextField GDtxtMotherQualification;
	private JButton btnBackPersonalDetails;
	private JButton btnNext;
	private JButton GDbtnSearchMod;
	
	EnterNewStudentActionListener enterlisten;
	SearchFromFrameActionListener searchframelisten;
	
	private JLabel GDlblUniqueNumber;
	private JTextField GDtxtUniqueNumber;
	
	public JButton getGDbtnSearchMod() {
		return GDbtnSearchMod;
	}

	public void setGDbtnSearchMod(JButton gDbtnSearchMod) {
		GDbtnSearchMod = gDbtnSearchMod;
	}

	public JTextField getGDtxtFatherName() 
	{
		return GDtxtFatherName;
	}

	public JTextField getGDtxtFatherContact() 
	{
		return GDtxtFatherContact;
	}

	public JTextField getGDtxtFatherOccupation() 
	{
		return GDtxtFatherOccupation;
	}

	public JTextField getGDtxtFatherQualification() 
	{
		return GDtxtFatherQualification;
	}

	public JTextField getGDtxtFatherEmail() 
	{
		return GDtxtFatherEmail;
	}

	public JTextField getGDtxtMotherName()
	{
		return GDtxtMotherName;
	}

	public JTextField getGDtxtMotherContact() 
	{
		return GDtxtMotherContact;
	}

	public JTextField getGDtxtMotherOccupation() 
	{
		return GDtxtMotherOccupation;
	}

	public JTextField getGDtxtMotherQualification() 
	{
		return GDtxtMotherQualification;
	}

	public String getGDcmbFatherIncome()
	{
		return (String)this.GDcomboBoxFatherIncome.getSelectedItem();
	}
	
	public String getGDcmbMotherIncome()
	{
		return (String)this.GDcomboBoxMotherIncome.getSelectedItem();
	}
	
	public JButton getBtnBackPersonalDetails() 
	{
		return btnBackPersonalDetails;
	}

	public JButton getBtnNext()
	{
		return btnNext;
	}

	public void setGDtxtFatherName(JTextField gDtxtFatherName) 
	{
		GDtxtFatherName = gDtxtFatherName;
	}

	public void setGDtxtFatherContact(JTextField gDtxtFatherContact) 
	{
		GDtxtFatherContact = gDtxtFatherContact;
	}

	public void setGDtxtFatherOccupation(JTextField gDtxtFatherOccupation) 
	{
		GDtxtFatherOccupation = gDtxtFatherOccupation;
	}

	public void setGDtxtFatherQualification(JTextField gDtxtFatherQualification) 
	{
		GDtxtFatherQualification = gDtxtFatherQualification;
	}


	public void setGDtxtFatherEmail(JTextField gDtxtFatherEmail) 
	{
		GDtxtFatherEmail = gDtxtFatherEmail;
	}

	public void setGDtxtMotherName(JTextField gDtxtMotherName) 
	{
		GDtxtMotherName = gDtxtMotherName;
	}

	public void setGDtxtMotherContact(JTextField gDtxtMotherContact) 
	{
		GDtxtMotherContact = gDtxtMotherContact;
	}

	public void setGDtxtMotherOccupation(JTextField gDtxtMotherOccupation)
	{
		GDtxtMotherOccupation = gDtxtMotherOccupation;
	}

	public void setGDtxtMotherQualification(JTextField gDtxtMotherQualification) 
	{
		GDtxtMotherQualification = gDtxtMotherQualification;
	}


	public void setBtnBackPersonalDetails(JButton btnBackPersonalDetails) 
	{
		this.btnBackPersonalDetails = btnBackPersonalDetails;
	}

	public void setBtnNextAdmissionType(JButton btnNextAdmissionType)
	{
		this.btnNext = btnNextAdmissionType;
	}

	/**
	 * Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuardianDetails_GUI frame = new GuardianDetails_GUI();
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
	public GuardianDetails_GUI() 
	{
		//setType(Type.UTILITY);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(0, 0, screen.width, screen.height-30);

		setLocationRelativeTo(null);
		setTitle("GUARDIAN DETAILS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 620, 401);
		//setBounds(100, 100, 745, 575);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("ColorChooser.background"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		panel.setBounds(385, 111, 666, 495);
		panel.setLayout(null);
		
		JLabel lblGuardianDetails = new JLabel("GUARDIAN DETAILS");
		lblGuardianDetails.setHorizontalAlignment(SwingConstants.CENTER);
		lblGuardianDetails.setForeground(Color.BLACK);
		lblGuardianDetails.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblGuardianDetails.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		lblGuardianDetails.setBounds(10, 11, 327, 40);
		panel.add(lblGuardianDetails);
		
		JPanel GDpanelFatherDetails = new JPanel();
		GDpanelFatherDetails.setBorder(new TitledBorder(null, "Father Details", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GDpanelFatherDetails.setBounds(41, 108, 584, 138);
		panel.add(GDpanelFatherDetails);
		GDpanelFatherDetails.setLayout(null);
		
		JLabel GDlblFatherName = new JLabel("Name:");
		GDlblFatherName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GDlblFatherName.setBounds(10, 23, 50, 16);
		GDpanelFatherDetails.add(GDlblFatherName);
		
		GDtxtFatherName = new JTextField();
		GDtxtFatherName.setToolTipText("Enter Father's Full Name");
		GDtxtFatherName.setColumns(10);
		GDtxtFatherName.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		GDtxtFatherName.setBounds(56, 22, 94, 22);
		GDpanelFatherDetails.add(GDtxtFatherName);
		GDtxtFatherName.requestFocus();
		
		JLabel GDlblFatherContact = new JLabel("Contact:");
		GDlblFatherContact.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GDlblFatherContact.setBounds(160, 23, 62, 16);
		GDpanelFatherDetails.add(GDlblFatherContact);
		
		GDtxtFatherContact = new JTextField();
		GDtxtFatherContact.setToolTipText("Enter Father's Contact");
		GDtxtFatherContact.setColumns(10);
		GDtxtFatherContact.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		GDtxtFatherContact.setBounds(217, 22, 88, 22);
		GDpanelFatherDetails.add(GDtxtFatherContact);
		
		JLabel GDlblFatherOccupation = new JLabel("Occupation:");
		GDlblFatherOccupation.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GDlblFatherOccupation.setBounds(10, 85, 77, 16);
		GDpanelFatherDetails.add(GDlblFatherOccupation);
		
		GDtxtFatherOccupation = new JTextField();
		GDtxtFatherOccupation.setToolTipText("Enter Father's Occupation");
		GDtxtFatherOccupation.setColumns(10);
		GDtxtFatherOccupation.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		GDtxtFatherOccupation.setBounds(97, 84, 63, 22);
		GDpanelFatherDetails.add(GDtxtFatherOccupation);
		
		JLabel GDlblFatherQualifiaction = new JLabel("Qualification:");
		GDlblFatherQualifiaction.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GDlblFatherQualifiaction.setBounds(176, 85, 88, 16);
		GDpanelFatherDetails.add(GDlblFatherQualifiaction);
		
		GDtxtFatherQualification = new JTextField();
		GDtxtFatherQualification.setToolTipText("Enter Father's Qualification");
		GDtxtFatherQualification.setColumns(10);
		GDtxtFatherQualification.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		GDtxtFatherQualification.setBounds(258, 84, 70, 22);
		GDpanelFatherDetails.add(GDtxtFatherQualification);
		
		JLabel GDlblFatherIncome = new JLabel("Income:");
		GDlblFatherIncome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GDlblFatherIncome.setBounds(338, 23, 62, 16);
		GDpanelFatherDetails.add(GDlblFatherIncome);
		
		JLabel GDlblFatherEmail = new JLabel("Email id:");
		GDlblFatherEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GDlblFatherEmail.setBounds(371, 85, 62, 16);
		GDpanelFatherDetails.add(GDlblFatherEmail);
		
		GDtxtFatherEmail = new JTextField();
		GDtxtFatherEmail.setToolTipText("Enter Father's EmailId");
		GDtxtFatherEmail.setColumns(10);
		GDtxtFatherEmail.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		GDtxtFatherEmail.setBounds(443, 84, 131, 22);
		GDpanelFatherDetails.add(GDtxtFatherEmail);
		
		GDcomboBoxFatherIncome = new JComboBox();
		GDcomboBoxFatherIncome.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		GDcomboBoxFatherIncome.setModel(new DefaultComboBoxModel(new String[] {"", "<1,00,000", "1,00,00 to 3,00,000", "3,00,000 to 5,00,000", "5,00,000 to 7,00,000", ">7,00,000"}));
		GDcomboBoxFatherIncome.setBounds(410, 23, 108, 20);
		GDpanelFatherDetails.add(GDcomboBoxFatherIncome);
		
		JPanel GDpanelMotherDetails = new JPanel();
		GDpanelMotherDetails.setLayout(null);
		GDpanelMotherDetails.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Mother Details", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GDpanelMotherDetails.setBounds(41, 257, 584, 131);
		panel.add(GDpanelMotherDetails);
		
		JLabel GDlblMotherName = new JLabel("Name:");
		GDlblMotherName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GDlblMotherName.setBounds(10, 23, 50, 16);
		GDpanelMotherDetails.add(GDlblMotherName);
		
		GDtxtMotherName = new JTextField();
		GDtxtMotherName.setToolTipText("Enter Mother's Full Name");
		GDtxtMotherName.setColumns(10);
		GDtxtMotherName.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		GDtxtMotherName.setBounds(56, 22, 94, 22);
		GDpanelMotherDetails.add(GDtxtMotherName);
		
		JLabel GDlblMotherContact = new JLabel("Contact:");
		GDlblMotherContact.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GDlblMotherContact.setBounds(182, 23, 62, 16);
		GDpanelMotherDetails.add(GDlblMotherContact);
		
		GDtxtMotherContact = new JTextField();
		GDtxtMotherContact.setToolTipText("Enter Mother's Contact");
		GDtxtMotherContact.setColumns(10);
		GDtxtMotherContact.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		GDtxtMotherContact.setBounds(242, 22, 94, 22);
		GDpanelMotherDetails.add(GDtxtMotherContact);
		
		JLabel GDlblMotherOccupation = new JLabel("Occupation:");
		GDlblMotherOccupation.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GDlblMotherOccupation.setBounds(73, 89, 77, 16);
		GDpanelMotherDetails.add(GDlblMotherOccupation);
		
		GDtxtMotherOccupation = new JTextField();
		GDtxtMotherOccupation.setToolTipText("Enter Mother's Occupation");
		GDtxtMotherOccupation.setColumns(10);
		GDtxtMotherOccupation.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		GDtxtMotherOccupation.setBounds(161, 88, 94, 22);
		GDpanelMotherDetails.add(GDtxtMotherOccupation);
		
		JLabel GDlblMotherQualifiaction = new JLabel("Qualification:");
		GDlblMotherQualifiaction.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GDlblMotherQualifiaction.setBounds(280, 89, 88, 16);
		GDpanelMotherDetails.add(GDlblMotherQualifiaction);
		
		GDtxtMotherQualification = new JTextField();
		GDtxtMotherQualification.setToolTipText("Enter Mother's Qualification");
		GDtxtMotherQualification.setColumns(10);
		GDtxtMotherQualification.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		GDtxtMotherQualification.setBounds(378, 88, 94, 22);
		GDpanelMotherDetails.add(GDtxtMotherQualification);
		
		JLabel GDlblMotherIncome = new JLabel("Income:");
		GDlblMotherIncome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GDlblMotherIncome.setBounds(394, 23, 62, 16);
		GDpanelMotherDetails.add(GDlblMotherIncome);
		
		GDcomboBoxMotherIncome = new JComboBox();
		GDcomboBoxMotherIncome.setModel(new DefaultComboBoxModel(new String[] {"", "<1,00,000", "1,00,00 to 3,00,000", "3,00,000 to 5,00,000", "5,00,000 to 7,00,000", ">7,00,000"}));
		GDcomboBoxMotherIncome.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		GDcomboBoxMotherIncome.setBounds(466, 23, 108, 20);
		GDpanelMotherDetails.add(GDcomboBoxMotherIncome);
		
		btnBackPersonalDetails = new JButton("Back (Personal Details)");
		btnBackPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		btnBackPersonalDetails.setBounds(121, 435, 213, 29);
		panel.add(btnBackPersonalDetails);
		
		btnNext = new JButton("Next");
		btnNext.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNext.setBounds(457, 435, 97, 29);
		panel.add(btnNext);
		
		GDbtnSearchMod = new JButton("Modify");
		
		
		GDbtnSearchMod.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GDbtnSearchMod.setBounds(432, 51, 82, 23);
		panel.add(GDbtnSearchMod);
		
		GDlblUniqueNumber = new JLabel("Enter Unique Number:");
		GDlblUniqueNumber.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GDlblUniqueNumber.setBounds(347, 26, 127, 14);
		panel.add(GDlblUniqueNumber);
		
		GDtxtUniqueNumber = new JTextField();
		GDtxtUniqueNumber.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		GDtxtUniqueNumber.setBounds(479, 23, 115, 20);
		panel.add(GDtxtUniqueNumber);
		GDtxtUniqueNumber.setColumns(10);
		
		
		contentPane.add(panel);
		
	}
	public boolean GDgetTextEmpty()
	{
		if(this.GDtxtFatherContact.getText().isEmpty() || this.GDtxtFatherEmail.getText().isEmpty() 
				|| this.getGDcmbFatherIncome().isEmpty() || this.GDtxtFatherName.getText().isEmpty() 
				|| this.GDtxtFatherOccupation.getText().isEmpty() || this.GDtxtFatherQualification.getText().isEmpty() 
				||	this.GDtxtMotherContact.getText().isEmpty() || this.getGDcmbMotherIncome().isEmpty() 
				|| this.GDtxtMotherName.getText().isEmpty() || this.GDtxtMotherOccupation.getText().isEmpty() 
				|| this.GDtxtMotherQualification.getText().isEmpty())
			return true;
		else 
			return false;
		
	}
	public void setAction(EnterNewStudentActionListener enter, SearchFromFrameActionListener slis)
	{
		enterlisten = enter;
		searchframelisten = slis;
		this.btnNext.addActionListener(enterlisten);
		this.btnBackPersonalDetails.addActionListener(enterlisten);
		this.GDbtnSearchMod.addActionListener(searchframelisten);
	}
	
	public JTextField getGDtxtUniqueNumber() {
		return GDtxtUniqueNumber;
	}

	public void setBtnNext(JButton btnNext) {
		this.btnNext = btnNext;
	}

	public void setGDtxtUniqueNumber(JTextField gDtxtUniqueNumber) {
		GDtxtUniqueNumber = gDtxtUniqueNumber;
	}

	public void clear()
	{
		this.GDtxtFatherContact.setText("");
		this.GDtxtFatherEmail.setText("");
		this.GDcomboBoxFatherIncome.setSelectedItem("");
		this.GDtxtFatherName.setText("");
		this.GDtxtFatherOccupation.setText("");
		this.GDtxtFatherQualification.setText("");
		this.GDtxtMotherContact.setText("");
		this.GDtxtMotherQualification.setText("");
		this.GDcomboBoxMotherIncome.setSelectedItem("");
		this.GDtxtMotherName.setText("");
		this.GDtxtMotherOccupation.setText("");
	}
}
