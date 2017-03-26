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

import sprj_Listener.SearchFromFrameActionListener;
import sprj_Listener.SearchModifyActionListener;

import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.border.MatteBorder;

@SuppressWarnings("serial")
public class ModGuardianDetails_GUI extends JFrame {

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
	
	
	SearchModifyActionListener modsearchlisten;
	SearchFromFrameActionListener searchframelisten;
	
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

	public void setGDcmbFatherIncome(String sgDcomboBoxFatherIncome)
	{
		GDcomboBoxFatherIncome.setSelectedItem(sgDcomboBoxFatherIncome);
	}
	
	public void setGDcmbMotherIncome(String sgDcomboBoxMotherIncome)
	{
		GDcomboBoxMotherIncome.setSelectedItem(sgDcomboBoxMotherIncome);
	}
	
	public void setGDtxtFatherName(String sgDtxtFatherName) 
	{
		GDtxtFatherName.setText(sgDtxtFatherName);
	}

	public void setGDtxtFatherContact(String sgDtxtFatherContact) 
	{
		GDtxtFatherContact.setText(sgDtxtFatherContact);
	}

	public void setGDtxtFatherOccupation(String sgDtxtFatherOccupation) 
	{
		GDtxtFatherOccupation.setText(sgDtxtFatherOccupation);
	}

	public void setGDtxtFatherQualification(String sgDtxtFatherQualification) 
	{
		GDtxtFatherQualification.setText(sgDtxtFatherQualification);
	}


	public void setGDtxtFatherEmail(String sgDtxtFatherEmail) 
	{
		GDtxtFatherEmail.setText(sgDtxtFatherEmail);
	}

	public void setGDtxtMotherName(String sgDtxtMotherName) 
	{
		GDtxtMotherName.setText(sgDtxtMotherName);
	}

	public void setGDtxtMotherContact(String sgDtxtMotherContact) 
	{
		GDtxtMotherContact.setText(sgDtxtMotherContact);
	}

	public void setGDtxtMotherOccupation(String sgDtxtMotherOccupation)
	{
		GDtxtMotherOccupation.setText(sgDtxtMotherOccupation);
	}

