package sprj_GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.border.EtchedBorder;

import sprj_Listener.GenerateCopyActionListener;

@SuppressWarnings("serial")
public class GenerateCopy_GUI extends JFrame {

	private JPanel contentPane;
	private ButtonGroup bg = new ButtonGroup();
	private JButton GCbtnSubmit;
	private JButton GCbtnBack;
	private JRadioButton GCrbtnCHEM;
	private JRadioButton GCrbtnICT;
	private JRadioButton GCrbtnMECH;

	GenerateCopyActionListener generatecopy;
	
	public JButton getGCbtnSubmit() 
	{
		return GCbtnSubmit;
	}

	public JButton getGCbtnBack() 
	{
		return GCbtnBack;
	}

	public JRadioButton getGCrbtnCHEM() 
	{
		return GCrbtnCHEM;
	}

	public JRadioButton getGCrbtnICT() 
	{
		return GCrbtnICT;
	}

	public JRadioButton getGCrbtnMECH() 
	{
		return GCrbtnMECH;
	}

	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GenerateCopy_GUI frame = new GenerateCopy_GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	 * Create the frame.
	 */
	
	public GenerateCopy_GUI() 
	{
		setTitle("Generate Copy");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 602, 317);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		GCbtnSubmit = new JButton("Submit");
		GCbtnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GCbtnSubmit.setBounds(341, 223, 137, 25);
		contentPane.add(GCbtnSubmit);
		
		GCbtnBack = new JButton("Back");
		GCbtnBack.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GCbtnBack.setBounds(119, 223, 137, 25);
		contentPane.add(GCbtnBack);
		
		JLabel lblSelectBranch = new JLabel("Select Branch");
		lblSelectBranch.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		lblSelectBranch.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblSelectBranch.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectBranch.setBounds(53, 13, 476, 67);
		contentPane.add(lblSelectBranch);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBounds(30, 104, 523, 93);
		contentPane.add(panel);
		panel.setLayout(null);
		
		GCrbtnCHEM = new JRadioButton("CHEM");
		GCrbtnCHEM.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GCrbtnCHEM.setBounds(374, 39, 83, 25);
		panel.add(GCrbtnCHEM);
		bg.add(GCrbtnCHEM);
		
		GCrbtnICT = new JRadioButton("ICT");
		GCrbtnICT.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GCrbtnICT.setBounds(62, 39, 68, 25);
		panel.add(GCrbtnICT);
		bg.add(GCrbtnICT);
		
		GCrbtnMECH = new JRadioButton("MECH");
		GCrbtnMECH.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GCrbtnMECH.setBounds(209, 39, 93, 25);
		panel.add(GCrbtnMECH);
		bg.add(GCrbtnMECH);
	}
	
	
	public void setAction(GenerateCopyActionListener gc)
	{
		generatecopy = gc;
		
		this.GCbtnBack.addActionListener(generatecopy);
		this.GCbtnSubmit.addActionListener(generatecopy);
	}
}
