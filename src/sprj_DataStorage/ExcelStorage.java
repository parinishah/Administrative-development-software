package sprj_DataStorage;

//&& (admissionstat.getStringCellValue().equals("TENTATIVE"))

import java.io.*;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;

import sprj_Student.Student;

public class ExcelStorage extends Student
{
	public ExcelStorage()
	{
		super();
	}

	public int unICTjeerollnumcheck(String roll) throws Exception
	{
		int rownum = -1;
		
		File file = new File("//10.20.10.52/Documents/#2016/ICT.xls");
		////File file = new File("ICT.xls");
		
		try
		{
			Workbook wb = WorkbookFactory.create(file);
			Sheet sh = wb.getSheet("ACPC");
			
			int last = sh.getLastRowNum();

			for(int i = 1; i<=last; i++)	
			{
				Row row = sh.getRow(i);
				Cell jeerollcell = row.getCell(37);
				Cell admissionstat = row.getCell(40);
				jeerollcell = sh.getRow(i).getCell(37);
				admissionstat = sh.getRow(i).getCell(40);
				//System.out.println(admissionstat.getStringCellValue());
				if((jeerollcell.getStringCellValue().equals(roll))) 
				{
					rownum = i;
					//break;
					
					if(admissionstat.getStringCellValue().equals("CONFIRM"))
					{
						//System.out.println("inside confirm");
						rownum=-2;
						//System.out.println(rownum + "\n" + i);
						break;
					}
					
					else
						break;
				}
				
				
						
			}
			
			return rownum;
		}
		catch(Exception err)
		{
			
			throw err;
		}	
		
	}
	
	public int unMECHjeerollnumcheck(String roll) throws Exception
	{
		int rownum = -1;
		
		File file = new File("//10.20.10.52/Documents/#2016/MECH.xls");
		//File file = new File("MECH.xls");
		try
		{
			Workbook wb = WorkbookFactory.create(file);
			Sheet sh = wb.getSheet("ACPC");
			
			int last = sh.getLastRowNum();

			for(int i = 1; i<=last; i++)
			{
				Row row = sh.getRow(i);
				Cell jeerollcell = row.getCell(37);
				Cell admissionstat = row.getCell(40);
				jeerollcell = sh.getRow(i).getCell(37);
				admissionstat = sh.getRow(i).getCell(40);
				if((jeerollcell.getStringCellValue().equals(roll)))
				{
					rownum = i;
					//break;
					
					if(admissionstat.getStringCellValue().equals("CONFIRM"))
					{
						//System.out.println("inside confirm");
						rownum=-2;
						break;
					}
					
					else
						break;
				}
			}
			
			return rownum;
		}
		catch(Exception err)
		{
			
			throw err;
		}	
		//return rownum;
	}


	public int unCHEMjeerollnumcheck(String roll) throws Exception
	{
		int rownum = -1;
		
		File file = new File("//10.20.10.52/Documents/#2016/CHEM.xls");
		//File file = new File("CHEM.xls");
		try
		{
			Workbook wb = WorkbookFactory.create(file);
			Sheet sh = wb.getSheet("ACPC");
			
			int last = sh.getLastRowNum();

			for(int i = 1; i<=last; i++)				
			{
				Row row = sh.getRow(i);
				Cell jeerollcell = row.getCell(37);
				Cell admissionstat = row.getCell(40);
				jeerollcell = sh.getRow(i).getCell(37);
				admissionstat = sh.getRow(i).getCell(40);
				if((jeerollcell.getStringCellValue().equals(roll)))
				{
					rownum = i;
					//break;
					
					if(admissionstat.getStringCellValue().equals("CONFIRM"))
					{
						//System.out.println("inside confirm");
						rownum=-2;
						break;
					}
					
					else
						break;
				}
			}
			
			return rownum;
		}
		catch(Exception err)
		{
			
			throw err;
		}	
		//return rownum;
	}

	public void ICTuncomfirmedadmission(String jeeroll, int yearjoin, String fname, String lname, String gen, String fatname, String branch, String cat, int acpcrank) throws Exception
	{		
		int last = 0;
		super.ACPCAdmission();
		try
		{
			student.setStudentDetails(fname,null,lname,gen,null,null,null,null,null,null,null,null,cat,null);
			guard.setGuardianDetails(fatname,null,null,null,null,null,null,null,null,null,null);
			board_jee.setBoard_JEEDetails("ACPC",0,0,null,null,null,null,null,null,null,null, jeeroll,acpcrank);
			enroll.setEnrollmentDetails(branch,"TENTATIVE", yearjoin);
			
			File file = new File("//10.20.10.52/Documents/#2016/ICT.xls");
			////File file = new File("ICT.xls");
			
			FileInputStream fread = null;

			HSSFWorkbook workbook = null;
			HSSFSheet worksheet = null;
			
			FileOutputStream fwrite = null;
			
			fread = new FileInputStream(file); 

			workbook = new HSSFWorkbook(fread); 
			worksheet = workbook.getSheet("ACPC");

			fwrite = new FileOutputStream(file);
			
			last = worksheet.getLastRowNum() + 1;

			Row row = worksheet.createRow(last);
			Cell[] cell = new Cell[42];
			
			for(int i = 0; i<42; i++)
			{
				cell[i] = row.createCell(i);

			}
			
			for(int i = 0; i<42; i++)
			{
				cell[i] = worksheet.getRow(last).getCell(i);
			}

			cell[1].setCellValue(student.getFirstName());
			cell[3].setCellValue(student.getLastName());
			cell[4].setCellValue(student.getGender());
			cell[13].setCellValue(student.getCategory());
			cell[15].setCellValue(guard.getFatherName());
			cell[26].setCellValue(board_jee.getAdmissionType());
			cell[37].setCellValue(board_jee.getJEERollnum());
			cell[38].setCellValue(board_jee.getACPCRank());
			cell[39].setCellValue(enroll.getEDBranch());
			cell[40].setCellValue(enroll.getEDAdmissionStatus());
			cell[41].setCellValue(enroll.getEDYearofJoining());
			
			fread.close();
			
			workbook.write(fwrite);
			fwrite.close();			
		}
		catch(Exception err)
		{
			
			throw err;
		}	
	}


	public void MECHuncomfirmedadmission(String jeeroll, int yearjoin, String fname, String lname, String gen, String fatname, String branch, String cat, int acpcrank) throws Exception
	{		
		int last = 0;
		super.ACPCAdmission();
		try
		{
			student.setStudentDetails(fname,null,lname,gen,null,null,null,null,null,null,null,null,cat,null);
			guard.setGuardianDetails(fatname,null,null,null,null,null,null,null,null,null,null);
			board_jee.setBoard_JEEDetails("ACPC",0,0,null,null,null,null,null,null,null,null, jeeroll,acpcrank);
			enroll.setEnrollmentDetails(branch,"TENTATIVE", yearjoin);
			
			File file = new File("//10.20.10.52/Documents/#2016/MECH.xls");
			//File file = new File("MECH.xls");
			
			FileInputStream fread = null;

			HSSFWorkbook workbook = null;
			HSSFSheet worksheet = null;
			
			FileOutputStream fwrite = null;
			
			fread = new FileInputStream(file); 

			workbook = new HSSFWorkbook(fread); 
			worksheet = workbook.getSheet("ACPC");

			fwrite = new FileOutputStream(file);
			
			last = worksheet.getLastRowNum() + 1;

			Row row = worksheet.createRow(last);
			Cell[] cell = new Cell[42];
			
			for(int i = 0; i<42; i++)
			{
				cell[i] = row.createCell(i);

			}
			
			for(int i = 0; i<42; i++)
			{
				cell[i] = worksheet.getRow(last).getCell(i);
			}

			cell[1].setCellValue(student.getFirstName());
			cell[3].setCellValue(student.getLastName());
			cell[4].setCellValue(student.getGender());
			cell[13].setCellValue(student.getCategory());
			cell[15].setCellValue(guard.getFatherName());
			cell[26].setCellValue(board_jee.getAdmissionType());
			cell[37].setCellValue(board_jee.getJEERollnum());
			cell[38].setCellValue(board_jee.getACPCRank());
			cell[39].setCellValue(enroll.getEDBranch());
			cell[40].setCellValue(enroll.getEDAdmissionStatus());
			cell[41].setCellValue(enroll.getEDYearofJoining());
			
			fread.close();
			
			workbook.write(fwrite);
			fwrite.close();			
		}
		catch(Exception err)
		{
			
			throw err;
		}	
	}

	
	public void CHEMuncomfirmedadmission(String jeeroll, int yearjoin, String fname, String lname, String gen, String fatname, String branch, String cat, int acpcrank) throws Exception
	{		
		int last = 0;
		super.ACPCAdmission();
		try
		{
			student.setStudentDetails(fname,null,lname,gen,null,null,null,null,null,null,null,null,cat,null);
			guard.setGuardianDetails(fatname,null,null,null,null,null,null,null,null,null,null);
			board_jee.setBoard_JEEDetails("ACPC",0,0,null,null,null,null,null,null,null,null, jeeroll,acpcrank);
			enroll.setEnrollmentDetails(branch,"TENTATIVE", yearjoin);
			
			File file = new File("//10.20.10.52/Documents/#2016/CHEM.xls");
			//File file = new File("CHEM.xls");
			
			FileInputStream fread = null;

			HSSFWorkbook workbook = null;
			HSSFSheet worksheet = null;
			
			FileOutputStream fwrite = null;
			
			fread = new FileInputStream(file); 

			workbook = new HSSFWorkbook(fread); 
			worksheet = workbook.getSheet("ACPC");

			fwrite = new FileOutputStream(file);
			
			last = worksheet.getLastRowNum() + 1;

			Row row = worksheet.createRow(last);
			Cell[] cell = new Cell[42];
			
			for(int i = 0; i<42; i++)
			{
				cell[i] = row.createCell(i);

			}
			
			for(int i = 0; i<42; i++)
			{
				cell[i] = worksheet.getRow(last).getCell(i);
			}

			cell[1].setCellValue(student.getFirstName());
			cell[3].setCellValue(student.getLastName());
			cell[4].setCellValue(student.getGender());
			cell[13].setCellValue(student.getCategory());
			cell[15].setCellValue(guard.getFatherName());
			cell[26].setCellValue(board_jee.getAdmissionType());
			cell[37].setCellValue(board_jee.getJEERollnum());
			cell[38].setCellValue(board_jee.getACPCRank());
			cell[39].setCellValue(enroll.getEDBranch());
			cell[40].setCellValue(enroll.getEDAdmissionStatus());
			cell[41].setCellValue(enroll.getEDYearofJoining());
			
			fread.close();
			
			workbook.write(fwrite);
			fwrite.close();			
		}
		catch(Exception err)
		{
			
			throw err;
		}	
	}
	
	
	
