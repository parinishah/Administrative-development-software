package sprj_Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import sprj_DataStorage.ExcelModify;
import sprj_GUI.Error_GUI;
import sprj_GUI.Menu_GUI;
import sprj_GUI.ModBoard_JEE_GUI;
import sprj_GUI.ModEnrollmentDetails_GUI;
import sprj_GUI.ModGuardianDetails_GUI;
import sprj_GUI.ModNRISponsoredDetails_GUI;
import sprj_GUI.ModNRIStudent_GUI;
import sprj_GUI.ModNRI_AcademicDetails_GUI;
import sprj_GUI.ModPersonalDetails_GUI;
import sprj_GUI.SearchModify_GUI;

public class SearchModifyActionListener implements ActionListener 
{
	
	ExcelModify toexcel = new ExcelModify();
	
	private ModPersonalDetails_GUI modpersonal;
	private ModGuardianDetails_GUI modguard;
	private ModBoard_JEE_GUI modboard_jee;
	private ModEnrollmentDetails_GUI modenroll;
	private ModNRI_AcademicDetails_GUI modNRIacademic;
	private ModNRISponsoredDetails_GUI modNRIspons;
	private ModNRIStudent_GUI modNRIstud;
	//private SearchModify_GUI searchmod;
	private Error_GUI error;
	private Menu_GUI menu;
	private SearchModify_GUI searchmodmain;
	static int flag = 0;
	
	static int rownumictacpc, rownumictnri, rownumictnrisp, rownummechacpc, rownummechnri, rownummechnrisp,rownumchemacpc, rownumchemnri, rownumchemnrisp; 
	static int checkdocsictacpc, checkdocsictnri, checkdocsictnrisp, checkdocsmechacpc, checkdocsmechnri, checkdocsmechnrisp, checkdocschemacpc, checkdocschemnri, checkdocschemnrisp;
	
	public SearchModifyActionListener(Menu_GUI me, SearchModify_GUI searchmain, ModPersonalDetails_GUI modper, ModGuardianDetails_GUI modgrd, ModBoard_JEE_GUI modbj, ModNRISponsoredDetails_GUI modNRIsp, ModNRIStudent_GUI modNRIst, ModNRI_AcademicDetails_GUI modNRIaca, ModEnrollmentDetails_GUI modenrl, Error_GUI er)
	{
		//searchmod = searchm;
		searchmodmain = searchmain;
		modpersonal = modper;
		modguard = modgrd;
		modboard_jee = modbj;
		modenroll = modenrl;
		modNRIacademic = modNRIaca;
		modNRIspons = modNRIsp;
		modNRIstud = modNRIst;
		error = er;
		menu= me;
	}
	
