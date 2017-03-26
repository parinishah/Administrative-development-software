package sprj_GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.toedter.calendar.JDateChooser;

import sprj_Listener.SearchFromFrameActionListener;
import sprj_Listener.SearchModifyActionListener;

@SuppressWarnings("serial")
public class ModPersonalDetails_GUI extends JFrame 
{
	private ButtonGroup PDGenderBG = new ButtonGroup();
	private JTextField PDtxtLastName;
	private JTextField PDtxtMiddleName;
	private JTextField PDtxtFirstName;
	private JTextField PDtxtPincode;
	private JTextField PDtxtCity;
	private JTextField PDtxtState;
	private JTextField PDtxtEmailId;
	private JTextArea PDtxtAddL1;
	//private JTextArea PDtxtAddL2;
	private JRadioButton PDrdbtnMale;
	private JRadioButton PDrdbtnFemale;
	@SuppressWarnings("rawtypes")
	private JComboBox PDcomboBoxCategory;
	private JButton PDbtnNext;
	private JButton PDbtnBack;
	private JTextField PDtxtSecondaryContact;
	private JTextField PDtxtPrimaryContact;
	private JPanel panel;
	private JTextField PDtxtDisability;
	private JDateChooser PDdateDOB;
	
	SearchModifyActionListener modsearchlisten;
	SearchFromFrameActionListener searchframelisten;

	public String getPDgender()
	{
		if(this.PDrdbtnMale.isSelected())
			return this.PDrdbtnMale.getText();
		
		else if(this.PDrdbtnFemale.isSelected())
			return this.PDrdbtnFemale.getText();
		
		else return "";
	}
	
	public String getPDCategory()
	{
		return (String)this.PDcomboBoxCategory.getSelectedItem();
	}
	
	public String getPDDOB()
	{
		return new SimpleDateFormat("dd-MM-yyyy").format(this.PDdateDOB.getDate());
		//return this.PDdateDOB.getDate()
	}
	
	
	public JDateChooser getPDdateDOB() {
		return PDdateDOB;
	}

	public void setPDdateDOB(JDateChooser pDdateDOB) {
		PDdateDOB = pDdateDOB;
	}

	public JTextField getPDtxtDisability() {
		return PDtxtDisability;
	}

	public void setPDtxtDisability(JTextField pDtxtDisability) {
		PDtxtDisability = pDtxtDisability;
	}

	public ButtonGroup getPDGenderBG() 
	{
		return PDGenderBG;
	}

	public JTextField getPDtxtLastName() 
	{
		return PDtxtLastName;
	}

	public JTextField getPDtxtMiddleName() 
	{
		return PDtxtMiddleName;
	}

	public JTextField getPDtxtFirstName() 
	{
		return PDtxtFirstName;
	}

	public JTextField getPDtxtPincode() 
	{
		return PDtxtPincode;
	}

	public JTextField getPDtxtCity() 
	{
		return PDtxtCity;
	}

	public JTextField getPDtxtState() 
	{
		return PDtxtState;
	}

	public JTextField getPDtxtEmailId() 
	{
		return PDtxtEmailId;
	}

	public JTextArea getPDtxtAddL1() 
	{
		return PDtxtAddL1;
	}
	public JRadioButton getPDrdbtnMale() 
	{
		return PDrdbtnMale;
	}

	public JRadioButton getPDrdbtnFemale() 
	{
		return PDrdbtnFemale;
	}

	@SuppressWarnings("rawtypes")
	public JComboBox getPDcomboBoxCategory() 
	{
		return PDcomboBoxCategory;
	}

	public JButton getPDbtnNext() 
	{
		return PDbtnNext;
	}

	public JButton getPDbtnBack() 
	{
		return PDbtnBack;
	}

	public JTextField getPDtxtSecondaryContact() 
	{
		return PDtxtSecondaryContact;
	}

	public JTextField getPDtxtPrimaryContact() 
	{
		return PDtxtPrimaryContact;
	}

	public void setPDtxtDisability(String spDtxtDisability) 
	{
		this.PDtxtDisability.setText(spDtxtDisability);
	}

	public void setPDGenderBG(String sPDGenderBG) 
	{
		if(sPDGenderBG.equals("Male"))
			this.PDrdbtnMale.setSelected(true);
		else
			this.PDrdbtnFemale.setSelected(true);
	}