	/* This Condition for an Unconfirmed to Confirmed condition */
	public int ICTjeerollnumcheck(String roll) throws Exception
	{
		int rownum = -1;
		
		File file = new File("//10.20.10.52/Documents/#2016/ICT.xls");
		////File file = new File("ICT.xls");
		
		try
		{
			Workbook wb = WorkbookFactory.create(file);
			Sheet sh = wb.getSheet("ACPC");
			
			int last = sh.getLastRowNum();

			for(int i = 1; i<=last; i++)	
			{
				Row row = sh.getRow(i);
				Cell jeerollcell = row.getCell(37);
				Cell admissionstat = row.getCell(40);
				jeerollcell = sh.getRow(i).getCell(37);
				admissionstat = sh.getRow(i).getCell(40);
				//System.out.println(admissionstat.getStringCellValue());
				if((jeerollcell.getStringCellValue().equals(roll))) 
				{
					if(admissionstat.getStringCellValue().equals("TENTATIVE"))
					{
						rownum = i;
						break;
					}
							
					//break;
					
					else if(admissionstat.getStringCellValue().equals("CONFIRM"))
					{
						//System.out.println("inside confirm");
						rownum=-2;
						break;
					}
					
				}
				
				
						
			}
			
			return rownum;
		}
		catch(Exception err)
		{
			
			throw err;
		}	
		//return rownum;
	}
	

	/* This Condition for an Unconfirmed to Confirmed condition */
	public int MECHjeerollnumcheck(String roll) throws Exception
	{
		int rownum = -1;
		
		File file = new File("//10.20.10.52/Documents/#2016/MECH.xls");
		//File file = new File("MECH.xls");
		
		try
		{
			Workbook wb = WorkbookFactory.create(file);
			Sheet sh = wb.getSheet("ACPC");
			
			int last = sh.getLastRowNum();

			for(int i = 1; i<=last; i++)
			{
				Row row = sh.getRow(i);
				Cell jeerollcell = row.getCell(37);
				Cell admissionstat = row.getCell(40);
				jeerollcell = sh.getRow(i).getCell(37);
				admissionstat = sh.getRow(i).getCell(40);
				if((jeerollcell.getStringCellValue().equals(roll)))
				{
					if(admissionstat.getStringCellValue().equals("TENTATIVE"))
					{
						rownum = i;
						break;
					}
					
					if(admissionstat.getStringCellValue().equals("CONFIRM"))
					{
						//System.out.println("inside confirm");
						rownum=-2;
						break;
					}
				}
			}
			
			return rownum;
		}
		catch(Exception err)
		{
			
			throw err;
		}	
		//return rownum;
	}


