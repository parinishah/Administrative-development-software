package sprj_GUI;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import sprj_Listener.SearchActionListener;

import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.border.BevelBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

@SuppressWarnings("serial")
public class DisplayASingleStud_GUI extends JFrame {

	private JPanel contentPane;
	private JButton DisplaybtnDone;
	private JTextArea DisplaySingleStudText;
	private JButton btnSaveToPDF;

	public JButton getBtnSaveToPDF() {
		return btnSaveToPDF;
	}

	public void setBtnSaveToPDF(JButton btnSaveToPDF) {
		this.btnSaveToPDF = btnSaveToPDF;
	}

	SearchActionListener searchlisten;
	
	public JTextArea getDisplaySingleStudText() {
		return DisplaySingleStudText;
	}

	public JButton getDisplaybtnDone() {
		return DisplaybtnDone;
	}

	public void setDisplaySingleStudText(String displaySingleStudText) {
		DisplaySingleStudText.setText(displaySingleStudText);
	}

	public void setDisplaybtnDone(JButton displaybtnDone) {
		DisplaybtnDone = displaybtnDone;
	}

	/**
	 * Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DisplayASingleStud_GUI frame = new DisplayASingleStud_GUI();
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
	public DisplayASingleStud_GUI() 
	{
		//setType(Type.UTILITY);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		this.setBounds(0, 0, screen.width, screen.height-30);
		
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 450, 521);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(20, 85, 419, 509);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		panel_1.setBounds(370, 30, 641, 629);
		panel_1.setLayout(null);
		contentPane.add(panel_1);
		panel_1.add(panel);
		
	
		
		DisplaybtnDone = new JButton("Done");
		
		
		DisplaybtnDone.setFont(new Font("Tahoma", Font.BOLD, 13));
		DisplaybtnDone.setBounds(480, 310, 89, 29);
		panel_1.add(DisplaybtnDone);
		
		JLabel lblDisplaySingleStudent = new JLabel("Display Single Student");
		lblDisplaySingleStudent.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		lblDisplaySingleStudent.setHorizontalAlignment(SwingConstants.CENTER);
		lblDisplaySingleStudent.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDisplaySingleStudent.setBounds(114, 11, 414, 49);
		panel_1.add(lblDisplaySingleStudent);
		
		this.getRootPane().setDefaultButton(this.DisplaybtnDone);

		
		
		
		
		panel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane(DisplaySingleStudText);
		scrollPane.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		panel.add(scrollPane, BorderLayout.CENTER);
		
		DisplaySingleStudText = new JTextArea();
		DisplaySingleStudText.setBorder(null);
		scrollPane.setViewportView(DisplaySingleStudText);
		DisplaySingleStudText.setEditable(false);
		btnSaveToPDF = new JButton("Save To PDF");
		btnSaveToPDF.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSaveToPDF.setBounds(470, 263, 120, 36);
		panel_1.add(btnSaveToPDF);
		
		
		//contentPane.add(panel_1);
		
	}
	
	public void setAction(SearchActionListener search)
	{
		searchlisten = search;
		this.DisplaybtnDone.addActionListener(searchlisten);
		this.btnSaveToPDF.addActionListener(searchlisten);
	}
	
	public void clear()
	{
		this.DisplaySingleStudText.setText("");
	}
}
