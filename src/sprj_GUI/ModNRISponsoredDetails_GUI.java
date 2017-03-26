package sprj_GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

import sprj_Listener.SearchFromFrameActionListener;
import sprj_Listener.SearchModifyActionListener;

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
import javax.swing.border.MatteBorder;

@SuppressWarnings("serial")
public class ModNRISponsoredDetails_GUI extends JFrame {

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
	
	SearchModifyActionListener modsearchlisten;
	SearchFromFrameActionListener searchframelisten;
	
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

	/*
	public void setNRIStxtname(JTextField nRIStxtname)
	{
		NRIStxtname = nRIStxtname;
	}

	public void setNRIStxtContact(JTextField nRIStxtContact) 
	{
		NRIStxtContact = nRIStxtContact;
	}
	*/
	
	public void setNRIStxtname(String snRIStxtname)
	{
		this.NRIStxtname.setText(snRIStxtname); 
	}

	public void setNRIStxtContact(String snRIStxtContact) 
	{
		this.NRIStxtContact.setText(snRIStxtContact);
	}

	public void setNRIStxtGender(String snRIStxtGender) 
	{
		if(snRIStxtGender.equals("Male"))
		{
			this.NRISbtnMale.setEnabled(true);
		}
		else
		{
			this.NRISbtnFemale.setEnabled(true);			
		}
	}

	public void setNRIStxtNationality(String snRIStxtNationality) 
	{
		this.NRIStxtNationality.setText(snRIStxtNationality);
	}

	public void setNRIStxtStatus(String snRIStxtStatus) 
	{
		this.NRIStxtStatus.setText(snRIStxtStatus);
	}

	public void setNRIStxtRelation(String sNRIStxtRelation) 
	{
		this.NRIStxtRelation.setText(sNRIStxtRelation);
	}

	public void setNRIStextAreaAddress(String snRIStextAreaAddress)
	{
		this.NRIStextAreaAddress.setText(snRIStextAreaAddress);
	}

	/*
	public void setBtnNextenrollmentDetails(JButton btnNextenrollmentDetails) 
	{
		this.btnNextenrollmentDetails = btnNextenrollmentDetails;
	}
	*/
	
	/*public void setNRIStxtGender(JTextField nRIStxtGender) 
	{
		NRIStxtGender = nRIStxtGender;
	}*/

	/*
	public void setNRIStxtNationality(JTextField nRIStxtNationality) 
	{
		NRIStxtNationality = nRIStxtNationality;
	}

	public void setNRIStxtStatus(JTextField nRIStxtStatus) 
	{
		NRIStxtStatus = nRIStxtStatus;
	}

	public void setNRIStxtRelation(JTextField NRIStxtRelation) 
	{
		NRIStxtRelation = NRIStxtRelation;
	}

	public void setNRIStextAreaAddress(JTextArea nRIStextAreaAddress)
	{
		NRIStextAreaAddress = nRIStextAreaAddress;
	}

	public void setBtnBackAD(JButton btnBackAD) 
	{
		this.btnBackAD = btnBackAD;
	}
	*/
	
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
	public ModNRISponsoredDetails_GUI() {
		this.setLocationRelativeTo(null);
		setTitle("MODIFY NRI SPONSORED DETAILS");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 478, 339);
		
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		this.setBounds(0, 0,screen.width,screen.height - 30);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		panel_1.setBounds(369, 108, 670, 431);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNriSponsored = new JLabel("MODIFY NRI - SPONSORED STUDENT DETAILS");
		lblNriSponsored.setHorizontalAlignment(SwingConstants.CENTER);
		lblNriSponsored.setForeground(Color.BLACK);
		lblNriSponsored.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNriSponsored.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		lblNriSponsored.setBounds(26, 11, 575, 46);
		panel_1.add(lblNriSponsored);
		
		JPanel panel = new JPanel();
		panel.setBounds(26, 75, 618, 272);
		panel_1.add(panel);
		panel.setLayout(null);
		
		JLabel NRISlblname = new JLabel("Sponsor Name:");
		NRISlblname.setFont(new Font("Tahoma", Font.PLAIN, 17));
		NRISlblname.setBounds(10, 12, 127, 30);
		panel.add(NRISlblname);
		
		NRIStxtname = new JTextField();
		NRIStxtname.setFont(new Font("Tahoma", Font.PLAIN, 17));
		NRIStxtname.setToolTipText("Enter Sponsor's full Name");
		NRIStxtname.setColumns(10);
		NRIStxtname.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		NRIStxtname.setBounds(140, 13, 127, 30);
		panel.add(NRIStxtname);
		
		JLabel NRISlblContact = new JLabel("Contact:");
		NRISlblContact.setFont(new Font("Tahoma", Font.PLAIN, 17));
		NRISlblContact.setBounds(381, 119, 79, 30);
		panel.add(NRISlblContact);
		
