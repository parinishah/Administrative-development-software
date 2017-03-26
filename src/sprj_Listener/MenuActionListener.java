package sprj_Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import sprj_GUI.AdmissionType_GUI;
import sprj_GUI.GenerateCopy_GUI;
import sprj_GUI.Login_GUI;
import sprj_GUI.MegaSearch_GUI;
import sprj_GUI.Menu_GUI;
import sprj_GUI.SearchDetails_GUI;
import sprj_GUI.SearchModify_GUI;
import sprj_GUI.UnconfirmedAdmissionDetails_GUI;

public class MenuActionListener implements ActionListener 
{
	private AdmissionType_GUI admiss;
	private Menu_GUI menu;
	private SearchDetails_GUI search;
	private UnconfirmedAdmissionDetails_GUI unconfirm;
	private Login_GUI login;
	private SearchModify_GUI searchmodmain;
	private MegaSearch_GUI megasearch;
	private GenerateCopy_GUI generatecopy;
	
	
	public MenuActionListener(Menu_GUI men, Login_GUI log, AdmissionType_GUI adm, SearchDetails_GUI srch, UnconfirmedAdmissionDetails_GUI unc, SearchModify_GUI sm, MegaSearch_GUI meg, GenerateCopy_GUI gc)
	{
		admiss = adm;
		menu = men;
		login = log;
		search = srch;
		unconfirm = unc;
		searchmodmain = sm;
		megasearch = meg;
		generatecopy = gc;
	}
	
	public void actionPerformed(ActionEvent event)
	{
		if(event.getSource().equals(menu.getbtnUnconfirmedAdmission()))
		{
			unconfirm.setVisible(true);
			menu.setVisible(false);
		}
		
		else if(event.getSource().equals(menu.getBtnConfirmedAdmission()))
		{
			admiss.setVisible(true);
			menu.setVisible(false);
		}
		
		else if(event.getSource().equals(menu.getBtnSearchEntry()))
		{
			search.setVisible(true);
			menu.setVisible(false);
		}
		
		else if(event.getSource().equals(menu.getBtnLogout()))
		{
			login.setVisible(true);
			menu.setVisible(false);
		}
		
		else if(event.getSource().equals(menu.getBtnModifyEntry()))
		{
			menu.setVisible(false);
			searchmodmain.setVisible(true);
			searchmodmain.getSearchtxtEnterEnrollmentNumber().setText("");
		}
		
		else if(event.getSource().equals(menu.getBtnSearchMultipleEntries()))
		{
			megasearch.setVisible(true);
			menu.setVisible(false);
		}
		
		else if(event.getSource().equals(menu.getBtnGenerateACopy()))
		{
			generatecopy.setVisible(true);
			menu.setVisible(false);
		}
		
	}
	
	
}
