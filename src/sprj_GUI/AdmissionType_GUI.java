
package sprj_GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import sprj_Listener.EnterNewStudentActionListener;

import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.border.MatteBorder;

@SuppressWarnings("serial")
public class AdmissionType_GUI extends JFrame {

	private JPanel contentPane;
	private JRadioButton ATrbtnNRISponsored;
	private JRadioButton ATrbtnNRI;
	private JRadioButton ATrbtnACPC;
	private JButton ATbtnBackMainMenu;
	private JButton ATbtnNext;
	private ButtonGroup bg = new ButtonGroup();

	EnterNewStudentActionListener enterlisten;
	
	public String getATAdmType() 
	{
		if(this.ATrbtnNRISponsored.isSelected())
			return ATrbtnNRISponsored.getText();
		
		else if(this.ATrbtnACPC.isSelected())
			return ATrbtnACPC.getText();
		
		else if(this.ATrbtnNRI.isSelected())
			return ATrbtnNRI.getText();
		
		else
			return "";
	}


	public JRadioButton getATrbtnNRISponsored()
	{
		return ATrbtnNRISponsored;
	}
	
	
	
	public JRadioButton getATrbtnNRI() 
	{
		return ATrbtnNRI;
	}

	public JRadioButton getATrbtnACPC() 
	{
		return ATrbtnACPC;
	}

	public JButton getATbtnBackMainMenu() 
	{
		return ATbtnBackMainMenu;
	}

	public JButton getATbtnNext() 
	{
		return ATbtnNext;
	}

	public void setATrbtnNRISponsored(JRadioButton aTrbtnNRISponsored) 
	{
		ATrbtnNRISponsored = aTrbtnNRISponsored;
	}

	public void setATrbtnNRI(JRadioButton aTrbtnNRI) 
	{
		ATrbtnNRI = aTrbtnNRI;
	}

	public void setATrbtnACPC(JRadioButton aTrbtnACPC) 
	{
		ATrbtnACPC = aTrbtnACPC;
	}

	public void setATbtnBackMainMenu(JButton aTbtnBackMainMenu) 
	{
		ATbtnBackMainMenu = aTbtnBackMainMenu;
	}

	public void setATbtnNextPersonalDetails(JButton aTbtnNextPersonalDetails) 
	{
		ATbtnNext = aTbtnNextPersonalDetails;
	}

	/**
	 * Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdmissionType_GUI frame = new AdmissionType_GUI();
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
	public AdmissionType_GUI()
	{
		setType(Type.UTILITY);
		/*Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(0, 0, screen.width, screen.height-30);*/
		
		setLocationRelativeTo(null);
		setTitle("ADMISSION TYPE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 473, 332);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(32, 178, 170));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel ATpanelAdmissionType = new JPanel();
		ATpanelAdmissionType.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		ATpanelAdmissionType.setBounds(0, 0, 456, 293);
		contentPane.add(ATpanelAdmissionType);
		ATpanelAdmissionType.setLayout(null);
		
		JLabel ATlblAdmissionType = new JLabel("Admission Type");
		ATlblAdmissionType.setBounds(50, 32, 367, 54);
		ATlblAdmissionType.setHorizontalAlignment(SwingConstants.CENTER);
		ATlblAdmissionType.setForeground(Color.BLACK);
		ATlblAdmissionType.setFont(new Font("Tahoma", Font.BOLD, 20));
		ATlblAdmissionType.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 0, 0), null, null, Color.BLUE));
		ATpanelAdmissionType.add(ATlblAdmissionType);
		
		ATrbtnNRISponsored = new JRadioButton("NRI-Sponsored");
		ATrbtnNRISponsored.setFont(new Font("Dialog", Font.PLAIN, 17));
		ATrbtnNRISponsored.setBounds(299, 142, 137, 25);
		ATpanelAdmissionType.add(ATrbtnNRISponsored);
		bg.add(ATrbtnNRISponsored);
		
		ATrbtnNRI = new JRadioButton("NRI");
		ATrbtnNRI.setFont(new Font("Dialog", Font.PLAIN, 17));
		ATrbtnNRI.setBounds(195, 142, 68, 25);
		ATpanelAdmissionType.add(ATrbtnNRI);
		bg.add(ATrbtnNRI);
		
		ATrbtnACPC = new JRadioButton("ACPC");
		ATrbtnACPC.setFont(new Font("Dialog", Font.PLAIN, 17));
		ATrbtnACPC.setBounds(50, 142, 80, 25);
		ATpanelAdmissionType.add(ATrbtnACPC);
		bg.add(ATrbtnACPC);
		
		ATbtnBackMainMenu = new JButton("Back (Main Menu)");
		ATbtnBackMainMenu.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ATbtnBackMainMenu.setBounds(62, 236, 171, 31);
		ATpanelAdmissionType.add(ATbtnBackMainMenu);
		
		ATbtnNext = new JButton("Next");
		
		ATbtnNext.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ATbtnNext.setBounds(280, 235, 129, 33);
		ATpanelAdmissionType.add(ATbtnNext);
	}
	
	public boolean ATgetTextEmpty()
	{
		if(this.ATrbtnNRISponsored.isSelected() || this.ATrbtnACPC.isSelected() || this.ATrbtnNRI.isSelected())
			return false;
		else
			return true;
		
	}
	
	public void setAction(EnterNewStudentActionListener enter)
	{
		enterlisten = enter;
		this.ATbtnBackMainMenu.addActionListener(enterlisten);
		this.ATbtnNext.addActionListener(enterlisten);
	}
	
	public void clear()
	{
		this.ATrbtnACPC.setSelected(false);
		this.ATrbtnNRI.setSelected(false);
		this.ATrbtnNRISponsored.setSelected(false);
	}
}