	public void setPDtxtLastName(String sPDtxtLastName) 
	{
		this.PDtxtLastName.setText(sPDtxtLastName);
	}

	public void setPDtxtMiddleName(String sPDtxtMiddleName) 
	{
		this.PDtxtMiddleName.setText(sPDtxtMiddleName);
	}

	public void setPDtxtFirstName(String sPDtxtFirstName) 
	{
		this.PDtxtFirstName.setText(sPDtxtFirstName);
	}

	public void setPDtxtPincode(String sPDtxtPincode) 
	{
		this.PDtxtPincode.setText(sPDtxtPincode);
	}

	public void setPDtxtCity(String sPDtxtCity) 
	{
		this.PDtxtCity.setText(sPDtxtCity);
	}

	public void setPDtxtState(String sPDtxtState) 
	{
		this.PDtxtState.setText(sPDtxtState);
	}

	public void setPDtxtEmailId(String sPDtxtEmailId) 
	{
		this.PDtxtEmailId.setText(sPDtxtEmailId);
	}

	public void setPDtxtAddL1(String sPDtxtAddL1) 
	{
		this.PDtxtAddL1.setText(sPDtxtAddL1);
	}

	public void setPDcomboBoxCategory(String sPDcomboBoxCategory) 
	{
		this.PDcomboBoxCategory.setSelectedItem(sPDcomboBoxCategory);
	}

	public void setPDtxtSecondaryContact(String sPDtxtSecondaryContact) 
	{
		this.PDtxtSecondaryContact.setText(sPDtxtSecondaryContact);;
	}

	public void setPDtxtPrimaryContact(String sPDtxtPrimaryContact) 
	{
		this.PDtxtPrimaryContact.setText(sPDtxtPrimaryContact);
	}
	
