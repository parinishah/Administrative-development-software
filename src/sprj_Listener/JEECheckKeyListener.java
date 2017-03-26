package sprj_Listener;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import sprj_DataStorage.ExcelStorage;
import sprj_GUI.Error_GUI;
import sprj_GUI.UnconfirmedAdmissionDetails_GUI;

public class JEECheckKeyListener implements ItemListener 
{
	
	ExcelStorage toexcel = new ExcelStorage();

	UnconfirmedAdmissionDetails_GUI unconfirm;
	Error_GUI error;
	
	
	int rowict, rowmech, rowchem;
	
	public JEECheckKeyListener(UnconfirmedAdmissionDetails_GUI unc, Error_GUI er)
	{
		unconfirm = unc;
		error = er;
	}

	@Override
	public void itemStateChanged(ItemEvent event) 
	{
		//System.out.println("herestate");
		if(event.getSource().equals(unconfirm.getUADcombobranch()))
		{
			try
			{
				//System.out.println("herestate2");
				rowict = toexcel.unICTjeerollnumcheck(unconfirm.getUADtxtJeeRollNo().getText());
				rowmech = toexcel.unMECHjeerollnumcheck(unconfirm.getUADtxtJeeRollNo().getText());
				rowchem = toexcel.unCHEMjeerollnumcheck(unconfirm.getUADtxtJeeRollNo().getText());
				
				//System.out.println(unconfirm);
				//System.out.println(rowict + "jee");
				if(rowict!=-1 && unconfirm.getUADcmbbranch().equals("ICT"))
				{
					error.setlblerror("STUDENT ALREADY EXISTS IN ICT DATABASE!");
					error.setVisible(true);
					//System.out.println("errorenter");
				}
				
				if(rowmech!=-1 && unconfirm.getUADcmbbranch().equals("MECH"))
				{
					error.setlblerror("STUDENT ALREADY EXISTS IN MECH DATABASE!");
					error.setVisible(true);
				}
				
				if(rowchem!=-1 && unconfirm.getUADcmbbranch().equals("CHEM"))
				{
					error.setlblerror("STUDENT ALREADY EXISTS IN CHEM DATABASE!");
					error.setVisible(true);
				}
			}
			
			catch(Exception err)
			{
				error.setlblerror(err.getLocalizedMessage());
				error.setVisible(true);
			}
			
			
		}
		
	}
	
}