	/* This Condition for an Unconfirmed to Confirmed condition */
	public int CHEMjeerollnumcheck(String roll) throws Exception
	{
		int rownum = -1;
		
		File file = new File("//10.20.10.52/Documents/#2016/CHEM.xls");
		//File file = new File("CHEM.xls");
		try
		{
			Workbook wb = WorkbookFactory.create(file);
			Sheet sh = wb.getSheet("ACPC");
			
			int last = sh.getLastRowNum();

			for(int i = 1; i<=last; i++)				
			{
				Row row = sh.getRow(i);
				Cell jeerollcell = row.getCell(37);
				Cell admissionstat = row.getCell(40);
				jeerollcell = sh.getRow(i).getCell(37);
				admissionstat = sh.getRow(i).getCell(40);
				if((jeerollcell.getStringCellValue().equals(roll)))
				{
					if(admissionstat.getStringCellValue().equals("TENTATIVE"))
					{
						rownum = i;
						break;
					}
					
					if(admissionstat.getStringCellValue().equals("CONFIRM"))
					{
						//System.out.println("inside confirm");
						rownum=-2;
						break;
					}
					
				}
			}
			
			return rownum;
		}
		catch(Exception err)
		{
			
			throw err;
		}	
		//return rownum;
	}

	
	
	
	/* ICT */
	public void ICTACPCEnterData(int rownum, String fname, String mname, String lname, String gen, String dis, String addl1, String state, String city, String pin, String pcontact, String scontact, String email, String cat, String dob, String fatname, String fatcontact, String fatqual, String fatoccu, String fatincome, String fatemail, String motname, String motcontact, String motqual, String motoccu, String motincome, String admissiontype, int pass10, int pass12, String boardroll, String schoolboard, String schoolname, String boardpertage, String pcmpertage, String pcmpertile, String jeescore, String jeepertile, String jeeroll, int acpcrank, String branch, String admissionstat, int yearjoin) throws Exception                                                                                                                                                             
	{
		
//		int last = 0;
		super.ACPCAdmission();
		try
		{
			student.setStudentDetails(fname,mname,lname,gen,dis,addl1,state,city,pin,pcontact,scontact,email,cat,dob);
			guard.setGuardianDetails(fatname,fatcontact,fatqual,fatoccu,fatincome,fatemail,motname,motcontact,motqual,motoccu,motincome);
			board_jee.setBoard_JEEDetails(admissiontype,pass10,pass12,boardroll,schoolboard,schoolname,boardpertage,pcmpertage,pcmpertile,jeescore,jeepertile, jeeroll,acpcrank);
			enroll.setEnrollmentDetails(branch,admissionstat, yearjoin);
			
			File file = new File("//10.20.10.52/Documents/#2016/ICT.xls");
			////File file = new File("ICT.xls");
			
			FileInputStream fread = null;

			HSSFWorkbook workbook = null;
			HSSFSheet worksheet = null;
			
			FileOutputStream fwrite = null;
			
			fread = new FileInputStream(file); 

			workbook = new HSSFWorkbook(fread); 
			worksheet = workbook.getSheet("ACPC");

			fwrite = new FileOutputStream(file);
			
//			last = worksheet.getLastRowNum() + 1;

			Row row = worksheet.createRow(rownum);
			Cell[] cell = new Cell[42];
			
			for(int i = 0; i<42; i++)
			{
				cell[i] = row.createCell(i);

			}
			
			for(int i = 0; i<42; i++)
			{
				cell[i] = worksheet.getRow(rownum).getCell(i);
			}
			
			cell[1].setCellValue(student.getFirstName());
			cell[2].setCellValue(student.getMiddleName());
			cell[3].setCellValue(student.getLastName());
			cell[4].setCellValue(student.getGender());
			cell[5].setCellValue(student.getDisability());
			cell[6].setCellValue(student.getAddL1());
			cell[7].setCellValue(student.getState());
			cell[8].setCellValue(student.getCity());
			cell[9].setCellValue(student.getPincode());
			cell[10].setCellValue(student.getPrimaryContact());
			cell[11].setCellValue(student.getSecondaryContact());
			cell[12].setCellValue(student.getEmailId());
			cell[13].setCellValue(student.getCategory());
			cell[14].setCellValue(student.getDOB());
			
			cell[15].setCellValue(guard.getFatherName());
			cell[16].setCellValue(guard.getFatherContact());
			cell[17].setCellValue(guard.getFatherQualification());
			cell[18].setCellValue(guard.getFatherOccupation());
			cell[19].setCellValue(guard.getFatherIncome());
			cell[20].setCellValue(guard.getFatherEmailId());
			cell[21].setCellValue(guard.getMotherName());
			cell[22].setCellValue(guard.getMotherContact());
			cell[23].setCellValue(guard.getMotherQualification());
			cell[24].setCellValue(guard.getMotherOccupation());
			cell[25].setCellValue(guard.getMotherIncome());
			
			cell[26].setCellValue(board_jee.getAdmissionType());
			cell[27].setCellValue(board_jee.getPassingYear_10th());
			cell[28].setCellValue(board_jee.getPassingYear_12th());
			cell[29].setCellValue(board_jee.getBoardRollNo_12th());
			cell[30].setCellValue(board_jee.getSchoolBoard());
			cell[31].setCellValue(board_jee.getSchoolName());
			cell[32].setCellValue(board_jee.getOverallPercentage_12th());
			cell[33].setCellValue(board_jee.getPCMTheoryPercentage_12th());
			cell[34].setCellValue(board_jee.getPCMTheoryPercentile_12th());
			cell[35].setCellValue(board_jee.getJEEScore());
			cell[36].setCellValue(board_jee.getJEEPercentile());
			cell[37].setCellValue(board_jee.getJEERollnum());
			cell[38].setCellValue(board_jee.getACPCRank());
			
			cell[39].setCellValue(enroll.getEDBranch());
			cell[40].setCellValue(enroll.getEDAdmissionStatus());
			cell[41].setCellValue(enroll.getEDYearofJoining());
			
			fread.close();
			
			workbook.write(fwrite);
			fwrite.close();
		}
		catch(Exception err)
		{
			
			throw err;
		}	

	}
	


	
	public void ICTNRISPONEnterData(String fname, String mname, String lname, String gen, String dis, String addl1, String state, String city, String pin, String pcontact, String scontact, String email, String cat, String dob, String fatname, String fatcontact, String fatqual, String fatoccu, String fatincome, String fatemail, String motname, String motcontact, String motqual, String motoccu, String motincome, String admissiontype, int pass10, int pass12, String boardroll, String schoolboard, String schoolname, String boardpertage, String pcmpertage, String pcmpertile, String jeescore, String jeepertile, String jeeroll, int acpcrank, String sponsorname, String gender, String nationality, String nristat, String realtionwstud, String nricontact, String nriaddress, String branch, String admissionstat, int yearjoin) throws Exception                                                                                                                                                             
	{
		
		int last = 0;
		super.NRISponsoredAdmission();
		try
		{
			student.setStudentDetails(fname,mname,lname,gen,dis,addl1,state,city,pin,pcontact,scontact,email,cat,dob);
			guard.setGuardianDetails(fatname,fatcontact,fatqual,fatoccu,fatincome,fatemail,motname,motcontact,motqual,motoccu,motincome);
			board_jee.setBoard_JEEDetails(admissiontype,pass10,pass12,boardroll,schoolboard,schoolname,boardpertage,pcmpertage,pcmpertile,jeescore,jeepertile, jeeroll,acpcrank);
			NRIspons.setNRISponsoredDetails(sponsorname,gender,nationality,nristat,realtionwstud,nricontact,nriaddress);
			enroll.setEnrollmentDetails(branch,admissionstat, yearjoin);
			
			File file = new File("//10.20.10.52/Documents/#2016/ICT.xls");
			////File file = new File("ICT.xls");
			
			FileInputStream fread = null;

			HSSFWorkbook workbook = null;
			HSSFSheet worksheet = null;
			
			FileOutputStream fwrite = null;
			
			fread = new FileInputStream(file); 

			workbook = new HSSFWorkbook(fread); 
			worksheet = workbook.getSheet("NRI_SPONSOR");

			fwrite = new FileOutputStream(file);
			
			last = worksheet.getLastRowNum() + 1;

			Row row = worksheet.createRow(last);
			Cell[] cell = new Cell[49];
			
			for(int i = 0; i<49; i++)
			{
				cell[i] = row.createCell(i);

			}

			for(int i = 0; i<49; i++)
			{
				cell[i] = worksheet.getRow(last).getCell(i);
			}
			
			cell[1].setCellValue(student.getFirstName());
			cell[2].setCellValue(student.getMiddleName());
			cell[3].setCellValue(student.getLastName());
			cell[4].setCellValue(student.getGender());
			cell[5].setCellValue(student.getDisability());
			cell[6].setCellValue(student.getAddL1());
			cell[7].setCellValue(student.getState());
			cell[8].setCellValue(student.getCity());
			cell[9].setCellValue(student.getPincode());
			cell[10].setCellValue(student.getPrimaryContact());
			cell[11].setCellValue(student.getSecondaryContact());
			cell[12].setCellValue(student.getEmailId());
			cell[13].setCellValue(student.getCategory());
			cell[14].setCellValue(student.getDOB());
			
			cell[15].setCellValue(guard.getFatherName());
			cell[16].setCellValue(guard.getFatherContact());
			cell[17].setCellValue(guard.getFatherQualification());
			cell[18].setCellValue(guard.getFatherOccupation());
			cell[19].setCellValue(guard.getFatherIncome());
			cell[20].setCellValue(guard.getFatherEmailId());
			cell[21].setCellValue(guard.getMotherName());
			cell[22].setCellValue(guard.getMotherContact());
			cell[23].setCellValue(guard.getMotherQualification());
			cell[24].setCellValue(guard.getMotherOccupation());
			cell[25].setCellValue(guard.getMotherIncome());
			
			cell[26].setCellValue(board_jee.getAdmissionType());
			cell[27].setCellValue(board_jee.getPassingYear_10th());
			cell[28].setCellValue(board_jee.getPassingYear_12th());
			cell[29].setCellValue(board_jee.getBoardRollNo_12th());
			cell[30].setCellValue(board_jee.getSchoolBoard());
			cell[31].setCellValue(board_jee.getSchoolName());
			cell[32].setCellValue(board_jee.getOverallPercentage_12th());
			cell[33].setCellValue(board_jee.getPCMTheoryPercentage_12th());
			cell[34].setCellValue(board_jee.getPCMTheoryPercentile_12th());
			cell[35].setCellValue(board_jee.getJEEScore());
			cell[36].setCellValue(board_jee.getJEEPercentile());
			cell[37].setCellValue(board_jee.getJEERollnum());
			cell[38].setCellValue(board_jee.getACPCRank());
			
			cell[39].setCellValue(NRIspons.getSponsorName());
			cell[40].setCellValue(NRIspons.getSponsorGender());
			cell[41].setCellValue(NRIspons.getSponsorNationality());
			cell[42].setCellValue(NRIspons.getSponsorNriStatus());
			cell[43].setCellValue(NRIspons.getSponsorRelation());
			cell[44].setCellValue(NRIspons.getSponsorContact());
			cell[45].setCellValue(NRIspons.getSponsorAddress());

			cell[46].setCellValue(enroll.getEDBranch());
			cell[47].setCellValue(enroll.getEDAdmissionStatus());
			cell[48].setCellValue(enroll.getEDYearofJoining());
			
			fread.close();
			
			workbook.write(fwrite);
			fwrite.close();
		}
		catch(Exception err)
		{
			
			throw err;
		}	

	}
	
	
	public void ICTNRIEnterData(String fname, String mname, String lname, String gen, String dis, String addl1, String state, String city, String pin, String pcontact, String scontact, String email, String cat, String dob, String fatname, String fatcontact, String fatqual, String fatoccu, String fatincome, String fatemail, String motname, String motcontact, String motqual, String motoccu, String motincome, String roll12, String grade, String nation, String NRI_status, String NRI_add, String branch, String admstat, int yearjoin) throws Exception
	{
		int last = 0;
		super.NRIStudentAdmission();
		try
		{
			student.setStudentDetails(fname,mname,lname,gen,dis,addl1,state,city,pin,pcontact,scontact,email,cat,dob);
			guard.setGuardianDetails(fatname,fatcontact,fatqual,fatoccu,fatincome,fatemail,motname,motcontact,motqual,motoccu,motincome);
			NRIstud.setNRIStudentDetails(grade, roll12, nation, NRI_status, NRI_add, "NRI");
			enroll.setEnrollmentDetails(branch,admstat, yearjoin);
			
			File file = new File("//10.20.10.52/Documents/#2016/ICT.xls");
			////File file = new File("ICT.xls");
			
			FileInputStream fread = null;

			HSSFWorkbook workbook = null;
			HSSFSheet worksheet = null;
			
			FileOutputStream fwrite = null;
			
			fread = new FileInputStream(file); 

			workbook = new HSSFWorkbook(fread); 
			worksheet = workbook.getSheet("NRI");

			fwrite = new FileOutputStream(file);
			
			last = worksheet.getLastRowNum() + 1;

			Row row = worksheet.createRow(last);
			Cell[] cell = new Cell[35];
			
			for(int i = 0; i<35; i++)
			{
				cell[i] = row.createCell(i);

			}
			
			for(int i = 0; i<35; i++)
			{
				cell[i] = worksheet.getRow(last).getCell(i);
			}
			
			cell[1].setCellValue(student.getFirstName());
			cell[2].setCellValue(student.getMiddleName());
			cell[3].setCellValue(student.getLastName());
			cell[4].setCellValue(student.getGender());
			cell[5].setCellValue(student.getDisability());
			cell[6].setCellValue(student.getAddL1());
			cell[7].setCellValue(student.getState());
			cell[8].setCellValue(student.getCity());
			cell[9].setCellValue(student.getPincode());
			cell[10].setCellValue(student.getPrimaryContact());
			cell[11].setCellValue(student.getSecondaryContact());
			cell[12].setCellValue(student.getEmailId());
			cell[13].setCellValue(student.getCategory());
			cell[14].setCellValue(student.getDOB());
			
			cell[15].setCellValue(guard.getFatherName());
			cell[16].setCellValue(guard.getFatherContact());
			cell[17].setCellValue(guard.getFatherQualification());
			cell[18].setCellValue(guard.getFatherOccupation());
			cell[19].setCellValue(guard.getFatherIncome());
			cell[20].setCellValue(guard.getFatherEmailId());
			cell[21].setCellValue(guard.getMotherName());
			cell[22].setCellValue(guard.getMotherContact());
			cell[23].setCellValue(guard.getMotherQualification());
			cell[24].setCellValue(guard.getMotherOccupation());
			cell[25].setCellValue(guard.getMotherIncome());
			
			cell[26].setCellValue(NRIstud.getAdmissionType());
			cell[27].setCellValue(NRIstud.getNRIRollNumber12());
	        cell[28].setCellValue(NRIstud.getNRIGrade12());
	        cell[29].setCellValue(NRIstud.getNationality());
	        cell[30].setCellValue(NRIstud.getNriStatus());
	        cell[31].setCellValue(NRIstud.getAddress());
	        
	        cell[32].setCellValue(enroll.getEDBranch());
			cell[33].setCellValue(enroll.getEDAdmissionStatus());
			cell[34].setCellValue(enroll.getEDYearofJoining());
			
			fread.close();
			
			workbook.write(fwrite);
			fwrite.close();
	        
		}
		catch(Exception err)
		{
			
			throw err;
		}	

		
	}

	
	
