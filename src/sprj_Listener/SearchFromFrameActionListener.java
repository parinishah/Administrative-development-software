package sprj_Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import sprj_DataStorage.ExcelModify;
import sprj_GUI.Board_JEE_GUI;
import sprj_GUI.EnrollmentDetails_GUI;
import sprj_GUI.Error_GUI;
import sprj_GUI.GuardianDetails_GUI;
import sprj_GUI.ModBoard_JEE_GUI;
import sprj_GUI.ModEnrollmentDetails_GUI;
import sprj_GUI.ModGuardianDetails_GUI;
import sprj_GUI.ModNRISponsoredDetails_GUI;
import sprj_GUI.ModNRIStudent_GUI;
import sprj_GUI.ModNRI_AcademicDetails_GUI;
import sprj_GUI.ModPersonalDetails_GUI;
import sprj_GUI.NRISponsoredDetails_GUI;
import sprj_GUI.NRIStudent_GUI;
import sprj_GUI.NRI_AcademicDetails_GUI;
import sprj_GUI.PersonalDetails_GUI;

public class SearchFromFrameActionListener implements ActionListener 
{
	private PersonalDetails_GUI person;
	private GuardianDetails_GUI guard;
	private Board_JEE_GUI board_jee;
	private EnrollmentDetails_GUI enroll;
	private NRIStudent_GUI NRIstud;
	private NRISponsoredDetails_GUI NRIspons;
	private NRI_AcademicDetails_GUI NRIacademic;
	private ModPersonalDetails_GUI modpersonal;
	private ModGuardianDetails_GUI modguard;
	private ModBoard_JEE_GUI modboard_jee;
	private ModEnrollmentDetails_GUI modenroll;
	private ModNRI_AcademicDetails_GUI modNRIacademic;
	private ModNRISponsoredDetails_GUI modNRIspons;
	private ModNRIStudent_GUI modNRIstud;
	private Error_GUI error;

	String uniqueID;
	int[] branchtype = new int[9];
	
	static int flag = 0;
	
	ExcelModify toexcel = new ExcelModify();
	
	static int rownumictacpc, rownumictnri, rownumictnrisp, rownummechacpc, rownummechnri, rownummechnrisp,rownumchemacpc, rownumchemnri, rownumchemnrisp;
	static int checkdocsictacpc, checkdocsictnri, checkdocsictnrisp, checkdocsmechacpc, checkdocsmechnri, checkdocsmechnrisp, checkdocschemacpc, checkdocschemnri, checkdocschemnrisp; 
	