/*
 * 
 * 
 *
 *public void mouseClicked(MouseEvent event) 
	{
		if(event.getSource().equals(unconfirm.getUADcombobranch()))
		{
			System.out.println("hereclicked");
			rowict = toexcel.ICTjeerollnumcheck(unconfirm.getUADtxtJeeRollNo().getText());
			rowmech = toexcel.MECHjeerollnumcheck(unconfirm.getUADtxtJeeRollNo().getText());
			rowchem = toexcel.CHEMjeerollnumcheck(unconfirm.getUADtxtJeeRollNo().getText());
			
			//System.out.println(unconfirm);
			
			if(rowict!=-1 && unconfirm.getUADcmbbranch().equals("ICT"))
			{
				error.setlblerror("STUDENT ALREADY EXISTS IN ICT DATABASE!");
				error.setVisible(true);
			}
			
			if(rowmech!=-1 && unconfirm.getUADcmbbranch().equals("MECH"))
			{
				error.setlblerror("STUDENT ALREADY EXISTS IN MECH DATABASE!");
				error.setVisible(true);
			}
			
			if(rowchem!=-1 && unconfirm.getUADcmbbranch().equals("CHEM"))
			{
				error.setlblerror("STUDENT ALREADY EXISTS IN CHEM DATABASE!");
				error.setVisible(true);
			}
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent event) 
	{
		System.out.println("hereenter");
		if(event.getSource().equals(unconfirm.getUADcombobranch()))
		{
			
			System.out.println("hereenter2");
			rowict = toexcel.ICTjeerollnumcheck(unconfirm.getUADtxtJeeRollNo().getText());
			rowmech = toexcel.MECHjeerollnumcheck(unconfirm.getUADtxtJeeRollNo().getText());
			rowchem = toexcel.CHEMjeerollnumcheck(unconfirm.getUADtxtJeeRollNo().getText());
			
			//System.out.println(unconfirm);
			
			if(rowict!=-1 && unconfirm.getUADcmbbranch().equals("ICT"))
			{
				error.setlblerror("STUDENT ALREADY EXISTS IN ICT DATABASE!");
				error.setVisible(true);
				System.out.println("errorenter");
			}
			
			if(rowmech!=-1 && unconfirm.getUADcmbbranch().equals("MECH"))
			{
				error.setlblerror("STUDENT ALREADY EXISTS IN MECH DATABASE!");
				error.setVisible(true);
			}
			
			if(rowchem!=-1 && unconfirm.getUADcmbbranch().equals("CHEM"))
			{
				error.setlblerror("STUDENT ALREADY EXISTS IN CHEM DATABASE!");
				error.setVisible(true);
			}
		}
		
	}

	@Override
	public void mouseExited(MouseEvent event) 
	{
		System.out.println("hereexit");
		if(event.getSource().equals(unconfirm.getUADcombobranch()))
		{
			
			System.out.println("hereexit2");
			rowict = toexcel.ICTjeerollnumcheck(unconfirm.getUADtxtJeeRollNo().getText());
			rowmech = toexcel.MECHjeerollnumcheck(unconfirm.getUADtxtJeeRollNo().getText());
			rowchem = toexcel.CHEMjeerollnumcheck(unconfirm.getUADtxtJeeRollNo().getText());
			
			//System.out.println(unconfirm);
			
			if(rowict!=-1 && unconfirm.getUADcmbbranch().equals("ICT"))
			{
				error.setlblerror("STUDENT ALREADY EXISTS IN ICT DATABASE!");
				error.setVisible(true);
				System.out.println("errorexit");
			}
			
			if(rowmech!=-1 && unconfirm.getUADcmbbranch().equals("MECH"))
			{
				error.setlblerror("STUDENT ALREADY EXISTS IN MECH DATABASE!");
				error.setVisible(true);
			}
			
			if(rowchem!=-1 && unconfirm.getUADcmbbranch().equals("CHEM"))
			{
				error.setlblerror("STUDENT ALREADY EXISTS IN CHEM DATABASE!");
				error.setVisible(true);
			}
		}
		
	}

	@Override
	public void mousePressed(MouseEvent event) 
	{
		System.out.println("herepress");
		if(event.getSource().equals(unconfirm.getUADcombobranch()))
		{
			
			System.out.println("herepress2");
			rowict = toexcel.ICTjeerollnumcheck(unconfirm.getUADtxtJeeRollNo().getText());
			rowmech = toexcel.MECHjeerollnumcheck(unconfirm.getUADtxtJeeRollNo().getText());
			rowchem = toexcel.CHEMjeerollnumcheck(unconfirm.getUADtxtJeeRollNo().getText());
			
			//System.out.println(unconfirm);
			
			if(rowict!=-1 && unconfirm.getUADcmbbranch().equals("ICT"))
			{
				error.setlblerror("STUDENT ALREADY EXISTS IN ICT DATABASE!");
				error.setVisible(true);
				System.out.println("errorpress");
			}
			
			if(rowmech!=-1 && unconfirm.getUADcmbbranch().equals("MECH"))
			{
				error.setlblerror("STUDENT ALREADY EXISTS IN MECH DATABASE!");
				error.setVisible(true);
			}
			
			if(rowchem!=-1 && unconfirm.getUADcmbbranch().equals("CHEM"))
			{
				error.setlblerror("STUDENT ALREADY EXISTS IN CHEM DATABASE!");
				error.setVisible(true);
			}
		}
	}

	@Override
	public void mouseReleased(MouseEvent event) 
	{
		System.out.println("here");
		if(event.getSource().equals(unconfirm.getUADcombobranch()))
		{
			
			System.out.println("here2");
			rowict = toexcel.ICTjeerollnumcheck(unconfirm.getUADtxtJeeRollNo().getText());
			rowmech = toexcel.MECHjeerollnumcheck(unconfirm.getUADtxtJeeRollNo().getText());
			rowchem = toexcel.CHEMjeerollnumcheck(unconfirm.getUADtxtJeeRollNo().getText());
			
			//System.out.println(unconfirm);
			
			if(rowict!=-1 && unconfirm.getUADcmbbranch().equals("ICT"))
			{
				error.setlblerror("STUDENT ALREADY EXISTS IN ICT DATABASE!");
				error.setVisible(true);
				System.out.println("errorrelease");
			}
			
			if(rowmech!=-1 && unconfirm.getUADcmbbranch().equals("MECH"))
			{
				error.setlblerror("STUDENT ALREADY EXISTS IN MECH DATABASE!");
				error.setVisible(true);
			}
			
			if(rowchem!=-1 && unconfirm.getUADcmbbranch().equals("CHEM"))
			{
				error.setlblerror("STUDENT ALREADY EXISTS IN CHEM DATABASE!");
				error.setVisible(true);
			}
		}
		
	}*/