	/* MECH */
	public void MECHACPCEnterData(int rownum, String fname, String mname, String lname, String gen, String dis, String addl1, String state, String city, String pin, String pcontact, String scontact, String email, String cat, String dob, String fatname, String fatcontact, String fatqual, String fatoccu, String fatincome, String fatemail, String motname, String motcontact, String motqual, String motoccu, String motincome, String admissiontype, int pass10, int pass12, String boardroll, String schoolboard, String schoolname, String boardpertage, String pcmpertage, String pcmpertile, String jeescore, String jeepertile, String jeeroll, int acpcrank, String branch, String admissionstat, int yearjoin) throws Exception                                                                                                                                                             
	{
		
		//int last = 0;
		super.ACPCAdmission();
		try
		{
			student.setStudentDetails(fname,mname,lname,gen,dis,addl1,state,city,pin,pcontact,scontact,email,cat,dob);
			guard.setGuardianDetails(fatname,fatcontact,fatqual,fatoccu,fatincome,fatemail,motname,motcontact,motqual,motoccu,motincome);
			board_jee.setBoard_JEEDetails(admissiontype,pass10,pass12,boardroll,schoolboard,schoolname,boardpertage,pcmpertage,pcmpertile,jeescore,jeepertile, jeeroll,acpcrank);
			enroll.setEnrollmentDetails(branch,admissionstat, yearjoin);
			
			File file = new File("//10.20.10.52/Documents/#2016/MECH.xls");
			//File file = new File("MECH.xls");
			
			FileInputStream fread = null;

			HSSFWorkbook workbook = null;
			HSSFSheet worksheet = null;
			
			FileOutputStream fwrite = null;
			
			fread = new FileInputStream(file); 

			workbook = new HSSFWorkbook(fread); 
			worksheet = workbook.getSheet("ACPC");

			fwrite = new FileOutputStream(file);
			
			//last = worksheet.getLastRowNum() + 1;

			Row row = worksheet.createRow(rownum);
			Cell[] cell = new Cell[42];
			
			for(int i = 0; i<42; i++)
			{
				cell[i] = row.createCell(i);

			}
			
			for(int i = 0; i<42; i++)
			{
				cell[i] = worksheet.getRow(rownum).getCell(i);
			}
			
			cell[1].setCellValue(student.getFirstName());
			cell[2].setCellValue(student.getMiddleName());
			cell[3].setCellValue(student.getLastName());
			cell[4].setCellValue(student.getGender());
			cell[5].setCellValue(student.getDisability());
			cell[6].setCellValue(student.getAddL1());
			cell[7].setCellValue(student.getState());
			cell[8].setCellValue(student.getCity());
			cell[9].setCellValue(student.getPincode());
			cell[10].setCellValue(student.getPrimaryContact());
			cell[11].setCellValue(student.getSecondaryContact());
			cell[12].setCellValue(student.getEmailId());
			cell[13].setCellValue(student.getCategory());
			cell[14].setCellValue(student.getDOB());
			
			cell[15].setCellValue(guard.getFatherName());
			cell[16].setCellValue(guard.getFatherContact());
			cell[17].setCellValue(guard.getFatherQualification());
			cell[18].setCellValue(guard.getFatherOccupation());
			cell[19].setCellValue(guard.getFatherIncome());
			cell[20].setCellValue(guard.getFatherEmailId());
			cell[21].setCellValue(guard.getMotherName());
			cell[22].setCellValue(guard.getMotherContact());
			cell[23].setCellValue(guard.getMotherQualification());
			cell[24].setCellValue(guard.getMotherOccupation());
			cell[25].setCellValue(guard.getMotherIncome());
			
			cell[26].setCellValue(board_jee.getAdmissionType());
			cell[27].setCellValue(board_jee.getPassingYear_10th());
			cell[28].setCellValue(board_jee.getPassingYear_12th());
			cell[29].setCellValue(board_jee.getBoardRollNo_12th());
			cell[30].setCellValue(board_jee.getSchoolBoard());
			cell[31].setCellValue(board_jee.getSchoolName());
			cell[32].setCellValue(board_jee.getOverallPercentage_12th());
			cell[33].setCellValue(board_jee.getPCMTheoryPercentage_12th());
			cell[34].setCellValue(board_jee.getPCMTheoryPercentile_12th());
			cell[35].setCellValue(board_jee.getJEEScore());
			cell[36].setCellValue(board_jee.getJEEPercentile());
			cell[37].setCellValue(board_jee.getJEERollnum());
			cell[38].setCellValue(board_jee.getACPCRank());
			
			cell[39].setCellValue(enroll.getEDBranch());
			cell[40].setCellValue(enroll.getEDAdmissionStatus());
			cell[41].setCellValue(enroll.getEDYearofJoining());
			
			fread.close();
			
			workbook.write(fwrite);
			fwrite.close();			
		}
		catch(Exception err)
		{
			
			throw err;
		}	

	}

	public void MECHNRISPONEnterData(String fname, String mname, String lname, String gen, String dis, String addl1, String state, String city, String pin, String pcontact, String scontact, String email, String cat, String dob, String fatname, String fatcontact, String fatqual, String fatoccu, String fatincome, String fatemail, String motname, String motcontact, String motqual, String motoccu, String motincome, String admissiontype, int pass10, int pass12, String boardroll, String schoolboard, String schoolname, String boardpertage, String pcmpertage, String pcmpertile, String jeescore, String jeepertile, String jeeroll, int acpcrank, String sponsorname, String gender, String nationality, String nristat, String realtionwstud, String nricontact, String nriaddress, String branch, String admissionstat, int yearjoin) throws Exception                                                                                                                                                             
	{
		
		int last = 0;
		super.NRISponsoredAdmission();
		try
		{
			student.setStudentDetails(fname,mname,lname,gen,dis,addl1,state,city,pin,pcontact,scontact,email,cat,dob);
			guard.setGuardianDetails(fatname,fatcontact,fatqual,fatoccu,fatincome,fatemail,motname,motcontact,motqual,motoccu,motincome);
			board_jee.setBoard_JEEDetails(admissiontype,pass10,pass12,boardroll,schoolboard,schoolname,boardpertage,pcmpertage,pcmpertile,jeescore,jeepertile, jeeroll,acpcrank);
			NRIspons.setNRISponsoredDetails(sponsorname,gender,nationality,nristat,realtionwstud,nricontact,nriaddress);
			enroll.setEnrollmentDetails(branch,admissionstat, yearjoin);
			
			File file = new File("//10.20.10.52/Documents/#2016/MECH.xls");
			//File file = new File("MECH.xls");
			
			FileInputStream fread = null;

			HSSFWorkbook workbook = null;
			HSSFSheet worksheet = null;
			
			FileOutputStream fwrite = null;
			
			fread = new FileInputStream(file); 

			workbook = new HSSFWorkbook(fread); 
			worksheet = workbook.getSheet("NRI_SPONSOR");

			fwrite = new FileOutputStream(file);
			
			last = worksheet.getLastRowNum() + 1;

			Row row = worksheet.createRow(last);
			Cell[] cell = new Cell[49];
			
			for(int i = 0; i<49; i++)
			{
				cell[i] = row.createCell(i);

			}
			
			for(int i = 0; i<49; i++)
			{
				cell[i] = worksheet.getRow(last).getCell(i);
			}
			
			cell[1].setCellValue(student.getFirstName());
			cell[2].setCellValue(student.getMiddleName());
			cell[3].setCellValue(student.getLastName());
			cell[4].setCellValue(student.getGender());
			cell[5].setCellValue(student.getDisability());
			cell[6].setCellValue(student.getAddL1());
			cell[7].setCellValue(student.getState());
			cell[8].setCellValue(student.getCity());
			cell[9].setCellValue(student.getPincode());
			cell[10].setCellValue(student.getPrimaryContact());
			cell[11].setCellValue(student.getSecondaryContact());
			cell[12].setCellValue(student.getEmailId());
			cell[13].setCellValue(student.getCategory());
			cell[14].setCellValue(student.getDOB());
			
			cell[15].setCellValue(guard.getFatherName());
			cell[16].setCellValue(guard.getFatherContact());
			cell[17].setCellValue(guard.getFatherQualification());
			cell[18].setCellValue(guard.getFatherOccupation());
			cell[19].setCellValue(guard.getFatherIncome());
			cell[20].setCellValue(guard.getFatherEmailId());
			cell[21].setCellValue(guard.getMotherName());
			cell[22].setCellValue(guard.getMotherContact());
			cell[23].setCellValue(guard.getMotherQualification());
			cell[24].setCellValue(guard.getMotherOccupation());
			cell[25].setCellValue(guard.getMotherIncome());
			
			cell[26].setCellValue(board_jee.getAdmissionType());
			cell[27].setCellValue(board_jee.getPassingYear_10th());
			cell[28].setCellValue(board_jee.getPassingYear_12th());
			cell[29].setCellValue(board_jee.getBoardRollNo_12th());
			cell[30].setCellValue(board_jee.getSchoolBoard());
			cell[31].setCellValue(board_jee.getSchoolName());
			cell[32].setCellValue(board_jee.getOverallPercentage_12th());
			cell[33].setCellValue(board_jee.getPCMTheoryPercentage_12th());
			cell[34].setCellValue(board_jee.getPCMTheoryPercentile_12th());
			cell[35].setCellValue(board_jee.getJEEScore());
			cell[36].setCellValue(board_jee.getJEEPercentile());
			cell[37].setCellValue(board_jee.getJEERollnum());
			cell[38].setCellValue(board_jee.getACPCRank());
			
			cell[39].setCellValue(NRIspons.getSponsorName());
			cell[40].setCellValue(NRIspons.getSponsorGender());
			cell[41].setCellValue(NRIspons.getSponsorNationality());
			cell[42].setCellValue(NRIspons.getSponsorNriStatus());
			cell[43].setCellValue(NRIspons.getSponsorRelation());
			cell[44].setCellValue(NRIspons.getSponsorContact());
			cell[45].setCellValue(NRIspons.getSponsorAddress());

			cell[46].setCellValue(enroll.getEDBranch());
			cell[47].setCellValue(enroll.getEDAdmissionStatus());
			cell[48].setCellValue(enroll.getEDYearofJoining());
			
			fread.close();
			
			workbook.write(fwrite);
			fwrite.close();
		}
		catch(Exception err)
		{
			
			throw err;
		}	

	}

