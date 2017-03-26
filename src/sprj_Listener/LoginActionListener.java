package sprj_Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import sprj_DataStorage.LoginDetails;
import sprj_GUI.Login_GUI;
import sprj_GUI.Menu_GUI;

public class LoginActionListener implements ActionListener 
{

	private Menu_GUI menu;
	private Login_GUI login;
	
	
	//String userid = "P";
	//String password = "P";
	
	String userid = "admin";
	String password = "Kz1jz3ot";
		
	LoginDetails toexcel = new LoginDetails();
	
	public LoginActionListener(Login_GUI log, Menu_GUI me)
	{
		menu = me;
		login = log;
	}
	
	
	public void actionPerformed(ActionEvent event)
	{
		try
		{
			if(event.getSource().equals(login.getLoginbtnlogin()))
			{
				String passenter = new String(login.getLogintxtPassword().getPassword());
				String userenter = login.getLogintxtLoginId().getText();
				
				int passcheck = toexcel.check(userenter, passenter);
				
				
				if(!(userid.isEmpty() || passenter.isEmpty()))
				{
					if((userenter.equals(userid) && passenter.equals(password)))
					{
						menu.setVisible(true);
						login.setVisible(false);
						
						login.clear();
					}
					
					else if(passcheck != -1)
					{
						menu.setVisible(true);
						login.setVisible(false);
						login.clear();
					}
					
					else if(passcheck == -1)
					{
						menu.getMenuError().setlblerror("INCORRECT LOGIN DETAILS!");
						menu.getMenuError().setVisible(true);
					}
				}
				
				else
				{
					menu.getMenuError().setlblerror("INCORRECT LOGIN DETAILS!");
					menu.getMenuError().setVisible(true);
				}
			}
		}
		
		catch(Exception err)
		{
			menu.getMenuError().setlblerror(err.getLocalizedMessage());
			menu.getMenuError().setVisible(true);
		}
	}
	
}
