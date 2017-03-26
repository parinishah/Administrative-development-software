package sprj_GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import sprj_Listener.SearchModifyActionListener;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;

@SuppressWarnings("serial")
public class SearchModify_GUI extends JFrame {

	private JPanel contentPane;
	private ButtonGroup bg = new ButtonGroup();
	private JTextField SearchtxtEnterEnrollmentNumber;
	private JRadioButton SearchrdbtnAcpc;
	private JRadioButton SearchrdbtnNRI;
	private JRadioButton SearchrdbtnNRISponsored;
	private JButton btnSearch ;
	private JRadioButton rdbtnIct;
	private JRadioButton rdbtnMech;
	private JRadioButton rdbtnChem;
	private JLabel SearchlblEnterEnrollmentNumber;
	private JButton SearchModbtnBack;
	
	public JButton getSearchModbtnBack() {
		return SearchModbtnBack;
	}

	public void setSearchModbtnBack(JButton searchModbtnBack) {
		SearchModbtnBack = searchModbtnBack;
	}

	SearchModifyActionListener searchmodlisten;
	
	public JRadioButton getRdbtnIct() {
		return rdbtnIct;
	}

	public JRadioButton getRdbtnMech() {
		return rdbtnMech;
	}

	public JRadioButton getRdbtnChem() {
		return rdbtnChem;
	}

	public void setRdbtnIct(JRadioButton rdbtnIct) {
		this.rdbtnIct = rdbtnIct;
	}

	public void setRdbtnMech(JRadioButton rdbtnMech) {
		this.rdbtnMech = rdbtnMech;
	}

	public void setRdbtnChem(JRadioButton rdbtnChem) {
		this.rdbtnChem = rdbtnChem;
	}

	public JTextField getSearchtxtEnterEnrollmentNumber()
	{
		return SearchtxtEnterEnrollmentNumber;
	}

	public JRadioButton getSearchrdbtnAcpc()
	{
		return SearchrdbtnAcpc;
	}

	public JRadioButton getSearchrdbtnNRI()
	{
		return SearchrdbtnNRI;
	}

	public JRadioButton getSearchrdbtnNRISponsored() 
	{
		return SearchrdbtnNRISponsored;
	}

	public JButton getBtnSearch() 
	{
		return btnSearch;
	}
	
	public void setlblSearchUniqueNum(String s)
	{
		this.SearchlblEnterEnrollmentNumber.setText(s);
	}
	

	public void setSearchtxtEnterEnrollmentNumber(JTextField searchtxtEnterEnrollmentNumber)
	{
		SearchtxtEnterEnrollmentNumber = searchtxtEnterEnrollmentNumber;
	}

	public void setSearchrdbtnAcpc(JRadioButton searchrdbtnAcpc) 
	{
		SearchrdbtnAcpc = searchrdbtnAcpc;
	}

	public void setSearchrdbtnNRI(JRadioButton searchrdbtnNRI) 
	{
		SearchrdbtnNRI = searchrdbtnNRI;
	}

	public void setSearchrdbtnNRISponsored(JRadioButton searchrdbtnNRISponsored) 
	{
		SearchrdbtnNRISponsored = searchrdbtnNRISponsored;
	}


	public void setBtnSearch(JButton btnSearch) 
	{
		this.btnSearch = btnSearch;
	}