	public void MECHNRIEnterData(String fname, String mname, String lname, String gen, String dis, String addl1, String state, String city, String pin, String pcontact, String scontact, String email, String cat, String dob, String fatname, String fatcontact, String fatqual, String fatoccu, String fatincome, String fatemail, String motname, String motcontact, String motqual, String motoccu, String motincome, String roll12, String grade, String nation, String NRI_status, String NRI_add, String branch, String admstat, int yearjoin) throws Exception
	{
		int last = 0;
		super.NRIStudentAdmission();
		try
		{
			student.setStudentDetails(fname,mname,lname,gen,dis,addl1,state,city,pin,pcontact,scontact,email,cat,dob);
			guard.setGuardianDetails(fatname,fatcontact,fatqual,fatoccu,fatincome,fatemail,motname,motcontact,motqual,motoccu,motincome);
			NRIstud.setNRIStudentDetails(grade, roll12, nation, NRI_status, NRI_add, "NRI");
			enroll.setEnrollmentDetails(branch,admstat, yearjoin);
			
			File file = new File("//10.20.10.52/Documents/#2016/MECH.xls");
			//File file = new File("MECH.xls");
			
			FileInputStream fread = null;

			HSSFWorkbook workbook = null;
			HSSFSheet worksheet = null;
			
			FileOutputStream fwrite = null;
			
			fread = new FileInputStream(file); 

			workbook = new HSSFWorkbook(fread); 
			worksheet = workbook.getSheet("NRI");

			fwrite = new FileOutputStream(file);
			
			last = worksheet.getLastRowNum() + 1;

			Row row = worksheet.createRow(last);
			Cell[] cell = new Cell[35];
			
			for(int i = 0; i<35; i++)
			{
				cell[i] = row.createCell(i);

			}
			
			for(int i = 0; i<35; i++)
			{
				cell[i] = worksheet.getRow(last).getCell(i);
			}
			
			cell[1].setCellValue(student.getFirstName());
			cell[2].setCellValue(student.getMiddleName());
			cell[3].setCellValue(student.getLastName());
			cell[4].setCellValue(student.getGender());
			cell[5].setCellValue(student.getDisability());
			cell[6].setCellValue(student.getAddL1());
			cell[7].setCellValue(student.getState());
			cell[8].setCellValue(student.getCity());
			cell[9].setCellValue(student.getPincode());
			cell[10].setCellValue(student.getPrimaryContact());
			cell[11].setCellValue(student.getSecondaryContact());
			cell[12].setCellValue(student.getEmailId());
			cell[13].setCellValue(student.getCategory());
			cell[14].setCellValue(student.getDOB());
			
			cell[15].setCellValue(guard.getFatherName());
			cell[16].setCellValue(guard.getFatherContact());
			cell[17].setCellValue(guard.getFatherQualification());
			cell[18].setCellValue(guard.getFatherOccupation());
			cell[19].setCellValue(guard.getFatherIncome());
			cell[20].setCellValue(guard.getFatherEmailId());
			cell[21].setCellValue(guard.getMotherName());
			cell[22].setCellValue(guard.getMotherContact());
			cell[23].setCellValue(guard.getMotherQualification());
			cell[24].setCellValue(guard.getMotherOccupation());
			cell[25].setCellValue(guard.getMotherIncome());
			
			cell[26].setCellValue(NRIstud.getAdmissionType());
			cell[27].setCellValue(NRIstud.getNRIRollNumber12());
	        cell[28].setCellValue(NRIstud.getNRIGrade12());
	        cell[29].setCellValue(NRIstud.getNationality());
	        cell[30].setCellValue(NRIstud.getNriStatus());
	        cell[31].setCellValue(NRIstud.getAddress());
	        
	        cell[32].setCellValue(enroll.getEDBranch());
			cell[33].setCellValue(enroll.getEDAdmissionStatus());
			cell[34].setCellValue(enroll.getEDYearofJoining());
			
			fread.close();
			
			workbook.write(fwrite);
			fwrite.close();
	        
		}
		catch(Exception err)
		{
			
			throw err;
		}	

		
	}
	
	/* CHEM */
	public void CHEMACPCEnterData(int rownum, String fname, String mname, String lname, String gen, String dis, String addl1, String state, String city, String pin, String pcontact, String scontact, String email, String cat, String dob, String fatname, String fatcontact, String fatqual, String fatoccu, String fatincome, String fatemail, String motname, String motcontact, String motqual, String motoccu, String motincome, String admissiontype, int pass10, int pass12, String boardroll, String schoolboard, String schoolname, String boardpertage, String pcmpertage, String pcmpertile, String jeescore, String jeepertile, String jeeroll, int acpcrank, String branch, String admissionstat, int yearjoin) throws Exception                                                                                                                                                             
	{
		
		//int last = 0;
		super.ACPCAdmission();
		try
		{
			student.setStudentDetails(fname,mname,lname,gen,dis,addl1,state,city,pin,pcontact,scontact,email,cat,dob);
			guard.setGuardianDetails(fatname,fatcontact,fatqual,fatoccu,fatincome,fatemail,motname,motcontact,motqual,motoccu,motincome);
			board_jee.setBoard_JEEDetails(admissiontype,pass10,pass12,boardroll,schoolboard,schoolname,boardpertage,pcmpertage,pcmpertile,jeescore,jeepertile, jeeroll,acpcrank);
			enroll.setEnrollmentDetails(branch,admissionstat, yearjoin);
			
			File file = new File("//10.20.10.52/Documents/#2016/CHEM.xls");
			//File file = new File("CHEM.xls");
			
			FileInputStream fread = null;

			HSSFWorkbook workbook = null;
			HSSFSheet worksheet = null;
			
			FileOutputStream fwrite = null;
			
			fread = new FileInputStream(file); 

			workbook = new HSSFWorkbook(fread); 
			worksheet = workbook.getSheet("ACPC");

			fwrite = new FileOutputStream(file);
			
			//last = worksheet.getLastRowNum() + 1;

			Row row = worksheet.createRow(rownum);
			Cell[] cell = new Cell[42];
			
			for(int i = 0; i<42; i++)
			{
				cell[i] = row.createCell(i);

			}
			
			for(int i = 0; i<42; i++)
			{
				cell[i] = worksheet.getRow(rownum).getCell(i);
			}
			
			cell[1].setCellValue(student.getFirstName());
			cell[2].setCellValue(student.getMiddleName());
			cell[3].setCellValue(student.getLastName());
			cell[4].setCellValue(student.getGender());
			cell[5].setCellValue(student.getDisability());
			cell[6].setCellValue(student.getAddL1());
			cell[7].setCellValue(student.getState());
			cell[8].setCellValue(student.getCity());
			cell[9].setCellValue(student.getPincode());
			cell[10].setCellValue(student.getPrimaryContact());
			cell[11].setCellValue(student.getSecondaryContact());
			cell[12].setCellValue(student.getEmailId());
			cell[13].setCellValue(student.getCategory());
			cell[14].setCellValue(student.getDOB());
			
			cell[15].setCellValue(guard.getFatherName());
			cell[16].setCellValue(guard.getFatherContact());
			cell[17].setCellValue(guard.getFatherQualification());
			cell[18].setCellValue(guard.getFatherOccupation());
			cell[19].setCellValue(guard.getFatherIncome());
			cell[20].setCellValue(guard.getFatherEmailId());
			cell[21].setCellValue(guard.getMotherName());
			cell[22].setCellValue(guard.getMotherContact());
			cell[23].setCellValue(guard.getMotherQualification());
			cell[24].setCellValue(guard.getMotherOccupation());
			cell[25].setCellValue(guard.getMotherIncome());
			
			cell[26].setCellValue(board_jee.getAdmissionType());
			cell[27].setCellValue(board_jee.getPassingYear_10th());
			cell[28].setCellValue(board_jee.getPassingYear_12th());
			cell[29].setCellValue(board_jee.getBoardRollNo_12th());
			cell[30].setCellValue(board_jee.getSchoolBoard());
			cell[31].setCellValue(board_jee.getSchoolName());
			cell[32].setCellValue(board_jee.getOverallPercentage_12th());
			cell[33].setCellValue(board_jee.getPCMTheoryPercentage_12th());
			cell[34].setCellValue(board_jee.getPCMTheoryPercentile_12th());
			cell[35].setCellValue(board_jee.getJEEScore());
			cell[36].setCellValue(board_jee.getJEEPercentile());
			cell[37].setCellValue(board_jee.getJEERollnum());
			cell[38].setCellValue(board_jee.getACPCRank());
			
			cell[39].setCellValue(enroll.getEDBranch());
			cell[40].setCellValue(enroll.getEDAdmissionStatus());
			cell[41].setCellValue(enroll.getEDYearofJoining());
			
			fread.close();
			
			workbook.write(fwrite);
			fwrite.close();			
		}
		catch(Exception err)
		{
			
			throw err;
		}	
	}
	
