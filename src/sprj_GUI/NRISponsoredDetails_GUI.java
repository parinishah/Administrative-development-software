package sprj_GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

import sprj_Listener.EnterNewStudentActionListener;
import sprj_Listener.SearchFromFrameActionListener;

import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.UIManager;

@SuppressWarnings("serial")
public class NRISponsoredDetails_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField NRIStxtname;
	private JTextField NRIStxtContact;
	//private JTextField NRIStxtGender;
	private JTextField NRIStxtNationality;
	private JTextField NRIStxtStatus;
	private JTextField NRIStxtRelation;
	private JTextArea NRIStextAreaAddress;
	private JButton btnBackAD;
	private JButton btnNextenrollmentDetails;
	private JRadioButton NRISbtnMale;
	private JRadioButton NRISbtnFemale;
	
	EnterNewStudentActionListener enterlisten;
	SearchFromFrameActionListener searchframelisten;
	
	public JButton getNRISbtnSearchMod() {
		return NRISbtnSearchMod;
	}

	public void setNRISbtnSearchMod(JButton nRISbtnSearchMod) {
		NRISbtnSearchMod = nRISbtnSearchMod;
	}

	private JButton NRISbtnSearchMod;
	public JTextField getNRIStxtUniqueNumber() {
		return NRIStxtUniqueNumber;
	}

	public void setNRIStxtUniqueNumber(JTextField nRIStxtUniqueNumber) {
		NRIStxtUniqueNumber = nRIStxtUniqueNumber;
	}

	private JLabel NRISlblUniqueNumber;
	private JTextField NRIStxtUniqueNumber;
	private JPanel panel_1;

	public JTextField getNRIStxtname() 
	{
		return NRIStxtname;
	}

	public JTextField getNRIStxtContact() 
	{
		return NRIStxtContact;
	}
	
	public String getNRISGender()
	{
		if(this.NRISbtnMale.isSelected())
			return this.NRISbtnMale.getText();
		
		else
			return this.NRISbtnFemale.getText();
	}

	/*public JTextField getNRIStxtGender() 
	{
		return NRIStxtGender;
	}*/

	public JTextField getNRIStxtNationality() 
	{
		return NRIStxtNationality;
	}

	public JTextField getNRIStxtStatus()
	{
		return NRIStxtStatus;
	}

	public JTextField getNRIStxtRelation() 
	{
		return NRIStxtRelation;
	}

	public JTextArea getNRIStextAreaAddress() 
	{
		return NRIStextAreaAddress;
	}

	public JButton getBtnBackAD() 
	{
		return btnBackAD;
	}

	public JButton getBtnNextenrollmentDetails()
	{
		return btnNextenrollmentDetails;
	}

	public void setNRIStxtname(JTextField nRIStxtname)
	{
		NRIStxtname = nRIStxtname;
	}

	public void setNRIStxtContact(JTextField nRIStxtContact) 
	{
		NRIStxtContact = nRIStxtContact;
	}

	/*public void setNRIStxtGender(JTextField nRIStxtGender) 
	{
		NRIStxtGender = nRIStxtGender;
	}*/

	public void setNRIStxtNationality(JTextField nRIStxtNationality) 
	{
		NRIStxtNationality = nRIStxtNationality;
	}

	public void setNRIStxtStatus(JTextField nRIStxtStatus) 
	{
		NRIStxtStatus = nRIStxtStatus;
	}

	public void setNRIStxtRelation(JTextField nRIStxtRelation) 
	{
		NRIStxtRelation = nRIStxtRelation;
	}

	public void setNRIStextAreaAddress(JTextArea nRIStextAreaAddress)
	{
		NRIStextAreaAddress = nRIStextAreaAddress;
	}

	public void setBtnBackAD(JButton btnBackAD) 
	{
		this.btnBackAD = btnBackAD;
	}

	public void setBtnNextenrollmentDetails(JButton btnNextenrollmentDetails) 
	{
		this.btnNextenrollmentDetails = btnNextenrollmentDetails;
	}

	/**
	 * Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NRISponsoredDetails_GUI frame = new NRISponsoredDetails_GUI();
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
	public NRISponsoredDetails_GUI()
	{
		//setType(Type.UTILITY);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		this.setBounds(0, 0, screen.width, screen.height-30);
		
		this.setLocationRelativeTo(null);
		setTitle("NRI SPONSORED DETAILS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 640, 401);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("ColorChooser.background"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		panel_1.setBounds(309, 112, 742, 472);
		panel_1.setLayout(null);

		
		JLabel lblNriSponsored = new JLabel("NRI - SPONSORED STUDENT DETAILS");
		lblNriSponsored.setHorizontalAlignment(SwingConstants.CENTER);
		lblNriSponsored.setForeground(Color.BLACK);
		lblNriSponsored.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNriSponsored.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		lblNriSponsored.setBounds(26, 13, 413, 55);
		panel_1.add(lblNriSponsored);
		
		JPanel panel = new JPanel();
		panel.setBounds(24, 99, 696, 306);
		//contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel NRISlblname = new JLabel("Sponsor Name:");
		NRISlblname.setFont(new Font("Tahoma", Font.PLAIN, 17));
		NRISlblname.setBounds(23, 9, 127, 22);
		panel.add(NRISlblname);
		
		NRIStxtname = new JTextField();
		NRIStxtname.setToolTipText("Enter Sponsor's full Name");
		NRIStxtname.setColumns(10);
		NRIStxtname.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		NRIStxtname.setBounds(173, 12, 111, 22);
		panel.add(NRIStxtname);
		NRIStxtname.requestFocus();
		
		JLabel NRISlblContact = new JLabel("Contact:");
		NRISlblContact.setFont(new Font("Tahoma", Font.PLAIN, 17));
		NRISlblContact.setBounds(404, 146, 79, 16);
		panel.add(NRISlblContact);
		
		NRIStxtContact = new JTextField();
		NRIStxtContact.setToolTipText("Enter Sponsor's Contact ");
		NRIStxtContact.setColumns(10);
		NRIStxtContact.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		NRIStxtContact.setBounds(507, 146, 119, 22);
		panel.add(NRIStxtContact);
		
		JLabel NRISlblGender = new JLabel("Gender:");
		NRISlblGender.setFont(new Font("Tahoma", Font.PLAIN, 17));
		NRISlblGender.setBounds(404, 12, 71, 16);
		panel.add(NRISlblGender);
		
		JLabel NRISlblNationality = new JLabel("Nationality:");
		NRISlblNationality.setFont(new Font("Tahoma", Font.PLAIN, 17));
		NRISlblNationality.setBounds(23, 73, 102, 22);
		panel.add(NRISlblNationality);
		
		NRIStxtNationality = new JTextField();
		NRIStxtNationality.setToolTipText("Enter Sponsor's Nationality");
		NRIStxtNationality.setColumns(10);
		NRIStxtNationality.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		NRIStxtNationality.setBounds(147, 76, 86, 22);
		panel.add(NRIStxtNationality);
		
		JLabel NRISlblStatus = new JLabel("NRI Status:");
		NRISlblStatus.setFont(new Font("Tahoma", Font.PLAIN, 17));
		NRISlblStatus.setBounds(404, 73, 111, 16);
		panel.add(NRISlblStatus);
		
		NRIStxtStatus = new JTextField();
		NRIStxtStatus.setToolTipText("Enter Sponsor's NRI Status (EG:Citizenship/ PR/ GreenCard holder)");
		NRIStxtStatus.setColumns(10);
		NRIStxtStatus.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		NRIStxtStatus.setBounds(525, 73, 148, 22);
		panel.add(NRIStxtStatus);
		
		JLabel NRISlblAdderss = new JLabel("Address:");
		NRISlblAdderss.setFont(new Font("Tahoma", Font.PLAIN, 17));
		NRISlblAdderss.setBounds(100, 227, 79, 16);
		panel.add(NRISlblAdderss);
		
		NRIStextAreaAddress = new JTextArea();
		NRIStextAreaAddress.setToolTipText("Enter Sponsor's Residential Address");
		NRIStextAreaAddress.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		NRIStextAreaAddress.setBounds(248, 226, 351, 52);
		panel.add(NRIStextAreaAddress);
		
		JLabel NRISlblRelation = new JLabel("Relation with Student:");
		NRISlblRelation.setFont(new Font("Tahoma", Font.PLAIN, 17));
		NRISlblRelation.setBounds(23, 146, 169, 16);
		panel.add(NRISlblRelation);
		
		NRIStxtRelation = new JTextField();
		NRIStxtRelation.setToolTipText("Enter Sponsor's Relationship with Student");
		NRIStxtRelation.setColumns(10);
		NRIStxtRelation.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		NRIStxtRelation.setBounds(202, 146, 102, 22);
		panel.add(NRIStxtRelation);
		
		ButtonGroup bg = new ButtonGroup();
		NRISbtnMale = new JRadioButton("Male");
		NRISbtnMale.setFont(new Font("Tahoma", Font.PLAIN, 17));
		NRISbtnMale.setBounds(501, 9, 62, 23);
		panel.add(NRISbtnMale);
		bg.add(NRISbtnMale);
		
		NRISbtnFemale = new JRadioButton("Female");
		NRISbtnFemale.setFont(new Font("Tahoma", Font.PLAIN, 17));
		NRISbtnFemale.setBounds(580, 9, 81, 23);
		panel.add(NRISbtnFemale);
		bg.add(NRISbtnFemale);
		
		btnBackAD = new JButton("Back (Academic Details)");
		btnBackAD.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		btnBackAD.setBounds(118, 422, 233, 23);
		panel_1.add(btnBackAD);
		
	    btnNextenrollmentDetails = new JButton("Next (Enrollment Details)");
	    btnNextenrollmentDetails.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNextenrollmentDetails.setBounds(397, 422, 233, 23);
		panel_1.add(btnNextenrollmentDetails);
		
		NRISbtnSearchMod = new JButton("Modify");
		
		
		
		
		NRISbtnSearchMod.setFont(new Font("Tahoma", Font.PLAIN, 15));
		NRISbtnSearchMod.setBounds(578, 55, 81, 25);
		panel_1.add(NRISbtnSearchMod);
		
		NRISlblUniqueNumber = new JLabel("Enter Unique Number:");
		NRISlblUniqueNumber.setFont(new Font("Tahoma", Font.PLAIN, 17));
		NRISlblUniqueNumber.setBounds(449, 13, 171, 31);
		panel_1.add(NRISlblUniqueNumber);
		
		NRIStxtUniqueNumber = new JTextField();
		NRIStxtUniqueNumber.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		NRIStxtUniqueNumber.setBounds(626, 17, 106, 23);
		panel_1.add(NRIStxtUniqueNumber);
		NRIStxtUniqueNumber.setColumns(10);
		
		panel_1.add(panel);
				contentPane.add(panel_1);
	}
	
	public boolean NRISpongetTextEmpty()
	{
		if(this.NRIStxtRelation.getText().isEmpty() || this.NRIStxtContact.getText().isEmpty() 
				|| this.NRIStxtname.getText().isEmpty() || this.NRIStxtNationality.getText().isEmpty() 
				|| this.NRIStxtStatus.getText().isEmpty() || NRIStextAreaAddress.getText().isEmpty())
			return true;
		else 
			return false;
	}
	
	public void setAction(EnterNewStudentActionListener enter, SearchFromFrameActionListener slis)
	{
		enterlisten = enter;
		searchframelisten = slis;
		this.btnNextenrollmentDetails.addActionListener(enterlisten);
		this.btnBackAD.addActionListener(enterlisten);
		this.NRISbtnSearchMod.addActionListener(searchframelisten);
	}
	
	public void clear()
	{
		this.NRIStextAreaAddress.setText("");
		this.NRIStxtRelation.setText("");
		this.NRIStxtContact.setText("");
		this.NRIStxtname.setText("");
		this.NRIStxtNationality.setText("");
		this.NRIStxtStatus.setText("");
		this.NRISbtnMale.setSelected(false);
		this.NRISbtnFemale.setSelected(false);
	}
	
}