	public SearchFromFrameActionListener(PersonalDetails_GUI pers, GuardianDetails_GUI grd, Board_JEE_GUI bj, NRISponsoredDetails_GUI nrisp, NRIStudent_GUI nris, NRI_AcademicDetails_GUI NRIaca ,EnrollmentDetails_GUI en,ModPersonalDetails_GUI modper, ModGuardianDetails_GUI modgrd, ModBoard_JEE_GUI modbj, ModNRISponsoredDetails_GUI modNRIsp, ModNRIStudent_GUI modNRIst, ModNRI_AcademicDetails_GUI modNRIaca, ModEnrollmentDetails_GUI modenrl, Error_GUI er)
	{
		person = pers;
		guard = grd;
		board_jee =bj;
		enroll = en;
		NRIspons = nrisp;
		NRIstud = nris;
		NRIacademic = NRIaca;

		modpersonal = modper;
		modguard = modgrd;
		modboard_jee = modbj;
		modenroll = modenrl;
		modNRIacademic = modNRIaca;
		modNRIspons = modNRIsp;
		modNRIstud = modNRIst;
		
		error= er;
	}
	@Override
	public void actionPerformed(ActionEvent event) 
	{
		if(event.getSource().equals(person.getPDbtnSearchMod()))
		{
			uniqueID = null;
			uniqueID = person.getPDtxtSearchMod().getText();
			if(uniqueID.isEmpty())
				error.displayerror();

			flag = 0;
			person.getPDtxtSearchMod().setText("");
			guard.getGDtxtUniqueNumber().setText("");
			board_jee.getADtxtEnterUniqueNumber().setText("");
			enroll.getEDtxtUniqueNumber().setText("");
			NRIspons.getNRIStxtUniqueNumber().setText("");
			NRIstud.getNRItxtUniqueNumber().setText("");
			NRIacademic.getNADtxtUniqueNumber().setText("");
		}
		
		else if(event.getSource().equals(guard.getGDbtnSearchMod()))
		{
			uniqueID = null;
			uniqueID = guard.getGDtxtUniqueNumber().getText();
			if(uniqueID.isEmpty())
				error.displayerror();
			
			
			flag=0;
			person.getPDtxtSearchMod().setText("");
			guard.getGDtxtUniqueNumber().setText("");
			board_jee.getADtxtEnterUniqueNumber().setText("");
			enroll.getEDtxtUniqueNumber().setText("");
			NRIspons.getNRIStxtUniqueNumber().setText("");
			NRIstud.getNRItxtUniqueNumber().setText("");
			NRIacademic.getNADtxtUniqueNumber().setText("");
		}
		
		else if(event.getSource().equals(board_jee.getADbtnSearchMod()))
		{
			uniqueID = null;
			uniqueID = board_jee.getADtxtEnterUniqueNumber().getText();
			if(uniqueID.isEmpty())
				error.displayerror();

			flag =0;
			person.getPDtxtSearchMod().setText("");
			guard.getGDtxtUniqueNumber().setText("");
			board_jee.getADtxtEnterUniqueNumber().setText("");
			enroll.getEDtxtUniqueNumber().setText("");
			NRIspons.getNRIStxtUniqueNumber().setText("");
			NRIstud.getNRItxtUniqueNumber().setText("");
			NRIacademic.getNADtxtUniqueNumber().setText("");
		}
		
		else if(event.getSource().equals(enroll.getEDbtnSearchMod()))
		{
			uniqueID = null;
			uniqueID = enroll.getEDtxtUniqueNumber().getText();
			if(uniqueID.isEmpty())
				error.displayerror();

			flag=0;
			person.getPDtxtSearchMod().setText("");
			guard.getGDtxtUniqueNumber().setText("");
			board_jee.getADtxtEnterUniqueNumber().setText("");
			enroll.getEDtxtUniqueNumber().setText("");
			NRIspons.getNRIStxtUniqueNumber().setText("");
			NRIstud.getNRItxtUniqueNumber().setText("");
			NRIacademic.getNADtxtUniqueNumber().setText("");
		}
		
		else if(event.getSource().equals(NRIspons.getNRISbtnSearchMod()))
		{
			uniqueID = null;
			uniqueID = NRIspons.getNRIStxtUniqueNumber().getText();
			if(uniqueID.isEmpty())
				error.displayerror();

			flag=0;
			person.getPDtxtSearchMod().setText("");
			guard.getGDtxtUniqueNumber().setText("");
			board_jee.getADtxtEnterUniqueNumber().setText("");
			enroll.getEDtxtUniqueNumber().setText("");
			NRIspons.getNRIStxtUniqueNumber().setText("");
			NRIstud.getNRItxtUniqueNumber().setText("");
			NRIacademic.getNADtxtUniqueNumber().setText("");
		}
		
		else if(event.getSource().equals(NRIstud.getNRIbtnSearchModify()))
		{
			uniqueID = null;
			uniqueID = NRIstud.getNRItxtUniqueNumber().getText();
			if(uniqueID.isEmpty())
				error.displayerror();

			flag=0;
			person.getPDtxtSearchMod().setText("");
			guard.getGDtxtUniqueNumber().setText("");
			board_jee.getADtxtEnterUniqueNumber().setText("");
			enroll.getEDtxtUniqueNumber().setText("");
			NRIspons.getNRIStxtUniqueNumber().setText("");
			NRIstud.getNRItxtUniqueNumber().setText("");
			NRIacademic.getNADtxtUniqueNumber().setText("");
		}
		
		else if(event.getSource().equals(NRIacademic.getNADbtnSearchMod()))
		{
			uniqueID = null;
			uniqueID = NRIacademic.getNADtxtUniqueNumber().getText();
			if(uniqueID.isEmpty())
				error.displayerror();

			
			flag=0;
			person.getPDtxtSearchMod().setText("");
			guard.getGDtxtUniqueNumber().setText("");
			board_jee.getADtxtEnterUniqueNumber().setText("");
			enroll.getEDtxtUniqueNumber().setText("");
			NRIspons.getNRIStxtUniqueNumber().setText("");
			NRIstud.getNRItxtUniqueNumber().setText("");
			NRIacademic.getNADtxtUniqueNumber().setText("");
		}
		
		try
		{
			//System.out.println(uniqueID+ "\n");
			branchtype[0] = toexcel.ICTacpcjeerollnumcheck(uniqueID);
			branchtype[3] = toexcel.MECHacpcjeerollnumcheck(uniqueID);
			branchtype[6] = toexcel.CHEMacpcjeerollnumcheck(uniqueID);
			
			branchtype[1] = toexcel.ICTnrisponjeerollnumcheck(uniqueID);
			branchtype[4] = toexcel.MECHnrisponjeerollnumcheck(uniqueID);
			branchtype[7] = toexcel.CHEMnrisponjeerollnumcheck(uniqueID);
			
			branchtype[2] = toexcel.ICTnristudrollcheck(uniqueID);
			branchtype[5] = toexcel.MECHnristudrollcheck(uniqueID);
			branchtype[8] = toexcel.CHEMnristudrollcheck(uniqueID);
			
			
			
			
			if((branchtype[0] != -1 || branchtype[3] != -1 || branchtype[6] != -1) && flag == 0 )
			{
				if(branchtype[0] != -1)
				{
					rownumictacpc = toexcel.modviewICTACPC(uniqueID, modpersonal, modguard, modboard_jee, modenroll);
					modpersonal.setVisible(true);
					//System.out.println("here");
					
					checkdocsictacpc = toexcel.ICTacpcjeerollnumcheckchkbox(uniqueID);
					
					if(checkdocsictacpc == -1)
					{
						throw new Exception("STUDENT NOT FOUND! CHECK STUDENT DOCUMENT LIST!");
					}
					
				}
				
				else if(branchtype[3] != -1)
				{
					rownummechacpc = toexcel.modviewMECHACPC(uniqueID, modpersonal, modguard, modboard_jee, modenroll);
					modpersonal.setVisible(true);
					
					checkdocsmechacpc = toexcel.MECHacpcjeerollnumcheckchkbox(uniqueID);
					
					if(checkdocsmechacpc == -1)
					{
						throw new Exception("STUDENT NOT FOUND! CHECK STUDENT DOCUMENT LIST!");
					}
				}
				
				else if(branchtype[6] != -1)
				{
					rownumchemacpc = toexcel.modviewCHEMACPC(uniqueID, modpersonal, modguard, modboard_jee, modenroll);
					modpersonal.setVisible(true);
					
					checkdocschemacpc = toexcel.CHEMacpcjeerollnumcheckchkbox(uniqueID);
					
					if(checkdocschemacpc == -1)
					{
						throw new Exception("STUDENT NOT FOUND! CHECK STUDENT DOCUMENT LIST!");
					}
				}
			}
			
			
					
			else if((branchtype[2] != -1 || branchtype[5] != -1 || branchtype[8] != -1) && flag == 0)
			{
				if(branchtype[2] != -1)
				{
					rownumictnri = toexcel.modviewICTNRISTUD(uniqueID, modpersonal, modguard, modNRIacademic, modNRIstud, modenroll);
					modpersonal.setVisible(true);
					
					checkdocsictnri = toexcel.ICTnristudrollcheckchkbox(uniqueID);
					
					if(checkdocsictnri == -1)
					{
						throw new Exception("STUDENT NOT FOUND! CHECK STUDENT DOCUMENT LIST!");
					}
					
				}
				
				else if(branchtype[5] != -1)
				{
					rownummechnri = toexcel.modviewMECHNRISTUD(uniqueID, modpersonal, modguard, modNRIacademic, modNRIstud, modenroll);
					modpersonal.setVisible(true);
					
					checkdocsmechnri = toexcel.MECHnristudrollcheckchkbox(uniqueID);

					if(checkdocsmechnri == -1)
					{
						throw new Exception("STUDENT NOT FOUND! CHECK STUDENT DOCUMENT LIST!");
					}
				}
				
				else if(branchtype[8] != -1)
				{
					rownumchemnri = toexcel.modviewCHEMNRISTUD(uniqueID, modpersonal, modguard, modNRIacademic, modNRIstud, modenroll);
					modpersonal.setVisible(true);
					
					checkdocschemnri = toexcel.CHEMnristudrollcheckchkbox(uniqueID);
					

					if(checkdocschemnri == -1)
					{
						throw new Exception("STUDENT NOT FOUND! CHECK STUDENT DOCUMENT LIST!");
					}
				}
			}
			
			else if((branchtype[1] != -1 || branchtype[4] != -1 || branchtype[7] != -1) && flag == 0)
			{
				if(branchtype[1] != -1)
				{
					rownumictnrisp = toexcel.modviewICTNRISPON(uniqueID, modpersonal, modguard, modboard_jee, modNRIspons, modenroll);
					modpersonal.setVisible(true);
					
					checkdocsictnrisp = toexcel.ICTnrisponjeerollnumcheckchkbox(uniqueID);

					if(checkdocsictnrisp == -1)
					{
						throw new Exception("STUDENT NOT FOUND! CHECK STUDENT DOCUMENT LIST!");
					}
				}
				
				else if(branchtype[4] != -1)
				{
					rownummechnrisp = toexcel.modviewMECHNRISPON(uniqueID, modpersonal, modguard, modboard_jee, modNRIspons, modenroll);
					modpersonal.setVisible(true);
					
					checkdocsmechnrisp = toexcel.MECHnrisponjeerollnumcheckchkbox(uniqueID);
					
					if(checkdocsmechnrisp == -1)
					{
						throw new Exception("STUDENT NOT FOUND! CHECK STUDENT DOCUMENT LIST!");
					}
				}
				
				else if(branchtype[7] != -1)
				{
					rownumchemnrisp = toexcel.modviewCHEMNRISPON(uniqueID, modpersonal, modguard, modboard_jee, modNRIspons, modenroll);
					modpersonal.setVisible(true);
					
					checkdocschemnrisp = toexcel.CHEMnrisponjeerollnumcheckchkbox(uniqueID);
					
					if(checkdocschemnrisp == -1)
					{
						throw new Exception("STUDENT NOT FOUND! CHECK STUDENT DOCUMENT LIST!");
					}
				}
			}
			
			
			for(int i =0; i<9;i++)
			{
					
				if(branchtype[i] != -1)
				{
					++flag;
					break;
				}
				
			}
			
			for(int i =0;i<9;i++)
			{
				if(flag == 0 && branchtype[8] == -1 )
				{
					error.setlblerror("STUDENT DOESN'T EXIST IN ANY DATABASE!");
					error.setVisible(true);
				}
			}
			
			//flag++;
			//System.out.println(flag);
			
			if(event.getSource().equals(modpersonal.getPDbtnBack()))
			{
				
				modpersonal.setVisible(false);
			}
			
			else if(event.getSource().equals(modpersonal.getPDbtnNext()) )
			{
				if(modpersonal.PDgetTextEmpty())
				{
					error.displayerror();
					error.setVisible(true);
				}
				
				else
				{

					modpersonal.setVisible(false);
					modguard.setVisible(true);
				}
			}
			
			else if(event.getSource().equals(modguard.getBtnBackPersonalDetails())  )
			{
				modpersonal.setVisible(true);
				modguard.setVisible(false);
			}
			
			else if(event.getSource().equals(modguard.getBtnNext())  )
			{
				if(modguard.GDgetTextEmpty())
				{
					error.displayerror();
					error.setVisible(true);
				}
				
				else
				{			
					if(branchtype[0] != -1 || branchtype[3] != -1 || branchtype[6] != -1 || branchtype[1] != -1 || branchtype[4] != -1 || branchtype[7] != -1)
					{
						modboard_jee.setVisible(true);
						modboard_jee.getADtxtJEERollNumber().setEditable(false);
						modguard.setVisible(false);
					}
					
					else if(branchtype[2] != -1 || branchtype[5] != -1 || branchtype[8] != -1)
					{
						modNRIacademic.setVisible(true);
						modNRIacademic.getNADtxt12thRollNumberunique().setEditable(false);
						modguard.setVisible(false);
					}
				}
			}
			
			else if(event.getSource().equals(modboard_jee.getADbtnBackGardianDetails())  )
			{
				modboard_jee.setVisible(false);
				modguard.setVisible(true);
			}
			
			else if(event.getSource().equals(modboard_jee.getADbtnNextEnrollmentDetails())  )
			{
				if(modboard_jee.ADgetTextEmpty())
				{
					error.displayerror();
					error.setVisible(true);
				}
				
				else
				{
					
					
					if(branchtype[0] != -1 || branchtype[3] != -1 || branchtype[6] != -1)
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
					
					else if(branchtype[1] != -1 || branchtype[4] != -1 || branchtype[7] != -1)
					{
						modNRIspons.setVisible(true);
						modboard_jee.setVisible(false);
					}
				}
			}
			
			else if(event.getSource().equals(modNRIspons.getBtnNextenrollmentDetails())  )
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
			
			else if(event.getSource().equals(modNRIspons.getBtnBackAD())  )
			{
				modboard_jee.setVisible(true);
				modNRIspons.setVisible(false);
			}
			
			else if(event.getSource().equals(modNRIacademic.getNADbtnBackGuardianDetails())  )
			{
				modguard.setVisible(true);
				modNRIacademic.setVisible(false);
			}
			
			else if(event.getSource().equals(modNRIacademic.getNADbtnNextNRIStudentDetails())  )
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
			
			else if(event.getSource().equals(modNRIstud.getBtnNextEnrollmentDetails())  )
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
			
			else if(event.getSource().equals(modNRIstud.getBtnBackAcademicDetails()))
			{
				modNRIacademic.setVisible(true);
				modNRIstud.setVisible(false);
			}
			
			else if(event.getSource().equals(modenroll.getEDbtnBack()))
			{
				if(branchtype[0] != -1 || branchtype[3] != -1 || branchtype[6] != -1)
				{
					modboard_jee.setVisible(true);
					modenroll.setVisible(false);
				}
				
				else if(branchtype[1] != -1 || branchtype[4] != -1 || branchtype[7] != -1)
				{
					modNRIspons.setVisible(true);
					modenroll.setVisible(false);
				}
				
				else if(branchtype[2] != -1 || branchtype[5] != -1 || branchtype[8] != -1)
				{
					modNRIstud.setVisible(true);
					modenroll.setVisible(false);
				}
				
			}
			
			else if(event.getSource().equals(modenroll.getEDbtnSubmit()))
			{
				if(modenroll.EDgetTextEmpty())
					error.displayerror();
				
				else
				{
					if(branchtype[0] != -1 || branchtype[3] != -1 || branchtype[6] != -1)
					{
						if(branchtype[0] != -1)
						{
							//System.out.println(modpersonal.getPDtxtFirstName().getText());
							
							toexcel.modstoreICTACPC(rownumictacpc, modpersonal.getPDtxtFirstName().getText(), modpersonal.getPDtxtMiddleName().getText(), modpersonal.getPDtxtLastName().getText(), modpersonal.getPDgender(), modpersonal.getPDtxtDisability().getText(), modpersonal.getPDtxtAddL1().getText(), modpersonal.getPDtxtState().getText(), modpersonal.getPDtxtCity().getText(), modpersonal.getPDtxtPincode().getText(), modpersonal.getPDtxtPrimaryContact().getText(), modpersonal.getPDtxtSecondaryContact().getText(), modpersonal.getPDtxtEmailId().getText(), modpersonal.getPDCategory(), modpersonal.getPDDOB(), 
									modguard.getGDtxtFatherName().getText(), modguard.getGDtxtFatherContact().getText(), modguard.getGDtxtFatherQualification().getText(), modguard.getGDtxtFatherOccupation().getText(), modguard.getGDcmbFatherIncome(), modguard.getGDtxtFatherEmail().getText(), modguard.getGDtxtMotherName().getText(), modguard.getGDtxtMotherContact().getText(), modguard.getGDtxtMotherQualification().getText(), modguard.getGDtxtMotherOccupation().getText(), modguard.getGDcmbMotherIncome(), 
									//admiss.getATAdmType(),
									modboard_jee.getADcmb10passing(), modboard_jee.getADcmb12passing(), modboard_jee.getADtxtBoardRollNum12th().getText(), modboard_jee.getADcmbschlbrd(), modboard_jee.getADtxtSchoolName().getText(), modboard_jee.getADtxtOverallPercentage12th().getText(), modboard_jee.getADtxtPCMPercentage12th().getText(), modboard_jee.getADtxtPCMPercentile12th().getText(), modboard_jee.getADtxtJEEScore().getText(), modboard_jee.getADtxtJEEPercentile().getText() ,modboard_jee.getADtxtJEERollNumber().getText(), Integer.parseInt(modboard_jee.getADtxtAcpcRank().getText()), 
									modenroll.getEDAdmissionStatus());
				
							toexcel.docICTACPC(checkdocsictacpc, modboard_jee.getADtxtJEERollNumber().getText(), modpersonal.getPDtxtFirstName().getText(), modpersonal.getPDtxtLastName().getText(), modenroll.getEDchckbx10Marksheet(), modenroll.getEDchckbx12Marksheet(), 
												modenroll.getEDchckbxJeeMarksheet(), modenroll.getEDchckbxSchoolLeavingCertificate(), modenroll.getEDchckbxMeritRankReciepts(), modenroll.getEDchckbx20000Receipts(), modenroll.getEDchckbxAllotmentLetter(), modenroll.getEDchckbxPassportSize());
							
							//System.out.println("here");
							
									//menu.setVisible(true);
									modenroll.setVisible(false);
									
									modpersonal.clear();
									modguard.clear();
									modNRIspons.clear();
									modNRIstud.clear();
									modboard_jee.clear();
									modenroll.clearcheckbox();

							
						}
						
						else if(branchtype[3] != -1)
						{
							toexcel.modstoreMECHACPC(rownummechacpc, modpersonal.getPDtxtFirstName().getText(), modpersonal.getPDtxtMiddleName().getText(), modpersonal.getPDtxtLastName().getText(), modpersonal.getPDgender(), modpersonal.getPDtxtDisability().getText(), modpersonal.getPDtxtAddL1().getText(), modpersonal.getPDtxtState().getText(), modpersonal.getPDtxtCity().getText(), modpersonal.getPDtxtPincode().getText(), modpersonal.getPDtxtPrimaryContact().getText(), modpersonal.getPDtxtSecondaryContact().getText(), modpersonal.getPDtxtEmailId().getText(), modpersonal.getPDCategory(), modpersonal.getPDDOB(), 
									modguard.getGDtxtFatherName().getText(), modguard.getGDtxtFatherContact().getText(), modguard.getGDtxtFatherQualification().getText(), modguard.getGDtxtFatherOccupation().getText(), modguard.getGDcmbFatherIncome(), modguard.getGDtxtFatherEmail().getText(), modguard.getGDtxtMotherName().getText(), modguard.getGDtxtMotherContact().getText(), modguard.getGDtxtMotherQualification().getText(), modguard.getGDtxtMotherOccupation().getText(), modguard.getGDcmbMotherIncome(), 
									//admiss.getATAdmType(),
									modboard_jee.getADcmb10passing(), modboard_jee.getADcmb12passing(), modboard_jee.getADtxtBoardRollNum12th().getText(), modboard_jee.getADcmbschlbrd(), modboard_jee.getADtxtSchoolName().getText(), modboard_jee.getADtxtOverallPercentage12th().getText(), modboard_jee.getADtxtPCMPercentage12th().getText(), modboard_jee.getADtxtPCMPercentile12th().getText(), modboard_jee.getADtxtJEEScore().getText(), modboard_jee.getADtxtJEEPercentile().getText() ,modboard_jee.getADtxtJEERollNumber().getText(), Integer.parseInt(modboard_jee.getADtxtAcpcRank().getText()), 
									modenroll.getEDAdmissionStatus());
				
							toexcel.docMECHACPC(checkdocsmechacpc, modboard_jee.getADtxtJEERollNumber().getText(), modpersonal.getPDtxtFirstName().getText(), modpersonal.getPDtxtLastName().getText(), modenroll.getEDchckbx10Marksheet(), modenroll.getEDchckbx12Marksheet(), 
												modenroll.getEDchckbxJeeMarksheet(), modenroll.getEDchckbxSchoolLeavingCertificate(), modenroll.getEDchckbxMeritRankReciepts(), modenroll.getEDchckbx20000Receipts(), modenroll.getEDchckbxAllotmentLetter(), modenroll.getEDchckbxPassportSize());
							
							
									//menu.setVisible(true);
									modenroll.setVisible(false);
									
									modpersonal.clear();
									modguard.clear();
									modNRIspons.clear();
									modNRIstud.clear();
									modboard_jee.clear();
									modenroll.clearcheckbox();

						}
						
						else if(branchtype[6] != -1)
						{
							toexcel.modstoreCHEMACPC(rownumchemacpc, modpersonal.getPDtxtFirstName().getText(), modpersonal.getPDtxtMiddleName().getText(), modpersonal.getPDtxtLastName().getText(), modpersonal.getPDgender(), modpersonal.getPDtxtDisability().getText(), modpersonal.getPDtxtAddL1().getText(), modpersonal.getPDtxtState().getText(), modpersonal.getPDtxtCity().getText(), modpersonal.getPDtxtPincode().getText(), modpersonal.getPDtxtPrimaryContact().getText(), modpersonal.getPDtxtSecondaryContact().getText(), modpersonal.getPDtxtEmailId().getText(), modpersonal.getPDCategory(), modpersonal.getPDDOB(), 
									modguard.getGDtxtFatherName().getText(), modguard.getGDtxtFatherContact().getText(), modguard.getGDtxtFatherQualification().getText(), modguard.getGDtxtFatherOccupation().getText(), modguard.getGDcmbFatherIncome(), modguard.getGDtxtFatherEmail().getText(), modguard.getGDtxtMotherName().getText(), modguard.getGDtxtMotherContact().getText(), modguard.getGDtxtMotherQualification().getText(), modguard.getGDtxtMotherOccupation().getText(), modguard.getGDcmbMotherIncome(), 
									//admiss.getATAdmType(),
									modboard_jee.getADcmb10passing(), modboard_jee.getADcmb12passing(), modboard_jee.getADtxtBoardRollNum12th().getText(), modboard_jee.getADcmbschlbrd(), modboard_jee.getADtxtSchoolName().getText(), modboard_jee.getADtxtOverallPercentage12th().getText(), modboard_jee.getADtxtPCMPercentage12th().getText(), modboard_jee.getADtxtPCMPercentile12th().getText(), modboard_jee.getADtxtJEEScore().getText(), modboard_jee.getADtxtJEEPercentile().getText() ,modboard_jee.getADtxtJEERollNumber().getText(), Integer.parseInt(modboard_jee.getADtxtAcpcRank().getText()), 
									modenroll.getEDAdmissionStatus());
				
							toexcel.docCHEMACPC(checkdocschemacpc, modboard_jee.getADtxtJEERollNumber().getText(), modpersonal.getPDtxtFirstName().getText(), modpersonal.getPDtxtLastName().getText(), modenroll.getEDchckbx10Marksheet(), modenroll.getEDchckbx12Marksheet(), 
											modenroll.getEDchckbxJeeMarksheet(), modenroll.getEDchckbxSchoolLeavingCertificate(), modenroll.getEDchckbxMeritRankReciepts(), modenroll.getEDchckbx20000Receipts(), modenroll.getEDchckbxAllotmentLetter(), modenroll.getEDchckbxPassportSize());
			
							
									
									modenroll.setVisible(false);
									
									modpersonal.clear();
									modguard.clear();
									modNRIspons.clear();
									modNRIstud.clear();
									modboard_jee.clear();
									modenroll.clearcheckbox();

						}
					}
					
					
							
					else if(branchtype[2] != -1 || branchtype[5] != -1 || branchtype[8] != -1)
					{
						if(branchtype[2] != -1)
						{
							toexcel.modstoreICTNRISTUD(rownumictnri, modpersonal.getPDtxtFirstName().getText(), modpersonal.getPDtxtMiddleName().getText(), modpersonal.getPDtxtLastName().getText(), modpersonal.getPDgender(), modpersonal.getPDtxtDisability().getText(), modpersonal.getPDtxtAddL1().getText(), modpersonal.getPDtxtState().getText(), modpersonal.getPDtxtCity().getText(), modpersonal.getPDtxtPincode().getText(), modpersonal.getPDtxtPrimaryContact().getText(), modpersonal.getPDtxtSecondaryContact().getText(), modpersonal.getPDtxtEmailId().getText(), modpersonal.getPDCategory(), modpersonal.getPDDOB(), 
									modguard.getGDtxtFatherName().getText(), modguard.getGDtxtFatherContact().getText(), modguard.getGDtxtFatherQualification().getText(), modguard.getGDtxtFatherOccupation().getText(), modguard.getGDcmbFatherIncome(), modguard.getGDtxtFatherEmail().getText(), modguard.getGDtxtMotherName().getText(), modguard.getGDtxtMotherContact().getText(), modguard.getGDtxtMotherQualification().getText(), modguard.getGDtxtMotherOccupation().getText(), modguard.getGDcmbMotherIncome(), 
									modNRIacademic.getNADtxt12thRollNumberunique().getText(), modNRIacademic.getNADtxtOverallGrade().getText(),
									modNRIstud.getNRItxtNationality().getText(), modNRIstud.getNRItxtNriStatus().getText(), modNRIstud.getNRItextAreaAddress().getText(),
									modenroll.getEDAdmissionStatus());
							
							
							toexcel.docICTNRI(checkdocsictnri, modNRIacademic.getNADtxt12thRollNumberunique().getText(), modpersonal.getPDtxtFirstName().getText(), modpersonal.getPDtxtLastName().getText(), 
										modenroll.getEDchckbxLastEducationalCertificate(), modenroll.getEDchckbxMigrationCertificate(), modenroll.getEDchckbxCopyOfPassport(), modenroll.getEDchckbxPassportSize());
							
							//menu.setVisible(true);
							modenroll.setVisible(false);
							
							modpersonal.clear();
							modguard.clear();
							modNRIspons.clear();
							modNRIstud.clear();
							modboard_jee.clear();
							modenroll.clearcheckbox();

							
						}
						
						else if(branchtype[5] != -1)
						{
							toexcel.modstoreMECHNRISTUD(rownummechnri, modpersonal.getPDtxtFirstName().getText(), modpersonal.getPDtxtMiddleName().getText(), modpersonal.getPDtxtLastName().getText(), modpersonal.getPDgender(), modpersonal.getPDtxtDisability().getText(), modpersonal.getPDtxtAddL1().getText(), modpersonal.getPDtxtState().getText(), modpersonal.getPDtxtCity().getText(), modpersonal.getPDtxtPincode().getText(), modpersonal.getPDtxtPrimaryContact().getText(), modpersonal.getPDtxtSecondaryContact().getText(), modpersonal.getPDtxtEmailId().getText(), modpersonal.getPDCategory(), modpersonal.getPDDOB(), 
									modguard.getGDtxtFatherName().getText(), modguard.getGDtxtFatherContact().getText(), modguard.getGDtxtFatherQualification().getText(), modguard.getGDtxtFatherOccupation().getText(), modguard.getGDcmbFatherIncome(), modguard.getGDtxtFatherEmail().getText(), modguard.getGDtxtMotherName().getText(), modguard.getGDtxtMotherContact().getText(), modguard.getGDtxtMotherQualification().getText(), modguard.getGDtxtMotherOccupation().getText(), modguard.getGDcmbMotherIncome(), 
									modNRIacademic.getNADtxt12thRollNumberunique().getText(), modNRIacademic.getNADtxtOverallGrade().getText(),
									modNRIstud.getNRItxtNationality().getText(), modNRIstud.getNRItxtNriStatus().getText(), modNRIstud.getNRItextAreaAddress().getText(),
									modenroll.getEDAdmissionStatus());
							
							toexcel.docMECHNRI(checkdocsmechnri, modNRIacademic.getNADtxt12thRollNumberunique().getText(), modpersonal.getPDtxtFirstName().getText(), modpersonal.getPDtxtLastName().getText(), 
												modenroll.getEDchckbxLastEducationalCertificate(), modenroll.getEDchckbxMigrationCertificate(), modenroll.getEDchckbxCopyOfPassport(), modenroll.getEDchckbxPassportSize());
						
							
							//menu.setVisible(true);
							modenroll.setVisible(false);
							
							modpersonal.clear();
							modguard.clear();
							modNRIspons.clear();
							modNRIstud.clear();
							modboard_jee.clear();
							modenroll.clearcheckbox();

						}
						
						else if(branchtype[8] != -1)
						{
							toexcel.modstoreCHEMNRISTUD(rownumchemnri, modpersonal.getPDtxtFirstName().getText(), modpersonal.getPDtxtMiddleName().getText(), modpersonal.getPDtxtLastName().getText(), modpersonal.getPDgender(), modpersonal.getPDtxtDisability().getText(), modpersonal.getPDtxtAddL1().getText(), modpersonal.getPDtxtState().getText(), modpersonal.getPDtxtCity().getText(), modpersonal.getPDtxtPincode().getText(), modpersonal.getPDtxtPrimaryContact().getText(), modpersonal.getPDtxtSecondaryContact().getText(), modpersonal.getPDtxtEmailId().getText(), modpersonal.getPDCategory(), modpersonal.getPDDOB(), 
									modguard.getGDtxtFatherName().getText(), modguard.getGDtxtFatherContact().getText(), modguard.getGDtxtFatherQualification().getText(), modguard.getGDtxtFatherOccupation().getText(), modguard.getGDcmbFatherIncome(), modguard.getGDtxtFatherEmail().getText(), modguard.getGDtxtMotherName().getText(), modguard.getGDtxtMotherContact().getText(), modguard.getGDtxtMotherQualification().getText(), modguard.getGDtxtMotherOccupation().getText(), modguard.getGDcmbMotherIncome(), 
									modNRIacademic.getNADtxt12thRollNumberunique().getText(), modNRIacademic.getNADtxtOverallGrade().getText(),
									modNRIstud.getNRItxtNationality().getText(), modNRIstud.getNRItxtNriStatus().getText(), modNRIstud.getNRItextAreaAddress().getText(),
									modenroll.getEDAdmissionStatus());
							
							toexcel.docCHEMNRI(checkdocschemnri, modNRIacademic.getNADtxt12thRollNumberunique().getText(), modpersonal.getPDtxtFirstName().getText(), modpersonal.getPDtxtLastName().getText(), 
												modenroll.getEDchckbxLastEducationalCertificate(), modenroll.getEDchckbxMigrationCertificate(), modenroll.getEDchckbxCopyOfPassport(), modenroll.getEDchckbxPassportSize());
						
							
							modenroll.setVisible(false);
							
							modpersonal.clear();
							modguard.clear();
							modNRIspons.clear();
							modNRIstud.clear();
							modboard_jee.clear();
							modenroll.clearcheckbox();

						}
					}
					
					else if(branchtype[1] != -1 || branchtype[4] != -1 || branchtype[7] != -1)
					{
						if(branchtype[1] != -1)
						{
							toexcel.modstoreICTNRISPON(rownumictnrisp, modpersonal.getPDtxtFirstName().getText(), modpersonal.getPDtxtMiddleName().getText(), modpersonal.getPDtxtLastName().getText(), modpersonal.getPDgender(), modpersonal.getPDtxtDisability().getText(), modpersonal.getPDtxtAddL1().getText(), modpersonal.getPDtxtState().getText(), modpersonal.getPDtxtCity().getText(), modpersonal.getPDtxtPincode().getText(), modpersonal.getPDtxtPrimaryContact().getText(), modpersonal.getPDtxtSecondaryContact().getText(), modpersonal.getPDtxtEmailId().getText(), modpersonal.getPDCategory(), modpersonal.getPDDOB(), 
									modguard.getGDtxtFatherName().getText(), modguard.getGDtxtFatherContact().getText(), modguard.getGDtxtFatherQualification().getText(), modguard.getGDtxtFatherOccupation().getText(), modguard.getGDcmbFatherIncome(), modguard.getGDtxtFatherEmail().getText(), modguard.getGDtxtMotherName().getText(), modguard.getGDtxtMotherContact().getText(), modguard.getGDtxtMotherQualification().getText(), modguard.getGDtxtMotherOccupation().getText(), modguard.getGDcmbMotherIncome(), 
									modboard_jee.getADcmb10passing(), modboard_jee.getADcmb12passing(), modboard_jee.getADtxtBoardRollNum12th().getText(), modboard_jee.getADcmbschlbrd(), modboard_jee.getADtxtSchoolName().getText(), modboard_jee.getADtxtOverallPercentage12th().getText(), modboard_jee.getADtxtPCMPercentage12th().getText(), modboard_jee.getADtxtPCMPercentile12th().getText(), modboard_jee.getADtxtJEEScore().getText(), modboard_jee.getADtxtJEEPercentile().getText() ,modboard_jee.getADtxtJEERollNumber().getText(), Integer.parseInt(modboard_jee.getADtxtAcpcRank().getText()),
									modNRIspons.getNRIStxtname().getText(), modNRIspons.getNRISGender(), modNRIspons.getNRIStxtNationality().getText(), modNRIspons.getNRIStxtStatus().getText(), modNRIspons.getNRIStxtRelation().getText(), modNRIspons.getNRIStxtContact().getText(), modNRIspons.getNRIStextAreaAddress().getText(),
									modenroll.getEDAdmissionStatus());
							
							
							toexcel.docICTNRISPON(checkdocsictnrisp, modboard_jee.getADtxtJEERollNumber().getText(), modpersonal.getPDtxtFirstName().getText(), modpersonal.getPDtxtLastName().getText(), 
									modenroll.getEDchckbx10Marksheet(), modenroll.getEDchckbx12Marksheet(), modenroll.getEDchckbxJeeMarksheet(), modenroll.getEDchckbxSchoolLeavingCertificate(), modenroll.getEDchckbxMeritRankReciepts(), modenroll.getEDchckbx20000Receipts(), modenroll.getEDchckbxAllotmentLetter(), modenroll.getEDchckbxPassportSize(), modenroll.getEDchckbxAffidavit(), modenroll.getEDchckbxCopyOfPassport(), modenroll.getEDchckbxNriProofCertificate());
							
							
							//menu.setVisible(true);
							modenroll.setVisible(false);
							
							modpersonal.clear();
							modguard.clear();
							modNRIspons.clear();
							modNRIstud.clear();
							modboard_jee.clear();
							modenroll.clearcheckbox();

							
							
							
						}
						
						else if(branchtype[4] != -1)
						{
							toexcel.modstoreMECHNRISPON(rownummechnrisp, modpersonal.getPDtxtFirstName().getText(), modpersonal.getPDtxtMiddleName().getText(), modpersonal.getPDtxtLastName().getText(), modpersonal.getPDgender(), modpersonal.getPDtxtDisability().getText(), modpersonal.getPDtxtAddL1().getText(), modpersonal.getPDtxtState().getText(), modpersonal.getPDtxtCity().getText(), modpersonal.getPDtxtPincode().getText(), modpersonal.getPDtxtPrimaryContact().getText(), modpersonal.getPDtxtSecondaryContact().getText(), modpersonal.getPDtxtEmailId().getText(), modpersonal.getPDCategory(), modpersonal.getPDDOB(), 
									modguard.getGDtxtFatherName().getText(), modguard.getGDtxtFatherContact().getText(), modguard.getGDtxtFatherQualification().getText(), modguard.getGDtxtFatherOccupation().getText(), modguard.getGDcmbFatherIncome(), modguard.getGDtxtFatherEmail().getText(), modguard.getGDtxtMotherName().getText(), modguard.getGDtxtMotherContact().getText(), modguard.getGDtxtMotherQualification().getText(), modguard.getGDtxtMotherOccupation().getText(), modguard.getGDcmbMotherIncome(), 
									modboard_jee.getADcmb10passing(), modboard_jee.getADcmb12passing(), modboard_jee.getADtxtBoardRollNum12th().getText(), modboard_jee.getADcmbschlbrd(), modboard_jee.getADtxtSchoolName().getText(), modboard_jee.getADtxtOverallPercentage12th().getText(), modboard_jee.getADtxtPCMPercentage12th().getText(), modboard_jee.getADtxtPCMPercentile12th().getText(), modboard_jee.getADtxtJEEScore().getText(), modboard_jee.getADtxtJEEPercentile().getText() ,modboard_jee.getADtxtJEERollNumber().getText(), Integer.parseInt(modboard_jee.getADtxtAcpcRank().getText()),
									modNRIspons.getNRIStxtname().getText(), modNRIspons.getNRISGender(), modNRIspons.getNRIStxtNationality().getText(), modNRIspons.getNRIStxtStatus().getText(), modNRIspons.getNRIStxtRelation().getText(), modNRIspons.getNRIStxtContact().getText(), modNRIspons.getNRIStextAreaAddress().getText(),
									modenroll.getEDAdmissionStatus());
							
							toexcel.docMECHNRISPON(checkdocsmechnrisp, modboard_jee.getADtxtJEERollNumber().getText(), modpersonal.getPDtxtFirstName().getText(), modpersonal.getPDtxtLastName().getText(), 
													modenroll.getEDchckbx10Marksheet(), modenroll.getEDchckbx12Marksheet(), modenroll.getEDchckbxJeeMarksheet(), modenroll.getEDchckbxSchoolLeavingCertificate(), modenroll.getEDchckbxMeritRankReciepts(), modenroll.getEDchckbx20000Receipts(), modenroll.getEDchckbxAllotmentLetter(), modenroll.getEDchckbxPassportSize(), modenroll.getEDchckbxAffidavit(), modenroll.getEDchckbxCopyOfPassport(), modenroll.getEDchckbxNriProofCertificate());
							
							
							modenroll.setVisible(false);
							
							modpersonal.clear();
							modguard.clear();
							modNRIspons.clear();
							modNRIstud.clear();
							modboard_jee.clear();
							modenroll.clearcheckbox();

						}
						
						else if(branchtype[7] != -1)
						{
							toexcel.modstoreCHEMNRISPON(rownumchemnrisp, modpersonal.getPDtxtFirstName().getText(), modpersonal.getPDtxtMiddleName().getText(), modpersonal.getPDtxtLastName().getText(), modpersonal.getPDgender(), modpersonal.getPDtxtDisability().getText(), modpersonal.getPDtxtAddL1().getText(), modpersonal.getPDtxtState().getText(), modpersonal.getPDtxtCity().getText(), modpersonal.getPDtxtPincode().getText(), modpersonal.getPDtxtPrimaryContact().getText(), modpersonal.getPDtxtSecondaryContact().getText(), modpersonal.getPDtxtEmailId().getText(), modpersonal.getPDCategory(), modpersonal.getPDDOB(), 
									modguard.getGDtxtFatherName().getText(), modguard.getGDtxtFatherContact().getText(), modguard.getGDtxtFatherQualification().getText(), modguard.getGDtxtFatherOccupation().getText(), modguard.getGDcmbFatherIncome(), modguard.getGDtxtFatherEmail().getText(), modguard.getGDtxtMotherName().getText(), modguard.getGDtxtMotherContact().getText(), modguard.getGDtxtMotherQualification().getText(), modguard.getGDtxtMotherOccupation().getText(), modguard.getGDcmbMotherIncome(), 
									modboard_jee.getADcmb10passing(), modboard_jee.getADcmb12passing(), modboard_jee.getADtxtBoardRollNum12th().getText(), modboard_jee.getADcmbschlbrd(), modboard_jee.getADtxtSchoolName().getText(), modboard_jee.getADtxtOverallPercentage12th().getText(), modboard_jee.getADtxtPCMPercentage12th().getText(), modboard_jee.getADtxtPCMPercentile12th().getText(), modboard_jee.getADtxtJEEScore().getText(), modboard_jee.getADtxtJEEPercentile().getText() ,modboard_jee.getADtxtJEERollNumber().getText(), Integer.parseInt(modboard_jee.getADtxtAcpcRank().getText()),
									modNRIspons.getNRIStxtname().getText(), modNRIspons.getNRISGender(), modNRIspons.getNRIStxtNationality().getText(), modNRIspons.getNRIStxtStatus().getText(), modNRIspons.getNRIStxtRelation().getText(), modNRIspons.getNRIStxtContact().getText(), modNRIspons.getNRIStextAreaAddress().getText(),
									modenroll.getEDAdmissionStatus());
							
							toexcel.docCHEMNRISPON(checkdocschemnrisp, modboard_jee.getADtxtJEERollNumber().getText(), modpersonal.getPDtxtFirstName().getText(), modpersonal.getPDtxtLastName().getText(), 
													modenroll.getEDchckbx10Marksheet(), modenroll.getEDchckbx12Marksheet(), modenroll.getEDchckbxJeeMarksheet(), modenroll.getEDchckbxSchoolLeavingCertificate(), modenroll.getEDchckbxMeritRankReciepts(), modenroll.getEDchckbx20000Receipts(), modenroll.getEDchckbxAllotmentLetter(), modenroll.getEDchckbxPassportSize(), modenroll.getEDchckbxAffidavit(), modenroll.getEDchckbxCopyOfPassport(), modenroll.getEDchckbxNriProofCertificate());
							
							
							
							modenroll.setVisible(false);
							
							modpersonal.clear();
							modguard.clear();
							modNRIspons.clear();
							modNRIstud.clear();
							modboard_jee.clear();
							modenroll.clearcheckbox();

						}
					}
					
					person.getPDtxtSearchMod().setText("");
					guard.getGDtxtUniqueNumber().setText("");
					board_jee.getADtxtEnterUniqueNumber().setText("");
					enroll.getEDtxtUniqueNumber().setText("");
					NRIspons.getNRIStxtUniqueNumber().setText("");
					NRIstud.getNRItxtUniqueNumber().setText("");
					NRIacademic.getNADtxtUniqueNumber().setText("");
					
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