	public void CHEMNRISPONEnterData(String fname, String mname, String lname, String gen, String dis, String addl1, String state, String city, String pin, String pcontact, String scontact, String email, String cat, String dob, String fatname, String fatcontact, String fatqual, String fatoccu, String fatincome, String fatemail, String motname, String motcontact, String motqual, String motoccu, String motincome, String admissiontype, int pass10, int pass12, String boardroll, String schoolboard, String schoolname, String boardpertage, String pcmpertage, String pcmpertile, String jeescore, String jeepertile, String jeeroll, int acpcrank, String sponsorname, String gender, String nationality, String nristat, String realtionwstud, String nricontact, String nriaddress, String branch, String admissionstat, int yearjoin) throws Exception                                                                                                                                                             
	{
		
		int last = 0;
		super.NRISponsoredAdmission();
		try
		{
			student.setStudentDetails(fname,mname,lname,gen,dis,addl1,state,city,pin,pcontact,scontact,email,cat,dob);
			guard.setGuardianDetails(fatname,fatcontact,fatqual,fatoccu,fatincome,fatemail,motname,motcontact,motqual,motoccu,motincome);
			board_jee.setBoard_JEEDetails(admissiontype,pass10,pass12,boardroll,schoolboard,schoolname,boardpertage,pcmpertage,pcmpertile,jeescore,jeepertile, jeeroll,acpcrank);
			NRIspons.setNRISponsoredDetails(sponsorname,gender,nationality,nristat,realtionwstud,nricontact,nriaddress);
			enroll.setEnrollmentDetails(branch,admissionstat, yearjoin);
			
			File file = new File("//10.20.10.52/Documents/#2016/CHEM.xls");
			//File file = new File("CHEM.xls");
			
			FileInputStream fread = null;

			HSSFWorkbook workbook = null;
			HSSFSheet worksheet = null;
			
			FileOutputStream fwrite = null;
			
			fread = new FileInputStream(file); 

			workbook = new HSSFWorkbook(fread); 
			worksheet = workbook.getSheet("NRI_SPONSOR");

			fwrite = new FileOutputStream(file);
			
			last = worksheet.getLastRowNum() + 1;

			Row row = worksheet.createRow(last);
			Cell[] cell = new Cell[49];
			
			for(int i = 0; i<49; i++)
			{
				cell[i] = row.createCell(i);

			}
			
			for(int i = 0; i<49; i++)
			{
				cell[i] = worksheet.getRow(last).getCell(i);
			}
			
			cell[1].setCellValue(student.getFirstName());
			cell[2].setCellValue(student.getMiddleName());
			cell[3].setCellValue(student.getLastName());
			cell[4].setCellValue(student.getGender());
			cell[5].setCellValue(student.getDisability());
			cell[6].setCellValue(student.getAddL1());
			cell[7].setCellValue(student.getState());
			cell[8].setCellValue(student.getCity());
			cell[9].setCellValue(student.getPincode());
			cell[10].setCellValue(student.getPrimaryContact());
			cell[11].setCellValue(student.getSecondaryContact());
			cell[12].setCellValue(student.getEmailId());
			cell[13].setCellValue(student.getCategory());
			cell[14].setCellValue(student.getDOB());
			
			cell[15].setCellValue(guard.getFatherName());
			cell[16].setCellValue(guard.getFatherContact());
			cell[17].setCellValue(guard.getFatherQualification());
			cell[18].setCellValue(guard.getFatherOccupation());
			cell[19].setCellValue(guard.getFatherIncome());
			cell[20].setCellValue(guard.getFatherEmailId());
			cell[21].setCellValue(guard.getMotherName());
			cell[22].setCellValue(guard.getMotherContact());
			cell[23].setCellValue(guard.getMotherQualification());
			cell[24].setCellValue(guard.getMotherOccupation());
			cell[25].setCellValue(guard.getMotherIncome());
			
			cell[26].setCellValue(board_jee.getAdmissionType());
			cell[27].setCellValue(board_jee.getPassingYear_10th());
			cell[28].setCellValue(board_jee.getPassingYear_12th());
			cell[29].setCellValue(board_jee.getBoardRollNo_12th());
			cell[30].setCellValue(board_jee.getSchoolBoard());
			cell[31].setCellValue(board_jee.getSchoolName());
			cell[32].setCellValue(board_jee.getOverallPercentage_12th());
			cell[33].setCellValue(board_jee.getPCMTheoryPercentage_12th());
			cell[34].setCellValue(board_jee.getPCMTheoryPercentile_12th());
			cell[35].setCellValue(board_jee.getJEEScore());
			cell[36].setCellValue(board_jee.getJEEPercentile());
			cell[37].setCellValue(board_jee.getJEERollnum());
			cell[38].setCellValue(board_jee.getACPCRank());
			
			cell[39].setCellValue(NRIspons.getSponsorName());
			cell[40].setCellValue(NRIspons.getSponsorGender());
			cell[41].setCellValue(NRIspons.getSponsorNationality());
			cell[42].setCellValue(NRIspons.getSponsorNriStatus());
			cell[43].setCellValue(NRIspons.getSponsorRelation());
			cell[44].setCellValue(NRIspons.getSponsorContact());
			cell[45].setCellValue(NRIspons.getSponsorAddress());

			cell[46].setCellValue(enroll.getEDBranch());
			cell[47].setCellValue(enroll.getEDAdmissionStatus());
			cell[48].setCellValue(enroll.getEDYearofJoining());
			
			fread.close();
			
			workbook.write(fwrite);
			fwrite.close();
		}
		catch(Exception err)
		{
			
			throw err;
		}	

	}
	
	public void CHEMNRIEnterData(String fname, String mname, String lname, String gen, String dis, String addl1, String state, String city, String pin, String pcontact, String scontact, String email, String cat, String dob, String fatname, String fatcontact, String fatqual, String fatoccu, String fatincome, String fatemail, String motname, String motcontact, String motqual, String motoccu, String motincome, String roll12, String grade, String nation, String NRI_status, String NRI_add, String branch, String admstat, int yearjoin) throws Exception
	{
		int last = 0;
		super.NRIStudentAdmission();
		try
		{
			student.setStudentDetails(fname,mname,lname,gen,dis,addl1,state,city,pin,pcontact,scontact,email,cat,dob);
			guard.setGuardianDetails(fatname,fatcontact,fatqual,fatoccu,fatincome,fatemail,motname,motcontact,motqual,motoccu,motincome);
			NRIstud.setNRIStudentDetails(grade, roll12, nation, NRI_status, NRI_add, "NRI");
			enroll.setEnrollmentDetails(branch,admstat, yearjoin);
			
			File file = new File("//10.20.10.52/Documents/#2016/CHEM.xls");
			//File file = new File("CHEM.xls");
			
			FileInputStream fread = null;

			HSSFWorkbook workbook = null;
			HSSFSheet worksheet = null;
			
			FileOutputStream fwrite = null;
			
			fread = new FileInputStream(file); 

			workbook = new HSSFWorkbook(fread); 
			worksheet = workbook.getSheet("NRI");

			fwrite = new FileOutputStream(file);
			
			last = worksheet.getLastRowNum() + 1;

			Row row = worksheet.createRow(last);
			Cell[] cell = new Cell[35];
			
			for(int i = 0; i<35; i++)
			{
				cell[i] = row.createCell(i);

			}
			
			for(int i = 0; i<35; i++)
			{
				cell[i] = worksheet.getRow(last).getCell(i);
			}
			
			cell[1].setCellValue(student.getFirstName());
			cell[2].setCellValue(student.getMiddleName());
			cell[3].setCellValue(student.getLastName());
			cell[4].setCellValue(student.getGender());
			cell[5].setCellValue(student.getDisability());
			cell[6].setCellValue(student.getAddL1());
			cell[7].setCellValue(student.getState());
			cell[8].setCellValue(student.getCity());
			cell[9].setCellValue(student.getPincode());
			cell[10].setCellValue(student.getPrimaryContact());
			cell[11].setCellValue(student.getSecondaryContact());
			cell[12].setCellValue(student.getEmailId());
			cell[13].setCellValue(student.getCategory());
			cell[14].setCellValue(student.getDOB());
			
			cell[15].setCellValue(guard.getFatherName());
			cell[16].setCellValue(guard.getFatherContact());
			cell[17].setCellValue(guard.getFatherQualification());
			cell[18].setCellValue(guard.getFatherOccupation());
			cell[19].setCellValue(guard.getFatherIncome());
			cell[20].setCellValue(guard.getFatherEmailId());
			cell[21].setCellValue(guard.getMotherName());
			cell[22].setCellValue(guard.getMotherContact());
			cell[23].setCellValue(guard.getMotherQualification());
			cell[24].setCellValue(guard.getMotherOccupation());
			cell[25].setCellValue(guard.getMotherIncome());
			
			cell[26].setCellValue(NRIstud.getAdmissionType());
			cell[27].setCellValue(NRIstud.getNRIRollNumber12());
	        cell[28].setCellValue(NRIstud.getNRIGrade12());
	        cell[29].setCellValue(NRIstud.getNationality());
	        cell[30].setCellValue(NRIstud.getNriStatus());
	        cell[31].setCellValue(NRIstud.getAddress());
	        
	        cell[32].setCellValue(enroll.getEDBranch());
			cell[33].setCellValue(enroll.getEDAdmissionStatus());
			cell[34].setCellValue(enroll.getEDYearofJoining());
			
			fread.close();
			
			workbook.write(fwrite);
			fwrite.close();
	        
		}
		catch(Exception err)
		{
			
			throw err;
		}	

		
	}

	public int ICTnrisponjeerollnumcheck(String roll) throws Exception
	{
		int rownum = -1;
		
		File file = new File("//10.20.10.52/Documents/#2016/ICT.xls");
		////File file = new File("ICT.xls");
		
		try
		{
			Workbook wb = WorkbookFactory.create(file);
			Sheet sh = wb.getSheet("NRI_SPONSOR");
			
			int last = sh.getLastRowNum();

			for(int i = 1; i<=last; i++)	
			{
				Row row = sh.getRow(i);
				Cell jeerollcell = row.getCell(37);
				Cell admissionstat = row.getCell(47);
				jeerollcell = sh.getRow(i).getCell(37);
				admissionstat = sh.getRow(i).getCell(47);
				//System.out.println(admissionstat.getStringCellValue());
				if((jeerollcell.getStringCellValue().equals(roll)) && (admissionstat.getStringCellValue().equals("CONFIRM"))) 
				{
					rownum = i;
					break;
				}		
			}
			
			return rownum;
		}
		catch(Exception err)
		{
			
			throw err;
		}	
		//return rownum;
		/* -1 if didnt found the row with the specific roll number in the file */
		/* Any other number if found the Roll number at a specific row in the file */
	}
	
	public int MECHnrisponjeerollnumcheck(String roll) throws Exception
	{
		int rownum = -1;
		
		File file = new File("//10.20.10.52/Documents/#2016/MECH.xls");
		////File file = new File("MECH.xls");
		
		try
		{
			Workbook wb = WorkbookFactory.create(file);
			Sheet sh = wb.getSheet("NRI_SPONSOR");
			
			int last = sh.getLastRowNum();

			for(int i = 1; i<=last; i++)	
			{
				Row row = sh.getRow(i);
				Cell jeerollcell = row.getCell(37);
				Cell admissionstat = row.getCell(47);
				jeerollcell = sh.getRow(i).getCell(37);
				admissionstat = sh.getRow(i).getCell(47);
				//System.out.println(admissionstat.getStringCellValue());
				if((jeerollcell.getStringCellValue().equals(roll)) && (admissionstat.getStringCellValue().equals("CONFIRM"))) 
				{
					rownum = i;
					break;
				}		
			}
			
			return rownum;
		}
		catch(Exception err)
		{
			
			throw err;
		}	
		//return rownum;
		/* -1 if didnt found the row with the specific roll number in the file */
		/* Any other number if found the Roll number at a specific row in the file */
	}

