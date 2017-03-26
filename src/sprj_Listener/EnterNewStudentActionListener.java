package sprj_Listener;

import sprj_GUI.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import sprj_DataStorage.ExcelStorage;

public class EnterNewStudentActionListener implements ActionListener
{
	ExcelStorage toexcel = new ExcelStorage();
	
	private PersonalDetails_GUI person;
	private UnconfirmedAdmissionDetails_GUI unconfirm;
	private NRIStudent_GUI NRIstud;
	private NRISponsoredDetails_GUI NRIspons;
	private GuardianDetails_GUI guard;
	private Board_JEE_GUI board_jee;
	private SearchModify_GUI searchmod;
	private AdmissionType_GUI admiss;
	private EnrollmentDetails_GUI enroll;
	private Menu_GUI menu;
	private Error_GUI error;
	private JEE_RollNo_GUI searchjee;
	private NRI_AcademicDetails_GUI NRIacademic;
	
	int rowict,  rowchem, rowmech;
	
	public EnterNewStudentActionListener(Menu_GUI men, PersonalDetails_GUI pers, UnconfirmedAdmissionDetails_GUI unc, JEE_RollNo_GUI sjee, GuardianDetails_GUI grd, AdmissionType_GUI adm, Board_JEE_GUI bj, NRISponsoredDetails_GUI nrisp, NRIStudent_GUI nris, NRI_AcademicDetails_GUI NRIaca ,EnrollmentDetails_GUI en, SearchModify_GUI searm, Error_GUI er)
	{
		person = pers;
		unconfirm = unc;
		guard = grd;
		admiss = adm;
		board_jee =bj;
		NRIspons = nrisp;
		NRIstud = nris;
		NRIacademic = NRIaca;
		enroll = en;
		menu = men;
		error= er;
		searchmod = searm;
		searchjee = sjee;
	}
	
