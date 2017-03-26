package sprj_Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import sprj_DataStorage.ReCreateExcel;
import sprj_GUI.GenerateCopy_GUI;
import sprj_GUI.Menu_GUI;

public class GenerateCopyActionListener implements ActionListener
{

	private Menu_GUI menu;
	private GenerateCopy_GUI generatecopy;
	
	ReCreateExcel toexcel = new ReCreateExcel();
	
	public GenerateCopyActionListener(Menu_GUI me, GenerateCopy_GUI gc)
	{
		menu = me;
		generatecopy = gc;
	}
	
	@Override
	public void actionPerformed(ActionEvent event) 
	{
		if(event.getSource().equals(generatecopy.getGCbtnBack()))
		{
			menu.setVisible(true);
			generatecopy.setVisible(false);
		}
		
		else if(event.getSource().equals(generatecopy.getGCbtnSubmit()))
		{
			try
			{
				if(generatecopy.getGCrbtnICT().isSelected())
				{
					toexcel.createDupli("ICT");
					menu.setVisible(true);
					generatecopy.setVisible(false);
				}
				
				else if(generatecopy.getGCrbtnMECH().isSelected())
				{
					toexcel.createDupli("MECH");
					menu.setVisible(true);
					generatecopy.setVisible(false);
				}
				
				else if(generatecopy.getGCrbtnCHEM().isSelected())
				{
					toexcel.createDupli("CHEM");
					menu.setVisible(true);
					generatecopy.setVisible(false);
				}
				
				else
				{
					menu.getMenuError().setlblerror("SELECT A BRANCH");
					menu.getMenuError().setVisible(true);
				}
			}
			
			catch(Exception err)
			{
				menu.getMenuError().setlblerror(err.getLocalizedMessage());
				menu.getMenuError().setVisible(true);
			}
		}
		
	}
		
}