	public void actionPerformed(ActionEvent event) 
	{
		
		
		
		
		
		////////////MAIN MENU MODIFY///////////////////////////////////////
		////////////////
		//////////////
		////////////
		//////////
		////////
		
	
		if(event.getSource().equals(searchmodmain.getSearchrdbtnNRI()))
		{
			searchmodmain.setlblSearchUniqueNum("Enter Unique ID:");
		}
		
		else if(event.getSource().equals(searchmodmain.getSearchrdbtnAcpc()) || event.getSource().equals(searchmodmain.getSearchrdbtnNRISponsored()))
		{
			searchmodmain.setlblSearchUniqueNum("Enter JEE Roll Number:");
		}
		
		
		else if(event.getSource().equals(searchmodmain.getSearchModbtnBack()))
		{
			menu.setVisible(true);
			searchmodmain.setVisible(false);
			searchmodmain.clear();  
		}
		
		else if(event.getSource().equals(searchmodmain.getBtnSearch()))
		{
			flag = 1;
			//System.out.println(flag);
			if(searchmodmain.SearchModgetTextEmpty())
				error.displayerror();
			else
			{
				if(searchmodmain.getRdbtnIct().isSelected())
				{
					try
					{
						
						if(searchmodmain.getSearchrdbtnAcpc().isSelected())
						{
							rownumictacpc = toexcel.modviewICTACPC(searchmodmain.getSearchtxtEnterEnrollmentNumber().getText(), modpersonal, modguard, modboard_jee, modenroll);
							
							if(rownumictacpc == -1)
							{
								error.setlblerror("STUDENT DOESN'T EXIST IN ICT ACPC DATABASE");
								error.setVisible(true);
							}
							
							else
							{
								checkdocsictacpc = toexcel.ICTacpcjeerollnumcheckchkbox(searchmodmain.getSearchtxtEnterEnrollmentNumber().getText());
								if(checkdocsictacpc == -1)
								{
									throw new Exception("STUDENT NOT FOUND! CHECK STUDENT DOCUMENT LIST!");
								}
								
								modpersonal.setVisible(true);
								searchmodmain.setVisible(false);
							}
						}
						
						else if(searchmodmain.getSearchrdbtnNRI().isSelected())
						{
							rownumictnri = toexcel.modviewICTNRISTUD(searchmodmain.getSearchtxtEnterEnrollmentNumber().getText(), modpersonal, modguard, modNRIacademic, modNRIstud, modenroll);
							
							if(rownumictnri == -1)
							{
								error.setlblerror("STUDENT DOESN'T EXIST IN ICT NRI DATABASE");
								error.setVisible(true);
							}
							
							else
							{
								
								checkdocsictnri = toexcel.ICTnristudrollcheckchkbox(searchmodmain.getSearchtxtEnterEnrollmentNumber().getText());
								if(checkdocsictnri == -1)
								{
									throw new Exception("STUDENT NOT FOUND! CHECK STUDENT DOCUMENT LIST!");
								}
								
								modpersonal.setVisible(true);
								searchmodmain.setVisible(false);
								
								modpersonal.setVisible(true);
								searchmodmain.setVisible(false);
							}
						}
						
						else if(searchmodmain.getSearchrdbtnNRISponsored().isSelected())
						{
							rownumictnrisp = toexcel.modviewICTNRISPON(searchmodmain.getSearchtxtEnterEnrollmentNumber().getText(), modpersonal, modguard, modboard_jee, modNRIspons, modenroll);
							
							if(rownumictnrisp == -1)
							{
								error.setlblerror("STUDENT DOESN'T EXIST IN ICT NRI SPONSORED DATABASE");
								error.setVisible(true);
							}
							
							else
							{
								checkdocsictnrisp = toexcel.ICTnrisponjeerollnumcheckchkbox(searchmodmain.getSearchtxtEnterEnrollmentNumber().getText());

								if(checkdocsictnrisp == -1)
								{
									throw new Exception("STUDENT NOT FOUND! CHECK STUDENT DOCUMENT LIST!");
								}
								
								modpersonal.setVisible(true);
								searchmodmain.setVisible(false);
							}
						}
						
					
					}
					
					catch(Exception err)
					{
						error.setlblerror(err.getLocalizedMessage());
						error.setVisible(true);
					}
				}
				
				else if(searchmodmain.getRdbtnMech().isSelected())
				{
					try
					{
						if(searchmodmain.getSearchrdbtnAcpc().isSelected())
						{
							rownummechacpc = toexcel.modviewMECHACPC(searchmodmain.getSearchtxtEnterEnrollmentNumber().getText(), modpersonal, modguard, modboard_jee, modenroll);
							
							if(rownummechacpc == -1)
							{
								error.setlblerror("STUDENT DOESN'T EXIST IN MECH ACPC DATABASE");
								error.setVisible(true);
							}
							
							else
							{
								checkdocsmechacpc = toexcel.MECHacpcjeerollnumcheckchkbox(searchmodmain.getSearchtxtEnterEnrollmentNumber().getText());
								if(checkdocsmechacpc == -1)
								{
									throw new Exception("STUDENT NOT FOUND! CHECK STUDENT DOCUMENT LIST!");
								}

								
								modpersonal.setVisible(true);
								searchmodmain.setVisible(false);
							}
						}
						
						else if(searchmodmain.getSearchrdbtnNRI().isSelected())
						{
							rownummechnri = toexcel.modviewMECHNRISTUD(searchmodmain.getSearchtxtEnterEnrollmentNumber().getText(), modpersonal, modguard, modNRIacademic, modNRIstud, modenroll);
							
							if(rownummechnri == -1)
							{
								error.setlblerror("STUDENT DOESN'T EXIST IN MECH NRI DATABASE");
								error.setVisible(true);
							}
							
							else
							{
								checkdocsmechnri = toexcel.MECHnristudrollcheckchkbox(searchmodmain.getSearchtxtEnterEnrollmentNumber().getText());
								if(checkdocsmechnri == -1)
								{
									throw new Exception("STUDENT NOT FOUND! CHECK STUDENT DOCUMENT LIST!");
								}

								
								modpersonal.setVisible(true);
								searchmodmain.setVisible(false);
							}
						}
						
						else if(searchmodmain.getSearchrdbtnNRISponsored().isSelected())
						{
							rownummechnrisp = toexcel.modviewMECHNRISPON(searchmodmain.getSearchtxtEnterEnrollmentNumber().getText(), modpersonal, modguard, modboard_jee, modNRIspons, modenroll);
							
							if(rownummechnrisp == -1)
							{
								error.setlblerror("STUDENT DOESN'T EXIST IN MECH NRI SPONSORED DATABASE");
								error.setVisible(true);
							}
							
							else
							{
								checkdocsmechnrisp = toexcel.MECHnrisponjeerollnumcheckchkbox(searchmodmain.getSearchtxtEnterEnrollmentNumber().getText());

								if(checkdocsmechnrisp == -1)
								{
									throw new Exception("STUDENT NOT FOUND! CHECK STUDENT DOCUMENT LIST!");
								}

								
								modpersonal.setVisible(true);
								searchmodmain.setVisible(false);
							}
						}
					}
					
					catch(Exception err)
					{
						error.setlblerror(err.getLocalizedMessage());
						error.setVisible(true);
					}
				}
				
				else if(searchmodmain.getRdbtnChem().isSelected())
				{
					try
					{
						if(searchmodmain.getSearchrdbtnAcpc().isSelected())
						{
							rownumchemacpc = toexcel.modviewCHEMACPC(searchmodmain.getSearchtxtEnterEnrollmentNumber().getText(), modpersonal, modguard, modboard_jee, modenroll);
							
							if(rownumchemacpc == -1)
							{
								error.setlblerror("STUDENT DOESN'T EXIST IN CHEM ACPC DATABASE");
								error.setVisible(true);
							}
							
							else
							{
								checkdocschemacpc = toexcel.CHEMacpcjeerollnumcheckchkbox(searchmodmain.getSearchtxtEnterEnrollmentNumber().getText());
								if(checkdocschemacpc == -1)
								{
									throw new Exception("STUDENT NOT FOUND! CHECK STUDENT DOCUMENT LIST!");
								}

								
								modpersonal.setVisible(true);
								searchmodmain.setVisible(false);
							}
						}
						
						else if(searchmodmain.getSearchrdbtnNRI().isSelected())
						{
							rownumchemnri = toexcel.modviewCHEMNRISTUD(searchmodmain.getSearchtxtEnterEnrollmentNumber().getText(), modpersonal, modguard, modNRIacademic, modNRIstud, modenroll);
							
							if(rownumchemnri == -1)
							{
								error.setlblerror("STUDENT DOESN'T EXIST IN CHEM NRI DATABASE");
								error.setVisible(true);
							}
							
							else
							{
								checkdocschemnri = toexcel.CHEMnristudrollcheckchkbox(searchmodmain.getSearchtxtEnterEnrollmentNumber().getText());
								if(checkdocschemnri == -1)
								{
									throw new Exception("STUDENT NOT FOUND! CHECK STUDENT DOCUMENT LIST!");
								}

								
								modpersonal.setVisible(true);
								searchmodmain.setVisible(false);
							}
						}
						
						else if(searchmodmain.getSearchrdbtnNRISponsored().isSelected())
						{
							rownumchemnrisp = toexcel.modviewCHEMNRISPON(searchmodmain.getSearchtxtEnterEnrollmentNumber().getText(), modpersonal, modguard, modboard_jee, modNRIspons, modenroll);
							
							if(rownumchemnrisp == -1)
							{
								error.setlblerror("STUDENT DOESN'T EXIST IN CHEM NRI SPONSORED DATABASE");
								error.setVisible(true);
							}
							
							else
							{
								checkdocschemnrisp = toexcel.CHEMnrisponjeerollnumcheckchkbox(searchmodmain.getSearchtxtEnterEnrollmentNumber().getText());

								if(checkdocschemnrisp == -1)
								{
									throw new Exception("STUDENT NOT FOUND! CHECK STUDENT DOCUMENT LIST!");
								}
	
								modpersonal.setVisible(true);
								searchmodmain.setVisible(false);
							}
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
		
		else if(event.getSource().equals(modpersonal.getPDbtnBack()) && flag == 1)
		{
			//System.out.println("OY");
			searchmodmain.setVisible(true);
			modpersonal.setVisible(false);
			searchmodmain.clear();
		}
		
		else if(event.getSource().equals(modpersonal.getPDbtnNext())  && flag == 1)
		{
			if(modpersonal.PDgetTextEmpty())
			{
				error.displayerror();
				error.setVisible(true);
			}
			
			else
			{
				//System.out.println("heremod");
				modpersonal.setVisible(false);
				modguard.setVisible(true);
			}
		}
		
		else if(event.getSource().equals(modguard.getBtnBackPersonalDetails()) && flag == 1)
		{
			modpersonal.setVisible(true);
			modguard.setVisible(false);
		}
		
		else if(event.getSource().equals(modguard.getBtnNext()) && flag == 1)
		{
			if(modguard.GDgetTextEmpty())
			{
				error.displayerror();
				error.setVisible(true);
			}
			
			else
			{
				
				if(searchmodmain.getSearchrdbtnAcpc().isSelected() || searchmodmain.getSearchrdbtnNRISponsored().isSelected())
				{
					modboard_jee.setVisible(true);
					modboard_jee.getADtxtJEERollNumber().setEditable(false);
					modguard.setVisible(false);
				}
				
				else if(searchmodmain.getSearchrdbtnNRI().isSelected())
				{
					modNRIacademic.setVisible(true);
					modNRIacademic.getNADtxt12thRollNumberunique().setEditable(false);
					modguard.setVisible(false);
				}
			}
		}
		
		else if(event.getSource().equals(modboard_jee.getADbtnBackGardianDetails()) && flag == 1)
		{
			modboard_jee.setVisible(false);
			modguard.setVisible(true);
		}
		
		else if(event.getSource().equals(modboard_jee.getADbtnNextEnrollmentDetails()) && flag == 1)
		{
			if(modboard_jee.ADgetTextEmpty())
			{
				error.displayerror();
				error.setVisible(true);
			}
			
			else
			{
				if(searchmodmain.getSearchrdbtnAcpc().isSelected())
				{
					modenroll.setEnabledAll();
					
					modenroll.getJEDchckbxAffidavit().setSelected(false);
					modenroll.getJEDchckbxAffidavit().setEnabled(false);
					
					modenroll.getJEDchckbxCopyOfPassport().setSelected(false);
					modenroll.getJEDchckbxCopyOfPassport().setEnabled(false);
					
					modenroll.getJEDchckbxNriProofCertificate().setSelected(false);
					modenroll.getJEDchckbxNriProofCertificate().setEnabled(false);
					
					modenroll.getJEDchckbxLastEducationalCertificate().setSelected(false);
					modenroll.getJEDchckbxLastEducationalCertificate().setEnabled(false);
					
					modenroll.getJEDchckbxMigrationCertificate().setSelected(false);
					modenroll.getJEDchckbxMigrationCertificate().setEnabled(false);
					
					modenroll.setVisible(true);
					modboard_jee.setVisible(false);
				}
				
				else if(searchmodmain.getSearchrdbtnNRISponsored().isSelected())
				{
					modNRIspons.setVisible(true);
					modboard_jee.setVisible(false);
				}
			}
		}
		
		else if(event.getSource().equals(modNRIspons.getBtnNextenrollmentDetails()) && flag == 1)
		{
			if(modenroll.EDgetTextEmpty())
			{
				error.displayerror();
				error.setVisible(true);
			}
			else
			{
				modenroll.setEnabledAll();
				
				modenroll.getJEDchckbxLastEducationalCertificate().setSelected(false);
				modenroll.getJEDchckbxLastEducationalCertificate().setEnabled(false);
				
				modenroll.getJEDchckbxMigrationCertificate().setSelected(false);
				modenroll.getJEDchckbxMigrationCertificate().setEnabled(false);
				
				modenroll.setVisible(true);
				modNRIspons.setVisible(false);
			}
		}
		
		else if(event.getSource().equals(modNRIspons.getBtnBackAD()) && flag == 1)
		{
			modboard_jee.setVisible(true);
			modNRIspons.setVisible(false);
		}
		
		else if(event.getSource().equals(modNRIacademic.getNADbtnBackGuardianDetails()) && flag == 1)
		{
			modguard.setVisible(true);
			modNRIacademic.setVisible(false);
		}
		
		else if(event.getSource().equals(modNRIacademic.getNADbtnNextNRIStudentDetails()) && flag == 1)
		{
			
			if(modNRIacademic.getNRIacadTextEmpty())
			{
				error.displayerror();
				error.setVisible(true);
			}
			else
			{
				modNRIstud.setVisible(true);
				modNRIacademic.setVisible(false);
			}
		}
		
		else if(event.getSource().equals(modNRIstud.getBtnNextEnrollmentDetails()) && flag == 1)
		{
			if(modNRIstud.NRIStudgetTextEmpty())
			{
				error.displayerror();
				error.setVisible(true);
			}
			
			else
			{
				modenroll.setEnabledAll();
				
				
				modenroll.getJEDchckbxAffidavit().setSelected(false);
				modenroll.getJEDchckbxAffidavit().setEnabled(false);
				
				modenroll.getJEDchckbxNriProofCertificate().setSelected(false);
				modenroll.getJEDchckbxNriProofCertificate().setEnabled(false);
				
				modenroll.getJEDchckbx12Marksheet().setSelected(false);
				modenroll.getJEDchckbx12Marksheet().setEnabled(false);
				
				modenroll.getJEDchckbx10Marksheet().setSelected(false);
				modenroll.getJEDchckbx10Marksheet().setEnabled(false);
				
				modenroll.getJEDchckbxJeeMarksheet().setSelected(false);
				modenroll.getJEDchckbxJeeMarksheet().setEnabled(false);
				
				modenroll.getJEDchckbxSchoolLeavingCertificate().setSelected(false);
				modenroll.getJEDchckbxSchoolLeavingCertificate().setEnabled(false);
				
				modenroll.getJEDchckbxMeritRankReciepts().setSelected(false);
				modenroll.getJEDchckbxMeritRankReciepts().setEnabled(false);
				
				modenroll.getJEDchckbx20000Receipts().setSelected(false);
				modenroll.getJEDchckbx20000Receipts().setEnabled(false);
				
				modenroll.getJEDchckbxAllotmentLetter().setSelected(false);
				modenroll.getJEDchckbxAllotmentLetter().setEnabled(false);
				
				modenroll.setVisible(true);
				modNRIstud.setVisible(false);
			
			}
		}
		
		else if(event.getSource().equals(modNRIstud.getBtnBackAcademicDetails()) && flag == 1)
		{
			modNRIacademic.setVisible(true);
			modNRIstud.setVisible(false);
		}
		
		else if(event.getSource().equals(modenroll.getEDbtnBack()) && flag == 1)
		{
			if(searchmodmain.getSearchrdbtnAcpc().isSelected())
			{
				modboard_jee.setVisible(true);
				modenroll.setVisible(false);
			}
			
			else if(searchmodmain.getSearchrdbtnNRISponsored().isSelected())
			{
				modNRIspons.setVisible(true);
				modenroll.setVisible(false);
			}
			
			else if(searchmodmain.getSearchrdbtnNRI().isSelected())
			{
				modNRIstud.setVisible(true);
				modenroll.setVisible(false);
			}
		}
		
		else if(event.getSource().equals(modenroll.getEDbtnSubmit()) && flag == 1)
		{
			if(modenroll.EDgetTextEmpty())
				error.displayerror();
			
			else
			{
				if(searchmodmain.getRdbtnIct().isSelected())
				{
					try
					{
						if(searchmodmain.getSearchrdbtnAcpc().isSelected())
						{
							
							//int rownum = toexcel.ICTjeerollnumcheck(searchjee.getTxtEnterJEEroll().getText());
							
							toexcel.modstoreICTACPC(rownumictacpc, modpersonal.getPDtxtFirstName().getText(), modpersonal.getPDtxtMiddleName().getText(), modpersonal.getPDtxtLastName().getText(), modpersonal.getPDgender(), modpersonal.getPDtxtDisability().getText(), modpersonal.getPDtxtAddL1().getText(), modpersonal.getPDtxtState().getText(), modpersonal.getPDtxtCity().getText(), modpersonal.getPDtxtPincode().getText(), modpersonal.getPDtxtPrimaryContact().getText(), modpersonal.getPDtxtSecondaryContact().getText(), modpersonal.getPDtxtEmailId().getText(), modpersonal.getPDCategory(), modpersonal.getPDDOB(), 
									modguard.getGDtxtFatherName().getText(), modguard.getGDtxtFatherContact().getText(), modguard.getGDtxtFatherQualification().getText(), modguard.getGDtxtFatherOccupation().getText(), modguard.getGDcmbFatherIncome(), modguard.getGDtxtFatherEmail().getText(), modguard.getGDtxtMotherName().getText(), modguard.getGDtxtMotherContact().getText(), modguard.getGDtxtMotherQualification().getText(), modguard.getGDtxtMotherOccupation().getText(), modguard.getGDcmbMotherIncome(), 
									//admiss.getATAdmType(),
									modboard_jee.getADcmb10passing(), modboard_jee.getADcmb12passing(), modboard_jee.getADtxtBoardRollNum12th().getText(), modboard_jee.getADcmbschlbrd(), modboard_jee.getADtxtSchoolName().getText(), modboard_jee.getADtxtOverallPercentage12th().getText(), modboard_jee.getADtxtPCMPercentage12th().getText(), modboard_jee.getADtxtPCMPercentile12th().getText(), modboard_jee.getADtxtJEEScore().getText(), modboard_jee.getADtxtJEEPercentile().getText() ,modboard_jee.getADtxtJEERollNumber().getText(), Integer.parseInt(modboard_jee.getADtxtAcpcRank().getText()), 
									modenroll.getEDAdmissionStatus());
				
							toexcel.docICTACPC(checkdocsictacpc, modboard_jee.getADtxtJEERollNumber().getText(), modpersonal.getPDtxtFirstName().getText(), modpersonal.getPDtxtLastName().getText(), modenroll.getEDchckbx10Marksheet(), modenroll.getEDchckbx12Marksheet(), 
									modenroll.getEDchckbxJeeMarksheet(), modenroll.getEDchckbxSchoolLeavingCertificate(), modenroll.getEDchckbxMeritRankReciepts(), modenroll.getEDchckbx20000Receipts(), modenroll.getEDchckbxAllotmentLetter(), modenroll.getEDchckbxPassportSize());
				

							
							menu.setVisible(true);
							modenroll.setVisible(false);
							
							modpersonal.clear();
							modguard.clear();
							modNRIspons.clear();
							modNRIstud.clear();
							modenroll.clearcheckbox();
							modboard_jee.clear();
						}
						
						else if(searchmodmain.getSearchrdbtnNRI().isSelected())
						{					
							
							toexcel.modstoreICTNRISTUD(rownumictnri, modpersonal.getPDtxtFirstName().getText(), modpersonal.getPDtxtMiddleName().getText(), modpersonal.getPDtxtLastName().getText(), modpersonal.getPDgender(), modpersonal.getPDtxtDisability().getText(), modpersonal.getPDtxtAddL1().getText(), modpersonal.getPDtxtState().getText(), modpersonal.getPDtxtCity().getText(), modpersonal.getPDtxtPincode().getText(), modpersonal.getPDtxtPrimaryContact().getText(), modpersonal.getPDtxtSecondaryContact().getText(), modpersonal.getPDtxtEmailId().getText(), modpersonal.getPDCategory(), modpersonal.getPDDOB(), 
									modguard.getGDtxtFatherName().getText(), modguard.getGDtxtFatherContact().getText(), modguard.getGDtxtFatherQualification().getText(), modguard.getGDtxtFatherOccupation().getText(), modguard.getGDcmbFatherIncome(), modguard.getGDtxtFatherEmail().getText(), modguard.getGDtxtMotherName().getText(), modguard.getGDtxtMotherContact().getText(), modguard.getGDtxtMotherQualification().getText(), modguard.getGDtxtMotherOccupation().getText(), modguard.getGDcmbMotherIncome(), 
									modNRIacademic.getNADtxt12thRollNumberunique().getText(), modNRIacademic.getNADtxtOverallGrade().getText(),
									modNRIstud.getNRItxtNationality().getText(), modNRIstud.getNRItxtNriStatus().getText(), modNRIstud.getNRItextAreaAddress().getText(),
									modenroll.getEDAdmissionStatus());
							
							
							toexcel.docICTNRI(checkdocsictnri, modNRIacademic.getNADtxt12thRollNumberunique().getText(), modpersonal.getPDtxtFirstName().getText(), modpersonal.getPDtxtLastName().getText(), 
									modenroll.getEDchckbxLastEducationalCertificate(), modenroll.getEDchckbxMigrationCertificate(), modenroll.getEDchckbxCopyOfPassport(), modenroll.getEDchckbxPassportSize());
						
							
							menu.setVisible(true);
							modenroll.setVisible(false);
							
							modpersonal.clear();
							modguard.clear();
							modNRIspons.clear();
							modNRIstud.clear();
							modenroll.clearcheckbox();
							modboard_jee.clear();
						}
						
						else if(searchmodmain.getSearchrdbtnNRISponsored().isSelected())
						{
							toexcel.modstoreICTNRISPON(rownumictnrisp, modpersonal.getPDtxtFirstName().getText(), modpersonal.getPDtxtMiddleName().getText(), modpersonal.getPDtxtLastName().getText(), modpersonal.getPDgender(), modpersonal.getPDtxtDisability().getText(), modpersonal.getPDtxtAddL1().getText(), modpersonal.getPDtxtState().getText(), modpersonal.getPDtxtCity().getText(), modpersonal.getPDtxtPincode().getText(), modpersonal.getPDtxtPrimaryContact().getText(), modpersonal.getPDtxtSecondaryContact().getText(), modpersonal.getPDtxtEmailId().getText(), modpersonal.getPDCategory(), modpersonal.getPDDOB(), 
									modguard.getGDtxtFatherName().getText(), modguard.getGDtxtFatherContact().getText(), modguard.getGDtxtFatherQualification().getText(), modguard.getGDtxtFatherOccupation().getText(), modguard.getGDcmbFatherIncome(), modguard.getGDtxtFatherEmail().getText(), modguard.getGDtxtMotherName().getText(), modguard.getGDtxtMotherContact().getText(), modguard.getGDtxtMotherQualification().getText(), modguard.getGDtxtMotherOccupation().getText(), modguard.getGDcmbMotherIncome(), 
									modboard_jee.getADcmb10passing(), modboard_jee.getADcmb12passing(), modboard_jee.getADtxtBoardRollNum12th().getText(), modboard_jee.getADcmbschlbrd(), modboard_jee.getADtxtSchoolName().getText(), modboard_jee.getADtxtOverallPercentage12th().getText(), modboard_jee.getADtxtPCMPercentage12th().getText(), modboard_jee.getADtxtPCMPercentile12th().getText(), modboard_jee.getADtxtJEEScore().getText(), modboard_jee.getADtxtJEEPercentile().getText() ,modboard_jee.getADtxtJEERollNumber().getText(), Integer.parseInt(modboard_jee.getADtxtAcpcRank().getText()),
									modNRIspons.getNRIStxtname().getText(), modNRIspons.getNRISGender(), modNRIspons.getNRIStxtNationality().getText(), modNRIspons.getNRIStxtStatus().getText(), modNRIspons.getNRIStxtRelation().getText(), modNRIspons.getNRIStxtContact().getText(), modNRIspons.getNRIStextAreaAddress().getText(),
									modenroll.getEDAdmissionStatus());
							
							toexcel.docICTNRISPON(checkdocsictnrisp, modboard_jee.getADtxtJEERollNumber().getText(), modpersonal.getPDtxtFirstName().getText(), modpersonal.getPDtxtLastName().getText(), 
									modenroll.getEDchckbx10Marksheet(), modenroll.getEDchckbx12Marksheet(), modenroll.getEDchckbxJeeMarksheet(), modenroll.getEDchckbxSchoolLeavingCertificate(), modenroll.getEDchckbxMeritRankReciepts(), modenroll.getEDchckbx20000Receipts(), modenroll.getEDchckbxAllotmentLetter(), modenroll.getEDchckbxPassportSize(), modenroll.getEDchckbxAffidavit(), modenroll.getEDchckbxCopyOfPassport(), modenroll.getEDchckbxNriProofCertificate());
							
							
							menu.setVisible(true);
							modenroll.setVisible(false);
							
							modpersonal.clear();
							modguard.clear();
							modNRIspons.clear();
							modNRIstud.clear();
							modboard_jee.clear();
							modenroll.clearcheckbox();
						}
						
					}
					
					catch(Exception err)
					{
						error.setlblerror(err.getLocalizedMessage());
						error.setVisible(true);
					}
				
				
						
				}
				
				
				else if(searchmodmain.getRdbtnMech().isSelected())
				{
					try
					{
						if(searchmodmain.getSearchrdbtnAcpc().isSelected())
						{
							
							//int rownum = toexcel.ICTjeerollnumcheck(searchjee.getTxtEnterJEEroll().getText());
							
							toexcel.modstoreMECHACPC(rownummechacpc, modpersonal.getPDtxtFirstName().getText(), modpersonal.getPDtxtMiddleName().getText(), modpersonal.getPDtxtLastName().getText(), modpersonal.getPDgender(), modpersonal.getPDtxtDisability().getText(), modpersonal.getPDtxtAddL1().getText(), modpersonal.getPDtxtState().getText(), modpersonal.getPDtxtCity().getText(), modpersonal.getPDtxtPincode().getText(), modpersonal.getPDtxtPrimaryContact().getText(), modpersonal.getPDtxtSecondaryContact().getText(), modpersonal.getPDtxtEmailId().getText(), modpersonal.getPDCategory(), modpersonal.getPDDOB(), 
									modguard.getGDtxtFatherName().getText(), modguard.getGDtxtFatherContact().getText(), modguard.getGDtxtFatherQualification().getText(), modguard.getGDtxtFatherOccupation().getText(), modguard.getGDcmbFatherIncome(), modguard.getGDtxtFatherEmail().getText(), modguard.getGDtxtMotherName().getText(), modguard.getGDtxtMotherContact().getText(), modguard.getGDtxtMotherQualification().getText(), modguard.getGDtxtMotherOccupation().getText(), modguard.getGDcmbMotherIncome(), 
									//admiss.getATAdmType(),
									modboard_jee.getADcmb10passing(), modboard_jee.getADcmb12passing(), modboard_jee.getADtxtBoardRollNum12th().getText(), modboard_jee.getADcmbschlbrd(), modboard_jee.getADtxtSchoolName().getText(), modboard_jee.getADtxtOverallPercentage12th().getText(), modboard_jee.getADtxtPCMPercentage12th().getText(), modboard_jee.getADtxtPCMPercentile12th().getText(), modboard_jee.getADtxtJEEScore().getText(), modboard_jee.getADtxtJEEPercentile().getText() ,modboard_jee.getADtxtJEERollNumber().getText(), Integer.parseInt(modboard_jee.getADtxtAcpcRank().getText()), 
									modenroll.getEDAdmissionStatus());
							
							toexcel.docMECHACPC(checkdocsmechacpc, modboard_jee.getADtxtJEERollNumber().getText(), modpersonal.getPDtxtFirstName().getText(), modpersonal.getPDtxtLastName().getText(), modenroll.getEDchckbx10Marksheet(), modenroll.getEDchckbx10Marksheet(), 
												modenroll.getEDchckbxJeeMarksheet(), modenroll.getEDchckbxSchoolLeavingCertificate(), modenroll.getEDchckbxMeritRankReciepts(), modenroll.getEDchckbx20000Receipts(), modenroll.getEDchckbxAllotmentLetter(), modenroll.getEDchckbxPassportSize());
						
							
							menu.setVisible(true);
							modenroll.setVisible(false);
							
							modpersonal.clear();
							modguard.clear();
							modNRIspons.clear();
							modenroll.clearcheckbox();
							modNRIstud.clear();
							modboard_jee.clear();
						}
						
						else if(searchmodmain.getSearchrdbtnNRI().isSelected())
						{					
							
							toexcel.modstoreMECHNRISTUD(rownummechnri, modpersonal.getPDtxtFirstName().getText(), modpersonal.getPDtxtMiddleName().getText(), modpersonal.getPDtxtLastName().getText(), modpersonal.getPDgender(), modpersonal.getPDtxtDisability().getText(), modpersonal.getPDtxtAddL1().getText(), modpersonal.getPDtxtState().getText(), modpersonal.getPDtxtCity().getText(), modpersonal.getPDtxtPincode().getText(), modpersonal.getPDtxtPrimaryContact().getText(), modpersonal.getPDtxtSecondaryContact().getText(), modpersonal.getPDtxtEmailId().getText(), modpersonal.getPDCategory(), modpersonal.getPDDOB(), 
									modguard.getGDtxtFatherName().getText(), modguard.getGDtxtFatherContact().getText(), modguard.getGDtxtFatherQualification().getText(), modguard.getGDtxtFatherOccupation().getText(), modguard.getGDcmbFatherIncome(), modguard.getGDtxtFatherEmail().getText(), modguard.getGDtxtMotherName().getText(), modguard.getGDtxtMotherContact().getText(), modguard.getGDtxtMotherQualification().getText(), modguard.getGDtxtMotherOccupation().getText(), modguard.getGDcmbMotherIncome(), 
									modNRIacademic.getNADtxt12thRollNumberunique().getText(), modNRIacademic.getNADtxtOverallGrade().getText(),
									modNRIstud.getNRItxtNationality().getText(), modNRIstud.getNRItxtNriStatus().getText(), modNRIstud.getNRItextAreaAddress().getText(),
									modenroll.getEDAdmissionStatus());
							
							toexcel.docMECHNRI(checkdocsmechnri, modNRIacademic.getNADtxt12thRollNumberunique().getText(), modpersonal.getPDtxtFirstName().getText(), modpersonal.getPDtxtLastName().getText(), 
												modenroll.getEDchckbxLastEducationalCertificate(), modenroll.getEDchckbxMigrationCertificate(), modenroll.getEDchckbxCopyOfPassport(), modenroll.getEDchckbxPassportSize());
					
							
							menu.setVisible(true);
							modenroll.setVisible(false);
							
							modpersonal.clear();
							modguard.clear();
							modNRIspons.clear();
							modNRIstud.clear();
							modboard_jee.clear();
							modenroll.clearcheckbox();
						}
						
						else if(searchmodmain.getSearchrdbtnNRISponsored().isSelected())
						{
							toexcel.modstoreMECHNRISPON(rownummechnrisp, modpersonal.getPDtxtFirstName().getText(), modpersonal.getPDtxtMiddleName().getText(), modpersonal.getPDtxtLastName().getText(), modpersonal.getPDgender(), modpersonal.getPDtxtDisability().getText(), modpersonal.getPDtxtAddL1().getText(), modpersonal.getPDtxtState().getText(), modpersonal.getPDtxtCity().getText(), modpersonal.getPDtxtPincode().getText(), modpersonal.getPDtxtPrimaryContact().getText(), modpersonal.getPDtxtSecondaryContact().getText(), modpersonal.getPDtxtEmailId().getText(), modpersonal.getPDCategory(), modpersonal.getPDDOB(), 
									modguard.getGDtxtFatherName().getText(), modguard.getGDtxtFatherContact().getText(), modguard.getGDtxtFatherQualification().getText(), modguard.getGDtxtFatherOccupation().getText(), modguard.getGDcmbFatherIncome(), modguard.getGDtxtFatherEmail().getText(), modguard.getGDtxtMotherName().getText(), modguard.getGDtxtMotherContact().getText(), modguard.getGDtxtMotherQualification().getText(), modguard.getGDtxtMotherOccupation().getText(), modguard.getGDcmbMotherIncome(), 
									modboard_jee.getADcmb10passing(), modboard_jee.getADcmb12passing(), modboard_jee.getADtxtBoardRollNum12th().getText(), modboard_jee.getADcmbschlbrd(), modboard_jee.getADtxtSchoolName().getText(), modboard_jee.getADtxtOverallPercentage12th().getText(), modboard_jee.getADtxtPCMPercentage12th().getText(), modboard_jee.getADtxtPCMPercentile12th().getText(), modboard_jee.getADtxtJEEScore().getText(), modboard_jee.getADtxtJEEPercentile().getText() ,modboard_jee.getADtxtJEERollNumber().getText(), Integer.parseInt(modboard_jee.getADtxtAcpcRank().getText()),
									modNRIspons.getNRIStxtname().getText(), modNRIspons.getNRISGender(), modNRIspons.getNRIStxtNationality().getText(), modNRIspons.getNRIStxtStatus().getText(), modNRIspons.getNRIStxtRelation().getText(), modNRIspons.getNRIStxtContact().getText(), modNRIspons.getNRIStextAreaAddress().getText(),
									modenroll.getEDAdmissionStatus());
							
							toexcel.docMECHNRISPON(checkdocsmechnrisp, modboard_jee.getADtxtJEERollNumber().getText(), modpersonal.getPDtxtFirstName().getText(), modpersonal.getPDtxtLastName().getText(), 
													modenroll.getEDchckbx10Marksheet(), modenroll.getEDchckbx12Marksheet(), modenroll.getEDchckbxJeeMarksheet(), modenroll.getEDchckbxSchoolLeavingCertificate(), modenroll.getEDchckbxMeritRankReciepts(), modenroll.getEDchckbx20000Receipts(), modenroll.getEDchckbxAllotmentLetter(), modenroll.getEDchckbxPassportSize(), modenroll.getEDchckbxAffidavit(), modenroll.getEDchckbxCopyOfPassport(), modenroll.getEDchckbxNriProofCertificate());
							
							
							
							menu.setVisible(true);
							modenroll.setVisible(false);
							
							modpersonal.clear();
							modguard.clear();
							modNRIspons.clear();
							modNRIstud.clear();
							modenroll.clearcheckbox();
							modboard_jee.clear();
						}
					
					}
					
					catch(Exception err)
					{
						error.setlblerror(err.getLocalizedMessage());
						error.setVisible(true);
						err.printStackTrace();
					}
						
				}
				
				else if(searchmodmain.getRdbtnChem().isSelected())
				{
					try
					{
						if(searchmodmain.getSearchrdbtnAcpc().isSelected())
						{
							
							//int rownum = toexcel.ICTjeerollnumcheck(searchjee.getTxtEnterJEEroll().getText());
							
							toexcel.modstoreCHEMACPC(rownumchemacpc, modpersonal.getPDtxtFirstName().getText(), modpersonal.getPDtxtMiddleName().getText(), modpersonal.getPDtxtLastName().getText(), modpersonal.getPDgender(), modpersonal.getPDtxtDisability().getText(), modpersonal.getPDtxtAddL1().getText(), modpersonal.getPDtxtState().getText(), modpersonal.getPDtxtCity().getText(), modpersonal.getPDtxtPincode().getText(), modpersonal.getPDtxtPrimaryContact().getText(), modpersonal.getPDtxtSecondaryContact().getText(), modpersonal.getPDtxtEmailId().getText(), modpersonal.getPDCategory(), modpersonal.getPDDOB(), 
									modguard.getGDtxtFatherName().getText(), modguard.getGDtxtFatherContact().getText(), modguard.getGDtxtFatherQualification().getText(), modguard.getGDtxtFatherOccupation().getText(), modguard.getGDcmbFatherIncome(), modguard.getGDtxtFatherEmail().getText(), modguard.getGDtxtMotherName().getText(), modguard.getGDtxtMotherContact().getText(), modguard.getGDtxtMotherQualification().getText(), modguard.getGDtxtMotherOccupation().getText(), modguard.getGDcmbMotherIncome(), 
									//admiss.getATAdmType(),
									modboard_jee.getADcmb10passing(), modboard_jee.getADcmb12passing(), modboard_jee.getADtxtBoardRollNum12th().getText(), modboard_jee.getADcmbschlbrd(), modboard_jee.getADtxtSchoolName().getText(), modboard_jee.getADtxtOverallPercentage12th().getText(), modboard_jee.getADtxtPCMPercentage12th().getText(), modboard_jee.getADtxtPCMPercentile12th().getText(), modboard_jee.getADtxtJEEScore().getText(), modboard_jee.getADtxtJEEPercentile().getText() ,modboard_jee.getADtxtJEERollNumber().getText(), Integer.parseInt(modboard_jee.getADtxtAcpcRank().getText()), 
									modenroll.getEDAdmissionStatus());
				
							toexcel.docCHEMACPC(checkdocschemacpc, modboard_jee.getADtxtJEERollNumber().getText(), modpersonal.getPDtxtFirstName().getText(), modpersonal.getPDtxtLastName().getText(), modenroll.getEDchckbx10Marksheet(), modenroll.getEDchckbx10Marksheet(), 
											modenroll.getEDchckbxJeeMarksheet(), modenroll.getEDchckbxSchoolLeavingCertificate(), modenroll.getEDchckbxMeritRankReciepts(), modenroll.getEDchckbx20000Receipts(), modenroll.getEDchckbxAllotmentLetter(), modenroll.getEDchckbxPassportSize());
		
							
							menu.setVisible(true);
							modenroll.setVisible(false);
							
							modpersonal.clear();
							
							modenroll.clearcheckbox();
							modguard.clear();
							modNRIspons.clear();
							modNRIstud.clear();
							modboard_jee.clear();
						}
						
						else if(searchmodmain.getSearchrdbtnNRI().isSelected())
						{					
							
							toexcel.modstoreCHEMNRISTUD(rownumchemnri, modpersonal.getPDtxtFirstName().getText(), modpersonal.getPDtxtMiddleName().getText(), modpersonal.getPDtxtLastName().getText(), modpersonal.getPDgender(), modpersonal.getPDtxtDisability().getText(), modpersonal.getPDtxtAddL1().getText(), modpersonal.getPDtxtState().getText(), modpersonal.getPDtxtCity().getText(), modpersonal.getPDtxtPincode().getText(), modpersonal.getPDtxtPrimaryContact().getText(), modpersonal.getPDtxtSecondaryContact().getText(), modpersonal.getPDtxtEmailId().getText(), modpersonal.getPDCategory(), modpersonal.getPDDOB(), 
									modguard.getGDtxtFatherName().getText(), modguard.getGDtxtFatherContact().getText(), modguard.getGDtxtFatherQualification().getText(), modguard.getGDtxtFatherOccupation().getText(), modguard.getGDcmbFatherIncome(), modguard.getGDtxtFatherEmail().getText(), modguard.getGDtxtMotherName().getText(), modguard.getGDtxtMotherContact().getText(), modguard.getGDtxtMotherQualification().getText(), modguard.getGDtxtMotherOccupation().getText(), modguard.getGDcmbMotherIncome(), 
									modNRIacademic.getNADtxt12thRollNumberunique().getText(), modNRIacademic.getNADtxtOverallGrade().getText(),
									modNRIstud.getNRItxtNationality().getText(), modNRIstud.getNRItxtNriStatus().getText(), modNRIstud.getNRItextAreaAddress().getText(),
									modenroll.getEDAdmissionStatus());
							
							toexcel.docCHEMNRI(checkdocschemnri, modNRIacademic.getNADtxt12thRollNumberunique().getText(), modpersonal.getPDtxtFirstName().getText(), modpersonal.getPDtxtLastName().getText(), 
												modenroll.getEDchckbxLastEducationalCertificate(), modenroll.getEDchckbxMigrationCertificate(), modenroll.getEDchckbxCopyOfPassport(), modenroll.getEDchckbxPassportSize());
						
							
							menu.setVisible(true);
							modenroll.setVisible(false);
							
							modpersonal.clear();
							modguard.clear();
							modNRIspons.clear();
							modenroll.clearcheckbox();
							modNRIstud.clear();
							modboard_jee.clear();
						}
						
						else if(searchmodmain.getSearchrdbtnNRISponsored().isSelected())
						{
							toexcel.modstoreCHEMNRISPON(rownumchemnrisp, modpersonal.getPDtxtFirstName().getText(), modpersonal.getPDtxtMiddleName().getText(), modpersonal.getPDtxtLastName().getText(), modpersonal.getPDgender(), modpersonal.getPDtxtDisability().getText(), modpersonal.getPDtxtAddL1().getText(), modpersonal.getPDtxtState().getText(), modpersonal.getPDtxtCity().getText(), modpersonal.getPDtxtPincode().getText(), modpersonal.getPDtxtPrimaryContact().getText(), modpersonal.getPDtxtSecondaryContact().getText(), modpersonal.getPDtxtEmailId().getText(), modpersonal.getPDCategory(), modpersonal.getPDDOB(), 
									modguard.getGDtxtFatherName().getText(), modguard.getGDtxtFatherContact().getText(), modguard.getGDtxtFatherQualification().getText(), modguard.getGDtxtFatherOccupation().getText(), modguard.getGDcmbFatherIncome(), modguard.getGDtxtFatherEmail().getText(), modguard.getGDtxtMotherName().getText(), modguard.getGDtxtMotherContact().getText(), modguard.getGDtxtMotherQualification().getText(), modguard.getGDtxtMotherOccupation().getText(), modguard.getGDcmbMotherIncome(), 
									modboard_jee.getADcmb10passing(), modboard_jee.getADcmb12passing(), modboard_jee.getADtxtBoardRollNum12th().getText(), modboard_jee.getADcmbschlbrd(), modboard_jee.getADtxtSchoolName().getText(), modboard_jee.getADtxtOverallPercentage12th().getText(), modboard_jee.getADtxtPCMPercentage12th().getText(), modboard_jee.getADtxtPCMPercentile12th().getText(), modboard_jee.getADtxtJEEScore().getText(), modboard_jee.getADtxtJEEPercentile().getText() ,modboard_jee.getADtxtJEERollNumber().getText(), Integer.parseInt(modboard_jee.getADtxtAcpcRank().getText()),
									modNRIspons.getNRIStxtname().getText(), modNRIspons.getNRISGender(), modNRIspons.getNRIStxtNationality().getText(), modNRIspons.getNRIStxtStatus().getText(), modNRIspons.getNRIStxtRelation().getText(), modNRIspons.getNRIStxtContact().getText(), modNRIspons.getNRIStextAreaAddress().getText(),
									modenroll.getEDAdmissionStatus());
							
							toexcel.docCHEMNRISPON(checkdocschemnrisp, modboard_jee.getADtxtJEERollNumber().getText(), modpersonal.getPDtxtFirstName().getText(), modpersonal.getPDtxtLastName().getText(), 
													modenroll.getEDchckbx10Marksheet(), modenroll.getEDchckbx12Marksheet(), modenroll.getEDchckbxJeeMarksheet(), modenroll.getEDchckbxSchoolLeavingCertificate(), modenroll.getEDchckbxMeritRankReciepts(), modenroll.getEDchckbx20000Receipts(), modenroll.getEDchckbxAllotmentLetter(), modenroll.getEDchckbxPassportSize(), modenroll.getEDchckbxAffidavit(), modenroll.getEDchckbxCopyOfPassport(), modenroll.getEDchckbxNriProofCertificate());
							
							
							
							
							menu.setVisible(true);
							modenroll.setVisible(false);
							
							modpersonal.clear();
							modguard.clear();
							modNRIspons.clear();
							modenroll.clearcheckbox();
							modNRIstud.clear();
							modboard_jee.clear();
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
		
		
		

	}

}
