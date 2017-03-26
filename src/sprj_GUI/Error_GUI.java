package sprj_GUI;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import sprj_Listener.EnterNewStudentActionListener;
import sprj_Listener.ManageAccountActionListener;

import javax.swing.border.BevelBorder;

@SuppressWarnings("serial")
public class Error_GUI extends JFrame 
{

	private JPanel contentPane;
	private JButton ErrorbtnOk;

	EnterNewStudentActionListener enterlisten;
	ManageAccountActionListener manage;
	private JLabel lblerror;
	public JButton getErrorbtnOk() 
	{
		return ErrorbtnOk;
	}

	public void setErrorbtnOk(JButton errorbtnOk) 
	{
		ErrorbtnOk = errorbtnOk;
	}
	
	public void setlblerror(String r)
	{
		this.lblerror.setText(r);
	}
	
	public void displayerror()
	{
		this.lblerror.setText("ENTER ALL DETAILS!");
		this.setVisible(true);
	}

	/**
	 * Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Error_GUI frame = new Error_GUI();
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
	public Error_GUI() {
		setTitle("ERROR!");
		setLocationRelativeTo(null);
		setBounds(100, 100, 518, 245);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblerror = new JLabel("STUDENT DOESN'T EXIST IN MECH NRI(SPONSORED) ADMISSION");
		lblerror.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.BLUE));
		lblerror.setHorizontalAlignment(SwingConstants.CENTER);
		lblerror.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblerror.setBounds(12, 23, 480, 48);
		contentPane.add(lblerror);
		
		ErrorbtnOk = new JButton("OK");
		ErrorbtnOk.setBounds(210, 108, 85, 23);
		contentPane.add(ErrorbtnOk);
		
		this.getRootPane().setDefaultButton(this.ErrorbtnOk);
		
	}
	
	public void setAction(EnterNewStudentActionListener enter)
	{
		enterlisten = enter;
		ErrorbtnOk.addActionListener(enterlisten);
	}
	
	public void setAction(ManageAccountActionListener man)
	{
		manage =  man;
		ErrorbtnOk.addActionListener(manage);
	}

}