		NRIStxtContact = new JTextField();
		NRIStxtContact.setToolTipText("Enter Sponsor's Contact ");
		NRIStxtContact.setColumns(10);
		NRIStxtContact.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		NRIStxtContact.setBounds(470, 121, 127, 30);
		panel.add(NRIStxtContact);
		
		JLabel NRISlblGender = new JLabel("Gender:");
		NRISlblGender.setFont(new Font("Tahoma", Font.PLAIN, 17));
		NRISlblGender.setBounds(306, 12, 62, 23);
		panel.add(NRISlblGender);
		
		JLabel NRISlblNationality = new JLabel("Nationality:");
		NRISlblNationality.setFont(new Font("Tahoma", Font.PLAIN, 17));
		NRISlblNationality.setBounds(33, 72, 104, 30);
		panel.add(NRISlblNationality);
		
		NRIStxtNationality = new JTextField();
		NRIStxtNationality.setToolTipText("Enter Sponsor's Nationality");
		NRIStxtNationality.setColumns(10);
		NRIStxtNationality.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		NRIStxtNationality.setBounds(147, 72, 120, 30);
		panel.add(NRIStxtNationality);
		
		JLabel NRISlblStatus = new JLabel("NRI Status:");
		NRISlblStatus.setFont(new Font("Tahoma", Font.PLAIN, 17));
		NRISlblStatus.setBounds(328, 66, 111, 31);
		panel.add(NRISlblStatus);
		
		NRIStxtStatus = new JTextField();
		NRIStxtStatus.setToolTipText("Enter Sponsor's NRI Status (EG:Citizenship/ PR/ GreenCard holder)");
		NRIStxtStatus.setColumns(10);
		NRIStxtStatus.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		NRIStxtStatus.setBounds(449, 61, 148, 36);
		panel.add(NRIStxtStatus);
		
		JLabel NRISlblAdderss = new JLabel("Address:");
		NRISlblAdderss.setHorizontalAlignment(SwingConstants.RIGHT);
		NRISlblAdderss.setFont(new Font("Tahoma", Font.PLAIN, 17));
		NRISlblAdderss.setBounds(10, 182, 91, 30);
		panel.add(NRISlblAdderss);
		
		NRIStextAreaAddress = new JTextArea();
		NRIStextAreaAddress.setToolTipText("Enter Sponsor's Residential Address");
		NRIStextAreaAddress.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		NRIStextAreaAddress.setBounds(111, 173, 497, 68);
		panel.add(NRIStextAreaAddress);
		
		JLabel NRISlblRelation = new JLabel("Relation with Student:");
		NRISlblRelation.setFont(new Font("Tahoma", Font.PLAIN, 17));
		NRISlblRelation.setBounds(20, 112, 176, 30);
		panel.add(NRISlblRelation);
		
		NRIStxtRelation = new JTextField();
		NRIStxtRelation.setToolTipText("Enter Sponsor's Relationship with Student");
		NRIStxtRelation.setColumns(10);
		NRIStxtRelation.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		NRIStxtRelation.setBounds(206, 119, 133, 28);
		panel.add(NRIStxtRelation);
		
		ButtonGroup bg = new ButtonGroup();
		NRISbtnMale = new JRadioButton("Male");
		NRISbtnMale.setFont(new Font("Tahoma", Font.PLAIN, 15));
		NRISbtnMale.setBounds(381, 11, 75, 23);
		panel.add(NRISbtnMale);
		bg.add(NRISbtnMale);
		
		NRISbtnFemale = new JRadioButton("Female");
		NRISbtnFemale.setFont(new Font("Tahoma", Font.PLAIN, 15));
		NRISbtnFemale.setBounds(477, 11, 92, 23);
		panel.add(NRISbtnFemale);
		bg.add(NRISbtnFemale);
		
		btnBackAD = new JButton("Back");
		btnBackAD.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnBackAD.setBounds(125, 369, 188, 34);
		panel_1.add(btnBackAD);
		
	    btnNextenrollmentDetails = new JButton("Next");
	    btnNextenrollmentDetails.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNextenrollmentDetails.setBounds(411, 369, 188, 34);
		panel_1.add(btnNextenrollmentDetails);
		
		
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
	
	public void setAction(SearchModifyActionListener searchm)
	{
		modsearchlisten = searchm;
		//searchframelisten = sr;
		this.btnNextenrollmentDetails.addActionListener(modsearchlisten);
		this.btnBackAD.addActionListener(modsearchlisten);
	}
	
	public void setAction(SearchFromFrameActionListener sr)
	{
		//modsearchlisten = searchm;
		searchframelisten = sr;
		this.btnNextenrollmentDetails.addActionListener(searchframelisten);
		this.btnBackAD.addActionListener(searchframelisten);
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