	public void setPDdob(String PDdob)
	{
		try
		{
			java.util.Date date = new SimpleDateFormat("dd-MM-yyyy").parse(PDdob);
			this.PDdateDOB.setDate(date);
			//System.out.println(this.PDdateDOB.getDate());
		}
		
		catch(Exception err)
		{
			
		}

		
	}	
	
	
/*	public void setPDGenderBG(ButtonGroup PDGenderBG) 
	{
		this.PDGenderBG = PDGenderBG;
	}

	public void setPDtxtLastName(JTextField PDtxtLastName) 
	{
		this.PDtxtLastName = PDtxtLastName;
	}

	public void setPDtxtMiddleName(JTextField PDtxtMiddleName) 
	{
		this.PDtxtMiddleName = PDtxtMiddleName;
	}

	public void setPDtxtFirstName(JTextField PDtxtFirstName) 
	{
		this.PDtxtFirstName = PDtxtFirstName;
	}

	public void setPDtxtPincode(JTextField PDtxtPincode) 
	{
		this.PDtxtPincode = PDtxtPincode;
	}

	public void setPDtxtCity(JTextField PDtxtCity) 
	{
		this.PDtxtCity = PDtxtCity;
	}

	public void setPDtxtState(JTextField PDtxtState) 
	{
		this.PDtxtState = PDtxtState;
	}

	public void setPDtxtEmailId(JTextField PDtxtEmailId) 
	{
		this.PDtxtEmailId = PDtxtEmailId;
	}

	public void setPDtxtAddL1(JTextArea PDtxtAddL1) 
	{
		this.PDtxtAddL1 = PDtxtAddL1;
	}


	public void setPDrdbtnMale(JRadioButton PDrdbtnMale) 
	{
		this.PDrdbtnMale = PDrdbtnMale;
	}

	public void setPDrdbtnFemale(JRadioButton PDrdbtnFemale) 
	{
		this.PDrdbtnFemale = PDrdbtnFemale;
	}

	public void setPDcomboBoxCategory(JComboBox PDcomboBoxCategory) 
	{
		this.PDcomboBoxCategory = PDcomboBoxCategory;
	}

	public void setPDbtnNext(JButton PDbtnNext) 
	{
		this.PDbtnNext = PDbtnNext;
	}

	public void setPDbtnBack(JButton PDbtnBack) 
	{
		this.PDbtnBack = PDbtnBack;
	}

	public void setPDtxtSecondaryContact(JTextField PDtxtSecondaryContact) 
	{
		this.PDtxtSecondaryContact = PDtxtSecondaryContact;
	}

	public void setPDtxtPrimaryContact(JTextField PDtxtPrimaryContact) 
	{
		this.PDtxtPrimaryContact = PDtxtPrimaryContact;
	}

*/
	/**
	 * Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PersonalDetails_GUI frame = new PersonalDetails_GUI();
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
	public ModPersonalDetails_GUI() 
	{
		getContentPane().setBackground(new Color(32, 178, 170));
		//setType(Type.UTILITY);
		setMaximizedBounds(new Rectangle(0, 0, 0, 0));
		setLocationRelativeTo(null);
		this.setTitle("MODIFY PERSONAL DETAILS");
		
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		this.setBounds(0, 0,screen.width,screen.height - 30);
		
		this.getContentPane().setForeground(Color.BLACK);
		this.getContentPane().setFont(UIManager.getFont("Label.font"));
		//this.setBounds(100, 100, 745, 575);
		//this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		
		
		
		panel = new JPanel();
		panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		panel.setBounds(301, 77, 816, 555);
		this.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblPDPersonalDetails = new JLabel("MODIFY PERSONAL DETAILS");
		lblPDPersonalDetails.setHorizontalAlignment(SwingConstants.CENTER);
		lblPDPersonalDetails.setForeground(Color.BLACK);
		lblPDPersonalDetails.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPDPersonalDetails.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		lblPDPersonalDetails.setBounds(31, 13, 750, 58);
		panel.add(lblPDPersonalDetails);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Personal Details", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(20, 95, 772, 393);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblPDFirstName = new JLabel("First Name");
		lblPDFirstName.setToolTipText("");
		lblPDFirstName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPDFirstName.setBounds(86, 25, 85, 21);
		panel_1.add(lblPDFirstName);
		
		JLabel lblPDMiddleName = new JLabel("Middle Name");
		lblPDMiddleName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPDMiddleName.setBounds(341, 25, 92, 21);
		panel_1.add(lblPDMiddleName);
		
		JLabel lblPDLastName = new JLabel("Last Name");
		lblPDLastName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPDLastName.setBounds(600, 25, 92, 21);
		panel_1.add(lblPDLastName);
		
		PDtxtLastName = new JTextField();
		PDtxtLastName.setToolTipText("Enter Last Name");
		PDtxtLastName.setColumns(10);
		PDtxtLastName.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		PDtxtLastName.setBounds(555, 50, 181, 29);
		panel_1.add(PDtxtLastName);
		
		PDtxtMiddleName = new JTextField();
		PDtxtMiddleName.setToolTipText("Enter Middle Name");
		PDtxtMiddleName.setColumns(10);
		PDtxtMiddleName.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		PDtxtMiddleName.setBounds(304, 50, 171, 29);
		panel_1.add(PDtxtMiddleName);
		
		PDtxtFirstName = new JTextField();
		PDtxtFirstName.setToolTipText("Enter First Name");
		PDtxtFirstName.setColumns(10);
		PDtxtFirstName.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 0, 0), null, null, new Color(0, 0, 255)));
		PDtxtFirstName.setBounds(49, 52, 150, 29);
		panel_1.add(PDtxtFirstName);
		
		JLabel lblPDGender = new JLabel("Gender:");
		lblPDGender.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPDGender.setBounds(24, 86, 72, 31);
		panel_1.add(lblPDGender);
		
		PDrdbtnMale = new JRadioButton("Male");
		PDrdbtnMale.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 0, 0), null, null, new Color(0, 0, 255)));
		PDrdbtnMale.setBounds(106, 88, 65, 31);
		panel_1.add(PDrdbtnMale);
		PDGenderBG.add(PDrdbtnMale);
		
		PDrdbtnFemale = new JRadioButton("Female");
		PDrdbtnFemale.setBounds(177, 88, 85, 31);
		panel_1.add(PDrdbtnFemale);
		PDGenderBG.add(PDrdbtnFemale);
		
		JLabel lblPDdob = new JLabel("Date Of Birth:");
		lblPDdob.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPDdob.setBounds(508, 349, 106, 31);
		panel_1.add(lblPDdob);
		
		PDtxtAddL1 = new JTextArea();
		PDtxtAddL1.setToolTipText("Enter Address");
		PDtxtAddL1.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		PDtxtAddL1.setBounds(155, 129, 590, 95);
		panel_1.add(PDtxtAddL1);
		
		JLabel lblPDAddress = new JLabel("Address:");
		lblPDAddress.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPDAddress.setBounds(24, 132, 126, 36);
		panel_1.add(lblPDAddress);
		
		JLabel lblPDPinCode = new JLabel("Pin Code:");
		lblPDPinCode.setToolTipText("");
		lblPDPinCode.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPDPinCode.setBounds(508, 238, 85, 21);
		panel_1.add(lblPDPinCode);
		
		PDtxtPincode = new JTextField();
		PDtxtPincode.setToolTipText("Enter Pin code");
		PDtxtPincode.setColumns(10);
		PDtxtPincode.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		PDtxtPincode.setBounds(603, 235, 142, 31);
		panel_1.add(PDtxtPincode);
		
		JLabel lblPDCity = new JLabel("State:");
		lblPDCity.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPDCity.setBounds(254, 241, 53, 25);
		panel_1.add(lblPDCity);
		
		PDtxtCity = new JTextField();
		PDtxtCity.setToolTipText("Enter residential City");
		PDtxtCity.setColumns(10);
		PDtxtCity.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		PDtxtCity.setBounds(72, 240, 142, 31);
		panel_1.add(PDtxtCity);
		
		PDtxtState = new JTextField();
		PDtxtState.setToolTipText("Enter your residential State");
		PDtxtState.setColumns(10);
		PDtxtState.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		PDtxtState.setBounds(304, 240, 142, 31);
		panel_1.add(PDtxtState);
		
		JLabel lblPDState = new JLabel("City:");
		lblPDState.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPDState.setBounds(24, 238, 68, 31);
		panel_1.add(lblPDState);
		
		JLabel lblPDCategory = new JLabel("Category:");
		lblPDCategory.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPDCategory.setBounds(288, 349, 76, 31);
		panel_1.add(lblPDCategory);
		
		PDcomboBoxCategory = new JComboBox();
		PDcomboBoxCategory.setModel(new DefaultComboBoxModel(new String[] {"", "General", "OBC", "SC/ST", "SEBC", "Others"}));
		PDcomboBoxCategory.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(220, 20, 60), null, null, new Color(0, 0, 255)));
		PDcomboBoxCategory.setToolTipText("Select Category");
		PDcomboBoxCategory.setBounds(374, 351, 106, 31);
		panel_1.add(PDcomboBoxCategory);
		
		JLabel lblPDEmailId = new JLabel("E-mail Id:");
		lblPDEmailId.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPDEmailId.setBounds(21, 351, 79, 23);
		panel_1.add(lblPDEmailId);
		
		PDtxtEmailId = new JTextField();
		PDtxtEmailId.setToolTipText("Enter Personal Email Id");
		PDtxtEmailId.setColumns(10);
		PDtxtEmailId.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(220, 20, 60), null, null, new Color(0, 0, 255)));
		PDtxtEmailId.setBounds(95, 351, 142, 31);
		panel_1.add(PDtxtEmailId);
		
		JLabel lblPDSecondaryContact = new JLabel("Contact No(P):");
		lblPDSecondaryContact.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPDSecondaryContact.setBounds(24, 292, 126, 31);
		panel_1.add(lblPDSecondaryContact);
		
		PDtxtSecondaryContact = new JTextField();
		PDtxtSecondaryContact.setToolTipText("Enter Primary Contact number");
		PDtxtSecondaryContact.setColumns(10);
		PDtxtSecondaryContact.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		PDtxtSecondaryContact.setBounds(162, 290, 193, 31);
		panel_1.add(PDtxtSecondaryContact);
		
		JLabel lblPDPrimaryContact = new JLabel("Contact No(S):");
		lblPDPrimaryContact.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPDPrimaryContact.setBounds(459, 288, 116, 31);
		panel_1.add(lblPDPrimaryContact);
		
		PDtxtPrimaryContact = new JTextField();
		PDtxtPrimaryContact.setToolTipText("Enter Secondary Contact number");
		PDtxtPrimaryContact.setColumns(10);
		PDtxtPrimaryContact.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		PDtxtPrimaryContact.setBounds(574, 290, 171, 31);
		panel_1.add(PDtxtPrimaryContact);
		
		PDtxtDisability = new JTextField();
		PDtxtDisability.setToolTipText("Enter 'none' if empty");
		PDtxtDisability.setColumns(10);
		PDtxtDisability.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		PDtxtDisability.setBounds(488, 86, 248, 31);
		panel_1.add(PDtxtDisability);
		
		JLabel PDlblDisability = new JLabel("Disability(if any):");
		PDlblDisability.setFont(new Font("Tahoma", Font.PLAIN, 15));
		PDlblDisability.setBounds(372, 81, 108, 23);
		panel_1.add(PDlblDisability);
		
		PDdateDOB = new JDateChooser();
		PDdateDOB.setToolTipText("Select Date of Birth");
		PDdateDOB.setBounds(637, 349, 108, 31);
		panel_1.add(PDdateDOB);
		
		PDbtnNext = new JButton("Next");
		
		PDbtnNext.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		PDbtnNext.setBounds(481, 510, 197, 34);
		panel.add(PDbtnNext);
		
		PDbtnBack = new JButton("Back");
		
		PDbtnBack.setFont(new Font("Tahoma", Font.PLAIN, 15));
		PDbtnBack.setBounds(209, 510, 189, 30);
		panel.add(PDbtnBack);
		//setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{getContentPane(), panel, lblPDPersonalDetails, panel_1, lblPDFirstName, lblPDMiddleName, lblPDLastName, PDtxtLastName, PDtxtMiddleName, PDtxtFirstName, lblPDGender, PDrdbtnMale, PDrdbtnFemale, lblPDdob, PDtxtAddL1, lblPDAddress, lblPDPinCode, PDtxtPincode, lblPDCity, PDtxtCity, PDtxtState, lblPDState, lblPDCategory, PDcomboBoxCategory, lblPDEmailId, PDtxtEmailId, lblPDSecondaryContact, PDtxtSecondaryContact, lblPDPrimaryContact, PDtxtPrimaryContact, PDtxtDisability, PDlblDisability, PDdateDOB, PDdateDOB.getCalendarButton(), PDbtnNext, PDbtnBack}));
	
	
	}
	public boolean PDgetTextEmpty()
	{
		if(this.PDtxtAddL1.getText().isEmpty() || this.PDtxtCity.getText().isEmpty() ||
				this.PDtxtDisability.getText().isEmpty() || this.PDtxtEmailId.getText().isEmpty() || this.PDtxtFirstName.getText().isEmpty() ||
				this.PDtxtLastName.getText().isEmpty() || this.PDtxtMiddleName.getText().isEmpty() || this.PDtxtPincode.getText().isEmpty() || 
				this.PDtxtPrimaryContact.getText().isEmpty() || this.PDtxtSecondaryContact.getText().isEmpty() || this.PDtxtState.getText().isEmpty()
				|| !(this.PDrdbtnFemale.isSelected() || this.PDrdbtnMale.isSelected() ) || this.PDcomboBoxCategory.getSelectedItem().equals("") )
			return true;
		else 
			return false;
	}
	
	public void setAction(SearchModifyActionListener searchm)
	{
		modsearchlisten = searchm;
		//searchframelisten = sr;
		this.PDbtnNext.addActionListener(modsearchlisten);
		this.PDbtnBack.addActionListener(modsearchlisten);
	}
	
	public void setAction(SearchFromFrameActionListener sr)
	{
	//	modsearchlisten = searchm;
		searchframelisten = sr;
		this.PDbtnNext.addActionListener(searchframelisten);
		this.PDbtnBack.addActionListener(searchframelisten);
		//System.out.println("herep");
	}
	
	public void clear()
	{
		this.PDtxtAddL1.setText("");
		this.PDtxtCity.setText("");
		this.PDtxtDisability.setText("");
		this.PDtxtEmailId.setText("");
		this.PDtxtFirstName.setText("");
		this.PDtxtLastName.setText("");
		this.PDtxtMiddleName.setText("");
		this.PDtxtPincode.setText("");
		this.PDtxtPrimaryContact.setText("");
		this.PDtxtSecondaryContact.setText("");
		this.PDtxtState.setText("");
		this.PDrdbtnFemale.setSelected(false);
		this.PDrdbtnMale.setSelected(false);
		this.PDcomboBoxCategory.setSelectedItem("");
		//this.PDdateDOB.setDateFormatString("");
		
		
		try
		{
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			Date today = dateFormat.parse(dateFormat.format(new Date()));
			this.PDdateDOB.setDate(today);
			
		}
		
		catch(Exception err)
		{
			
		}
		
		
	}
}