	public int CHEMnrisponjeerollnumcheck(String roll) throws Exception
	{
		int rownum = -1;
		
		File file = new File("//10.20.10.52/Documents/#2016/CHEM.xls");
		//File file = new File("CHEM.xls");
		
		try
		{
			Workbook wb = WorkbookFactory.create(file);
			Sheet sh = wb.getSheet("NRI_SPONSOR");
			
			int last = sh.getLastRowNum();

			for(int i = 1; i<=last; i++)	
			{
				Row row = sh.getRow(i);
				Cell jeerollcell = row.getCell(37);
				Cell admissionstat = row.getCell(47);
				jeerollcell = sh.getRow(i).getCell(37);
				admissionstat = sh.getRow(i).getCell(47);
				//System.out.println(admissionstat.getStringCellValue());
				if((jeerollcell.getStringCellValue().equals(roll)) && (admissionstat.getStringCellValue().equals("CONFIRM"))) 
				{
					rownum = i;
					break;
				}		
			}
			return rownum;
		}
		catch(Exception err)
		{
			
			throw err;
		}	
//		/return rownum;
		
		/* -1 if didnt found the row with the specific roll number in the file */
		/* Any other number if found the Roll number at a specific row in the file */
	}

	
	public int ICTnristudrollcheck(String roll) throws Exception
	{
		int rownum = -1;
		
		File file = new File("//10.20.10.52/Documents/#2016/ICT.xls");
		////File file = new File("ICT.xls");
		
		try
		{
			Workbook wb = WorkbookFactory.create(file);
			Sheet sh = wb.getSheet("NRI");
			
			int last = sh.getLastRowNum();

			for(int i = 1; i<=last; i++)	
			{
				Row row = sh.getRow(i);
				Cell rollcell = row.getCell(27);
				Cell admissionstat = row.getCell(33);
				rollcell = sh.getRow(i).getCell(27);
				admissionstat = sh.getRow(i).getCell(33);
				//System.out.println(admissionstat.getStringCellValue());
				if((rollcell.getStringCellValue().equals(roll)) && (admissionstat.getStringCellValue().equals("CONFIRM"))) 
				{
					rownum = i;
					break;
				}		
			}
			return rownum;
		}
		catch(Exception err)
		{
			
			throw err;
		}	
//		/return rownum;
		/* -1 if didnt found the row with the specific roll number in the file */
		/* Any other number if found the Roll number at a specific row in the file */
	}

	public int MECHnristudrollcheck(String roll) throws Exception
	{
		int rownum = -1;
		
		File file = new File("//10.20.10.52/Documents/#2016/MECH.xls");
		//File file = new File("MECH.xls");
		
		try
		{
			Workbook wb = WorkbookFactory.create(file);
			Sheet sh = wb.getSheet("NRI");
			
			int last = sh.getLastRowNum();

			for(int i = 1; i<=last; i++)	
			{
				Row row = sh.getRow(i);
				Cell jeerollcell = row.getCell(27);
				Cell admissionstat = row.getCell(33);
				jeerollcell = sh.getRow(i).getCell(27);
				admissionstat = sh.getRow(i).getCell(33);
				//System.out.println(admissionstat.getStringCellValue());
				if((jeerollcell.getStringCellValue().equals(roll)) && (admissionstat.getStringCellValue().equals("CONFIRM"))) 
				{
					rownum = i;
					break;
				}		
			}
			return rownum;
		}
		catch(Exception err)
		{
			
			throw err;
		}	
		//return rownum;
		/* -1 if didnt found the row with the specific roll number in the file */
		/* Any other number if found the Roll number at a specific row in the file */
	}
	
	public int CHEMnristudrollcheck(String roll) throws Exception
	{
		int rownum = -1;
		
		File file = new File("//10.20.10.52/Documents/#2016/CHEM.xls");
		//File file = new File("CHEM.xls");
		
		try
		{
			Workbook wb = WorkbookFactory.create(file);
			Sheet sh = wb.getSheet("NRI");
			
			int last = sh.getLastRowNum();

			for(int i = 1; i<=last; i++)	
			{
				Row row = sh.getRow(i);
				Cell jeerollcell = row.getCell(27);
				Cell admissionstat = row.getCell(33);
				jeerollcell = sh.getRow(i).getCell(27);
				admissionstat = sh.getRow(i).getCell(33);
				//System.out.println(admissionstat.getStringCellValue());
				if((jeerollcell.getStringCellValue().equals(roll)) && (admissionstat.getStringCellValue().equals("CONFIRM"))) 
				{
					rownum = i;
					break;
				}		
			}
			
			return rownum;
		}
		catch(Exception err)
		{
			
			throw err;
		}	
		//return rownum;
		/* -1 if didnt found the row with the specific roll number in the file */
		/* Any other number if found the Roll number at a specific row in the file */
	}
	
	public void docICTACPC(String jeeroll, String fname, String lname, String marksheet10, String marksheet12, String jeemarksheet, String schleaving, String meritrec, String rec20, String allotletter, String photos) throws Exception
	{
		int last = 0;
		try
		{			
			File file = new File("//10.20.10.52/Documents/#2016/ICT.xls");
			////File file = new File("ICT.xls");
			
			FileInputStream fread = null;

			HSSFWorkbook workbook = null;
			HSSFSheet worksheet = null;
			
			FileOutputStream fwrite = null;
			
			fread = new FileInputStream(file); 

			workbook = new HSSFWorkbook(fread); 
			worksheet = workbook.getSheet("ACPC_Docs");

			fwrite = new FileOutputStream(file);
			
			last = worksheet.getLastRowNum() + 1;

			Row row = worksheet.createRow(last);
			Cell[] cell = new Cell[11];
			
			for(int i = 0; i<11; i++)
			{
				cell[i] = row.createCell(i);

			}

			for(int i = 0; i<11; i++)
			{
				cell[i] = worksheet.getRow(last).getCell(i);
			}
			
			cell[0].setCellValue(jeeroll);
			cell[1].setCellValue(fname);
			cell[2].setCellValue(lname);
			cell[3].setCellValue(marksheet10);
			cell[4].setCellValue(marksheet12);
			cell[5].setCellValue(jeemarksheet);
			cell[6].setCellValue(schleaving);
			cell[7].setCellValue(meritrec);
			cell[8].setCellValue(rec20);
			cell[9].setCellValue(allotletter);
			cell[10].setCellValue(photos);
			
			fread.close();
			
			workbook.write(fwrite);
			fwrite.close();
		}
		catch(Exception err)
		{
			throw err;
		}
	}
	
	public void docICTNRISPON(String jeeroll, String fname, String lname, String marksheet10, String marksheet12, String jeemarksheet, String schleaving, String meritrec, String rec20, String allotletter, String photos, String affi, String xerox, String nriproof) throws Exception
	{
		int last = 0;
		try
		{			
			File file = new File("//10.20.10.52/Documents/#2016/ICT.xls");
			////File file = new File("ICT.xls");
			
			FileInputStream fread = null;

			HSSFWorkbook workbook = null;
			HSSFSheet worksheet = null;
			
			FileOutputStream fwrite = null;
			
			fread = new FileInputStream(file); 

			workbook = new HSSFWorkbook(fread); 
			worksheet = workbook.getSheet("NRI_SPONSOR_Docs");

			fwrite = new FileOutputStream(file);
			
			last = worksheet.getLastRowNum() + 1;

			Row row = worksheet.createRow(last);
			Cell[] cell = new Cell[14];
			
			for(int i = 0; i<14; i++)
			{
				cell[i] = row.createCell(i);

			}

			for(int i = 0; i<14; i++)
			{
				cell[i] = worksheet.getRow(last).getCell(i);
			}
			
			cell[0].setCellValue(jeeroll);
			cell[1].setCellValue(fname);
			cell[2].setCellValue(lname);
			cell[3].setCellValue(marksheet10);
			cell[4].setCellValue(marksheet12);
			cell[5].setCellValue(jeemarksheet);
			cell[6].setCellValue(schleaving);
			cell[7].setCellValue(meritrec);
			cell[8].setCellValue(rec20);
			cell[9].setCellValue(allotletter);
			cell[10].setCellValue(photos);
			cell[11].setCellValue(affi);
			cell[12].setCellValue(xerox);
			cell[13].setCellValue(nriproof);
			
			fread.close();
			
			workbook.write(fwrite);
			fwrite.close();
		}
		catch(Exception err)
		{
			err.printStackTrace();
			throw err;
		}
	}

	public void docICTNRI(String roll, String fname, String lname, String lastedu, String migration, String xerox, String photos) throws Exception
	{
		int last = 0;
		try
		{			
			File file = new File("//10.20.10.52/Documents/#2016/ICT.xls");
			////File file = new File("ICT.xls");
			
			FileInputStream fread = null;

			HSSFWorkbook workbook = null;
			HSSFSheet worksheet = null;
			
			FileOutputStream fwrite = null;
			
			fread = new FileInputStream(file); 

			workbook = new HSSFWorkbook(fread); 
			worksheet = workbook.getSheet("NRI_Docs");

			fwrite = new FileOutputStream(file);
			
			last = worksheet.getLastRowNum() + 1;

			Row row = worksheet.createRow(last);
			Cell[] cell = new Cell[7];
			
			for(int i = 0; i<7; i++)
			{
				cell[i] = row.createCell(i);

			}

			for(int i = 0; i<7; i++)
			{
				cell[i] = worksheet.getRow(last).getCell(i);
			}
			
			cell[0].setCellValue(roll);
			cell[1].setCellValue(fname);
			cell[2].setCellValue(lname);
			cell[3].setCellValue(lastedu);
			cell[4].setCellValue(migration);
			cell[5].setCellValue(xerox);
			cell[6].setCellValue(photos);
			
			fread.close();
			
			workbook.write(fwrite);
			fwrite.close();
		}
		catch(Exception err)
		{
			throw err;
		}
	}
	
