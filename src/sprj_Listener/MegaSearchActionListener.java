package sprj_Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import sprj_DataStorage.MassDisplay;
import sprj_GUI.MegaSearch_GUI;
import sprj_GUI.Menu_GUI;

public class MegaSearchActionListener implements ActionListener 
{
	MassDisplay toexcel = new MassDisplay();
	
	private Menu_GUI menu;
	private MegaSearch_GUI megasearch;
	public MegaSearchActionListener(Menu_GUI me, MegaSearch_GUI ms)
	{
		menu = me;
		megasearch = ms;
	}
	
	
	public void actionPerformed(ActionEvent event) 
	{
		if(event.getSource().equals(megasearch.getMSbtnBack()))
		{
			menu.setVisible(true);
			megasearch.setVisible(false);
			megasearch.clear();
		}
		
		else if(event.getSource().equals(megasearch.getMSchkboxAll()))
		{
			megasearch.clearunall();
		}
		
		else if(event.getSource().equals((megasearch.getMSchkboxACPCRank())) || event.getSource().equals(megasearch.getMSchkboxAdmStatus())
				|| event.getSource().equals(megasearch.getMSchkboxAdmType()) || event.getSource().equals(megasearch.getMSchkboxBoard()) || event.getSource().equals(megasearch.getMSchkboxCategory())
				|| event.getSource().equals(megasearch.getMSchkboxCategory()) || event.getSource().equals(megasearch.getMSchkboxEmailId()) || event.getSource().equals(megasearch.getMSchkboxFatherIncome())
				|| event.getSource().equals(megasearch.getMSchkboxFirstName()) || event.getSource().equals(megasearch.getMSchkboxGender()) || event.getSource().equals(megasearch.getMSchkboxJEERollNum())
				|| event.getSource().equals(megasearch.getMSchkboxJEEScore()) || event.getSource().equals(megasearch.getMSchkboxLastName()) || event.getSource().equals(megasearch.getChckbxContactp())
				|| event.getSource().equals(megasearch.getChckbxYearOfJoining()) || event.getSource().equals(megasearch.getChckbxAddress()) || event.getSource().equals(megasearch.getChckbxContacts()))
		{
			megasearch.getMSchkboxAll().setSelected(false);
		}
		
		else if(event.getSource().equals(megasearch.getMSbtnSubmit()))
		{
			try
			{
				
				if(megasearch.MSRCHempty())
				{
					menu.getMenuError().setlblerror("SELECT ATLEAST ONE FIELD");
					menu.getMenuError().setVisible(true);
				}
				
				else
				{

					if(megasearch.getMSrdbtnIct().isSelected())
					{
						if(!(megasearch.getMSchkboxAll().isSelected()))
							toexcel.massDisplayStore("ICT", megasearch.getMSchkboxFirstName().isSelected(), megasearch.getMSchkboxLastName().isSelected() ,megasearch.getMSchkboxGender().isSelected(),megasearch.getChckbxAddress().isSelected(), megasearch.getChckbxContactp().isSelected(), megasearch.getChckbxContacts().isSelected() ,megasearch.getMSchkboxEmailId().isSelected(), megasearch.getMSchkboxCategory().isSelected(), megasearch.getMSchkboxFatherIncome().isSelected(), megasearch.getMSchkboxAdmType().isSelected(), megasearch.getMSchkboxBoard().isSelected(), megasearch.getMSchkboxJEEScore().isSelected(), megasearch.getMSchkboxJEERollNum().isSelected(), megasearch.getMSchkboxACPCRank().isSelected(), megasearch.getMSchkboxAdmStatus().isSelected(), megasearch.getChckbxYearOfJoining().isSelected());
					
						else
							toexcel.massDisplayStore("ICT", true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true);
						
						menu.setVisible(true);
						megasearch.setVisible(false);
						megasearch.clear();
					}
					
					else if(megasearch.getMSrdbtnMech().isSelected())
					{
						if(!(megasearch.getMSchkboxAll().isSelected()))
							toexcel.massDisplayStore("MECH", megasearch.getMSchkboxFirstName().isSelected(), megasearch.getMSchkboxLastName().isSelected() ,megasearch.getMSchkboxGender().isSelected(),megasearch.getChckbxAddress().isSelected(), megasearch.getChckbxContactp().isSelected(), megasearch.getChckbxContacts().isSelected() ,megasearch.getMSchkboxEmailId().isSelected(), megasearch.getMSchkboxCategory().isSelected(), megasearch.getMSchkboxFatherIncome().isSelected(), megasearch.getMSchkboxAdmType().isSelected(), megasearch.getMSchkboxBoard().isSelected(), megasearch.getMSchkboxJEEScore().isSelected(), megasearch.getMSchkboxJEERollNum().isSelected(), megasearch.getMSchkboxACPCRank().isSelected(), megasearch.getMSchkboxAdmStatus().isSelected(), megasearch.getChckbxYearOfJoining().isSelected());
						
						else
							toexcel.massDisplayStore("MECH", true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true);
						
						menu.setVisible(true);
						megasearch.setVisible(false);
						megasearch.clear();
					}
					
					else if(megasearch.getMSrdbtnChem().isSelected())
					{
						
						if(!(megasearch.getMSchkboxAll().isSelected()))
							toexcel.massDisplayStore("CHEM", megasearch.getMSchkboxFirstName().isSelected(), megasearch.getMSchkboxLastName().isSelected() ,megasearch.getMSchkboxGender().isSelected(),megasearch.getChckbxAddress().isSelected(), megasearch.getChckbxContactp().isSelected(), megasearch.getChckbxContacts().isSelected() ,megasearch.getMSchkboxEmailId().isSelected(), megasearch.getMSchkboxCategory().isSelected(), megasearch.getMSchkboxFatherIncome().isSelected(), megasearch.getMSchkboxAdmType().isSelected(), megasearch.getMSchkboxBoard().isSelected(), megasearch.getMSchkboxJEEScore().isSelected(), megasearch.getMSchkboxJEERollNum().isSelected(), megasearch.getMSchkboxACPCRank().isSelected(), megasearch.getMSchkboxAdmStatus().isSelected(), megasearch.getChckbxYearOfJoining().isSelected());
						
						else
							toexcel.massDisplayStore("CHEM", true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true);
						
						menu.setVisible(true);
						megasearch.setVisible(false);
						megasearch.clear();
					}
					
					else
					{
						menu.getMenuError().setlblerror("SELECT ATLEAST ONE BRANCH");
						menu.getMenuError().setVisible(true);
						megasearch.clear();
					}

				}
				
			}
			
			catch(Exception err)
			{
				menu.getMenuError().setlblerror(err.getLocalizedMessage());
				menu.getMenuError().setVisible(true);
			}

			//System.out.println("here");
		}
		
	}

}