	public void actionPerformed(ActionEvent event)
	{
		
		if(event.getSource().equals(error.getErrorbtnOk()))
		{
			error.dispose();
		}
		
		if(event.getSource().equals(admiss.getATbtnNext()))
		{
			board_jee.getADtxtJEERollNumber().setEditable(true);
			board_jee.getADtxtJEERollNumber().setText("");
			
			
			if(admiss.getATrbtnACPC().isSelected())
			{
				searchjee.setVisible(true);
				admiss.setVisible(false);
			}
			
			else if(admiss.getATrbtnNRISponsored().isSelected())
			{
				//searchjee.setVisible(true);
				person.setVisible(true);
				admiss.setVisible(false);
				person.getPDtxtFirstName().requestFocusInWindow();
			}
			
			else if(admiss.getATrbtnNRI().isSelected())
			{
				person.setVisible(true);
				admiss.setVisible(false);
				person.getPDtxtFirstName().requestFocusInWindow();
			}
			
			else
			{
				error.displayerror();
				//admiss.setVisible(false);				
			}
			
			
				
		}
		
		else if(event.getSource().equals(admiss.getATbtnBackMainMenu()))
		{
			admiss.setVisible(false);
			menu.setVisible(true);
		}
		
		
		else if(event.getSource().equals(unconfirm.getUADbtnBackMainFrame()))
		{
			menu.setVisible(true);
			unconfirm.setVisible(false);
			unconfirm.clear();
		}
		
		else if(event.getSource().equals(searchjee.getBtnJEEroll()))
		{
			
			int rowict1, rowmech1, rowchem1;
			try
			{
				rowict = toexcel.ICTjeerollnumcheck(searchjee.getTxtEnterJEEroll().getText());
				rowmech = toexcel.MECHjeerollnumcheck(searchjee.getTxtEnterJEEroll().getText());
				rowchem = toexcel.CHEMjeerollnumcheck(searchjee.getTxtEnterJEEroll().getText());
				
				rowict1 = toexcel.unICTjeerollnumcheck(searchjee.getTxtEnterJEEroll().getText());
				rowmech1 = toexcel.unMECHjeerollnumcheck(searchjee.getTxtEnterJEEroll().getText());
				rowchem1 = toexcel.unCHEMjeerollnumcheck(searchjee.getTxtEnterJEEroll().getText());
				
				if(searchjee.getTxtEnterJEEroll().getText().isEmpty())
				{
					error.displayerror();
				}
				
				else if(rowict == -1 && rowmech == -1 && rowchem == -1)
				{
					error.setlblerror("STUDENT DOESN'T EXIST");
					//System.out.println("HERE");
					error.setVisible(true);
				}
				
				
				
				/*System.out.println(rowict + "ict\n");
				System.out.println(rowmech + "mech\n");
				System.out.println(rowchem + "chem\n");
				*/
				else if(rowict1 == -2 || rowmech1 == -2 || rowchem1 == -2)
				{
					error.setlblerror("STUDENT'S ADMISSION ALREADY CONFIRMED");
					
					error.setVisible(true);
				}
				
				else
				{
					person.setVisible(true);
					searchjee.setVisible(false);
					//searchjee.clear();
					person.getPDtxtFirstName().requestFocusInWindow();
					if(admiss.getATrbtnACPC().isSelected())
					{
						//board_jee.setVisible(true);
					
						board_jee.getADtxtJEERollNumber().setText((searchjee.getTxtEnterJEEroll().getText()));
						board_jee.getADtxtJEERollNumber().setEditable(false);
						//board_jee.setEnabled(false);
						//guard.setVisible(false);
					}
					
					
					else if(admiss.getATrbtnNRISponsored().isSelected())
					{
						//System.out.println("here");
						board_jee.getADtxtJEERollNumber().setEditable(true);
						board_jee.getADtxtJEERollNumber().setText("");
						//board_jee.setVisible(true);
						//guard.setVisible(false);
					}
					
					else if(admiss.getATrbtnNRI().isSelected())
					{
						//NRIacademic.setVisible(true);
						//guard.setVisible(false);
					}
				}
			}
			
			catch(Exception err)
			{
				error.setlblerror(err.getLocalizedMessage());
				error.setVisible(true);
			}
			
			
			
		}
		
		else if(event.getSource().equals(searchjee.getbtnJEEback()))
		{
			admiss.setVisible(true);
			searchjee.setVisible(false);
		}
		
		////////////////////////////////////////////////////////////////////	
		else if(event.getSource().equals(person.getPDbtnNext()))
		{
			if(person.PDgetTextEmpty())
			{
				error.displayerror();
				
			}
			
			else
			{
				guard.setVisible(true);
				person.setVisible(false);
				guard.getGDtxtFatherName().requestFocusInWindow();
				//menu.setVisible(false);
			}
		}
		
		else if(event.getSource().equals(person.getPDbtnBack()))
		{
			
			if(admiss.getATrbtnACPC().isSelected())
			{
				searchjee.setVisible(true);
				
				person.setVisible(false);
			}
				
			
			else
			{	
				person.setVisible(false);
				admiss.setVisible(true);
			}
			
			
		}
		
		else if(event.getSource().equals(guard.getBtnNext()))
		{
			if(guard.GDgetTextEmpty())
			{
				error.displayerror();
			}
			
			else
			{
				if(admiss.getATrbtnACPC().isSelected())
				{
					guard.setVisible(false);
					board_jee.setVisible(true);
					board_jee.getADtxtOverallPercentage12th().requestFocusInWindow();
				}
				
				else if(admiss.getATrbtnNRISponsored().isSelected())
				{
					guard.setVisible(false);
					board_jee.setVisible(true);
					board_jee.getADtxtOverallPercentage12th().requestFocusInWindow();
				}
				
				else if(admiss.getATrbtnNRI().isSelected())
				{
					guard.setVisible(false);
					NRIacademic.setVisible(true);
					NRIacademic.getNADtxt12thRollNumberunique().requestFocusInWindow();
				}
				
				else
					error.setVisible(true);
				
			}
			
		}
		
		else if(event.getSource().equals(guard.getBtnBackPersonalDetails()))
		{
			person.setVisible(true);
			guard.setVisible(false);
		}
		
		/*else if(event.getSource().equals(admiss.getATbtnNextacademicDetails()))
		{
			if(admiss.getATrbtnACPC().isSelected())
			{
				admiss.setVisible(false);
				board_jee.setVisible(true);
			}
			
			else if(admiss.getATrbtnNRISponsored().isSelected())
			{
				admiss.setVisible(false);
				board_jee.setVisible(true);
			}
			
			else if(admiss.getATrbtnNRI().isSelected())
			{
				admiss.setVisible(false);
				NRIstud.setVisible(true);
			}
			
			else
				error.displayerror();
			
		}*/
		
		else if(event.getSource().equals(NRIspons.getBtnBackAD()))
		{
		
			board_jee.setVisible(true);
			NRIspons.setVisible(false);
		}
		
		else if(event.getSource().equals(NRIacademic.getNADbtnNextNRIStudentDetails()))
		{
			if(NRIacademic.getNRIacadTextEmpty())
				error.displayerror();
			
			else
			{
				NRIstud.setVisible(true);
				NRIacademic.setVisible(false);
				NRIstud.getNRItxtNationality().requestFocusInWindow();
			}
		}
		
		else if(event.getSource().equals(NRIacademic.getNADbtnBackGuardianDetails()))
		{
			guard.setVisible(true);
			NRIacademic.setVisible(false);
		}
		
		else if(event.getSource().equals(NRIstud.getBtnBackAcademicDetails()))
		{
			NRIacademic.setVisible(true);
			NRIstud.setVisible(false);
		}
		
		else if(event.getSource().equals(NRIstud.getBtnNextEnrollmentDetails()))
		{
			if(NRIstud.NRIStudgetTextEmpty())
				error.displayerror();
			
			else
			{
				
				
				enroll.setEnabledAll();
				NRIstud.setVisible(false);
				enroll.setVisible(true);
				
				
				enroll.getJEDchckbxAffidavit().setSelected(false);
				enroll.getJEDchckbxAffidavit().setEnabled(false);
				
				enroll.getJEDchckbxNriProofCertificate().setSelected(false);
				enroll.getJEDchckbxNriProofCertificate().setEnabled(false);
				
				enroll.getJEDchckbx12Marksheet().setSelected(false);
				enroll.getJEDchckbx12Marksheet().setEnabled(false);
				
				enroll.getJEDchckbx10Marksheet().setSelected(false);
				enroll.getJEDchckbx10Marksheet().setEnabled(false);
				
				enroll.getJEDchckbxJeeMarksheet().setSelected(false);
				enroll.getJEDchckbxJeeMarksheet().setEnabled(false);
				
				enroll.getJEDchckbxSchoolLeavingCertificate().setSelected(false);
				enroll.getJEDchckbxSchoolLeavingCertificate().setEnabled(false);
				
				enroll.getJEDchckbxMeritRankReciepts().setSelected(false);
				enroll.getJEDchckbxMeritRankReciepts().setEnabled(false);
				
				enroll.getJEDchckbx20000Receipts().setSelected(false);
				enroll.getJEDchckbx20000Receipts().setEnabled(false);
				
				enroll.getJEDchckbxAllotmentLetter().setSelected(false);
				enroll.getJEDchckbxAllotmentLetter().setEnabled(false);

			}
		}
		
		
		
		else if(event.getSource().equals(board_jee.getADbtnNextEnrollmentDetails()))
		{
			
			if(board_jee.ADgetTextEmpty())
				error.displayerror();
			
			else
			{
			
				int isNum=0;
				
				for(int i  = 0; i <board_jee.getADtxtAcpcRank().getText().length();i++)
				{
					if(Character.isDigit(board_jee.getADtxtAcpcRank().getText().charAt(i)))
					{
						isNum++;
					}
					
					else
						break;
				}
				
				//System.out.println(isNum);
				
				if(isNum!=(board_jee.getADtxtAcpcRank().getText().length()))
				{
					error.setlblerror("ACPC RANK MUST BE NUMERIC!");
					error.setVisible(true);
				}
					
				
				else
				{					
					if(admiss.getATrbtnACPC().isSelected())
					{
						
						try
						{
							int rowictacpc = toexcel.ICTjeerollnumcheck(board_jee.getADtxtJEERollNumber().getText());
							int rowmechacpc = toexcel.MECHjeerollnumcheck(board_jee.getADtxtJEERollNumber().getText());
							int rowchemacpc = toexcel.CHEMjeerollnumcheck(board_jee.getADtxtJEERollNumber().getText());

							if(rowictacpc != -1)
							{
								enroll.setEDcmbBranch("ICT");
							}
							
							else if(rowmechacpc != -1)
							{
								enroll.setEDcmbBranch("MECH");
							}
							
							else if(rowchemacpc != -1)
							{
								enroll.setEDcmbBranch("CHEM");
							}
						}
						
						catch(Exception err)
						{}
						
						enroll.setEnabledAll();
						
						
						board_jee.setVisible(false);
						enroll.setVisible(true);
						
						enroll.getJEDchckbxAffidavit().setSelected(false);
						enroll.getJEDchckbxAffidavit().setEnabled(false);
						
						enroll.getJEDchckbxCopyOfPassport().setSelected(false);
						enroll.getJEDchckbxCopyOfPassport().setEnabled(false);
						
						enroll.getJEDchckbxNriProofCertificate().setSelected(false);
						enroll.getJEDchckbxNriProofCertificate().setEnabled(false);
						
						enroll.getJEDchckbxLastEducationalCertificate().setSelected(false);
						enroll.getJEDchckbxLastEducationalCertificate().setEnabled(false);
						
						enroll.getJEDchckbxMigrationCertificate().setSelected(false);
						enroll.getJEDchckbxMigrationCertificate().setEnabled(false);
						
					}
					
					if(admiss.getATrbtnNRISponsored().isSelected())
					{
						
						NRIspons.setVisible(true);
						board_jee.setVisible(false);
						NRIspons.getNRIStxtname().requestFocusInWindow();
					}
				}
			
			}
			
		}
		
		else if(event.getSource().equals(board_jee.getADbtnBackGardianDetails()))
		{
			guard.setVisible(true);
			board_jee.setVisible(false);
		}
		
		else if(event.getSource().equals(NRIspons.getBtnNextenrollmentDetails()))
		{
			if(NRIspons.NRISpongetTextEmpty())
				error.displayerror();
		
			else
			{	
				
				enroll.setEnabledAll();
			
				enroll.getJEDchckbxLastEducationalCertificate().setSelected(false);
				enroll.getJEDchckbxLastEducationalCertificate().setEnabled(false);
				
				enroll.getJEDchckbxMigrationCertificate().setSelected(false);
				enroll.getJEDchckbxMigrationCertificate().setEnabled(false);
				//enroll.setEDchckbxLastEducationalCertificate();
				NRIspons.setVisible(false);
				enroll.setVisible(true);
			}
		}
	
	
		
		else if(event.getSource().equals(enroll.getEDbtnBack()))
		{
			if(admiss.getATrbtnACPC().isSelected())
			{
				board_jee.setVisible(true);
				enroll.setVisible(false);
			}
			
			if(admiss.getATrbtnNRISponsored().isSelected())
			{
				NRIspons.setVisible(true);
				enroll.setVisible(false);
			}
			
			if(admiss.getATrbtnNRI().isSelected())
			{
				NRIstud.setVisible(true);
				enroll.setVisible(false);
			}
		
		}
		
		else if(event.getSource().equals(enroll.getEDbtnSubmit()))
		{
			
			if(enroll.EDgetTextEmpty())
				error.displayerror();
			
			else
			{
				if(admiss.getATrbtnACPC().isSelected())
				{
					if(enroll.getEDBranch().equals("ICT"))
					{
						try
						{
							int rownum = toexcel.ICTjeerollnumcheck(searchjee.getTxtEnterJEEroll().getText());
							
							//System.out.println(searchjee.getTxtEnterJEEroll().getText());
							
							//System.out.println(rownum);
							
							if(rownum == -1)
							{
								error.setlblerror("STUDENT DOESN'T EXIST IN ICT ACPC DATABASE");
								error.setVisible(true);
							}
							
							else if(rownum == -2)
							{
								error.setlblerror("STUDENT ADMISSION ALREADY CONFIRMED");
								error.setVisible(true);
							}
								
							
							else
							{
								toexcel.ICTACPCEnterData(rownum, person.getPDtxtFirstName().getText(), person.getPDtxtMiddleName().getText(), person.getPDtxtLastName().getText(), person.getPDgender(), person.getPDtxtDisability().getText(), person.getPDtxtAddL1().getText(), person.getPDtxtState().getText(), person.getPDtxtCity().getText(), person.getPDtxtPincode().getText(), person.getPDtxtPrimaryContact().getText(), person.getPDtxtSecondaryContact().getText(), person.getPDtxtEmailId().getText(), person.getPDCategory(), person.getPDDOB(), 
													guard.getGDtxtFatherName().getText(), guard.getGDtxtFatherContact().getText(), guard.getGDtxtFatherQualification().getText(), guard.getGDtxtFatherOccupation().getText(), guard.getGDcmbFatherIncome(), guard.getGDtxtFatherEmail().getText(), guard.getGDtxtMotherName().getText(), guard.getGDtxtMotherContact().getText(), guard.getGDtxtMotherQualification().getText(), guard.getGDtxtMotherOccupation().getText(), guard.getGDcmbMotherIncome(), 
													admiss.getATAdmType(),
													board_jee.getADcmb10passing(), board_jee.getADcmb12passing(), board_jee.getADtxtBoardRollNum12th().getText(), board_jee.getADcmbschlbrd(), board_jee.getADtxtSchoolName().getText(), board_jee.getADtxtOverallPercentage12th().getText(), board_jee.getADtxtPCMPercentage12th().getText(), board_jee.getADtxtPCMPercentile12th().getText(), board_jee.getADtxtJEEScore().getText(), board_jee.getADtxtJEEPercentile().getText() ,board_jee.getADtxtJEERollNumber().getText(), Integer.parseInt(board_jee.getADtxtAcpcRank().getText()), 
													enroll.getEDBranch(), "CONFIRM", enroll.getEDcmbyearjoin());
								
								
								toexcel.docICTACPC(searchjee.getTxtEnterJEEroll().getText(), person.getPDtxtFirstName().getText(), person.getPDtxtLastName().getText(), enroll.getEDchckbx10Marksheet(), enroll.getEDchckbx12Marksheet(), 
												enroll.getEDchckbxJeeMarksheet(), enroll.getEDchckbxSchoolLeavingCertificate(), enroll.getEDchckbxMeritRankReciepts(), enroll.getEDchckbx20000Receipts(), enroll.getEDchckbxAllotmentLetter(), enroll.getEDchckbxPassportSize());
								
								
								menu.setVisible(true);
								enroll.setVisible(false);
								
								person.clear();
								guard.clear();
								NRIspons.clear();
								NRIstud.clear();
								admiss.clear();
								board_jee.clear();
								enroll.clear();
								enroll.clearcheckbox();
								searchjee.clear();
						
							}
						
						}
						
						catch(Exception err)
						{
							error.setlblerror(err.getLocalizedMessage());
							error.setVisible(true);
						}
					}
					else if(enroll.getEDBranch().equals("MECH"))
					{
						try
						{
							
							int rownum = toexcel.MECHjeerollnumcheck(searchjee.getTxtEnterJEEroll().getText());
							//System.out.println("here");
							
							if(rownum == -1)
							{
								error.setlblerror("STUDENT DOESN'T EXIST IN MECH ACPC DATABASE");
								error.setVisible(true);
							}
							
							else if(rownum == -2)
							{
								error.setlblerror("STUDENT ADMISSION ALREADY CONFIRMED");
								error.setVisible(true);
							}
							else
							{	
								toexcel.MECHACPCEnterData(rownum, person.getPDtxtFirstName().getText(), person.getPDtxtMiddleName().getText(), person.getPDtxtLastName().getText(), person.getPDgender(), person.getPDtxtDisability().getText(), person.getPDtxtAddL1().getText(), person.getPDtxtState().getText(), person.getPDtxtCity().getText(), person.getPDtxtPincode().getText(), person.getPDtxtPrimaryContact().getText(), person.getPDtxtSecondaryContact().getText(), person.getPDtxtEmailId().getText(), person.getPDCategory(), person.getPDDOB(), 
									guard.getGDtxtFatherName().getText(), guard.getGDtxtFatherContact().getText(), guard.getGDtxtFatherQualification().getText(), guard.getGDtxtFatherOccupation().getText(), guard.getGDcmbFatherIncome(), guard.getGDtxtFatherEmail().getText(), guard.getGDtxtMotherName().getText(), guard.getGDtxtMotherContact().getText(), guard.getGDtxtMotherQualification().getText(), guard.getGDtxtMotherOccupation().getText(), guard.getGDcmbMotherIncome(), 
									admiss.getATAdmType(),
									board_jee.getADcmb10passing(), board_jee.getADcmb12passing(), board_jee.getADtxtBoardRollNum12th().getText(), board_jee.getADcmbschlbrd(), board_jee.getADtxtSchoolName().getText(), board_jee.getADtxtOverallPercentage12th().getText(), board_jee.getADtxtPCMPercentage12th().getText(), board_jee.getADtxtPCMPercentile12th().getText(), board_jee.getADtxtJEEScore().getText(), board_jee.getADtxtJEEPercentile().getText() ,board_jee.getADtxtJEERollNumber().getText(), Integer.parseInt(board_jee.getADtxtAcpcRank().getText()), 
									enroll.getEDBranch(), "CONFIRM", enroll.getEDcmbyearjoin());
								
								toexcel.docMECHACPC(searchjee.getTxtEnterJEEroll().getText(), person.getPDtxtFirstName().getText(), person.getPDtxtLastName().getText(), enroll.getEDchckbx10Marksheet(), enroll.getEDchckbx12Marksheet(), 
										enroll.getEDchckbxJeeMarksheet(), enroll.getEDchckbxSchoolLeavingCertificate(), enroll.getEDchckbxMeritRankReciepts(), enroll.getEDchckbx20000Receipts(), enroll.getEDchckbxAllotmentLetter(), enroll.getEDchckbxPassportSize());
								
								menu.setVisible(true);
								enroll.setVisible(false);
								
								person.clear();
								guard.clear();
								NRIspons.clear();
								NRIstud.clear();
								admiss.clear();
								board_jee.clear();
								enroll.clear();
								enroll.clearcheckbox();
								searchjee.clear();
		
						
							}
						}
						
						catch(Exception err)
						{
							error.setlblerror(err.getLocalizedMessage());
							error.setVisible(true);
						}
					}
						
					else if(enroll.getEDBranch().equals("CHEM"))
					{
						try
						{
							int rownum = toexcel.CHEMjeerollnumcheck(searchjee.getTxtEnterJEEroll().getText());
							
							//System.out.println("Rownum" + rownum);
							//System.out.println(searchjee.getTxtEnterJEEroll().getText());
							
							if(rownum == -1)
							{
								error.setlblerror("STUDENT DOESN'T EXIST IN CHEM ACPC DATABASE");
								error.setVisible(true);
							}
							
							else if(rownum == -2)
							{
								error.setlblerror("STUDENT ADMISSION ALREADY CONFIRMED");
								error.setVisible(true);
							}
							else
							{
								
								toexcel.CHEMACPCEnterData(rownum, person.getPDtxtFirstName().getText(), person.getPDtxtMiddleName().getText(), person.getPDtxtLastName().getText(), person.getPDgender(), person.getPDtxtDisability().getText(), person.getPDtxtAddL1().getText(), person.getPDtxtState().getText(), person.getPDtxtCity().getText(), person.getPDtxtPincode().getText(), person.getPDtxtPrimaryContact().getText(), person.getPDtxtSecondaryContact().getText(), person.getPDtxtEmailId().getText(), person.getPDCategory(), person.getPDDOB(), 
									guard.getGDtxtFatherName().getText(), guard.getGDtxtFatherContact().getText(), guard.getGDtxtFatherQualification().getText(), guard.getGDtxtFatherOccupation().getText(), guard.getGDcmbFatherIncome(), guard.getGDtxtFatherEmail().getText(), guard.getGDtxtMotherName().getText(), guard.getGDtxtMotherContact().getText(), guard.getGDtxtMotherQualification().getText(), guard.getGDtxtMotherOccupation().getText(), guard.getGDcmbMotherIncome(), 
									admiss.getATAdmType(),
									board_jee.getADcmb10passing(), board_jee.getADcmb12passing(), board_jee.getADtxtBoardRollNum12th().getText(), board_jee.getADcmbschlbrd(), board_jee.getADtxtSchoolName().getText(), board_jee.getADtxtOverallPercentage12th().getText(), board_jee.getADtxtPCMPercentage12th().getText(), board_jee.getADtxtPCMPercentile12th().getText(), board_jee.getADtxtJEEScore().getText(), board_jee.getADtxtJEEPercentile().getText() ,board_jee.getADtxtJEERollNumber().getText(), Integer.parseInt(board_jee.getADtxtAcpcRank().getText()), 
									enroll.getEDBranch(), "CONFIRM", enroll.getEDcmbyearjoin());
								
								toexcel.docCHEMACPC(searchjee.getTxtEnterJEEroll().getText(), person.getPDtxtFirstName().getText(), person.getPDtxtLastName().getText(), enroll.getEDchckbx10Marksheet(), enroll.getEDchckbx12Marksheet(), 
										enroll.getEDchckbxJeeMarksheet(), enroll.getEDchckbxSchoolLeavingCertificate(), enroll.getEDchckbxMeritRankReciepts(), enroll.getEDchckbx20000Receipts(), enroll.getEDchckbxAllotmentLetter(), enroll.getEDchckbxPassportSize());
								
								menu.setVisible(true);
								enroll.setVisible(false);
								
								person.clear();
								guard.clear();
								NRIspons.clear();
								NRIstud.clear();
								admiss.clear();
								board_jee.clear();
								enroll.clear();
								enroll.clearcheckbox();
								searchjee.clear();
						
							}
						}
						
						catch(Exception err)
						{
							error.setlblerror(err.getLocalizedMessage());
							error.setVisible(true);
						}
					}			
				
				}
				
				else if(admiss.getATrbtnNRI().isSelected())
				{
					if(enroll.getEDBranch().equals("ICT"))
					{
						try
						{
							
							int rowictnri = toexcel.ICTnristudrollcheck(NRIacademic.getNADtxt12thRollNumberunique().getText());
							
							if(rowictnri != -1)
							{
								error.setlblerror("STUDENT EXISTS IN ICT NRI DATABASE");
								error.setVisible(true);
							}
							
							else
							{
								toexcel.ICTNRIEnterData(person.getPDtxtFirstName().getText(), person.getPDtxtMiddleName().getText(), person.getPDtxtLastName().getText(), person.getPDgender(), person.getPDtxtDisability().getText(), person.getPDtxtAddL1().getText(), person.getPDtxtState().getText(), person.getPDtxtCity().getText(), person.getPDtxtPincode().getText(), person.getPDtxtPrimaryContact().getText(), person.getPDtxtSecondaryContact().getText(), person.getPDtxtEmailId().getText(), person.getPDCategory(), person.getPDDOB(), 
										guard.getGDtxtFatherName().getText(), guard.getGDtxtFatherContact().getText(), guard.getGDtxtFatherQualification().getText(), guard.getGDtxtFatherOccupation().getText(), guard.getGDcmbFatherIncome(), guard.getGDtxtFatherEmail().getText(), guard.getGDtxtMotherName().getText(), guard.getGDtxtMotherContact().getText(), guard.getGDtxtMotherQualification().getText(), guard.getGDtxtMotherOccupation().getText(), guard.getGDcmbMotherIncome(), 
										NRIacademic.getNADtxt12thRollNumberunique().getText(), NRIacademic.getNADtxtOverallGrade().getText(),
										NRIstud.getNRItxtNationality().getText(), NRIstud.getNRItxtNriStatus().getText(), NRIstud.getNRItextAreaAddress().getText(),
										enroll.getEDBranch(), "CONFIRM", enroll.getEDcmbyearjoin());
								
								toexcel.docICTNRI(NRIacademic.getNADtxt12thRollNumberunique().getText(), person.getPDtxtFirstName().getText(), person.getPDtxtLastName().getText(), 
										enroll.getEDchckbxLastEducationalCertificate(), enroll.getEDchckbxMigrationCertificate(), enroll.getEDchckbxCopyOfPassport(), enroll.getEDchckbxPassportSize());
								
								menu.setVisible(true);
								enroll.setVisible(false);
								
								person.clear();
								guard.clear();
								NRIspons.clear();
								NRIstud.clear();
								NRIacademic.clear();
								admiss.clear();
								board_jee.clear();
								enroll.clear();
								enroll.clearcheckbox();
								searchjee.clear();
							}
						}
						
						catch(Exception err)
						{
							error.setlblerror(err.getLocalizedMessage());
							error.setVisible(true);
						}
					}
					
					else if(enroll.getEDBranch().equals("MECH"))
					{
						try
						{
							int rowmechnri = toexcel.MECHnristudrollcheck(NRIacademic.getNADtxt12thRollNumberunique().getText());
							
							if(rowmechnri != -1)
							{
								error.setlblerror("STUDENT EXISTS IN ICT NRI DATABASE");
								error.setVisible(true);
							}
							else
							{								
								toexcel.MECHNRIEnterData(person.getPDtxtFirstName().getText(), person.getPDtxtMiddleName().getText(), person.getPDtxtLastName().getText(), person.getPDgender(), person.getPDtxtDisability().getText(), person.getPDtxtAddL1().getText(), person.getPDtxtState().getText(), person.getPDtxtCity().getText(), person.getPDtxtPincode().getText(), person.getPDtxtPrimaryContact().getText(), person.getPDtxtSecondaryContact().getText(), person.getPDtxtEmailId().getText(), person.getPDCategory(), person.getPDDOB(), 
										guard.getGDtxtFatherName().getText(), guard.getGDtxtFatherContact().getText(), guard.getGDtxtFatherQualification().getText(), guard.getGDtxtFatherOccupation().getText(), guard.getGDcmbFatherIncome(), guard.getGDtxtFatherEmail().getText(), guard.getGDtxtMotherName().getText(), guard.getGDtxtMotherContact().getText(), guard.getGDtxtMotherQualification().getText(), guard.getGDtxtMotherOccupation().getText(), guard.getGDcmbMotherIncome(), 
										NRIacademic.getNADtxt12thRollNumberunique().getText(), NRIacademic.getNADtxtOverallGrade().getText(),
										NRIstud.getNRItxtNationality().getText(), NRIstud.getNRItxtNriStatus().getText(), NRIstud.getNRItextAreaAddress().getText(),
										enroll.getEDBranch(), "CONFIRM", enroll.getEDcmbyearjoin());
								
								toexcel.docMECHNRI(NRIacademic.getNADtxt12thRollNumberunique().getText(), person.getPDtxtFirstName().getText(), person.getPDtxtLastName().getText(), 
										enroll.getEDchckbxLastEducationalCertificate(), enroll.getEDchckbxMigrationCertificate(), enroll.getEDchckbxCopyOfPassport(), enroll.getEDchckbxPassportSize());
								
								menu.setVisible(true);
								enroll.setVisible(false);
								
								person.clear();
								guard.clear();
								NRIspons.clear();
								NRIstud.clear();
								NRIacademic.clear();
								admiss.clear();
								board_jee.clear();
								enroll.clear();
								enroll.clearcheckbox();
								searchjee.clear();
						
							}
						}
						
						catch(Exception err)
						{
							error.setlblerror(err.getLocalizedMessage());
							error.setVisible(true);
						}
					}
					
					else if(enroll.getEDBranch().equals("CHEM"))
					{
						try
						{
							int rowchemnri = toexcel.CHEMnristudrollcheck(NRIacademic.getNADtxt12thRollNumberunique().getText());
							
							if(rowchemnri != -1)
							{
								error.setlblerror("STUDENT EXISTS IN ICT NRI DATABASE");
								error.setVisible(true);
							}
							else
							{
								toexcel.CHEMNRIEnterData(person.getPDtxtFirstName().getText(), person.getPDtxtMiddleName().getText(), person.getPDtxtLastName().getText(), person.getPDgender(), person.getPDtxtDisability().getText(), person.getPDtxtAddL1().getText(), person.getPDtxtState().getText(), person.getPDtxtCity().getText(), person.getPDtxtPincode().getText(), person.getPDtxtPrimaryContact().getText(), person.getPDtxtSecondaryContact().getText(), person.getPDtxtEmailId().getText(), person.getPDCategory(), person.getPDDOB(), 
										guard.getGDtxtFatherName().getText(), guard.getGDtxtFatherContact().getText(), guard.getGDtxtFatherQualification().getText(), guard.getGDtxtFatherOccupation().getText(), guard.getGDcmbFatherIncome(), guard.getGDtxtFatherEmail().getText(), guard.getGDtxtMotherName().getText(), guard.getGDtxtMotherContact().getText(), guard.getGDtxtMotherQualification().getText(), guard.getGDtxtMotherOccupation().getText(), guard.getGDcmbMotherIncome(), 
										NRIacademic.getNADtxt12thRollNumberunique().getText(), NRIacademic.getNADtxtOverallGrade().getText(),
										NRIstud.getNRItxtNationality().getText(), NRIstud.getNRItxtNriStatus().getText(), NRIstud.getNRItextAreaAddress().getText(),
										enroll.getEDBranch(), "CONFIRM", enroll.getEDcmbyearjoin());
								
								toexcel.docCHEMNRI(NRIacademic.getNADtxt12thRollNumberunique().getText(), person.getPDtxtFirstName().getText(), person.getPDtxtLastName().getText(), 
										enroll.getEDchckbxLastEducationalCertificate(), enroll.getEDchckbxMigrationCertificate(), enroll.getEDchckbxCopyOfPassport(), enroll.getEDchckbxPassportSize());
								
								menu.setVisible(true);
								enroll.setVisible(false);
								
								person.clear();
								guard.clear();
								NRIspons.clear();
								NRIstud.clear();
								NRIacademic.clear();
								admiss.clear();
								board_jee.clear();
								enroll.clear();
								enroll.clearcheckbox();
								searchjee.clear();
							}
						}
						
						catch(Exception err)
						{
							error.setlblerror(err.getLocalizedMessage());
							error.setVisible(true);
						}
					}
				}
				
				else if(admiss.getATrbtnNRISponsored().isSelected())
				{
					if(enroll.getEDBranch().equals("ICT"))
					{
						try
						{
							int rowictnrisp = toexcel.ICTnrisponjeerollnumcheck(board_jee.getADtxtJEERollNumber().getText());
							
							if(rowictnrisp != -1)
							{
								error.setlblerror("STUDENT EXISTS IN ICT NRI DATABASE");
								error.setVisible(true);
							}
							else
							{
								toexcel.ICTNRISPONEnterData(person.getPDtxtFirstName().getText(), person.getPDtxtMiddleName().getText(), person.getPDtxtLastName().getText(), person.getPDgender(), person.getPDtxtDisability().getText(), person.getPDtxtAddL1().getText(), person.getPDtxtState().getText(), person.getPDtxtCity().getText(), person.getPDtxtPincode().getText(), person.getPDtxtPrimaryContact().getText(), person.getPDtxtSecondaryContact().getText(), person.getPDtxtEmailId().getText(), person.getPDCategory(), person.getPDDOB(), 
										guard.getGDtxtFatherName().getText(), guard.getGDtxtFatherContact().getText(), guard.getGDtxtFatherQualification().getText(), guard.getGDtxtFatherOccupation().getText(), guard.getGDcmbFatherIncome(), guard.getGDtxtFatherEmail().getText(), guard.getGDtxtMotherName().getText(), guard.getGDtxtMotherContact().getText(), guard.getGDtxtMotherQualification().getText(), guard.getGDtxtMotherOccupation().getText(), guard.getGDcmbMotherIncome(), 
										admiss.getATAdmType(),
										board_jee.getADcmb10passing(), board_jee.getADcmb12passing(), board_jee.getADtxtBoardRollNum12th().getText(), board_jee.getADcmbschlbrd(), board_jee.getADtxtSchoolName().getText(), board_jee.getADtxtOverallPercentage12th().getText(), board_jee.getADtxtPCMPercentage12th().getText(), board_jee.getADtxtPCMPercentile12th().getText(), board_jee.getADtxtJEEScore().getText(), board_jee.getADtxtJEEPercentile().getText() ,board_jee.getADtxtJEERollNumber().getText(), Integer.parseInt(board_jee.getADtxtAcpcRank().getText()),
										NRIspons.getNRIStxtname().getText(), NRIspons.getNRISGender(), NRIspons.getNRIStxtNationality().getText(), NRIspons.getNRIStxtStatus().getText(), NRIspons.getNRIStxtRelation().getText(), NRIspons.getNRIStxtContact().getText(), NRIspons.getNRIStextAreaAddress().getText(),
										enroll.getEDBranch(), "CONFIRM", enroll.getEDcmbyearjoin());
								
								toexcel.docICTNRISPON(board_jee.getADtxtJEERollNumber().getText(), person.getPDtxtFirstName().getText(), person.getPDtxtLastName().getText(), 
										enroll.getEDchckbx10Marksheet(), enroll.getEDchckbx12Marksheet(), enroll.getEDchckbxJeeMarksheet(), enroll.getEDchckbxSchoolLeavingCertificate(), enroll.getEDchckbxMeritRankReciepts(), enroll.getEDchckbx20000Receipts(), enroll.getEDchckbxAllotmentLetter(), enroll.getEDchckbxPassportSize(), enroll.getEDchckbxAffidavit(), enroll.getEDchckbxCopyOfPassport(), enroll.getEDchckbxNriProofCertificate());
								
								menu.setVisible(true);
								enroll.setVisible(false);
								
								person.clear();
								guard.clear();
								NRIspons.clear();
								NRIstud.clear();
								admiss.clear();
								board_jee.clear();
								enroll.clear();
								enroll.clearcheckbox();
								searchjee.clear();
							}
						}
						
						catch(Exception err)
						{
							error.setlblerror(err.getLocalizedMessage());
							error.setVisible(true);
						}
					}
					
					else if(enroll.getEDBranch().equals("MECH"))
					{
						try
						{
							int rowmechnrisp = toexcel.MECHnrisponjeerollnumcheck(board_jee.getADtxtJEERollNumber().getText());
							
							if(rowmechnrisp != -1)
							{
								error.setlblerror("STUDENT EXISTS IN ICT NRI DATABASE");
								error.setVisible(true);
							}
							else
							{	
								toexcel.MECHNRISPONEnterData(person.getPDtxtFirstName().getText(), person.getPDtxtMiddleName().getText(), person.getPDtxtLastName().getText(), person.getPDgender(), person.getPDtxtDisability().getText(), person.getPDtxtAddL1().getText(), person.getPDtxtState().getText(), person.getPDtxtCity().getText(), person.getPDtxtPincode().getText(), person.getPDtxtPrimaryContact().getText(), person.getPDtxtSecondaryContact().getText(), person.getPDtxtEmailId().getText(), person.getPDCategory(), person.getPDDOB(), 
										guard.getGDtxtFatherName().getText(), guard.getGDtxtFatherContact().getText(), guard.getGDtxtFatherQualification().getText(), guard.getGDtxtFatherOccupation().getText(), guard.getGDcmbFatherIncome(), guard.getGDtxtFatherEmail().getText(), guard.getGDtxtMotherName().getText(), guard.getGDtxtMotherContact().getText(), guard.getGDtxtMotherQualification().getText(), guard.getGDtxtMotherOccupation().getText(), guard.getGDcmbMotherIncome(), 
										admiss.getATAdmType(),
										board_jee.getADcmb10passing(), board_jee.getADcmb12passing(), board_jee.getADtxtBoardRollNum12th().getText(), board_jee.getADcmbschlbrd(), board_jee.getADtxtSchoolName().getText(), board_jee.getADtxtOverallPercentage12th().getText(), board_jee.getADtxtPCMPercentage12th().getText(), board_jee.getADtxtPCMPercentile12th().getText(), board_jee.getADtxtJEEScore().getText(), board_jee.getADtxtJEEPercentile().getText() ,board_jee.getADtxtJEERollNumber().getText(), Integer.parseInt(board_jee.getADtxtAcpcRank().getText()),
										NRIspons.getNRIStxtname().getText(), NRIspons.getNRISGender(), NRIspons.getNRIStxtNationality().getText(), NRIspons.getNRIStxtStatus().getText(), NRIspons.getNRIStxtRelation().getText(), NRIspons.getNRIStxtContact().getText(), NRIspons.getNRIStextAreaAddress().getText(),
										enroll.getEDBranch(), "CONFIRM", enroll.getEDcmbyearjoin());
								
								toexcel.docMECHNRISPON(board_jee.getADtxtJEERollNumber().getText(), person.getPDtxtFirstName().getText(), person.getPDtxtLastName().getText(), 
										enroll.getEDchckbx10Marksheet(), enroll.getEDchckbx12Marksheet(), enroll.getEDchckbxJeeMarksheet(), enroll.getEDchckbxSchoolLeavingCertificate(), enroll.getEDchckbxMeritRankReciepts(), enroll.getEDchckbx20000Receipts(), enroll.getEDchckbxAllotmentLetter(), enroll.getEDchckbxPassportSize(), enroll.getEDchckbxAffidavit(), enroll.getEDchckbxCopyOfPassport(), enroll.getEDchckbxNriProofCertificate());
								
								menu.setVisible(true);
								enroll.setVisible(false);
								
								person.clear();
								guard.clear();
								NRIspons.clear();
								NRIstud.clear();
								admiss.clear();
								board_jee.clear();
								enroll.clear();
								enroll.clearcheckbox();
								searchjee.clear();
							}
						}
						
						catch(Exception err)
						{
							error.setlblerror(err.getLocalizedMessage());
							error.setVisible(true);
						}
					}
					
					else if(enroll.getEDBranch().equals("CHEM"))
					{
						try
						{
							int rowchemnrisp = toexcel.CHEMnrisponjeerollnumcheck(board_jee.getADtxtJEERollNumber().getText());
							
							if(rowchemnrisp != -1)
							{
								error.setlblerror("STUDENT EXISTS IN ICT NRI DATABASE");
								error.setVisible(true);
							}
							else
							{
								toexcel.CHEMNRISPONEnterData(person.getPDtxtFirstName().getText(), person.getPDtxtMiddleName().getText(), person.getPDtxtLastName().getText(), person.getPDgender(), person.getPDtxtDisability().getText(), person.getPDtxtAddL1().getText(), person.getPDtxtState().getText(), person.getPDtxtCity().getText(), person.getPDtxtPincode().getText(), person.getPDtxtPrimaryContact().getText(), person.getPDtxtSecondaryContact().getText(), person.getPDtxtEmailId().getText(), person.getPDCategory(), person.getPDDOB(), 
										guard.getGDtxtFatherName().getText(), guard.getGDtxtFatherContact().getText(), guard.getGDtxtFatherQualification().getText(), guard.getGDtxtFatherOccupation().getText(), guard.getGDcmbFatherIncome(), guard.getGDtxtFatherEmail().getText(), guard.getGDtxtMotherName().getText(), guard.getGDtxtMotherContact().getText(), guard.getGDtxtMotherQualification().getText(), guard.getGDtxtMotherOccupation().getText(), guard.getGDcmbMotherIncome(), 
										admiss.getATAdmType(),
										board_jee.getADcmb10passing(), board_jee.getADcmb12passing(), board_jee.getADtxtBoardRollNum12th().getText(), board_jee.getADcmbschlbrd(), board_jee.getADtxtSchoolName().getText(), board_jee.getADtxtOverallPercentage12th().getText(), board_jee.getADtxtPCMPercentage12th().getText(), board_jee.getADtxtPCMPercentile12th().getText(), board_jee.getADtxtJEEScore().getText(), board_jee.getADtxtJEEPercentile().getText() ,board_jee.getADtxtJEERollNumber().getText(), Integer.parseInt(board_jee.getADtxtAcpcRank().getText()),
										NRIspons.getNRIStxtname().getText(), NRIspons.getNRISGender(), NRIspons.getNRIStxtNationality().getText(), NRIspons.getNRIStxtStatus().getText(), NRIspons.getNRIStxtRelation().getText(), NRIspons.getNRIStxtContact().getText(), NRIspons.getNRIStextAreaAddress().getText(),
										enroll.getEDBranch(), "CONFIRM", enroll.getEDcmbyearjoin());
								
								toexcel.docCHEMNRISPON(board_jee.getADtxtJEERollNumber().getText(), person.getPDtxtFirstName().getText(), person.getPDtxtLastName().getText(), 
										enroll.getEDchckbx10Marksheet(), enroll.getEDchckbx12Marksheet(), enroll.getEDchckbxJeeMarksheet(), enroll.getEDchckbxSchoolLeavingCertificate(), enroll.getEDchckbxMeritRankReciepts(), enroll.getEDchckbx20000Receipts(), enroll.getEDchckbxAllotmentLetter(), enroll.getEDchckbxPassportSize(), enroll.getEDchckbxAffidavit(), enroll.getEDchckbxCopyOfPassport(), enroll.getEDchckbxNriProofCertificate());
								
								menu.setVisible(true);
								enroll.setVisible(false);
								
								person.clear();
								guard.clear();
								NRIspons.clear();
								NRIstud.clear();
								admiss.clear();
								board_jee.clear();
								enroll.clear();
								enroll.clearcheckbox();
								searchjee.clear();
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
			
			//searchjee.clear();
			
		}

		
		/*if(event.getActionCommand().equals(unconfirm.getUADtxtJeeRollNo().getText()))
		{
			rowict = toexcel.ICTjeerollnumcheck(unconfirm.getUADtxtJeeRollNo().getText());
			rowmech = toexcel.MECHjeerollnumcheck(unconfirm.getUADtxtJeeRollNo().getText());
			rowchem = toexcel.CHEMjeerollnumcheck(unconfirm.getUADtxtJeeRollNo().getText());
			
			if(rowict==-1 || rowmech==-1 || rowchem==-1)
			{
				error.setlblerror("STUDENT ALREADY EXISTS IN DATABASE!");
				error.setVisible(true);
			}
				
			
		}*/
		
		
		
		
		else if(event.getSource().equals(unconfirm.getUADbtnSubmitMainFrame()))
		{			
			searchjee.clear();
			
			
			try
			{
				//System.out.println("HERE");
				rowict = toexcel.unICTjeerollnumcheck(unconfirm.getUADtxtJeeRollNo().getText());
				rowmech = toexcel.unMECHjeerollnumcheck(unconfirm.getUADtxtJeeRollNo().getText());
				rowchem = toexcel.unCHEMjeerollnumcheck(unconfirm.getUADtxtJeeRollNo().getText());
				
				
				int rowict1 = toexcel.ICTjeerollnumcheck(unconfirm.getUADtxtJeeRollNo().getText());
				int rowmech1 = toexcel.MECHjeerollnumcheck(unconfirm.getUADtxtJeeRollNo().getText());
				int rowchem1 = toexcel.CHEMjeerollnumcheck(unconfirm.getUADtxtJeeRollNo().getText());
				//System.out.println(rowict);
				
				//if(rowict == -1 || rowmech == -1 || rowchem == -1)
				//{
					
				if(rowict1 == -2 || rowmech1 == -2 || rowchem1 == -2)
				{
					error.setlblerror("STUDENT ADMISSION ALREADY CONFIRMED");
					error.setVisible(true);
				}
			
				else if(rowict != -1 && unconfirm.getUADcmbbranch().equals("ICT"))
				{
					error.setlblerror("STUDENT ALREADY EXISTS IN ICT!");
					error.setVisible(true);
				}
				
				else if(rowmech != -1 && unconfirm.getUADcmbbranch().equals("MECH"))
				{
					error.setlblerror("STUDENT ALREADY EXISTS IN MECH!");
					error.setVisible(true);
				}
				
				else if(rowchem != -1 && unconfirm.getUADcmbbranch().equals("CHEM"))
				{
					error.setlblerror("STUDENT ALREADY EXISTS IN CHEM!");
					error.setVisible(true);
				}
			//}
			
			
				else if(unconfirm.UADgetTextEmpty())
				{
					error.displayerror();
				}
				
				else
				{
					if(unconfirm.getUADcmbbranch().equals("ICT"))
					{
						try
						{
							int isNum=0;
							
							for(int i  = 0; i <unconfirm.getUADtxtACPCrank().getText().length();i++)
							{
								if(Character.isDigit(unconfirm.getUADtxtACPCrank().getText().charAt(i)))
								{
									isNum++;
								}
								
								else
									break;
							}
							
							//System.out.println(isNum);
							
							if(isNum!=(unconfirm.getUADtxtACPCrank().getText().length()))
							{
								error.setlblerror("ACPC RANK MUST BE NUMERIC!");
								error.setVisible(true);
							}
								
							
							else
							{
								
								toexcel.ICTuncomfirmedadmission(unconfirm.getUADtxtJeeRollNo().getText(), unconfirm.getUADyearjoin(),
														unconfirm.getUADtxtFirstName().getText(), unconfirm.getUADtxtLastName().getText(), unconfirm.getUADgender(), unconfirm.getUADtxtFatherName().getText(), 
														unconfirm.getUADcmbbranch(), unconfirm.getUADcmbcategory(), Integer.parseInt(unconfirm.getUADtxtACPCrank().getText()));
							}							
						}
						catch(Exception err)
						{
							error.setlblerror(err.getLocalizedMessage());
							error.setVisible(true);
						}
						
						
					}
					
					
					else if(unconfirm.getUADcmbbranch().equals("MECH"))
					{
						try
						{
int isNum=0;
							
							for(int i  = 0; i <unconfirm.getUADtxtACPCrank().getText().length();i++)
							{
								if(Character.isDigit(unconfirm.getUADtxtACPCrank().getText().charAt(i)))
								{
									isNum++;
								}
								
								else
									break;
							}
							
							//System.out.println(isNum);
							
							if(isNum!=(unconfirm.getUADtxtACPCrank().getText().length()))
							{
								error.setlblerror("ACPC RANK MUST BE NUMERIC!");
								error.setVisible(true);
							}
								
							
							else
							{
								toexcel.MECHuncomfirmedadmission(unconfirm.getUADtxtJeeRollNo().getText(), unconfirm.getUADyearjoin(),
										unconfirm.getUADtxtFirstName().getText(), unconfirm.getUADtxtLastName().getText(), unconfirm.getUADgender(), unconfirm.getUADtxtFatherName().getText(), 
										unconfirm.getUADcmbbranch(), unconfirm.getUADcmbcategory(), Integer.parseInt(unconfirm.getUADtxtACPCrank().getText()));
							}
						}	
						
						catch(Exception err)
						{
							error.setlblerror(err.getLocalizedMessage());
							error.setVisible(true);
						}
					}
					
					else if(unconfirm.getUADcmbbranch().equals("CHEM"))
					{
						try
						{
							int isNum=0;
							
							for(int i  = 0; i <unconfirm.getUADtxtACPCrank().getText().length();i++)
							{
								if(Character.isDigit(unconfirm.getUADtxtACPCrank().getText().charAt(i)))
								{
									isNum++;
								}
								
								else
									break;
							}
							
							//System.out.println(isNum);
							
							if(isNum!=(unconfirm.getUADtxtACPCrank().getText().length()))
							{
								error.setlblerror("ACPC RANK MUST BE NUMERIC!");
								error.setVisible(true);
							}
								
							
							else
							{
								toexcel.CHEMuncomfirmedadmission(unconfirm.getUADtxtJeeRollNo().getText(), unconfirm.getUADyearjoin(),
										unconfirm.getUADtxtFirstName().getText(), unconfirm.getUADtxtLastName().getText(), unconfirm.getUADgender(), unconfirm.getUADtxtFatherName().getText(), 
										unconfirm.getUADcmbbranch(), unconfirm.getUADcmbcategory(), Integer.parseInt(unconfirm.getUADtxtACPCrank().getText()));
							}	
						
						
						}
						
						catch(Exception err)
						{
							error.setlblerror(err.getLocalizedMessage());
							error.setVisible(true);
						}
					
					
					}
					
					menu.setVisible(true);
					unconfirm.clear();
					unconfirm.setVisible(false);
				}
			}
			catch(Exception err)
			{
				error.setlblerror(err.getLocalizedMessage());
				error.setVisible(true);
			}
			
			
		
			
		}	

		if(event.getSource().equals(person.getPDbtnSearchMod()))
		{
			searchmod.setVisible(true);
		}
		
		if(event.getSource().equals(guard.getGDbtnSearchMod()))
		{
			searchmod.setVisible(true);
		}
		
		if(event.getSource().equals(board_jee.getADbtnSearchMod()))
		{
			searchmod.setVisible(true);
		}
		
		if(event.getSource().equals(NRIacademic.getNADbtnSearchMod()))
		{
			searchmod.setVisible(true);
		}
		
		if(event.getSource().equals(NRIspons.getNRISbtnSearchMod()))
		{
			searchmod.setVisible(true);
		}
		
		if(event.getSource().equals(NRIstud.getNRIbtnSearchModify()))
		{
			searchmod.setVisible(true);
		}
		if(event.getSource().equals(enroll.getEDbtnSearchMod()))
		{
			searchmod.setVisible(true);
		}
		
		
		
	}
}