	public void docMECHACPC(String jeeroll, String fname, String lname, String marksheet10, String marksheet12, String jeemarksheet, String schleaving, String meritrec, String rec20, String allotletter, String photos) throws Exception
	{
		int last = 0;
		try
		{			
			File file = new File("//10.20.10.52/Documents/#2016/MECH.xls");
			//File file = new File("MECH.xls");
			
			FileInputStream fread = null;

			HSSFWorkbook workbook = null;
			HSSFSheet worksheet = null;
			
			FileOutputStream fwrite = null;
			
			fread = new FileInputStream(file); 

			workbook = new HSSFWorkbook(fread); 
			worksheet = workbook.getSheet("ACPC_Docs");

			fwrite = new FileOutputStream(file);
			
			last = worksheet.getLastRowNum() + 1;

			Row row = worksheet.createRow(last);
			Cell[] cell = new Cell[11];
			
			for(int i = 0; i<11; i++)
			{
				cell[i] = row.createCell(i);

			}

			for(int i = 0; i<11; i++)
			{
				cell[i] = worksheet.getRow(last).getCell(i);
			}
			
			cell[0].setCellValue(jeeroll);
			cell[1].setCellValue(fname);
			cell[2].setCellValue(lname);
			cell[3].setCellValue(marksheet10);
			cell[4].setCellValue(marksheet12);
			cell[5].setCellValue(jeemarksheet);
			cell[6].setCellValue(schleaving);
			cell[7].setCellValue(meritrec);
			cell[8].setCellValue(rec20);
			cell[9].setCellValue(allotletter);
			cell[10].setCellValue(photos);
			
			fread.close();
			
			workbook.write(fwrite);
			fwrite.close();
		}
		catch(Exception err)
		{
			throw err;
		}
	}
	
	public void docMECHNRISPON(String jeeroll, String fname, String lname, String marksheet10, String marksheet12, String jeemarksheet, String schleaving, String meritrec, String rec20, String allotletter, String photos, String affi, String xerox, String nriproof) throws Exception
	{
		int last = 0;
		try
		{			
			File file = new File("//10.20.10.52/Documents/#2016/MECH.xls");
			//File file = new File("MECH.xls");
			
			FileInputStream fread = null;

			HSSFWorkbook workbook = null;
			HSSFSheet worksheet = null;
			
			FileOutputStream fwrite = null;
			
			fread = new FileInputStream(file); 

			workbook = new HSSFWorkbook(fread); 
			worksheet = workbook.getSheet("NRI_SPONSOR_Docs");

			fwrite = new FileOutputStream(file);
			
			last = worksheet.getLastRowNum() + 1;

			Row row = worksheet.createRow(last);
			Cell[] cell = new Cell[14];
			
			for(int i = 0; i<14; i++)
			{
				cell[i] = row.createCell(i);

			}

			for(int i = 0; i<14; i++)
			{
				cell[i] = worksheet.getRow(last).getCell(i);
			}
			
			cell[0].setCellValue(jeeroll);
			cell[1].setCellValue(fname);
			cell[2].setCellValue(lname);
			cell[3].setCellValue(marksheet10);
			cell[4].setCellValue(marksheet12);
			cell[5].setCellValue(jeemarksheet);
			cell[6].setCellValue(schleaving);
			cell[7].setCellValue(meritrec);
			cell[8].setCellValue(rec20);
			cell[9].setCellValue(allotletter);
			cell[10].setCellValue(photos);
			cell[11].setCellValue(affi);
			cell[12].setCellValue(xerox);
			cell[13].setCellValue(nriproof);
			
			fread.close();
			
			workbook.write(fwrite);
			fwrite.close();
		}
		catch(Exception err)
		{
			throw err;
		}
	}

	public void docMECHNRI(String roll, String fname, String lname, String lastedu, String migration, String xerox, String photos) throws Exception
	{
		int last = 0;
		try
		{			
			File file = new File("//10.20.10.52/Documents/#2016/MECH.xls");
			//File file = new File("MECH.xls");
			
			FileInputStream fread = null;

			HSSFWorkbook workbook = null;
			HSSFSheet worksheet = null;
			
			FileOutputStream fwrite = null;
			
			fread = new FileInputStream(file); 

			workbook = new HSSFWorkbook(fread); 
			worksheet = workbook.getSheet("NRI_Docs");

			fwrite = new FileOutputStream(file);
			
			last = worksheet.getLastRowNum() + 1;

			Row row = worksheet.createRow(last);
			Cell[] cell = new Cell[7];
			
			for(int i = 0; i<7; i++)
			{
				cell[i] = row.createCell(i);

			}

			for(int i = 0; i<7; i++)
			{
				cell[i] = worksheet.getRow(last).getCell(i);
			}
			
			cell[0].setCellValue(roll);
			cell[1].setCellValue(fname);
			cell[2].setCellValue(lname);
			cell[3].setCellValue(lastedu);
			cell[4].setCellValue(migration);
			cell[5].setCellValue(xerox);
			cell[6].setCellValue(photos);
			
			fread.close();
			
			workbook.write(fwrite);
			fwrite.close();
		}
		catch(Exception err)
		{
			throw err;
		}
	}

	public void docCHEMACPC(String jeeroll, String fname, String lname, String marksheet10, String marksheet12, String jeemarksheet, String schleaving, String meritrec, String rec20, String allotletter, String photos) throws Exception
	{
		int last = 0;
		try
		{			
			File file = new File("//10.20.10.52/Documents/#2016/CHEM.xls");
			//File file = new File("CHEM.xls");
			
			FileInputStream fread = null;

			HSSFWorkbook workbook = null;
			HSSFSheet worksheet = null;
			
			FileOutputStream fwrite = null;
			
			fread = new FileInputStream(file); 

			workbook = new HSSFWorkbook(fread); 
			worksheet = workbook.getSheet("ACPC_Docs");

			fwrite = new FileOutputStream(file);
			
			last = worksheet.getLastRowNum() + 1;

			Row row = worksheet.createRow(last);
			Cell[] cell = new Cell[11];
			
			for(int i = 0; i<11; i++)
			{
				cell[i] = row.createCell(i);

			}

			for(int i = 0; i<11; i++)
			{
				cell[i] = worksheet.getRow(last).getCell(i);
			}
			
			cell[0].setCellValue(jeeroll);
			cell[1].setCellValue(fname);
			cell[2].setCellValue(lname);
			cell[3].setCellValue(marksheet10);
			cell[4].setCellValue(marksheet12);
			cell[5].setCellValue(jeemarksheet);
			cell[6].setCellValue(schleaving);
			cell[7].setCellValue(meritrec);
			cell[8].setCellValue(rec20);
			cell[9].setCellValue(allotletter);
			cell[10].setCellValue(photos);
			
			fread.close();
			
			workbook.write(fwrite);
			fwrite.close();
		}
		catch(Exception err)
		{
			throw err;
		}
	}
	
	public void docCHEMNRISPON(String jeeroll, String fname, String lname, String marksheet10, String marksheet12, String jeemarksheet, String schleaving, String meritrec, String rec20, String allotletter, String photos, String affi, String xerox, String nriproof) throws Exception
	{
		int last = 0;
		try
		{			
			File file = new File("//10.20.10.52/Documents/#2016/CHEM.xls");
			//File file = new File("CHEM.xls");
			
			FileInputStream fread = null;

			HSSFWorkbook workbook = null;
			HSSFSheet worksheet = null;
			
			FileOutputStream fwrite = null;
			
			fread = new FileInputStream(file); 

			workbook = new HSSFWorkbook(fread); 
			worksheet = workbook.getSheet("NRI_SPONSOR_Docs");

			fwrite = new FileOutputStream(file);
			
			last = worksheet.getLastRowNum() + 1;

			Row row = worksheet.createRow(last);
			Cell[] cell = new Cell[14];
			
			for(int i = 0; i<14; i++)
			{
				cell[i] = row.createCell(i);

			}

			for(int i = 0; i<14; i++)
			{
				cell[i] = worksheet.getRow(last).getCell(i);
			}
			
			cell[0].setCellValue(jeeroll);
			cell[1].setCellValue(fname);
			cell[2].setCellValue(lname);
			cell[3].setCellValue(marksheet10);
			cell[4].setCellValue(marksheet12);
			cell[5].setCellValue(jeemarksheet);
			cell[6].setCellValue(schleaving);
			cell[7].setCellValue(meritrec);
			cell[8].setCellValue(rec20);
			cell[9].setCellValue(allotletter);
			cell[10].setCellValue(photos);
			cell[11].setCellValue(affi);
			cell[12].setCellValue(xerox);
			cell[13].setCellValue(nriproof);
			
			fread.close();
			
			workbook.write(fwrite);
			fwrite.close();
		}
		catch(Exception err)
		{
			throw err;
		}
	}

	public void docCHEMNRI(String roll, String fname, String lname, String lastedu, String migration, String xerox, String photos) throws Exception
	{
		int last = 0;
		try
		{			
			File file = new File("//10.20.10.52/Documents/#2016/CHEM.xls");
			//File file = new File("CHEM.xls");
			
			FileInputStream fread = null;

			HSSFWorkbook workbook = null;
			HSSFSheet worksheet = null;
			
			FileOutputStream fwrite = null;
			
			fread = new FileInputStream(file); 

			workbook = new HSSFWorkbook(fread); 
			worksheet = workbook.getSheet("NRI_Docs");

			fwrite = new FileOutputStream(file);
			
			last = worksheet.getLastRowNum() + 1;

			Row row = worksheet.createRow(last);
			Cell[] cell = new Cell[7];
			
			for(int i = 0; i<7; i++)
			{
				cell[i] = row.createCell(i);

			}

			for(int i = 0; i<7; i++)
			{
				cell[i] = worksheet.getRow(last).getCell(i);
			}
			
			cell[0].setCellValue(roll);
			cell[1].setCellValue(fname);
			cell[2].setCellValue(lname);
			cell[3].setCellValue(lastedu);
			cell[4].setCellValue(migration);
			cell[5].setCellValue(xerox);
			cell[6].setCellValue(photos);
			
			fread.close();
			
			workbook.write(fwrite);
			fwrite.close();
		}
		catch(Exception err)
		{
			throw err;
		}
	}


}