	/**
	 * Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchDetails_GUI frame = new SearchDetails_GUI();
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
	public SearchModify_GUI() {
		setTitle("SEARCH AND MODIFY A STUDENT");
		setLocationRelativeTo(null);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 474, 324);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 447, 274);
		contentPane.add(panel);
		panel.setLayout(null);
		
		SearchlblEnterEnrollmentNumber = new JLabel("Enter JEE Roll Number:");
		SearchlblEnterEnrollmentNumber.setHorizontalAlignment(SwingConstants.CENTER);
		SearchlblEnterEnrollmentNumber.setFont(new Font("Tahoma", Font.PLAIN, 15));
		SearchlblEnterEnrollmentNumber.setBounds(135, 164, 193, 23);
		panel.add(SearchlblEnterEnrollmentNumber);
		
		btnSearch = new JButton("Search\r\n");
		btnSearch.setBounds(247, 235, 101, 28);
		panel.add(btnSearch);
		
		SearchtxtEnterEnrollmentNumber = new JTextField();
		SearchtxtEnterEnrollmentNumber.setColumns(10);
		SearchtxtEnterEnrollmentNumber.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		SearchtxtEnterEnrollmentNumber.setBounds(156, 196, 150, 22);
		panel.add(SearchtxtEnterEnrollmentNumber);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Admission Type", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 96, 437, 57);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		SearchrdbtnAcpc = new JRadioButton("ACPC\r\n");
		SearchrdbtnAcpc.setBounds(40, 25, 80, 23);
		panel_1.add(SearchrdbtnAcpc);
		bg.add(SearchrdbtnAcpc);
		
		SearchrdbtnNRI = new JRadioButton("NRI");
		SearchrdbtnNRI.setBounds(176, 25, 53, 23);
		panel_1.add(SearchrdbtnNRI);
		bg.add(SearchrdbtnNRI);
		
		SearchrdbtnNRISponsored = new JRadioButton("NRI-Sponsored");
		SearchrdbtnNRISponsored.setBounds(288, 25, 128, 23);
		panel_1.add(SearchrdbtnNRISponsored);
		bg.add(SearchrdbtnNRISponsored);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Branch", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(10, 50, 437, 45);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		ButtonGroup SearchBG = new ButtonGroup();
		
		rdbtnIct = new JRadioButton("ICT");
		rdbtnIct.setBounds(55, 16, 59, 23);
		panel_2.add(rdbtnIct);
		SearchBG.add(rdbtnIct);
		
		rdbtnMech = new JRadioButton("MECH");
		rdbtnMech.setBounds(172, 16, 70, 23);
		panel_2.add(rdbtnMech);
		SearchBG.add(rdbtnMech);
		
		rdbtnChem = new JRadioButton("CHEM");
		rdbtnChem.setBounds(288, 16, 81, 23);
		panel_2.add(rdbtnChem);
		SearchBG.add(rdbtnChem);
		
		JLabel lblSearchStudentEntry = new JLabel("Search Student Entry");
		lblSearchStudentEntry.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblSearchStudentEntry.setHorizontalAlignment(SwingConstants.CENTER);
		lblSearchStudentEntry.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		lblSearchStudentEntry.setBounds(10, 11, 437, 28);
		panel.add(lblSearchStudentEntry);
		
		SearchModbtnBack = new JButton("Back");
		SearchModbtnBack.setFont(new Font("Tahoma", Font.BOLD, 11));
		SearchModbtnBack.setBounds(135, 235, 78, 28);
		panel.add(SearchModbtnBack);
	}
	public boolean SearchModgetTextEmpty()
	{
		if(this.SearchtxtEnterEnrollmentNumber.getText().isEmpty() ||!(this.SearchrdbtnAcpc.isSelected() || this.SearchrdbtnNRI.isSelected() 
				|| this.SearchrdbtnNRISponsored.isSelected()))
			return true;
		else 
			return false;			
	}
	public void setAction(SearchModifyActionListener searchm)
	{
		searchmodlisten = searchm;
		this.btnSearch.addActionListener(searchmodlisten);
		//this.SearchbtnBack.addActionListener(searchmodlisten);
		this.SearchrdbtnNRI.addActionListener(searchmodlisten);
		this.SearchrdbtnAcpc.addActionListener(searchmodlisten);
		this.SearchrdbtnNRISponsored.addActionListener(searchmodlisten);
		this.SearchModbtnBack.addActionListener(searchmodlisten);
	}
	
	public void clear()
	{
		this.SearchtxtEnterEnrollmentNumber.setText("");
		this.SearchrdbtnAcpc.setSelected(false);
		this.SearchrdbtnNRI.setSelected(false);
		this.SearchrdbtnNRISponsored.setSelected(false);
		this.rdbtnChem.setSelected(false);
		this.rdbtnIct.setSelected(false);
		this.rdbtnMech.setSelected(false);
	}
}
