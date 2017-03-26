package sprj_Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import sprj_DataStorage.LoginDetails;
import sprj_GUI.AddAccount_GUI;
import sprj_GUI.ChangePassword_GUI;
import sprj_GUI.DeleteAccount_GUI;
import sprj_GUI.Error_GUI;
import sprj_GUI.Login_GUI;
import sprj_GUI.ManageAccounts_GUI;

public class ManageAccountActionListener implements ActionListener 
{
	
	
	private Login_GUI login;
	private ManageAccounts_GUI manage;
	private AddAccount_GUI addaccount;
	private DeleteAccount_GUI deleteaccount;
	private ChangePassword_GUI changepass;
	private Error_GUI error;
	
	LoginDetails toexcel = new LoginDetails();
	
	
	String AdminUser = "admin";
	String AdminPass = "Kz1jz3ot";
	public ManageAccountActionListener(Login_GUI log, ManageAccounts_GUI man, AddAccount_GUI add, DeleteAccount_GUI del, ChangePassword_GUI change, Error_GUI er)
	{
		login = log;
		manage = man;
		addaccount = add;
		deleteaccount = del;
		changepass = change;
		error = er;
		
	}

	public void actionPerformed(ActionEvent event) 
	{
		String passenter = new String(manage.getAdmintxtPassword().getPassword());
		String userenter = manage.getAdmintxtLoginID().getText();
		
		try
		{
			if(event.getSource().equals(error.getErrorbtnOk()))
			{
				error.dispose();
			}
			
			if(event.getSource().equals(login.getMenubtnManageAccounts()))
			{
				login.setVisible(false);
				manage.setVisible(true);
			}
			
			if(event.getSource().equals(manage.getAdminbtnBack()))
			{
				manage.setVisible(false);
				login.setVisible(true);
			}
			
			else if(event.getSource().equals(manage.getAdminbtnAddAccount()))
			{
				
				if(userenter.equals(AdminUser) && passenter.equals(AdminPass))
				{
					manage.setVisible(false);
					addaccount.setVisible(true);
					manage.clear();
					
				}
				
				else
				{
					error.setlblerror("INCORRECT LOGIN DETAILS FOR ADMIN");
					error.setVisible(true);
				}
			}
			
			else if(event.getSource().equals(manage.getAdminbtnDeleteAccount()))
			{
				if(userenter.equals(AdminUser) && passenter.equals(AdminPass))
				{
					manage.setVisible(false);
					deleteaccount.setVisible(true);
					
					manage.clear();
					
				}
				
				else
				{
					error.setlblerror("INCORRECT LOGIN DETAILS FOR ADMIN");
					error.setVisible(true);
				}
				
			}
			
			else if(event.getSource().equals(manage.getAdminbtnChangePassword()))
			{
				if(userenter.equals(AdminUser) && passenter.equals(AdminPass))
				{
					manage.setVisible(false);
					changepass.setVisible(true);
					manage.clear();
					
				}
				
				else
				{
					error.setlblerror("INCORRECT LOGIN DETAILS FOR ADMIN");
					error.setVisible(true);
				}
			}
			
			else if(event.getSource().equals(addaccount.getAAbtnBack()))
			{
				addaccount.setVisible(false);
				manage.setVisible(true);
				manage.clear();
			}
			
			
			////////////////////////////////////////////////////////////
			else if(event.getSource().equals(addaccount.getAAbtnSubmit()))
			{
				String pass1 = new String(addaccount.getAAPassword().getPassword());
				String pass2 = new String(addaccount.getAARePassword().getPassword());
				
				
				if((pass1.isEmpty() || pass2.isEmpty() || addaccount.getAAtxtLoginId().getText().isEmpty()))
				{
					error.setlblerror("EMPTY USERID OR PASSWORD!");
					error.setVisible(true);
				}
				
				else
				{
					if(pass1.equals(pass2))
					{
						toexcel.createacc(addaccount.getAAtxtLoginId().getText(), pass1);
						addaccount.setVisible(false);
						addaccount.clear();
						manage.setVisible(true);
						
					}
					
					else
					{
						error.setlblerror("PASSWORDS DON'T MATCH!");
						error.setVisible(true);
					}
				}
				
			}
			
			
			else if(event.getSource().equals(deleteaccount.getDAbtnBack()))
			{
				deleteaccount.setVisible(false);
				manage.setVisible(true);
				manage.clear();
			}
			
			////////////////////////////////////////////////////////////////////
			else if(event.getSource().equals(deleteaccount.getDAbtnDeleteAccount()))
			{
				String passdelete = new String(deleteaccount.getDAtxtPassword().getPassword());
				
				int rownum = toexcel.deleteacc(deleteaccount.getDAtxtLoginID().getText(), passdelete);
				
				if(rownum == -1)
				{
					error.setlblerror("ACCOUNT DOESN'T EXIST");
					error.setVisible(true);
				}
				
				else
				{
					manage.setVisible(true);
					deleteaccount.setVisible(false);
				}
				
			}
			
			
			
			
			/////////////////////////////////////////////////////////////
			else if(event.getSource().equals(changepass.getCPbtnSubmit()))
			{
				String passold = new String(changepass.getCPOldPassword().getPassword());
				String passnew = new String(changepass.getCPNewPassword().getPassword());
				
				if(!(passold.isEmpty() || passnew.isEmpty() || changepass.getCPtxtLoginId().getText().isEmpty()))
				{
					if(passold.equals(passnew))
					{
						error.setlblerror("OLD AND NEW PASSWORD CANNOT BE SAME");
						error.setVisible(true);
					}
					
					else
					{
						//String passchange = new String(changepass.getCPNewPassword().getPassword());
						
						
						int rownum = toexcel.changepass(changepass.getCPtxtLoginId().getText(), passold, passnew);
						
						if(rownum == -1)
						{
							error.setlblerror("ACCOUNT DOESN'T EXIST");
							error.setVisible(true);
						}
						
						else
						{
							manage.setVisible(true);
							changepass.setVisible(false);
							changepass.clear();
						}
					}
				}
				
				else
				{
					error.setlblerror("EMPTY PASSWORD FIELD!");
					error.setVisible(true);
				}
			}
			
			else if(event.getSource().equals(changepass.getCPbtnBack()))
			{
				changepass.setVisible(false);
				manage.setVisible(true);
				manage.clear();
			}

		}
		
		catch(Exception err)
		{
			error.setlblerror(err.getLocalizedMessage());
			error.setVisible(true);
		}
	}

}