	public void setGDtxtMotherQualification(String sgDtxtMotherQualification) 
	{
		GDtxtMotherQualification.setText(sgDtxtMotherQualification);
	}
	

/*	public void setGDtxtFatherEmail(JTextField gDtxtFatherEmail) 
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
	public ModGuardianDetails_GUI() {
		//setType(Type.UTILITY);
		
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		this.setBounds(0, 0,screen.width,screen.height - 30);
		
		setLocationRelativeTo(null);
		setTitle("MODIFY GUARDIAN DETAILS");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 577, 401);
		//setBounds(100, 100, 745, 575);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 102, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		panel.setBounds(236, 84, 901, 526);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblGuardianDetails = new JLabel("MODIFY GUARDIAN DETAILS");
		lblGuardianDetails.setHorizontalAlignment(SwingConstants.CENTER);
		lblGuardianDetails.setForeground(Color.BLACK);
		lblGuardianDetails.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblGuardianDetails.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		lblGuardianDetails.setBounds(20, 15, 854, 48);
		panel.add(lblGuardianDetails);
		
		JPanel GDpanelFatherDetails = new JPanel();
		GDpanelFatherDetails.setBorder(new TitledBorder(null, "Father Details", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GDpanelFatherDetails.setBounds(20, 90, 854, 158);
		panel.add(GDpanelFatherDetails);
		GDpanelFatherDetails.setLayout(null);
		
		JLabel GDlblFatherName = new JLabel("Name:");
		GDlblFatherName.setHorizontalAlignment(SwingConstants.RIGHT);
		GDlblFatherName.setFont(new Font("Tahoma", Font.PLAIN, 17));
		GDlblFatherName.setBounds(23, 21, 87, 29);
		GDpanelFatherDetails.add(GDlblFatherName);
		
		GDtxtFatherName = new JTextField();
		GDtxtFatherName.setToolTipText("Enter Father's Full Name");
		GDtxtFatherName.setColumns(10);
		GDtxtFatherName.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		GDtxtFatherName.setBounds(120, 23, 148, 30);
		GDpanelFatherDetails.add(GDtxtFatherName);
		
		JLabel GDlblFatherContact = new JLabel("Contact:");
		GDlblFatherContact.setHorizontalAlignment(SwingConstants.RIGHT);
		GDlblFatherContact.setFont(new Font("Tahoma", Font.PLAIN, 17));
		GDlblFatherContact.setBounds(329, 22, 94, 30);
		GDpanelFatherDetails.add(GDlblFatherContact);
		
		GDtxtFatherContact = new JTextField();
		GDtxtFatherContact.setToolTipText("Enter Father's Contact");
		GDtxtFatherContact.setColumns(10);
		GDtxtFatherContact.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		GDtxtFatherContact.setBounds(433, 25, 130, 30);
		GDpanelFatherDetails.add(GDtxtFatherContact);
		
		JLabel GDlblFatherOccupation = new JLabel("Occupation:");
		GDlblFatherOccupation.setFont(new Font("Tahoma", Font.PLAIN, 17));
		GDlblFatherOccupation.setBounds(16, 91, 94, 30);
		GDpanelFatherDetails.add(GDlblFatherOccupation);
		
		GDtxtFatherOccupation = new JTextField();
		GDtxtFatherOccupation.setToolTipText("Enter Father's Occupation");
		GDtxtFatherOccupation.setColumns(10);
		GDtxtFatherOccupation.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		GDtxtFatherOccupation.setBounds(120, 94, 130, 31);
		GDpanelFatherDetails.add(GDtxtFatherOccupation);
		
		JLabel GDlblFatherQualifiaction = new JLabel("Qualification:");
		GDlblFatherQualifiaction.setFont(new Font("Tahoma", Font.PLAIN, 17));
		GDlblFatherQualifiaction.setBounds(303, 91, 108, 30);
		GDpanelFatherDetails.add(GDlblFatherQualifiaction);
		
		GDtxtFatherQualification = new JTextField();
		GDtxtFatherQualification.setToolTipText("Enter Father's Qualification");
		GDtxtFatherQualification.setColumns(10);
		GDtxtFatherQualification.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		GDtxtFatherQualification.setBounds(421, 94, 116, 30);
		GDpanelFatherDetails.add(GDtxtFatherQualification);
		
		JLabel GDlblFatherIncome = new JLabel("Income:");
		GDlblFatherIncome.setHorizontalAlignment(SwingConstants.RIGHT);
		GDlblFatherIncome.setFont(new Font("Tahoma", Font.PLAIN, 17));
		GDlblFatherIncome.setBounds(624, 22, 78, 30);
		GDpanelFatherDetails.add(GDlblFatherIncome);
		
		JLabel GDlblFatherEmail = new JLabel("Email id:");
		GDlblFatherEmail.setFont(new Font("Tahoma", Font.PLAIN, 17));
		GDlblFatherEmail.setBounds(574, 92, 70, 29);
		GDpanelFatherDetails.add(GDlblFatherEmail);
		
		GDtxtFatherEmail = new JTextField();
		GDtxtFatherEmail.setToolTipText("Enter Father's EmailId");
		GDtxtFatherEmail.setColumns(10);
		GDtxtFatherEmail.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		GDtxtFatherEmail.setBounds(647, 91, 186, 30);
		GDpanelFatherDetails.add(GDtxtFatherEmail);
		
		GDcomboBoxFatherIncome = new JComboBox();
		GDcomboBoxFatherIncome.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		GDcomboBoxFatherIncome.setModel(new DefaultComboBoxModel(new String[] {"", "<1,00,000", "1,00,00 to 3,00,000", "3,00,000 to 5,00,000", "5,00,000 to 7,00,000", ">7,00,000"}));
		GDcomboBoxFatherIncome.setBounds(712, 25, 117, 30);
		GDpanelFatherDetails.add(GDcomboBoxFatherIncome);
		
		JPanel GDpanelMotherDetails = new JPanel();
		GDpanelMotherDetails.setLayout(null);
		GDpanelMotherDetails.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Mother Details", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GDpanelMotherDetails.setBounds(20, 264, 854, 158);
		panel.add(GDpanelMotherDetails);
		
		JLabel GDlblMotherName = new JLabel("Name:");
		GDlblMotherName.setHorizontalAlignment(SwingConstants.RIGHT);
		GDlblMotherName.setFont(new Font("Tahoma", Font.PLAIN, 17));
		GDlblMotherName.setBounds(10, 23, 97, 30);
		GDpanelMotherDetails.add(GDlblMotherName);
		
		GDtxtMotherName = new JTextField();
		GDtxtMotherName.setToolTipText("Enter Mother's Full Name");
		GDtxtMotherName.setColumns(10);
		GDtxtMotherName.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		GDtxtMotherName.setBounds(117, 23, 184, 36);
		GDpanelMotherDetails.add(GDtxtMotherName);
		
		JLabel GDlblMotherContact = new JLabel("Contact:");
		GDlblMotherContact.setHorizontalAlignment(SwingConstants.RIGHT);
		GDlblMotherContact.setFont(new Font("Tahoma", Font.PLAIN, 17));
		GDlblMotherContact.setBounds(319, 25, 94, 35);
		GDpanelMotherDetails.add(GDlblMotherContact);
		
		GDtxtMotherContact = new JTextField();
		GDtxtMotherContact.setToolTipText("Enter Mother's Contact");
		GDtxtMotherContact.setColumns(10);
		GDtxtMotherContact.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		GDtxtMotherContact.setBounds(423, 24, 154, 35);
		GDpanelMotherDetails.add(GDtxtMotherContact);
		
		JLabel GDlblMotherOccupation = new JLabel("Occupation:");
		GDlblMotherOccupation.setHorizontalAlignment(SwingConstants.RIGHT);
		GDlblMotherOccupation.setFont(new Font("Tahoma", Font.PLAIN, 17));
		GDlblMotherOccupation.setBounds(117, 91, 113, 32);
		GDpanelMotherDetails.add(GDlblMotherOccupation);
		
		GDtxtMotherOccupation = new JTextField();
		GDtxtMotherOccupation.setToolTipText("Enter Mother's Occupation");
		GDtxtMotherOccupation.setColumns(10);
		GDtxtMotherOccupation.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		GDtxtMotherOccupation.setBounds(240, 94, 167, 33);
		GDpanelMotherDetails.add(GDtxtMotherOccupation);
		
		JLabel GDlblMotherQualifiaction = new JLabel("Qualification:");
		GDlblMotherQualifiaction.setHorizontalAlignment(SwingConstants.RIGHT);
		GDlblMotherQualifiaction.setFont(new Font("Tahoma", Font.PLAIN, 17));
		GDlblMotherQualifiaction.setBounds(548, 92, 126, 30);
		GDpanelMotherDetails.add(GDlblMotherQualifiaction);
		
		GDtxtMotherQualification = new JTextField();
		GDtxtMotherQualification.setToolTipText("Enter Mother's Qualification");
		GDtxtMotherQualification.setColumns(10);
		GDtxtMotherQualification.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		GDtxtMotherQualification.setBounds(684, 95, 147, 30);
		GDpanelMotherDetails.add(GDtxtMotherQualification);
		
		JLabel GDlblMotherIncome = new JLabel("Income:");
		GDlblMotherIncome.setFont(new Font("Tahoma", Font.PLAIN, 17));
		GDlblMotherIncome.setBounds(641, 26, 72, 32);
		GDpanelMotherDetails.add(GDlblMotherIncome);
		
		GDcomboBoxMotherIncome = new JComboBox();
		GDcomboBoxMotherIncome.setModel(new DefaultComboBoxModel(new String[] {"", "<1,00,000", "1,00,00 to 3,00,000", "3,00,000 to 5,00,000", "5,00,000 to 7,00,000", ">7,00,000"}));
		GDcomboBoxMotherIncome.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		GDcomboBoxMotherIncome.setBounds(723, 31, 108, 27);
		GDpanelMotherDetails.add(GDcomboBoxMotherIncome);
		
		btnBackPersonalDetails = new JButton("Back");
		btnBackPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		btnBackPersonalDetails.setBounds(218, 456, 186, 34);
		panel.add(btnBackPersonalDetails);
		
		btnNext = new JButton("Next");
		btnNext.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNext.setBounds(562, 456, 115, 34);
		panel.add(btnNext);
		
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
	public void setAction(SearchModifyActionListener searchm)
	{
		modsearchlisten = searchm;
		//searchframelisten = sr;
		this.btnNext.addActionListener(modsearchlisten);
		this.btnBackPersonalDetails.addActionListener(modsearchlisten);
	}
	
	public void setAction(SearchFromFrameActionListener sr)
	{
		//modsearchlisten = searchm;
		searchframelisten = sr;
		this.btnNext.addActionListener(searchframelisten);
		this.btnBackPersonalDetails.addActionListener(searchframelisten);
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
