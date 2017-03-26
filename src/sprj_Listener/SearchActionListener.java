package sprj_Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import sprj_DataStorage.ExcelDisplayASingleStud;
import sprj_DataStorage.PDFconversion;
import sprj_GUI.DisplayASingleStud_GUI;
import sprj_GUI.Error_GUI;
import sprj_GUI.Menu_GUI;
import sprj_GUI.SearchDetails_GUI;

public class SearchActionListener implements ActionListener 
{
	
	ExcelDisplayASingleStud toexcel = new ExcelDisplayASingleStud();
	PDFconversion topdf = new PDFconversion();
	
	SearchDetails_GUI search;
	Menu_GUI menu;
	Error_GUI error;
	DisplayASingleStud_GUI dispsing;
	String display = null;
	public SearchActionListener(SearchDetails_GUI ser, Menu_GUI men, Error_GUI er, DisplayASingleStud_GUI dsing)
	{
		search = ser;
		menu = men;
		error = er;
		dispsing = dsing;
				
	}
	
	public void actionPerformed(ActionEvent event)
	{
		if(event.getSource().equals(search.getSearchbtnBack()))
		{
			menu.setVisible(true);
			search.setVisible(false);
		}
		
		else if(event.getSource().equals(search.getBtnSearch()))
		{
			if(search.SearchgetTextEmpty())
				error.displayerror();
			
			else
			{
				
				if(search.getRdbtnIct().isSelected())
				{
					if(search.getSearchrdbtnAcpc().isSelected())
					{
						try
						{
							display = toexcel.ICTACPCcheck(search.getSearchtxtEnterEnrollmentNumber().getText());
							//System.out.println(search.getSearchtxtEnterEnrollmentNumber().getText());
							
							if(display.equals("There is No Student Data Existing in the File ICT, Sheet ACPC"))
							{
								error.setlblerror("STUDENT DOESN'T EXIST IN ICT ACPC ADMISSION");
								error.setVisible(true);
							}
							
							else
							{
								dispsing.setDisplaySingleStudText(display);
								menu.setVisible(true);
								dispsing.setVisible(true);
								search.setVisible(false);
								//menu.setVisible(true);
								;
								
								
								
							}
						}
						
						catch(Exception err)
						{
							error.setlblerror(err.getLocalizedMessage());
							error.setVisible(true);
						}
					}
					
					else if(search.getSearchrdbtnNRI().isSelected())
					{
						try
						{
							display = toexcel.ICTNRISTUDcheck(search.getSearchtxtEnterEnrollmentNumber().getText());
							
							if(display.equals("There is No Student Data Existing in the File ICT, Sheet NRI"))
							{
								error.setlblerror("STUDENT DOESN'T EXIST IN ICT NRI ADMISSION");
								error.setVisible(true);
							}
							
							else
							{
								dispsing.setDisplaySingleStudText(display);
								menu.setVisible(true);
								dispsing.setVisible(true);
								search.setVisible(false);
								//menu.setVisible(true);
								;
							}
						}
						
						catch(Exception err)
						{
							error.setlblerror(err.getLocalizedMessage());
							error.setVisible(true);
						}
					}
					
					else if(search.getSearchrdbtnNRISponsored().isSelected())
					{
						try
						{
							display = toexcel.ICTNRISPONcheck(search.getSearchtxtEnterEnrollmentNumber().getText());
							
							if(display.equals("There is No Student Data Existing in the File ICT, Sheet NRI_SPONSOR"))
							{
								error.setlblerror("STUDENT DOESN'T EXIST IN ICT NRI(SPONSORED) ADMISSION");
								error.setVisible(true);
							}
							
							else
							{
								dispsing.setDisplaySingleStudText(display);
								menu.setVisible(true);
								dispsing.setVisible(true);
								search.setVisible(false);
								//menu.setVisible(true);
								;
							}
						}
						catch(Exception err)
						{
							error.setlblerror(err.getLocalizedMessage());
							error.setVisible(true);
						}
					}
				}
				
				if(search.getRdbtnMech().isSelected())
				{
					if(search.getSearchrdbtnAcpc().isSelected())
					{
						try
						{
							display = toexcel.MECHACPCcheck(search.getSearchtxtEnterEnrollmentNumber().getText());
							//System.out.println(search.getSearchtxtEnterEnrollmentNumber().getText());
							
							if(display.equals("There is No Student Data Existing in the File MECH, Sheet ACPC"))
							{
								error.setlblerror("STUDENT DOESN'T EXIST IN MECH ACPC ADMISSION");
								error.setVisible(true);
							}
							
							else
							{
								dispsing.setDisplaySingleStudText(display);
								menu.setVisible(true);
								dispsing.setVisible(true);
								search.setVisible(false);
								//menu.setVisible(true);
								;
							}
						}
						
						catch(Exception err)
						{
							error.setlblerror(err.getLocalizedMessage());
							error.setVisible(true);
						}
					}
					
					else if(search.getSearchrdbtnNRI().isSelected())
					{
						try
						{
							display = toexcel.MECHNRISTUDcheck(search.getSearchtxtEnterEnrollmentNumber().getText());
							
							if(display.equals("There is No Student Data Existing in the File MECH, Sheet NRI"))
							{
								error.setlblerror("STUDENT DOESN'T EXIST IN MECH NRI ADMISSION");
								error.setVisible(true);
							}
							
							else
							{
								dispsing.setDisplaySingleStudText(display);
								menu.setVisible(true);
								dispsing.setVisible(true);
								search.setVisible(false);
								//menu.setVisible(true);
								;
							}
						}
						
						catch(Exception err)
						{
							error.setlblerror(err.getLocalizedMessage());
							error.setVisible(true);
						}
					}
					
					else if(search.getSearchrdbtnNRISponsored().isSelected())
					{
						try
						{
							display = toexcel.MECHNRISPONcheck(search.getSearchtxtEnterEnrollmentNumber().getText());
							
							if(display.equals("There is No Student Data Existing in the File MECH, Sheet NRI_SPONSOR"))
							{
								error.setlblerror("STUDENT DOESN'T EXIST IN MECH NRI(SPONSORED) ADMISSION");
								error.setVisible(true);
							}
							
							else
							{
								dispsing.setDisplaySingleStudText(display);
								menu.setVisible(true);
								dispsing.setVisible(true);
								search.setVisible(false);
								//menu.setVisible(true);
								;
								
							}
						}
						
						catch(Exception err)
						{
							error.setlblerror(err.getLocalizedMessage());
							error.setVisible(true);
						}
					}
				}
				
				
				if(search.getRdbtnChem().isSelected())
				{
					if(search.getSearchrdbtnAcpc().isSelected())
					{
						try
						{
							display = toexcel.CHEMACPCcheck(search.getSearchtxtEnterEnrollmentNumber().getText());
							
							if(display.equals("There is No Student Data Existing in the File CHEM, Sheet ACPC"))
							{
								error.setlblerror("STUDENT DOESN'T EXIST IN CHEM ACPC ADMISSION");
								error.setVisible(true);
							}
							
							else
							{
								dispsing.setDisplaySingleStudText(display);
								menu.setVisible(true);
								dispsing.setVisible(true);
								search.setVisible(false);
								//menu.setVisible(true);
								
							}
						}
						
						catch(Exception err)
						{
							error.setlblerror(err.getLocalizedMessage());
							error.setVisible(true);
						}
					}
					
					else if(search.getSearchrdbtnNRI().isSelected())
					{
						try
						{
							display = toexcel.CHEMNRISTUDcheck(search.getSearchtxtEnterEnrollmentNumber().getText());
							
							if(display.equals("There is No Student Data Existing in the File CHEM, Sheet NRI"))
							{
								error.setlblerror("STUDENT DOESN'T EXIST IN CHEM NRI ADMISSION");
								error.setVisible(true);
							}
							
							else
							{
								dispsing.setDisplaySingleStudText(display);
								menu.setVisible(true);
								dispsing.setVisible(true);
								search.setVisible(false);
								//menu.setVisible(true);
								
							}
						}
						
						catch(Exception err)
						{
							error.setlblerror(err.getLocalizedMessage());
							error.setVisible(true);
						}
					}
					
					else if(search.getSearchrdbtnNRISponsored().isSelected())
					{
						try
						{
							display = toexcel.CHEMNRISPONcheck(search.getSearchtxtEnterEnrollmentNumber().getText());
							
							if(display.equals("There is No Student Data Existing in the File CHEM, Sheet NRI_SPONSOR"))
							{
								error.setlblerror("STUDENT DOESN'T EXIST IN CHEM NRI(SPONSORED) ADMISSION");
								error.setVisible(true);
							}
							
							else
							{
								dispsing.setDisplaySingleStudText(display);
								menu.setVisible(true);
								dispsing.setVisible(true);
								search.setVisible(false);
								
								
							}
						}
						
						catch(Exception err)
						{
							error.setlblerror(err.getLocalizedMessage());
							error.setVisible(true);
						}
					}
				}
				
				//menu.setVisible(true);
				//search.setVisible(false);
			}
		}
		
		else if(event.getSource().equals(search.getSearchrdbtnNRI()))
		{
			search.setlblSearchUniqueNum("Enter Unique ID:");
		}
		
		else if(event.getSource().equals(search.getSearchrdbtnAcpc()) || event.getSource().equals(search.getSearchrdbtnNRISponsored()))
		{
			search.setlblSearchUniqueNum("Enter JEE Roll Number:");
		}
		
		else if(event.getSource().equals(dispsing.getDisplaybtnDone()))
		{
			dispsing.setVisible(false);
			search.clear();
			menu.setVisible(true);
		}
		
		else if(event.getSource().equals(dispsing.getBtnSaveToPDF()))
		{
			try
			{
				topdf.savetopdf(search.getSearchtxtEnterEnrollmentNumber().getText(), display);
				search.clear();
				dispsing.setVisible(false);
			}
			
			catch(Exception err)
			{
				error.setlblerror(err.getLocalizedMessage());
				error.setVisible(true);
			}
		}
		
	}
	
}
