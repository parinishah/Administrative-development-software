package sprj_DataStorage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import sprj_GUI.ModBoard_JEE_GUI;
import sprj_GUI.ModEnrollmentDetails_GUI;
import sprj_GUI.ModGuardianDetails_GUI;
import sprj_GUI.ModNRISponsoredDetails_GUI;
import sprj_GUI.ModNRIStudent_GUI;
import sprj_GUI.ModNRI_AcademicDetails_GUI;
import sprj_GUI.ModPersonalDetails_GUI;


public class ExcelModify 
{
	private ModPersonalDetails_GUI modpd;
	private ModGuardianDetails_GUI modgd;
	private ModBoard_JEE_GUI modbj;
	private ModEnrollmentDetails_GUI modenroll;
	private ModNRI_AcademicDetails_GUI modnriaca;
	private ModNRISponsoredDetails_GUI modnrisd;
	private ModNRIStudent_GUI modnristud;
	//private SearchModify_GUI searchmod;

	
	public int modviewICTACPC(String roll,ModPersonalDetails_GUI PD,ModGuardianDetails_GUI GD,ModBoard_JEE_GUI BJ,ModEnrollmentDetails_GUI Enroll) throws Exception
	{
		this.modpd = PD;
		this.modgd = GD;
		this.modbj = BJ;
		this.modenroll = Enroll;
		
		int rownum = -1;
		
		try
		{
			File file = new File("//10.20.10.52/Documents/#2016/ICT.xls");
			//File file = new File("ICT.xls");

			FileInputStream fread = null;
			fread = new FileInputStream(file);

			Workbook wb = WorkbookFactory.create(fread);
			Sheet sh = wb.getSheet("ACPC");
			
			int last = sh.getLastRowNum();

			for(int i = 1; i<=last; i++)	
			{
				Row row = sh.getRow(i);
				Cell jeerollcell = row.getCell(37);
				Cell admissionstat = row.getCell(40);
				jeerollcell = sh.getRow(i).getCell(37);
				admissionstat = sh.getRow(i).getCell(40);
				if((jeerollcell.getStringCellValue().equals(roll)) && !(admissionstat.getStringCellValue().equals("TENTATIVE")))
				{
					rownum = i;
					break;
				}
			}
			
			if(rownum == -1)
			{
				return rownum;
			}
			else 
			{
				Row row2 = sh.getRow(rownum);
				
//				Cell cell0 = row2.getCell(0);
				Cell cell1 = row2.getCell(1);
				Cell cell2 = row2.getCell(2);
				Cell cell3 = row2.getCell(3);
				Cell cell4 = row2.getCell(4);
				Cell cell5 = row2.getCell(5);
				Cell cell6 = row2.getCell(6);
				Cell cell7 = row2.getCell(7);
				Cell cell8 = row2.getCell(8);
				Cell cell9 = row2.getCell(9);
				Cell cell10 = row2.getCell(10);
				Cell cell11 = row2.getCell(11);
				Cell cell12 = row2.getCell(12);
				Cell cell13 = row2.getCell(13);
				Cell cell14 = row2.getCell(14);
				Cell cell15 = row2.getCell(15);
				Cell cell16 = row2.getCell(16);
				Cell cell17 = row2.getCell(17);
				Cell cell18 = row2.getCell(18);
				Cell cell19 = row2.getCell(19);
				Cell cell20 = row2.getCell(20);
				Cell cell21 = row2.getCell(21);
				Cell cell22 = row2.getCell(22);
				Cell cell23 = row2.getCell(23);
				Cell cell24 = row2.getCell(24);
				Cell cell25 = row2.getCell(25);
//				Cell cell26 = row2.getCell(26);
				Cell cell27 = row2.getCell(27);
				Cell cell28 = row2.getCell(28);
				Cell cell29 = row2.getCell(29);
				Cell cell30 = row2.getCell(30);
				Cell cell31 = row2.getCell(31);
				Cell cell32 = row2.getCell(32);
				Cell cell33 = row2.getCell(33);
				Cell cell34 = row2.getCell(34);
				Cell cell35 = row2.getCell(35);
				Cell cell36 = row2.getCell(36);
				Cell cell37 = row2.getCell(37);
				Cell cell38 = row2.getCell(38);
//				Cell cell39 = row2.getCell(39);
				Cell cell40 = row2.getCell(40);
//				Cell cell41 = row2.getCell(41);
				
				
				this.modpd.setPDtxtFirstName(cell1.getStringCellValue());
				this.modpd.setPDtxtMiddleName(cell2.getStringCellValue());
				this.modpd.setPDtxtLastName(cell3.getStringCellValue());
				this.modpd.setPDGenderBG(cell4.getStringCellValue());
				this.modpd.setPDtxtDisability(cell5.getStringCellValue());
				this.modpd.setPDtxtAddL1(cell6.getStringCellValue());
				this.modpd.setPDtxtState(cell7.getStringCellValue());
				this.modpd.setPDtxtCity(cell8.getStringCellValue());
				this.modpd.setPDtxtPincode(cell9.getStringCellValue());
				this.modpd.setPDtxtPrimaryContact(cell10.getStringCellValue());
				this.modpd.setPDtxtSecondaryContact(cell11.getStringCellValue());
				this.modpd.setPDtxtEmailId(cell12.getStringCellValue());
				this.modpd.setPDcomboBoxCategory(cell13.getStringCellValue());
				this.modpd.setPDdob(cell14.getStringCellValue());
				
				this.modgd.setGDtxtFatherName(cell15.getStringCellValue());
				this.modgd.setGDtxtFatherContact(cell16.getStringCellValue());
				this.modgd.setGDtxtFatherQualification(cell17.getStringCellValue());
				this.modgd.setGDtxtFatherOccupation(cell18.getStringCellValue());
				this.modgd.setGDcmbFatherIncome(cell19.getStringCellValue());
				this.modgd.setGDtxtFatherEmail(cell20.getStringCellValue());
				this.modgd.setGDtxtMotherName(cell21.getStringCellValue());
				this.modgd.setGDtxtMotherContact(cell22.getStringCellValue());
				this.modgd.setGDtxtMotherQualification(cell23.getStringCellValue());
				this.modgd.setGDtxtMotherOccupation(cell24.getStringCellValue());
				this.modgd.setGDcmbMotherIncome(cell25.getStringCellValue());

				
				this.modbj.setADyearChooser10th((int)cell27.getNumericCellValue());
				this.modbj.setADyearChooser12th((int)(cell28.getNumericCellValue()));
				this.modbj.setADtxtBoardRollNum12th(cell29.getStringCellValue());
				this.modbj.setADcmbSchoolBoard(cell30.getStringCellValue());
				this.modbj.setADtxtSchoolName(cell31.getStringCellValue());
				this.modbj.setADtxtOverallPercentage12th(cell32.getStringCellValue());
				this.modbj.setADtxtPCMPercentage12th(cell33.getStringCellValue());
				this.modbj.setADtxtPCMPercentile12th(cell34.getStringCellValue());
				this.modbj.setADtxtJEEScore(cell35.getStringCellValue());
				this.modbj.setADtxtJEEPercentile(cell36.getStringCellValue());
				this.modbj.setADtxtJEERollNumber(cell37.getStringCellValue());
				this.modbj.setADtxtAcpcRank(String.valueOf((int)cell38.getNumericCellValue()));
				
				this.modenroll.setEDAdmissionStatus(cell40.getStringCellValue());

				fread.close();
				
				modviewICTACPCchkbox(roll,modenroll);
				
				return rownum;
				
			}			
		}
		catch(Exception err)
		{
			
			throw err;
		}
	}
	
	public void modstoreICTACPC(int rownum, String fname, String mname, String lname, String gen, String dis, String addl1, String state, String city, String pin, String pcontact, String scontact, String email, String cat, String dob, String fatname, String fatcontact, String fatqual, String fatoccu, String fatincome, String fatemail, String motname, String motcontact, String motqual, String motoccu, String motincome, int pass10, int pass12, String boardroll, String schoolboard, String schoolname, String boardpertage, String pcmpertage, String pcmpertile, String jeescore, String jeepertile, String jeeroll, int acpcrank, String admissionstat) throws Exception                                                                                                                                                             
	{
		try
		{
			File file = new File("//10.20.10.52/Documents/#2016/ICT.xls");
			//File file = new File("ICT.xls");
			
			FileInputStream fread = null;

			HSSFWorkbook workbook = null;
			HSSFSheet worksheet = null;
			
			FileOutputStream fwrite = null;
			
			fread = new FileInputStream(file); 

			workbook = new HSSFWorkbook(fread); 
			worksheet = workbook.getSheet("ACPC");

			fwrite = new FileOutputStream(file);
			
			Row row = worksheet.getRow(rownum);
			Cell[] cell = new Cell[42];
			
			for(int i = 1;(i<42); i++)
			{				
				if((i != 26) && (i != 39) && (i != 41))
				{
					cell[i] = row.createCell(i);
				}
			
				//if(i==27)
				//	System.out.println("HEY");

			}
			
			for(int i = 1; ((i<42)); i++)
			{
				if((i != 26) && (i != 39) && (i != 41))
					cell[i] = worksheet.getRow(rownum).getCell(i);
			}
			
			cell[1].setCellValue(fname);
			cell[2].setCellValue(mname);
			cell[3].setCellValue(lname);
			cell[4].setCellValue(gen);
			cell[5].setCellValue(dis);
			cell[6].setCellValue(addl1);
			cell[7].setCellValue(state);
			cell[8].setCellValue(city);
			cell[9].setCellValue(pin);
			cell[10].setCellValue(pcontact);
			cell[11].setCellValue(scontact);
			cell[12].setCellValue(email);
			cell[13].setCellValue(cat);
			cell[14].setCellValue(dob);
			
			cell[15].setCellValue(fatname);
			cell[16].setCellValue(fatcontact);
			cell[17].setCellValue(fatqual);
			cell[18].setCellValue(fatoccu);
			cell[19].setCellValue(fatincome);
			cell[20].setCellValue(fatemail);
			cell[21].setCellValue(motname);
			cell[22].setCellValue(motcontact);
			cell[23].setCellValue(motqual);
			cell[24].setCellValue(motoccu);
			cell[25].setCellValue(motincome);
			
			cell[27].setCellValue(pass10);
			cell[28].setCellValue(pass12);
			cell[29].setCellValue(boardroll);
			cell[30].setCellValue(schoolboard);
			cell[31].setCellValue(schoolname);
			cell[32].setCellValue(boardpertage);
			cell[33].setCellValue(pcmpertage);
			cell[34].setCellValue(pcmpertile);
			cell[35].setCellValue(jeescore);
			cell[36].setCellValue(jeepertile);
			cell[37].setCellValue(jeeroll);
			cell[38].setCellValue(acpcrank);
			
			cell[40].setCellValue(admissionstat);
			
			fread.close();
			
			workbook.write(fwrite);
			fwrite.close();
		}
		catch(Exception err)
		{
			
			throw err;
		}	
	}

	public int modviewICTNRISPON(String roll,ModPersonalDetails_GUI PD,ModGuardianDetails_GUI GD,ModBoard_JEE_GUI BJ,ModNRISponsoredDetails_GUI SD,ModEnrollmentDetails_GUI Enroll) throws Exception
	{
		this.modpd = PD;
		this.modgd = GD;
		this.modbj = BJ;
		this.modnrisd = SD;
		this.modenroll = Enroll;
		
		int rownum = -1;
		
		try
		{
			File file = new File("//10.20.10.52/Documents/#2016/ICT.xls");
			//File file = new File("ICT.xls");
			
			FileInputStream fread = null;
			fread = new FileInputStream(file);

			Workbook wb = WorkbookFactory.create(fread);
			Sheet sh = wb.getSheet("NRI_SPONSOR");
			
			int last = sh.getLastRowNum();

			for(int i = 1; i<=last; i++)	
			{
				Row row = sh.getRow(i);
				Cell jeerollcell = row.getCell(37);
				jeerollcell = sh.getRow(i).getCell(37);
				if(jeerollcell.getStringCellValue().equals(roll))
				{
					rownum = i;
					break;
				}
			}
			
			if(rownum == -1)
			{
				return rownum;
			}
			else 
			{
				Row row2 = sh.getRow(rownum);
				
//				Cell cell0 = row2.getCell(0);
				Cell cell1 = row2.getCell(1);
				Cell cell2 = row2.getCell(2);
				Cell cell3 = row2.getCell(3);
				Cell cell4 = row2.getCell(4);
				Cell cell5 = row2.getCell(5);
				Cell cell6 = row2.getCell(6);
				Cell cell7 = row2.getCell(7);
				Cell cell8 = row2.getCell(8);
				Cell cell9 = row2.getCell(9);
				Cell cell10 = row2.getCell(10);
				Cell cell11 = row2.getCell(11);
				Cell cell12 = row2.getCell(12);
				Cell cell13 = row2.getCell(13);
				Cell cell14 = row2.getCell(14);
				Cell cell15 = row2.getCell(15);
				Cell cell16 = row2.getCell(16);
				Cell cell17 = row2.getCell(17);
				Cell cell18 = row2.getCell(18);
				Cell cell19 = row2.getCell(19);
				Cell cell20 = row2.getCell(20);
				Cell cell21 = row2.getCell(21);
				Cell cell22 = row2.getCell(22);
				Cell cell23 = row2.getCell(23);
				Cell cell24 = row2.getCell(24);
				Cell cell25 = row2.getCell(25);
//				Cell cell26 = row2.getCell(26);
				Cell cell27 = row2.getCell(27);
				Cell cell28 = row2.getCell(28);
				Cell cell29 = row2.getCell(29);
				Cell cell30 = row2.getCell(30);
				Cell cell31 = row2.getCell(31);
				Cell cell32 = row2.getCell(32);
				Cell cell33 = row2.getCell(33);
				Cell cell34 = row2.getCell(34);
				Cell cell35 = row2.getCell(35);
				Cell cell36 = row2.getCell(36);
				Cell cell37 = row2.getCell(37);
				Cell cell38 = row2.getCell(38);
				Cell cell39 = row2.getCell(39);
				Cell cell40 = row2.getCell(40);
				Cell cell41 = row2.getCell(41);
				Cell cell42 = row2.getCell(42);
				Cell cell43 = row2.getCell(43);
				Cell cell44 = row2.getCell(44);
				Cell cell45 = row2.getCell(45);
//				Cell cell46 = row2.getCell(46);
				Cell cell47 = row2.getCell(47);
//				Cell cell48 = row2.getCell(48);
							
				this.modpd.setPDtxtFirstName(cell1.getStringCellValue());
				this.modpd.setPDtxtMiddleName(cell2.getStringCellValue());
				this.modpd.setPDtxtLastName(cell3.getStringCellValue());
				this.modpd.setPDGenderBG(cell4.getStringCellValue());
				this.modpd.setPDtxtDisability(cell5.getStringCellValue());
				this.modpd.setPDtxtAddL1(cell6.getStringCellValue());
				this.modpd.setPDtxtState(cell7.getStringCellValue());
				this.modpd.setPDtxtCity(cell8.getStringCellValue());
				this.modpd.setPDtxtPincode(cell9.getStringCellValue());
				this.modpd.setPDtxtPrimaryContact(cell10.getStringCellValue());
				this.modpd.setPDtxtSecondaryContact(cell11.getStringCellValue());
				this.modpd.setPDtxtEmailId(cell12.getStringCellValue());
				this.modpd.setPDcomboBoxCategory(cell13.getStringCellValue());
				this.modpd.setPDdob(cell14.getStringCellValue());
				
				this.modgd.setGDtxtFatherName(cell15.getStringCellValue());
				this.modgd.setGDtxtFatherContact(cell16.getStringCellValue());
				this.modgd.setGDtxtFatherQualification(cell17.getStringCellValue());
				this.modgd.setGDtxtFatherOccupation(cell18.getStringCellValue());
				this.modgd.setGDcmbFatherIncome(cell19.getStringCellValue());
				this.modgd.setGDtxtFatherEmail(cell20.getStringCellValue());
				this.modgd.setGDtxtMotherName(cell21.getStringCellValue());
				this.modgd.setGDtxtMotherContact(cell22.getStringCellValue());
				this.modgd.setGDtxtMotherQualification(cell23.getStringCellValue());
				this.modgd.setGDtxtMotherOccupation(cell24.getStringCellValue());
				this.modgd.setGDcmbMotherIncome(cell25.getStringCellValue());

				this.modbj.setADyearChooser10th((int)cell27.getNumericCellValue());
				this.modbj.setADyearChooser12th((int)(cell28.getNumericCellValue()));
				this.modbj.setADtxtBoardRollNum12th(cell29.getStringCellValue());
				this.modbj.setADcmbSchoolBoard(cell30.getStringCellValue());
				this.modbj.setADtxtSchoolName(cell31.getStringCellValue());
				this.modbj.setADtxtOverallPercentage12th(cell32.getStringCellValue());
				this.modbj.setADtxtPCMPercentage12th(cell33.getStringCellValue());
				this.modbj.setADtxtPCMPercentile12th(cell34.getStringCellValue());
				this.modbj.setADtxtJEEScore(cell35.getStringCellValue());
				this.modbj.setADtxtJEEPercentile(cell36.getStringCellValue());
				this.modbj.setADtxtJEERollNumber(cell37.getStringCellValue());
				this.modbj.setADtxtAcpcRank(String.valueOf((int)cell38.getNumericCellValue()));

				this.modnrisd.setNRIStxtname(cell39.getStringCellValue());
				this.modnrisd.setNRIStxtGender(cell40.getStringCellValue());
				this.modnrisd.setNRIStxtNationality(cell41.getStringCellValue());
				this.modnrisd.setNRIStxtStatus(cell42.getStringCellValue());
				this.modnrisd.setNRIStxtRelation(cell43.getStringCellValue());
				this.modnrisd.setNRIStxtContact(cell44.getStringCellValue());
				this.modnrisd.setNRIStextAreaAddress(cell45.getStringCellValue());

				this.modenroll.setEDAdmissionStatus(cell47.getStringCellValue());

				fread.close();
				
				modviewICTNRISPONchkbox(roll,modenroll);
				
				return rownum;
			}			
		}
		catch(Exception err)
		{
			
			throw err;
		}	
	}
	
	public void modstoreICTNRISPON(int rownum, String fname, String mname, String lname, String gen, String dis, String addl1, String state, String city, String pin, String pcontact, String scontact, String email, String cat, String dob, String fatname, String fatcontact, String fatqual, String fatoccu, String fatincome, String fatemail, String motname, String motcontact, String motqual, String motoccu, String motincome, int pass10, int pass12, String boardroll, String schoolboard, String schoolname, String boardpertage, String pcmpertage, String pcmpertile, String jeescore, String jeepertile, String jeeroll, int acpcrank, String sponsorname, String gender, String nationality, String nristat, String realtionwstud, String sponcontact, String sponaddress, String admissionstat) throws Exception                                                                                                                                                             
	{
		
		try
		{
			File file = new File("//10.20.10.52/Documents/#2016/ICT.xls");
			//File file = new File("ICT.xls");
			
			FileInputStream fread = null;

			HSSFWorkbook workbook = null;
			HSSFSheet worksheet = null;
			
			FileOutputStream fwrite = null;
			
			fread = new FileInputStream(file); 

			workbook = new HSSFWorkbook(fread); 
			worksheet = workbook.getSheet("NRI_SPONSOR");

			fwrite = new FileOutputStream(file);
			
			Row row = worksheet.getRow(rownum);
			Cell[] cell = new Cell[49];
			
			for(int i = 1; ((i<49)); i++)
			{
				if((i != 26) && (i != 46) && (i != 48))
					cell[i] = row.createCell(i);

			}
			
			for(int i = 1; ((i<49)); i++)
			{
				if((i != 26) && (i != 46) && (i != 48))
					cell[i] = worksheet.getRow(rownum).getCell(i);
			}
			
			cell[1].setCellValue(fname);
			cell[2].setCellValue(mname);
			cell[3].setCellValue(lname);
			cell[4].setCellValue(gen);
			cell[5].setCellValue(dis);
			cell[6].setCellValue(addl1);
			cell[7].setCellValue(state);
			cell[8].setCellValue(city);
			cell[9].setCellValue(pin);
			cell[10].setCellValue(pcontact);
			cell[11].setCellValue(scontact);
			cell[12].setCellValue(email);
			cell[13].setCellValue(cat);
			cell[14].setCellValue(dob);
			
			cell[15].setCellValue(fatname);
			cell[16].setCellValue(fatcontact);
			cell[17].setCellValue(fatqual);
			cell[18].setCellValue(fatoccu);
			cell[19].setCellValue(fatincome);
			cell[20].setCellValue(fatemail);
			cell[21].setCellValue(motname);
			cell[22].setCellValue(motcontact);
			cell[23].setCellValue(motqual);
			cell[24].setCellValue(motoccu);
			cell[25].setCellValue(motincome);
			
			cell[27].setCellValue(pass10);
			cell[28].setCellValue(pass12);
			cell[29].setCellValue(boardroll);
			cell[30].setCellValue(schoolboard);
			cell[31].setCellValue(schoolname);
			cell[32].setCellValue(boardpertage);
			cell[33].setCellValue(pcmpertage);
			cell[34].setCellValue(pcmpertile);
			cell[35].setCellValue(jeescore);
			cell[36].setCellValue(jeepertile);
			cell[37].setCellValue(jeeroll);
			cell[38].setCellValue(acpcrank);
			
			cell[39].setCellValue(sponsorname);
			cell[40].setCellValue(gender);
			cell[41].setCellValue(nationality);
			cell[42].setCellValue(nristat);
			cell[43].setCellValue(realtionwstud);
			cell[44].setCellValue(sponcontact);
			cell[45].setCellValue(sponaddress);

			cell[47].setCellValue(admissionstat);
			
			fread.close();
			
			workbook.write(fwrite);
			fwrite.close();
		}
		catch(Exception err)
		{
			
			throw err;
		}	

	}

	
	public int modviewICTNRISTUD(String roll,ModPersonalDetails_GUI PD,ModGuardianDetails_GUI GD,ModNRI_AcademicDetails_GUI NA,ModNRIStudent_GUI NS,ModEnrollmentDetails_GUI Enroll) throws Exception
	{
		this.modpd = PD;
		this.modgd = GD;
		this.modnriaca = NA;
		this.modnristud = NS;
		this.modenroll = Enroll;
		
		int rownum = -1;
		
		try
		{
			File file = new File("//10.20.10.52/Documents/#2016/ICT.xls");
			//File file = new File("ICT.xls");
			
			FileInputStream fread = null;
			fread = new FileInputStream(file);

			Workbook wb = WorkbookFactory.create(fread);
			Sheet sh = wb.getSheet("NRI");
			
			int last = sh.getLastRowNum();

			for(int i = 1; i<=last; i++)	
			{
				Row row = sh.getRow(i);
				Cell jeerollcell = row.getCell(27);
				jeerollcell = sh.getRow(i).getCell(27);
				if(jeerollcell.getStringCellValue().equals(roll))
				{
					rownum = i;
					break;
				}
			}
			
			if(rownum == -1)
			{
				return rownum;
			}
			else 
			{
				Row row2 = sh.getRow(rownum);
				
//				Cell cell0 = row2.getCell(0);
				Cell cell1 = row2.getCell(1);
				Cell cell2 = row2.getCell(2);
				Cell cell3 = row2.getCell(3);
				Cell cell4 = row2.getCell(4);
				Cell cell5 = row2.getCell(5);
				Cell cell6 = row2.getCell(6);
				Cell cell7 = row2.getCell(7);
				Cell cell8 = row2.getCell(8);
				Cell cell9 = row2.getCell(9);
				Cell cell10 = row2.getCell(10);
				Cell cell11 = row2.getCell(11);
				Cell cell12 = row2.getCell(12);
				Cell cell13 = row2.getCell(13);
				Cell cell14 = row2.getCell(14);
				Cell cell15 = row2.getCell(15);
				Cell cell16 = row2.getCell(16);
				Cell cell17 = row2.getCell(17);
				Cell cell18 = row2.getCell(18);
				Cell cell19 = row2.getCell(19);
				Cell cell20 = row2.getCell(20);
				Cell cell21 = row2.getCell(21);
				Cell cell22 = row2.getCell(22);
				Cell cell23 = row2.getCell(23);
				Cell cell24 = row2.getCell(24);
				Cell cell25 = row2.getCell(25);
//				Cell cell26 = row2.getCell(26);
				Cell cell27 = row2.getCell(27);
				Cell cell28 = row2.getCell(28);
				Cell cell29 = row2.getCell(29);
				Cell cell30 = row2.getCell(30);
				Cell cell31 = row2.getCell(31);
//				Cell cell32 = row2.getCell(32);
				Cell cell33 = row2.getCell(33);
//				Cell cell34 = row2.getCell(34);
				
				
				this.modpd.setPDtxtFirstName(cell1.getStringCellValue());
				this.modpd.setPDtxtMiddleName(cell2.getStringCellValue());
				this.modpd.setPDtxtLastName(cell3.getStringCellValue());
				this.modpd.setPDGenderBG(cell4.getStringCellValue());
				this.modpd.setPDtxtDisability(cell5.getStringCellValue());
				this.modpd.setPDtxtAddL1(cell6.getStringCellValue());
				this.modpd.setPDtxtState(cell7.getStringCellValue());
				this.modpd.setPDtxtCity(cell8.getStringCellValue());
				this.modpd.setPDtxtPincode(cell9.getStringCellValue());
				this.modpd.setPDtxtPrimaryContact(cell10.getStringCellValue());
				this.modpd.setPDtxtSecondaryContact(cell11.getStringCellValue());
				this.modpd.setPDtxtEmailId(cell12.getStringCellValue());
				this.modpd.setPDcomboBoxCategory(cell13.getStringCellValue());
				this.modpd.setPDdob(cell14.getStringCellValue());
				
				this.modgd.setGDtxtFatherName(cell15.getStringCellValue());
				this.modgd.setGDtxtFatherContact(cell16.getStringCellValue());
				this.modgd.setGDtxtFatherQualification(cell17.getStringCellValue());
				this.modgd.setGDtxtFatherOccupation(cell18.getStringCellValue());
				this.modgd.setGDcmbFatherIncome(cell19.getStringCellValue());
				this.modgd.setGDtxtFatherEmail(cell20.getStringCellValue());
				this.modgd.setGDtxtMotherName(cell21.getStringCellValue());
				this.modgd.setGDtxtMotherContact(cell22.getStringCellValue());
				this.modgd.setGDtxtMotherQualification(cell23.getStringCellValue());
				this.modgd.setGDtxtMotherOccupation(cell24.getStringCellValue());
				this.modgd.setGDcmbMotherIncome(cell25.getStringCellValue());
				
				this.modnriaca.setNADtxt12thRollNumberunique(cell27.getStringCellValue());
				this.modnriaca.setNADtxtOverallGrade(cell28.getStringCellValue());
				
				this.modnristud.setNRItextAreaAddress(cell29.getStringCellValue());
				this.modnristud.setNRItxtNriStatus(cell30.getStringCellValue());
				this.modnristud.setNRItxtNationality(cell31.getStringCellValue());

				this.modenroll.setEDAdmissionStatus(cell33.getStringCellValue());

				fread.close();
				
				modviewICTNRISTUDchkbox(roll,modenroll);
				
				return rownum;
			}			
		}
		catch(Exception err)
		{
			
			throw err;
		}	
	}
		
	public void modstoreICTNRISTUD(int rownum, String fname, String mname, String lname, String gen, String dis, String addl1, String state, String city, String pin, String pcontact, String scontact, String email, String cat, String dob, String fatname, String fatcontact, String fatqual, String fatoccu, String fatincome, String fatemail, String motname, String motcontact, String motqual, String motoccu, String motincome, String roll12, String grade, String nation, String NRI_status, String NRI_add, String admissionstat) throws Exception
	{
		try
		{
			File file = new File("//10.20.10.52/Documents/#2016/ICT.xls");
			//File file = new File("ICT.xls");
			
			FileInputStream fread = null;

			HSSFWorkbook workbook = null;
			HSSFSheet worksheet = null;
			
			FileOutputStream fwrite = null;
			
			fread = new FileInputStream(file); 

			workbook = new HSSFWorkbook(fread); 
			worksheet = workbook.getSheet("NRI");

			fwrite = new FileOutputStream(file);
			
			Row row = worksheet.getRow(rownum);
			Cell[] cell = new Cell[35];
			
			for(int i = 1; ((i<35)); i++)
			{
				if((i != 26) && (i != 32) && (i != 34))
					cell[i] = row.createCell(i);

			}
			
			for(int i = 1; ((i<35)); i++)
			{
				if((i != 26) && (i != 32) && (i != 34))
					cell[i] = worksheet.getRow(rownum).getCell(i);
			}
			
			cell[1].setCellValue(fname);
			cell[2].setCellValue(mname);
			cell[3].setCellValue(lname);
			cell[4].setCellValue(gen);
			cell[5].setCellValue(dis);
			cell[6].setCellValue(addl1);
			cell[7].setCellValue(state);
			cell[8].setCellValue(city);
			cell[9].setCellValue(pin);
			cell[10].setCellValue(pcontact);
			cell[11].setCellValue(scontact);
			cell[12].setCellValue(email);
			cell[13].setCellValue(cat);
			cell[14].setCellValue(dob);
			
			cell[15].setCellValue(fatname);
			cell[16].setCellValue(fatcontact);
			cell[17].setCellValue(fatqual);
			cell[18].setCellValue(fatoccu);
			cell[19].setCellValue(fatincome);
			cell[20].setCellValue(fatemail);
			cell[21].setCellValue(motname);
			cell[22].setCellValue(motcontact);
			cell[23].setCellValue(motqual);
			cell[24].setCellValue(motoccu);
			cell[25].setCellValue(motincome);
			
			cell[27].setCellValue(roll12);
			cell[28].setCellValue(grade);

			cell[29].setCellValue(nation);
			cell[30].setCellValue(NRI_status);
			cell[31].setCellValue(NRI_add);
			
			cell[33].setCellValue(admissionstat);
			
			fread.close();
			
			workbook.write(fwrite);
			fwrite.close();
		}
		catch(Exception err)
		{
			
			throw err;
		}	

	}
	
	public int modviewMECHACPC(String roll,ModPersonalDetails_GUI PD,ModGuardianDetails_GUI GD,ModBoard_JEE_GUI BJ,ModEnrollmentDetails_GUI Enroll) throws Exception
	{
		this.modpd = PD;
		this.modgd = GD;
		this.modbj = BJ;
		this.modenroll = Enroll;
		
		int rownum = -1;
		
		try
		{
			File file = new File("//10.20.10.52/Documents/#2016/MECH.xls");
			//File file = new File("MECH.xls");

			FileInputStream fread = null;
			fread = new FileInputStream(file);

			Workbook wb = WorkbookFactory.create(fread);
			Sheet sh = wb.getSheet("ACPC");
			
			int last = sh.getLastRowNum();

			for(int i = 1; i<=last; i++)	
			{
				Row row = sh.getRow(i);
				Cell jeerollcell = row.getCell(37);
				Cell admissionstat = row.getCell(40);
				jeerollcell = sh.getRow(i).getCell(37);
				admissionstat = sh.getRow(i).getCell(40);
				if((jeerollcell.getStringCellValue().equals(roll)) && !(admissionstat.getStringCellValue().equals("TENTATIVE")))
				{
					rownum = i;
					break;
				}
			}
			
			if(rownum == -1)
			{
				return rownum;
			}
			else 
			{
				Row row2 = sh.getRow(rownum);
				
//				Cell cell0 = row2.getCell(0);
				Cell cell1 = row2.getCell(1);
				Cell cell2 = row2.getCell(2);
				Cell cell3 = row2.getCell(3);
				Cell cell4 = row2.getCell(4);
				Cell cell5 = row2.getCell(5);
				Cell cell6 = row2.getCell(6);
				Cell cell7 = row2.getCell(7);
				Cell cell8 = row2.getCell(8);
				Cell cell9 = row2.getCell(9);
				Cell cell10 = row2.getCell(10);
				Cell cell11 = row2.getCell(11);
				Cell cell12 = row2.getCell(12);
				Cell cell13 = row2.getCell(13);
				Cell cell14 = row2.getCell(14);
				Cell cell15 = row2.getCell(15);
				Cell cell16 = row2.getCell(16);
				Cell cell17 = row2.getCell(17);
				Cell cell18 = row2.getCell(18);
				Cell cell19 = row2.getCell(19);
				Cell cell20 = row2.getCell(20);
				Cell cell21 = row2.getCell(21);
				Cell cell22 = row2.getCell(22);
				Cell cell23 = row2.getCell(23);
				Cell cell24 = row2.getCell(24);
				Cell cell25 = row2.getCell(25);
//				Cell cell26 = row2.getCell(26);
				Cell cell27 = row2.getCell(27);
				Cell cell28 = row2.getCell(28);
				Cell cell29 = row2.getCell(29);
				Cell cell30 = row2.getCell(30);
				Cell cell31 = row2.getCell(31);
				Cell cell32 = row2.getCell(32);
				Cell cell33 = row2.getCell(33);
				Cell cell34 = row2.getCell(34);
				Cell cell35 = row2.getCell(35);
				Cell cell36 = row2.getCell(36);
				Cell cell37 = row2.getCell(37);
				Cell cell38 = row2.getCell(38);
//				Cell cell39 = row2.getCell(39);
				Cell cell40 = row2.getCell(40);
//				Cell cell41 = row2.getCell(41);
				
				
				this.modpd.setPDtxtFirstName(cell1.getStringCellValue());
				this.modpd.setPDtxtMiddleName(cell2.getStringCellValue());
				this.modpd.setPDtxtLastName(cell3.getStringCellValue());
				this.modpd.setPDGenderBG(cell4.getStringCellValue());
				this.modpd.setPDtxtDisability(cell5.getStringCellValue());
				this.modpd.setPDtxtAddL1(cell6.getStringCellValue());
				this.modpd.setPDtxtState(cell7.getStringCellValue());
				this.modpd.setPDtxtCity(cell8.getStringCellValue());
				this.modpd.setPDtxtPincode(cell9.getStringCellValue());
				this.modpd.setPDtxtPrimaryContact(cell10.getStringCellValue());
				this.modpd.setPDtxtSecondaryContact(cell11.getStringCellValue());
				this.modpd.setPDtxtEmailId(cell12.getStringCellValue());
				this.modpd.setPDcomboBoxCategory(cell13.getStringCellValue());
				this.modpd.setPDdob(cell14.getStringCellValue());
				
				this.modgd.setGDtxtFatherName(cell15.getStringCellValue());
				this.modgd.setGDtxtFatherContact(cell16.getStringCellValue());
				this.modgd.setGDtxtFatherQualification(cell17.getStringCellValue());
				this.modgd.setGDtxtFatherOccupation(cell18.getStringCellValue());
				this.modgd.setGDcmbFatherIncome(cell19.getStringCellValue());
				this.modgd.setGDtxtFatherEmail(cell20.getStringCellValue());
				this.modgd.setGDtxtMotherName(cell21.getStringCellValue());
				this.modgd.setGDtxtMotherContact(cell22.getStringCellValue());
				this.modgd.setGDtxtMotherQualification(cell23.getStringCellValue());
				this.modgd.setGDtxtMotherOccupation(cell24.getStringCellValue());
				this.modgd.setGDcmbMotherIncome(cell25.getStringCellValue());

				
				this.modbj.setADyearChooser10th((int)cell27.getNumericCellValue());
				this.modbj.setADyearChooser12th((int)(cell28.getNumericCellValue()));
				this.modbj.setADtxtBoardRollNum12th(cell29.getStringCellValue());
				this.modbj.setADcmbSchoolBoard(cell30.getStringCellValue());
				this.modbj.setADtxtSchoolName(cell31.getStringCellValue());
				this.modbj.setADtxtOverallPercentage12th(cell32.getStringCellValue());
				this.modbj.setADtxtPCMPercentage12th(cell33.getStringCellValue());
				this.modbj.setADtxtPCMPercentile12th(cell34.getStringCellValue());
				this.modbj.setADtxtJEEScore(cell35.getStringCellValue());
				this.modbj.setADtxtJEEPercentile(cell36.getStringCellValue());
				this.modbj.setADtxtJEERollNumber(cell37.getStringCellValue());
				this.modbj.setADtxtAcpcRank(String.valueOf((int)cell38.getNumericCellValue()));
				
				this.modenroll.setEDAdmissionStatus(cell40.getStringCellValue());

				fread.close();
				
				modviewMECHACPCchkbox(roll,modenroll);
				
				return rownum;
			}			
		}
		catch(Exception err)
		{
			
			throw err;
		}	
	}
	
	public void modstoreMECHACPC(int rownum, String fname, String mname, String lname, String gen, String dis, String addl1, String state, String city, String pin, String pcontact, String scontact, String email, String cat, String dob, String fatname, String fatcontact, String fatqual, String fatoccu, String fatincome, String fatemail, String motname, String motcontact, String motqual, String motoccu, String motincome, int pass10, int pass12, String boardroll, String schoolboard, String schoolname, String boardpertage, String pcmpertage, String pcmpertile, String jeescore, String jeepertile, String jeeroll, int acpcrank, String admissionstat) throws Exception                                                                                                                                                             
	{
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
			worksheet = workbook.getSheet("ACPC");

			fwrite = new FileOutputStream(file);
			
			Row row = worksheet.getRow(rownum);
			Cell[] cell = new Cell[42];
			
			for(int i = 1;(i<42); i++)
			{				
				if((i != 26) && (i != 39) && (i != 41))
				{
					cell[i] = row.createCell(i);
				}
			
				//if(i==27)
				//	System.out.println("HEY");

			}
			
			for(int i = 1; ((i<42)); i++)
			{
				if((i != 26) && (i != 39) && (i != 41))
					cell[i] = worksheet.getRow(rownum).getCell(i);
			}
			
			cell[1].setCellValue(fname);
			cell[2].setCellValue(mname);
			cell[3].setCellValue(lname);
			cell[4].setCellValue(gen);
			cell[5].setCellValue(dis);
			cell[6].setCellValue(addl1);
			cell[7].setCellValue(state);
			cell[8].setCellValue(city);
			cell[9].setCellValue(pin);
			cell[10].setCellValue(pcontact);
			cell[11].setCellValue(scontact);
			cell[12].setCellValue(email);
			cell[13].setCellValue(cat);
			cell[14].setCellValue(dob);
			
			cell[15].setCellValue(fatname);
			cell[16].setCellValue(fatcontact);
			cell[17].setCellValue(fatqual);
			cell[18].setCellValue(fatoccu);
			cell[19].setCellValue(fatincome);
			cell[20].setCellValue(fatemail);
			cell[21].setCellValue(motname);
			cell[22].setCellValue(motcontact);
			cell[23].setCellValue(motqual);
			cell[24].setCellValue(motoccu);
			cell[25].setCellValue(motincome);
			
			cell[27].setCellValue(pass10);
			cell[28].setCellValue(pass12);
			cell[29].setCellValue(boardroll);
			cell[30].setCellValue(schoolboard);
			cell[31].setCellValue(schoolname);
			cell[32].setCellValue(boardpertage);
			cell[33].setCellValue(pcmpertage);
			cell[34].setCellValue(pcmpertile);
			cell[35].setCellValue(jeescore);
			cell[36].setCellValue(jeepertile);
			cell[37].setCellValue(jeeroll);
			cell[38].setCellValue(acpcrank);
			
			cell[40].setCellValue(admissionstat);
			
			fread.close();
			
			workbook.write(fwrite);
			fwrite.close();
		}
		catch(Exception err)
		{
			
			throw err;
		}	
	}

	public int modviewMECHNRISPON(String roll,ModPersonalDetails_GUI PD,ModGuardianDetails_GUI GD,ModBoard_JEE_GUI BJ,ModNRISponsoredDetails_GUI SD,ModEnrollmentDetails_GUI Enroll) throws Exception
	{
		this.modpd = PD;
		this.modgd = GD;
		this.modbj = BJ;
		this.modnrisd = SD;
		this.modenroll = Enroll;
		
		int rownum = -1;
		
		try
		{
			File file = new File("//10.20.10.52/Documents/#2016/MECH.xls");
			//File file = new File("MECH.xls");
			
			FileInputStream fread = null;
			fread = new FileInputStream(file);

			Workbook wb = WorkbookFactory.create(fread);
			Sheet sh = wb.getSheet("NRI_SPONSOR");
			
			int last = sh.getLastRowNum();

			for(int i = 1; i<=last; i++)	
			{
				Row row = sh.getRow(i);
				Cell jeerollcell = row.getCell(37);
				jeerollcell = sh.getRow(i).getCell(37);
				if(jeerollcell.getStringCellValue().equals(roll))
				{
					rownum = i;
					break;
				}
			}
			
			if(rownum == -1)
			{
				return rownum;
			}
			else 
			{
				Row row2 = sh.getRow(rownum);
				
//				Cell cell0 = row2.getCell(0);
				Cell cell1 = row2.getCell(1);
				Cell cell2 = row2.getCell(2);
				Cell cell3 = row2.getCell(3);
				Cell cell4 = row2.getCell(4);
				Cell cell5 = row2.getCell(5);
				Cell cell6 = row2.getCell(6);
				Cell cell7 = row2.getCell(7);
				Cell cell8 = row2.getCell(8);
				Cell cell9 = row2.getCell(9);
				Cell cell10 = row2.getCell(10);
				Cell cell11 = row2.getCell(11);
				Cell cell12 = row2.getCell(12);
				Cell cell13 = row2.getCell(13);
				Cell cell14 = row2.getCell(14);
				Cell cell15 = row2.getCell(15);
				Cell cell16 = row2.getCell(16);
				Cell cell17 = row2.getCell(17);
				Cell cell18 = row2.getCell(18);
				Cell cell19 = row2.getCell(19);
				Cell cell20 = row2.getCell(20);
				Cell cell21 = row2.getCell(21);
				Cell cell22 = row2.getCell(22);
				Cell cell23 = row2.getCell(23);
				Cell cell24 = row2.getCell(24);
				Cell cell25 = row2.getCell(25);
//				Cell cell26 = row2.getCell(26);
				Cell cell27 = row2.getCell(27);
				Cell cell28 = row2.getCell(28);
				Cell cell29 = row2.getCell(29);
				Cell cell30 = row2.getCell(30);
				Cell cell31 = row2.getCell(31);
				Cell cell32 = row2.getCell(32);
				Cell cell33 = row2.getCell(33);
				Cell cell34 = row2.getCell(34);
				Cell cell35 = row2.getCell(35);
				Cell cell36 = row2.getCell(36);
				Cell cell37 = row2.getCell(37);
				Cell cell38 = row2.getCell(38);
				Cell cell39 = row2.getCell(39);
				Cell cell40 = row2.getCell(40);
				Cell cell41 = row2.getCell(41);
				Cell cell42 = row2.getCell(42);
				Cell cell43 = row2.getCell(43);
				Cell cell44 = row2.getCell(44);
				Cell cell45 = row2.getCell(45);
//				Cell cell46 = row2.getCell(46);
				Cell cell47 = row2.getCell(47);
//				Cell cell48 = row2.getCell(48);
							
				this.modpd.setPDtxtFirstName(cell1.getStringCellValue());
				this.modpd.setPDtxtMiddleName(cell2.getStringCellValue());
				this.modpd.setPDtxtLastName(cell3.getStringCellValue());
				this.modpd.setPDGenderBG(cell4.getStringCellValue());
				this.modpd.setPDtxtDisability(cell5.getStringCellValue());
				this.modpd.setPDtxtAddL1(cell6.getStringCellValue());
				this.modpd.setPDtxtState(cell7.getStringCellValue());
				this.modpd.setPDtxtCity(cell8.getStringCellValue());
				this.modpd.setPDtxtPincode(cell9.getStringCellValue());
				this.modpd.setPDtxtPrimaryContact(cell10.getStringCellValue());
				this.modpd.setPDtxtSecondaryContact(cell11.getStringCellValue());
				this.modpd.setPDtxtEmailId(cell12.getStringCellValue());
				this.modpd.setPDcomboBoxCategory(cell13.getStringCellValue());
				this.modpd.setPDdob(cell14.getStringCellValue());
				
				this.modgd.setGDtxtFatherName(cell15.getStringCellValue());
				this.modgd.setGDtxtFatherContact(cell16.getStringCellValue());
				this.modgd.setGDtxtFatherQualification(cell17.getStringCellValue());
				this.modgd.setGDtxtFatherOccupation(cell18.getStringCellValue());
				this.modgd.setGDcmbFatherIncome(cell19.getStringCellValue());
				this.modgd.setGDtxtFatherEmail(cell20.getStringCellValue());
				this.modgd.setGDtxtMotherName(cell21.getStringCellValue());
				this.modgd.setGDtxtMotherContact(cell22.getStringCellValue());
				this.modgd.setGDtxtMotherQualification(cell23.getStringCellValue());
				this.modgd.setGDtxtMotherOccupation(cell24.getStringCellValue());
				this.modgd.setGDcmbMotherIncome(cell25.getStringCellValue());

				this.modbj.setADyearChooser10th((int)cell27.getNumericCellValue());
				this.modbj.setADyearChooser12th((int)(cell28.getNumericCellValue()));
				this.modbj.setADtxtBoardRollNum12th(cell29.getStringCellValue());
				this.modbj.setADcmbSchoolBoard(cell30.getStringCellValue());
				this.modbj.setADtxtSchoolName(cell31.getStringCellValue());
				this.modbj.setADtxtOverallPercentage12th(cell32.getStringCellValue());
				this.modbj.setADtxtPCMPercentage12th(cell33.getStringCellValue());
				this.modbj.setADtxtPCMPercentile12th(cell34.getStringCellValue());
				this.modbj.setADtxtJEEScore(cell35.getStringCellValue());
				this.modbj.setADtxtJEEPercentile(cell36.getStringCellValue());
				this.modbj.setADtxtJEERollNumber(cell37.getStringCellValue());
				this.modbj.setADtxtAcpcRank(String.valueOf((int)cell38.getNumericCellValue()));

				this.modnrisd.setNRIStxtname(cell39.getStringCellValue());
				this.modnrisd.setNRIStxtGender(cell40.getStringCellValue());
				this.modnrisd.setNRIStxtNationality(cell41.getStringCellValue());
				this.modnrisd.setNRIStxtStatus(cell42.getStringCellValue());
				this.modnrisd.setNRIStxtRelation(cell43.getStringCellValue());
				this.modnrisd.setNRIStxtContact(cell44.getStringCellValue());
				this.modnrisd.setNRIStextAreaAddress(cell45.getStringCellValue());

				this.modenroll.setEDAdmissionStatus(cell47.getStringCellValue());

				fread.close();
				
				modviewMECHNRISPONchkbox(roll,modenroll);
				
				return rownum;
			}			
		}
		catch(Exception err)
		{
			
			throw err;
		}	
		
	}
	
	public void modstoreMECHNRISPON(int rownum, String fname, String mname, String lname, String gen, String dis, String addl1, String state, String city, String pin, String pcontact, String scontact, String email, String cat, String dob, String fatname, String fatcontact, String fatqual, String fatoccu, String fatincome, String fatemail, String motname, String motcontact, String motqual, String motoccu, String motincome, int pass10, int pass12, String boardroll, String schoolboard, String schoolname, String boardpertage, String pcmpertage, String pcmpertile, String jeescore, String jeepertile, String jeeroll, int acpcrank, String sponsorname, String gender, String nationality, String nristat, String realtionwstud, String sponcontact, String sponaddress, String admissionstat) throws Exception                                                                                                                                                             
	{
		
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
			worksheet = workbook.getSheet("NRI_SPONSOR");

			fwrite = new FileOutputStream(file);
			
			Row row = worksheet.getRow(rownum);
			Cell[] cell = new Cell[49];
			
			for(int i = 1; ((i<49)); i++)
			{
				if((i != 26) && (i != 46) && (i != 48))
					cell[i] = row.createCell(i);

			}
			
			for(int i = 1; ((i<49)); i++)
			{
				if((i != 26) && (i != 46) && (i != 48))
					cell[i] = worksheet.getRow(rownum).getCell(i);
			}
			
			cell[1].setCellValue(fname);
			cell[2].setCellValue(mname);
			cell[3].setCellValue(lname);
			cell[4].setCellValue(gen);
			cell[5].setCellValue(dis);
			cell[6].setCellValue(addl1);
			cell[7].setCellValue(state);
			cell[8].setCellValue(city);
			cell[9].setCellValue(pin);
			cell[10].setCellValue(pcontact);
			cell[11].setCellValue(scontact);
			cell[12].setCellValue(email);
			cell[13].setCellValue(cat);
			cell[14].setCellValue(dob);
			
			cell[15].setCellValue(fatname);
			cell[16].setCellValue(fatcontact);
			cell[17].setCellValue(fatqual);
			cell[18].setCellValue(fatoccu);
			cell[19].setCellValue(fatincome);
			cell[20].setCellValue(fatemail);
			cell[21].setCellValue(motname);
			cell[22].setCellValue(motcontact);
			cell[23].setCellValue(motqual);
			cell[24].setCellValue(motoccu);
			cell[25].setCellValue(motincome);
			
			cell[27].setCellValue(pass10);
			cell[28].setCellValue(pass12);
			cell[29].setCellValue(boardroll);
			cell[30].setCellValue(schoolboard);
			cell[31].setCellValue(schoolname);
			cell[32].setCellValue(boardpertage);
			cell[33].setCellValue(pcmpertage);
			cell[34].setCellValue(pcmpertile);
			cell[35].setCellValue(jeescore);
			cell[36].setCellValue(jeepertile);
			cell[37].setCellValue(jeeroll);
			cell[38].setCellValue(acpcrank);
			
			cell[39].setCellValue(sponsorname);
			cell[40].setCellValue(gender);
			cell[41].setCellValue(nationality);
			cell[42].setCellValue(nristat);
			cell[43].setCellValue(realtionwstud);
			cell[44].setCellValue(sponcontact);
			cell[45].setCellValue(sponaddress);

			cell[47].setCellValue(admissionstat);
			
			fread.close();
			
			workbook.write(fwrite);
			fwrite.close();
		}
		catch(Exception err)
		{
			
			throw err;
		}	

	}

	
	public int modviewMECHNRISTUD(String roll,ModPersonalDetails_GUI PD,ModGuardianDetails_GUI GD,ModNRI_AcademicDetails_GUI NA,ModNRIStudent_GUI NS,ModEnrollmentDetails_GUI Enroll) throws Exception
	{
		this.modpd = PD;
		this.modgd = GD;
		this.modnriaca = NA;
		this.modnristud = NS;
		this.modenroll = Enroll;
		
		int rownum = -1;
		
		try
		{
			File file = new File("//10.20.10.52/Documents/#2016/MECH.xls");
			//File file = new File("MECH.xls");
			
			
			FileInputStream fread = null;
			fread = new FileInputStream(file);

			Workbook wb = WorkbookFactory.create(fread);
			Sheet sh = wb.getSheet("NRI");
			
			int last = sh.getLastRowNum();

			for(int i = 1; i<=last; i++)	
			{
				Row row = sh.getRow(i);
				Cell jeerollcell = row.getCell(27);
				jeerollcell = sh.getRow(i).getCell(27);
				if(jeerollcell.getStringCellValue().equals(roll))
				{
					rownum = i;
					break;
				}
			}
			
			if(rownum == -1)
			{
				return rownum;
			}
			else 
			{
				Row row2 = sh.getRow(rownum);
				
//				Cell cell0 = row2.getCell(0);
				Cell cell1 = row2.getCell(1);
				Cell cell2 = row2.getCell(2);
				Cell cell3 = row2.getCell(3);
				Cell cell4 = row2.getCell(4);
				Cell cell5 = row2.getCell(5);
				Cell cell6 = row2.getCell(6);
				Cell cell7 = row2.getCell(7);
				Cell cell8 = row2.getCell(8);
				Cell cell9 = row2.getCell(9);
				Cell cell10 = row2.getCell(10);
				Cell cell11 = row2.getCell(11);
				Cell cell12 = row2.getCell(12);
				Cell cell13 = row2.getCell(13);
				Cell cell14 = row2.getCell(14);
				Cell cell15 = row2.getCell(15);
				Cell cell16 = row2.getCell(16);
				Cell cell17 = row2.getCell(17);
				Cell cell18 = row2.getCell(18);
				Cell cell19 = row2.getCell(19);
				Cell cell20 = row2.getCell(20);
				Cell cell21 = row2.getCell(21);
				Cell cell22 = row2.getCell(22);
				Cell cell23 = row2.getCell(23);
				Cell cell24 = row2.getCell(24);
				Cell cell25 = row2.getCell(25);
//				Cell cell26 = row2.getCell(26);
				Cell cell27 = row2.getCell(27);
				Cell cell28 = row2.getCell(28);
				Cell cell29 = row2.getCell(29);
				Cell cell30 = row2.getCell(30);
				Cell cell31 = row2.getCell(31);
//				Cell cell32 = row2.getCell(32);
				Cell cell33 = row2.getCell(33);
//				Cell cell34 = row2.getCell(34);
				
				
				this.modpd.setPDtxtFirstName(cell1.getStringCellValue());
				this.modpd.setPDtxtMiddleName(cell2.getStringCellValue());
				this.modpd.setPDtxtLastName(cell3.getStringCellValue());
				this.modpd.setPDGenderBG(cell4.getStringCellValue());
				this.modpd.setPDtxtDisability(cell5.getStringCellValue());
				this.modpd.setPDtxtAddL1(cell6.getStringCellValue());
				this.modpd.setPDtxtState(cell7.getStringCellValue());
				this.modpd.setPDtxtCity(cell8.getStringCellValue());
				this.modpd.setPDtxtPincode(cell9.getStringCellValue());
				this.modpd.setPDtxtPrimaryContact(cell10.getStringCellValue());
				this.modpd.setPDtxtSecondaryContact(cell11.getStringCellValue());
				this.modpd.setPDtxtEmailId(cell12.getStringCellValue());
				this.modpd.setPDcomboBoxCategory(cell13.getStringCellValue());
				this.modpd.setPDdob(cell14.getStringCellValue());
				
				this.modgd.setGDtxtFatherName(cell15.getStringCellValue());
				this.modgd.setGDtxtFatherContact(cell16.getStringCellValue());
				this.modgd.setGDtxtFatherQualification(cell17.getStringCellValue());
				this.modgd.setGDtxtFatherOccupation(cell18.getStringCellValue());
				this.modgd.setGDcmbFatherIncome(cell19.getStringCellValue());
				this.modgd.setGDtxtFatherEmail(cell20.getStringCellValue());
				this.modgd.setGDtxtMotherName(cell21.getStringCellValue());
				this.modgd.setGDtxtMotherContact(cell22.getStringCellValue());
				this.modgd.setGDtxtMotherQualification(cell23.getStringCellValue());
				this.modgd.setGDtxtMotherOccupation(cell24.getStringCellValue());
				this.modgd.setGDcmbMotherIncome(cell25.getStringCellValue());
				
				this.modnriaca.setNADtxt12thRollNumberunique(cell27.getStringCellValue());
				this.modnriaca.setNADtxtOverallGrade(cell28.getStringCellValue());
				
				this.modnristud.setNRItextAreaAddress(cell29.getStringCellValue());
				this.modnristud.setNRItxtNriStatus(cell30.getStringCellValue());
				this.modnristud.setNRItxtNationality(cell31.getStringCellValue());

				this.modenroll.setEDAdmissionStatus(cell33.getStringCellValue());

				fread.close();
				
				modviewMECHNRISTUDchkbox(roll,modenroll);
				
				return rownum;
			}			
		}
		catch(Exception err)
		{
			
			throw err;
		}	
	}
	
	
	public void modstoreMECHNRISTUD(int rownum, String fname, String mname, String lname, String gen, String dis, String addl1, String state, String city, String pin, String pcontact, String scontact, String email, String cat, String dob, String fatname, String fatcontact, String fatqual, String fatoccu, String fatincome, String fatemail, String motname, String motcontact, String motqual, String motoccu, String motincome, String roll12, String grade, String nation, String NRI_status, String NRI_add, String admissionstat) throws Exception
	{
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
			worksheet = workbook.getSheet("NRI");

			fwrite = new FileOutputStream(file);
			
			Row row = worksheet.getRow(rownum);
			Cell[] cell = new Cell[35];
			
			for(int i = 1; ((i<35)); i++)
			{
				if((i != 26) && (i != 32) && (i != 34))
					cell[i] = row.createCell(i);

			}
			
			for(int i = 1; ((i<35)); i++)
			{
				if((i != 26) && (i != 32) && (i != 34))
					cell[i] = worksheet.getRow(rownum).getCell(i);
			}
			
			cell[1].setCellValue(fname);
			cell[2].setCellValue(mname);
			cell[3].setCellValue(lname);
			cell[4].setCellValue(gen);
			cell[5].setCellValue(dis);
			cell[6].setCellValue(addl1);
			cell[7].setCellValue(state);
			cell[8].setCellValue(city);
			cell[9].setCellValue(pin);
			cell[10].setCellValue(pcontact);
			cell[11].setCellValue(scontact);
			cell[12].setCellValue(email);
			cell[13].setCellValue(cat);
			cell[14].setCellValue(dob);
			
			cell[15].setCellValue(fatname);
			cell[16].setCellValue(fatcontact);
			cell[17].setCellValue(fatqual);
			cell[18].setCellValue(fatoccu);
			cell[19].setCellValue(fatincome);
			cell[20].setCellValue(fatemail);
			cell[21].setCellValue(motname);
			cell[22].setCellValue(motcontact);
			cell[23].setCellValue(motqual);
			cell[24].setCellValue(motoccu);
			cell[25].setCellValue(motincome);
			
			cell[27].setCellValue(roll12);
			cell[28].setCellValue(grade);

			cell[29].setCellValue(nation);
			cell[30].setCellValue(NRI_status);
			cell[31].setCellValue(NRI_add);
			
			cell[33].setCellValue(admissionstat);
			
			fread.close();
			
			workbook.write(fwrite);
			fwrite.close();
		}
		catch(Exception err)
		{
			
			throw err;
		}	

	}
	
	public int modviewCHEMACPC(String roll,ModPersonalDetails_GUI PD,ModGuardianDetails_GUI GD,ModBoard_JEE_GUI BJ,ModEnrollmentDetails_GUI Enroll) throws Exception
	{
		this.modpd = PD;
		this.modgd = GD;
		this.modbj = BJ;
		this.modenroll = Enroll;
		
		int rownum = -1;
		
		try
		{
			File file = new File("//10.20.10.52/Documents/#2016/CHEM.xls");
			//File file = new File("CHEM.xls");
			
			FileInputStream fread = null;
			fread = new FileInputStream(file);

			Workbook wb = WorkbookFactory.create(fread);
			Sheet sh = wb.getSheet("ACPC");
			
			int last = sh.getLastRowNum();

			for(int i = 1; i<=last; i++)	
			{
				Row row = sh.getRow(i);
				Cell jeerollcell = row.getCell(37);
				Cell admissionstat = row.getCell(40);
				jeerollcell = sh.getRow(i).getCell(37);
				admissionstat = sh.getRow(i).getCell(40);
				if((jeerollcell.getStringCellValue().equals(roll)) && !(admissionstat.getStringCellValue().equals("TENTATIVE")))
				{
					rownum = i;
					break;
				}
			}
			
			if(rownum == -1)
			{
				return rownum;
			}
			else 
			{
				Row row2 = sh.getRow(rownum);
				
//				Cell cell0 = row2.getCell(0);
				Cell cell1 = row2.getCell(1);
				Cell cell2 = row2.getCell(2);
				Cell cell3 = row2.getCell(3);
				Cell cell4 = row2.getCell(4);
				Cell cell5 = row2.getCell(5);
				Cell cell6 = row2.getCell(6);
				Cell cell7 = row2.getCell(7);
				Cell cell8 = row2.getCell(8);
				Cell cell9 = row2.getCell(9);
				Cell cell10 = row2.getCell(10);
				Cell cell11 = row2.getCell(11);
				Cell cell12 = row2.getCell(12);
				Cell cell13 = row2.getCell(13);
				Cell cell14 = row2.getCell(14);
				Cell cell15 = row2.getCell(15);
				Cell cell16 = row2.getCell(16);
				Cell cell17 = row2.getCell(17);
				Cell cell18 = row2.getCell(18);
				Cell cell19 = row2.getCell(19);
				Cell cell20 = row2.getCell(20);
				Cell cell21 = row2.getCell(21);
				Cell cell22 = row2.getCell(22);
				Cell cell23 = row2.getCell(23);
				Cell cell24 = row2.getCell(24);
				Cell cell25 = row2.getCell(25);
//				Cell cell26 = row2.getCell(26);
				Cell cell27 = row2.getCell(27);
				Cell cell28 = row2.getCell(28);
				Cell cell29 = row2.getCell(29);
				Cell cell30 = row2.getCell(30);
				Cell cell31 = row2.getCell(31);
				Cell cell32 = row2.getCell(32);
				Cell cell33 = row2.getCell(33);
				Cell cell34 = row2.getCell(34);
				Cell cell35 = row2.getCell(35);
				Cell cell36 = row2.getCell(36);
				Cell cell37 = row2.getCell(37);
				Cell cell38 = row2.getCell(38);
//				Cell cell39 = row2.getCell(39);
				Cell cell40 = row2.getCell(40);
//				Cell cell41 = row2.getCell(41);
				
				
				this.modpd.setPDtxtFirstName(cell1.getStringCellValue());
				this.modpd.setPDtxtMiddleName(cell2.getStringCellValue());
				this.modpd.setPDtxtLastName(cell3.getStringCellValue());
				this.modpd.setPDGenderBG(cell4.getStringCellValue());
				this.modpd.setPDtxtDisability(cell5.getStringCellValue());
				this.modpd.setPDtxtAddL1(cell6.getStringCellValue());
				this.modpd.setPDtxtState(cell7.getStringCellValue());
				this.modpd.setPDtxtCity(cell8.getStringCellValue());
				this.modpd.setPDtxtPincode(cell9.getStringCellValue());
				this.modpd.setPDtxtPrimaryContact(cell10.getStringCellValue());
				this.modpd.setPDtxtSecondaryContact(cell11.getStringCellValue());
				this.modpd.setPDtxtEmailId(cell12.getStringCellValue());
				this.modpd.setPDcomboBoxCategory(cell13.getStringCellValue());
				this.modpd.setPDdob(cell14.getStringCellValue());
				
				this.modgd.setGDtxtFatherName(cell15.getStringCellValue());
				this.modgd.setGDtxtFatherContact(cell16.getStringCellValue());
				this.modgd.setGDtxtFatherQualification(cell17.getStringCellValue());
				this.modgd.setGDtxtFatherOccupation(cell18.getStringCellValue());
				this.modgd.setGDcmbFatherIncome(cell19.getStringCellValue());
				this.modgd.setGDtxtFatherEmail(cell20.getStringCellValue());
				this.modgd.setGDtxtMotherName(cell21.getStringCellValue());
				this.modgd.setGDtxtMotherContact(cell22.getStringCellValue());
				this.modgd.setGDtxtMotherQualification(cell23.getStringCellValue());
				this.modgd.setGDtxtMotherOccupation(cell24.getStringCellValue());
				this.modgd.setGDcmbMotherIncome(cell25.getStringCellValue());

				
				this.modbj.setADyearChooser10th((int)cell27.getNumericCellValue());
				this.modbj.setADyearChooser12th((int)(cell28.getNumericCellValue()));
				this.modbj.setADtxtBoardRollNum12th(cell29.getStringCellValue());
				this.modbj.setADcmbSchoolBoard(cell30.getStringCellValue());
				this.modbj.setADtxtSchoolName(cell31.getStringCellValue());
				this.modbj.setADtxtOverallPercentage12th(cell32.getStringCellValue());
				this.modbj.setADtxtPCMPercentage12th(cell33.getStringCellValue());
				this.modbj.setADtxtPCMPercentile12th(cell34.getStringCellValue());
				this.modbj.setADtxtJEEScore(cell35.getStringCellValue());
				this.modbj.setADtxtJEEPercentile(cell36.getStringCellValue());
				this.modbj.setADtxtJEERollNumber(cell37.getStringCellValue());
				this.modbj.setADtxtAcpcRank(String.valueOf((int)cell38.getNumericCellValue()));
				
				this.modenroll.setEDAdmissionStatus(cell40.getStringCellValue());

				fread.close();
				
				modviewCHEMACPCchkbox(roll,modenroll);
				
				return rownum;
			}			
		}
		catch(Exception err)
		{
			
			throw err;
		}	
	}
	
	public void modstoreCHEMACPC(int rownum, String fname, String mname, String lname, String gen, String dis, String addl1, String state, String city, String pin, String pcontact, String scontact, String email, String cat, String dob, String fatname, String fatcontact, String fatqual, String fatoccu, String fatincome, String fatemail, String motname, String motcontact, String motqual, String motoccu, String motincome, int pass10, int pass12, String boardroll, String schoolboard, String schoolname, String boardpertage, String pcmpertage, String pcmpertile, String jeescore, String jeepertile, String jeeroll, int acpcrank, String admissionstat) throws Exception                                                                                                                                                             
	{
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
			worksheet = workbook.getSheet("ACPC");

			fwrite = new FileOutputStream(file);
			
			Row row = worksheet.getRow(rownum);
			Cell[] cell = new Cell[42];
			
			for(int i = 1;(i<42); i++)
			{				
				if((i != 26) && (i != 39) && (i != 41))
				{
					cell[i] = row.createCell(i);
				}
			
				//if(i==27)
				//	System.out.println("HEY");

			}
			
			for(int i = 1; ((i<42)); i++)
			{
				if((i != 26) && (i != 39) && (i != 41))
					cell[i] = worksheet.getRow(rownum).getCell(i);
			}
			
			cell[1].setCellValue(fname);
			cell[2].setCellValue(mname);
			cell[3].setCellValue(lname);
			cell[4].setCellValue(gen);
			cell[5].setCellValue(dis);
			cell[6].setCellValue(addl1);
			cell[7].setCellValue(state);
			cell[8].setCellValue(city);
			cell[9].setCellValue(pin);
			cell[10].setCellValue(pcontact);
			cell[11].setCellValue(scontact);
			cell[12].setCellValue(email);
			cell[13].setCellValue(cat);
			cell[14].setCellValue(dob);
			
			cell[15].setCellValue(fatname);
			cell[16].setCellValue(fatcontact);
			cell[17].setCellValue(fatqual);
			cell[18].setCellValue(fatoccu);
			cell[19].setCellValue(fatincome);
			cell[20].setCellValue(fatemail);
			cell[21].setCellValue(motname);
			cell[22].setCellValue(motcontact);
			cell[23].setCellValue(motqual);
			cell[24].setCellValue(motoccu);
			cell[25].setCellValue(motincome);
			
			cell[27].setCellValue(pass10);
			cell[28].setCellValue(pass12);
			cell[29].setCellValue(boardroll);
			cell[30].setCellValue(schoolboard);
			cell[31].setCellValue(schoolname);
			cell[32].setCellValue(boardpertage);
			cell[33].setCellValue(pcmpertage);
			cell[34].setCellValue(pcmpertile);
			cell[35].setCellValue(jeescore);
			cell[36].setCellValue(jeepertile);
			cell[37].setCellValue(jeeroll);
			cell[38].setCellValue(acpcrank);
			
			cell[40].setCellValue(admissionstat);
			
			fread.close();
			
			workbook.write(fwrite);
			fwrite.close();
		}
		catch(Exception err)
		{
			
			throw err;
		}	

	}

	public int modviewCHEMNRISPON(String roll,ModPersonalDetails_GUI PD,ModGuardianDetails_GUI GD,ModBoard_JEE_GUI BJ,ModNRISponsoredDetails_GUI SD,ModEnrollmentDetails_GUI Enroll) throws Exception
	{
		this.modpd = PD;
		this.modgd = GD;
		this.modbj = BJ;
		this.modnrisd = SD;
		this.modenroll = Enroll;
		
		int rownum = -1;
		
		try
		{
			File file = new File("//10.20.10.52/Documents/#2016/CHEM.xls");
			//File file = new File("CHEM.xls");
			

			FileInputStream fread = null;
			fread = new FileInputStream(file);

			Workbook wb = WorkbookFactory.create(fread);
			Sheet sh = wb.getSheet("NRI_SPONSOR");
			
			int last = sh.getLastRowNum();

			for(int i = 1; i<=last; i++)	
			{
				Row row = sh.getRow(i);
				Cell jeerollcell = row.getCell(37);
				jeerollcell = sh.getRow(i).getCell(37);
				if(jeerollcell.getStringCellValue().equals(roll))
				{
					rownum = i;
					break;
				}
			}
			
			if(rownum == -1)
			{
				return rownum;
			}
			else 
			{
				Row row2 = sh.getRow(rownum);
				
//				Cell cell0 = row2.getCell(0);
				Cell cell1 = row2.getCell(1);
				Cell cell2 = row2.getCell(2);
				Cell cell3 = row2.getCell(3);
				Cell cell4 = row2.getCell(4);
				Cell cell5 = row2.getCell(5);
				Cell cell6 = row2.getCell(6);
				Cell cell7 = row2.getCell(7);
				Cell cell8 = row2.getCell(8);
				Cell cell9 = row2.getCell(9);
				Cell cell10 = row2.getCell(10);
				Cell cell11 = row2.getCell(11);
				Cell cell12 = row2.getCell(12);
				Cell cell13 = row2.getCell(13);
				Cell cell14 = row2.getCell(14);
				Cell cell15 = row2.getCell(15);
				Cell cell16 = row2.getCell(16);
				Cell cell17 = row2.getCell(17);
				Cell cell18 = row2.getCell(18);
				Cell cell19 = row2.getCell(19);
				Cell cell20 = row2.getCell(20);
				Cell cell21 = row2.getCell(21);
				Cell cell22 = row2.getCell(22);
				Cell cell23 = row2.getCell(23);
				Cell cell24 = row2.getCell(24);
				Cell cell25 = row2.getCell(25);
//				Cell cell26 = row2.getCell(26);
				Cell cell27 = row2.getCell(27);
				Cell cell28 = row2.getCell(28);
				Cell cell29 = row2.getCell(29);
				Cell cell30 = row2.getCell(30);
				Cell cell31 = row2.getCell(31);
				Cell cell32 = row2.getCell(32);
				Cell cell33 = row2.getCell(33);
				Cell cell34 = row2.getCell(34);
				Cell cell35 = row2.getCell(35);
				Cell cell36 = row2.getCell(36);
				Cell cell37 = row2.getCell(37);
				Cell cell38 = row2.getCell(38);
				Cell cell39 = row2.getCell(39);
				Cell cell40 = row2.getCell(40);
				Cell cell41 = row2.getCell(41);
				Cell cell42 = row2.getCell(42);
				Cell cell43 = row2.getCell(43);
				Cell cell44 = row2.getCell(44);
				Cell cell45 = row2.getCell(45);
//				Cell cell46 = row2.getCell(46);
				Cell cell47 = row2.getCell(47);
//				Cell cell48 = row2.getCell(48);
							
				this.modpd.setPDtxtFirstName(cell1.getStringCellValue());
				this.modpd.setPDtxtMiddleName(cell2.getStringCellValue());
				this.modpd.setPDtxtLastName(cell3.getStringCellValue());
				this.modpd.setPDGenderBG(cell4.getStringCellValue());
				this.modpd.setPDtxtDisability(cell5.getStringCellValue());
				this.modpd.setPDtxtAddL1(cell6.getStringCellValue());
				this.modpd.setPDtxtState(cell7.getStringCellValue());
				this.modpd.setPDtxtCity(cell8.getStringCellValue());
				this.modpd.setPDtxtPincode(cell9.getStringCellValue());
				this.modpd.setPDtxtPrimaryContact(cell10.getStringCellValue());
				this.modpd.setPDtxtSecondaryContact(cell11.getStringCellValue());
				this.modpd.setPDtxtEmailId(cell12.getStringCellValue());
				this.modpd.setPDcomboBoxCategory(cell13.getStringCellValue());
				this.modpd.setPDdob(cell14.getStringCellValue());
				
				this.modgd.setGDtxtFatherName(cell15.getStringCellValue());
				this.modgd.setGDtxtFatherContact(cell16.getStringCellValue());
				this.modgd.setGDtxtFatherQualification(cell17.getStringCellValue());
				this.modgd.setGDtxtFatherOccupation(cell18.getStringCellValue());
				this.modgd.setGDcmbFatherIncome(cell19.getStringCellValue());
				this.modgd.setGDtxtFatherEmail(cell20.getStringCellValue());
				this.modgd.setGDtxtMotherName(cell21.getStringCellValue());
				this.modgd.setGDtxtMotherContact(cell22.getStringCellValue());
				this.modgd.setGDtxtMotherQualification(cell23.getStringCellValue());
				this.modgd.setGDtxtMotherOccupation(cell24.getStringCellValue());
				this.modgd.setGDcmbMotherIncome(cell25.getStringCellValue());

				this.modbj.setADyearChooser10th((int)cell27.getNumericCellValue());
				this.modbj.setADyearChooser12th((int)(cell28.getNumericCellValue()));
				this.modbj.setADtxtBoardRollNum12th(cell29.getStringCellValue());
				this.modbj.setADcmbSchoolBoard(cell30.getStringCellValue());
				this.modbj.setADtxtSchoolName(cell31.getStringCellValue());
				this.modbj.setADtxtOverallPercentage12th(cell32.getStringCellValue());
				this.modbj.setADtxtPCMPercentage12th(cell33.getStringCellValue());
				this.modbj.setADtxtPCMPercentile12th(cell34.getStringCellValue());
				this.modbj.setADtxtJEEScore(cell35.getStringCellValue());
				this.modbj.setADtxtJEEPercentile(cell36.getStringCellValue());
				this.modbj.setADtxtJEERollNumber(cell37.getStringCellValue());
				this.modbj.setADtxtAcpcRank(String.valueOf((int)cell38.getNumericCellValue()));

				this.modnrisd.setNRIStxtname(cell39.getStringCellValue());
				this.modnrisd.setNRIStxtGender(cell40.getStringCellValue());
				this.modnrisd.setNRIStxtNationality(cell41.getStringCellValue());
				this.modnrisd.setNRIStxtStatus(cell42.getStringCellValue());
				this.modnrisd.setNRIStxtRelation(cell43.getStringCellValue());
				this.modnrisd.setNRIStxtContact(cell44.getStringCellValue());
				this.modnrisd.setNRIStextAreaAddress(cell45.getStringCellValue());

				this.modenroll.setEDAdmissionStatus(cell47.getStringCellValue());

				fread.close();
				
				modviewCHEMNRISPONchkbox(roll,modenroll);
				
				return rownum;
			}			
		}
		catch(Exception err)
		{
			
			throw err;
		}	
	}
	
	public void modstoreCHEMNRISPON(int rownum, String fname, String mname, String lname, String gen, String dis, String addl1, String state, String city, String pin, String pcontact, String scontact, String email, String cat, String dob, String fatname, String fatcontact, String fatqual, String fatoccu, String fatincome, String fatemail, String motname, String motcontact, String motqual, String motoccu, String motincome, int pass10, int pass12, String boardroll, String schoolboard, String schoolname, String boardpertage, String pcmpertage, String pcmpertile, String jeescore, String jeepertile, String jeeroll, int acpcrank, String sponsorname, String gender, String nationality, String nristat, String realtionwstud, String sponcontact, String sponaddress, String admissionstat) throws Exception                                                                                                                                                             
	{
		
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
			worksheet = workbook.getSheet("NRI_SPONSOR");

			fwrite = new FileOutputStream(file);
			
			Row row = worksheet.getRow(rownum);
			Cell[] cell = new Cell[49];
			
			for(int i = 1; ((i<49)); i++)
			{
				if((i != 26) && (i != 46) && (i != 48))
					cell[i] = row.createCell(i);

			}
			
			for(int i = 1; ((i<49)); i++)
			{
				if((i != 26) && (i != 46) && (i != 48))
					cell[i] = worksheet.getRow(rownum).getCell(i);
			}
			
			cell[1].setCellValue(fname);
			cell[2].setCellValue(mname);
			cell[3].setCellValue(lname);
			cell[4].setCellValue(gen);
			cell[5].setCellValue(dis);
			cell[6].setCellValue(addl1);
			cell[7].setCellValue(state);
			cell[8].setCellValue(city);
			cell[9].setCellValue(pin);
			cell[10].setCellValue(pcontact);
			cell[11].setCellValue(scontact);
			cell[12].setCellValue(email);
			cell[13].setCellValue(cat);
			cell[14].setCellValue(dob);
			
			cell[15].setCellValue(fatname);
			cell[16].setCellValue(fatcontact);
			cell[17].setCellValue(fatqual);
			cell[18].setCellValue(fatoccu);
			cell[19].setCellValue(fatincome);
			cell[20].setCellValue(fatemail);
			cell[21].setCellValue(motname);
			cell[22].setCellValue(motcontact);
			cell[23].setCellValue(motqual);
			cell[24].setCellValue(motoccu);
			cell[25].setCellValue(motincome);
			
			cell[27].setCellValue(pass10);
			cell[28].setCellValue(pass12);
			cell[29].setCellValue(boardroll);
			cell[30].setCellValue(schoolboard);
			cell[31].setCellValue(schoolname);
			cell[32].setCellValue(boardpertage);
			cell[33].setCellValue(pcmpertage);
			cell[34].setCellValue(pcmpertile);
			cell[35].setCellValue(jeescore);
			cell[36].setCellValue(jeepertile);
			cell[37].setCellValue(jeeroll);
			cell[38].setCellValue(acpcrank);
			
			cell[39].setCellValue(sponsorname);
			cell[40].setCellValue(gender);
			cell[41].setCellValue(nationality);
			cell[42].setCellValue(nristat);
			cell[43].setCellValue(realtionwstud);
			cell[44].setCellValue(sponcontact);
			cell[45].setCellValue(sponaddress);

			cell[47].setCellValue(admissionstat);
			
			fread.close();
			
			workbook.write(fwrite);
			fwrite.close();
		}
		catch(Exception err)
		{
			
			throw err;
		}	

	}

	
	public int modviewCHEMNRISTUD(String roll,ModPersonalDetails_GUI PD,ModGuardianDetails_GUI GD,ModNRI_AcademicDetails_GUI NA,ModNRIStudent_GUI NS,ModEnrollmentDetails_GUI Enroll) throws Exception
	{
		this.modpd = PD;
		this.modgd = GD;
		this.modnriaca = NA;
		this.modnristud = NS;
		this.modenroll = Enroll;
		
		int rownum = -1;
		
		try
		{
			File file = new File("//10.20.10.52/Documents/#2016/CHEM.xls");
			//File file = new File("CHEM.xls");
			
			FileInputStream fread = null;
			fread = new FileInputStream(file);

			Workbook wb = WorkbookFactory.create(fread);
			Sheet sh = wb.getSheet("NRI");
			
			int last = sh.getLastRowNum();

			for(int i = 1; i<=last; i++)	
			{
				Row row = sh.getRow(i);
				Cell jeerollcell = row.getCell(27);
				jeerollcell = sh.getRow(i).getCell(27);
				if(jeerollcell.getStringCellValue().equals(roll))
				{
					rownum = i;
					break;
				}
			}
			
			if(rownum == -1)
			{
				return rownum;
			}
			else 
			{
				Row row2 = sh.getRow(rownum);
				
//				Cell cell0 = row2.getCell(0);
				Cell cell1 = row2.getCell(1);
				Cell cell2 = row2.getCell(2);
				Cell cell3 = row2.getCell(3);
				Cell cell4 = row2.getCell(4);
				Cell cell5 = row2.getCell(5);
				Cell cell6 = row2.getCell(6);
				Cell cell7 = row2.getCell(7);
				Cell cell8 = row2.getCell(8);
				Cell cell9 = row2.getCell(9);
				Cell cell10 = row2.getCell(10);
				Cell cell11 = row2.getCell(11);
				Cell cell12 = row2.getCell(12);
				Cell cell13 = row2.getCell(13);
				Cell cell14 = row2.getCell(14);
				Cell cell15 = row2.getCell(15);
				Cell cell16 = row2.getCell(16);
				Cell cell17 = row2.getCell(17);
				Cell cell18 = row2.getCell(18);
				Cell cell19 = row2.getCell(19);
				Cell cell20 = row2.getCell(20);
				Cell cell21 = row2.getCell(21);
				Cell cell22 = row2.getCell(22);
				Cell cell23 = row2.getCell(23);
				Cell cell24 = row2.getCell(24);
				Cell cell25 = row2.getCell(25);
//				Cell cell26 = row2.getCell(26);
				Cell cell27 = row2.getCell(27);
				Cell cell28 = row2.getCell(28);
				Cell cell29 = row2.getCell(29);
				Cell cell30 = row2.getCell(30);
				Cell cell31 = row2.getCell(31);
//				Cell cell32 = row2.getCell(32);
				Cell cell33 = row2.getCell(33);
//				Cell cell34 = row2.getCell(34);
				
				
				this.modpd.setPDtxtFirstName(cell1.getStringCellValue());
				this.modpd.setPDtxtMiddleName(cell2.getStringCellValue());
				this.modpd.setPDtxtLastName(cell3.getStringCellValue());
				this.modpd.setPDGenderBG(cell4.getStringCellValue());
				this.modpd.setPDtxtDisability(cell5.getStringCellValue());
				this.modpd.setPDtxtAddL1(cell6.getStringCellValue());
				this.modpd.setPDtxtState(cell7.getStringCellValue());
				this.modpd.setPDtxtCity(cell8.getStringCellValue());
				this.modpd.setPDtxtPincode(cell9.getStringCellValue());
				this.modpd.setPDtxtPrimaryContact(cell10.getStringCellValue());
				this.modpd.setPDtxtSecondaryContact(cell11.getStringCellValue());
				this.modpd.setPDtxtEmailId(cell12.getStringCellValue());
				this.modpd.setPDcomboBoxCategory(cell13.getStringCellValue());
				this.modpd.setPDdob(cell14.getStringCellValue());
				
				this.modgd.setGDtxtFatherName(cell15.getStringCellValue());
				this.modgd.setGDtxtFatherContact(cell16.getStringCellValue());
				this.modgd.setGDtxtFatherQualification(cell17.getStringCellValue());
				this.modgd.setGDtxtFatherOccupation(cell18.getStringCellValue());
				this.modgd.setGDcmbFatherIncome(cell19.getStringCellValue());
				this.modgd.setGDtxtFatherEmail(cell20.getStringCellValue());
				this.modgd.setGDtxtMotherName(cell21.getStringCellValue());
				this.modgd.setGDtxtMotherContact(cell22.getStringCellValue());
				this.modgd.setGDtxtMotherQualification(cell23.getStringCellValue());
				this.modgd.setGDtxtMotherOccupation(cell24.getStringCellValue());
				this.modgd.setGDcmbMotherIncome(cell25.getStringCellValue());
				
				this.modnriaca.setNADtxt12thRollNumberunique(cell27.getStringCellValue());
				this.modnriaca.setNADtxtOverallGrade(cell28.getStringCellValue());
				
				this.modnristud.setNRItextAreaAddress(cell29.getStringCellValue());
				this.modnristud.setNRItxtNriStatus(cell30.getStringCellValue());
				this.modnristud.setNRItxtNationality(cell31.getStringCellValue());

				this.modenroll.setEDAdmissionStatus(cell33.getStringCellValue());

				fread.close();
				
				modviewCHEMNRISTUDchkbox(roll,modenroll);
				
				return rownum;
			}			
		}
		catch(Exception err)
		{
			
			throw err;
		}	
	}
	
	
	public void modstoreCHEMNRISTUD(int rownum, String fname, String mname, String lname, String gen, String dis, String addl1, String state, String city, String pin, String pcontact, String scontact, String email, String cat, String dob, String fatname, String fatcontact, String fatqual, String fatoccu, String fatincome, String fatemail, String motname, String motcontact, String motqual, String motoccu, String motincome, String roll12, String grade, String nation, String NRI_status, String NRI_add, String admissionstat) throws Exception
	{
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
			worksheet = workbook.getSheet("NRI");

			fwrite = new FileOutputStream(file);
			
			Row row = worksheet.getRow(rownum);
			Cell[] cell = new Cell[35];
			
			for(int i = 1; ((i<35)); i++)
			{
				if((i != 26) && (i != 32) && (i != 34))
					cell[i] = row.createCell(i);

			}
			
			for(int i = 1; ((i<35)); i++)
			{
				if((i != 26) && (i != 32) && (i != 34))
					cell[i] = worksheet.getRow(rownum).getCell(i);
			}
			
			cell[1].setCellValue(fname);
			cell[2].setCellValue(mname);
			cell[3].setCellValue(lname);
			cell[4].setCellValue(gen);
			cell[5].setCellValue(dis);
			cell[6].setCellValue(addl1);
			cell[7].setCellValue(state);
			cell[8].setCellValue(city);
			cell[9].setCellValue(pin);
			cell[10].setCellValue(pcontact);
			cell[11].setCellValue(scontact);
			cell[12].setCellValue(email);
			cell[13].setCellValue(cat);
			cell[14].setCellValue(dob);
			
			cell[15].setCellValue(fatname);
			cell[16].setCellValue(fatcontact);
			cell[17].setCellValue(fatqual);
			cell[18].setCellValue(fatoccu);
			cell[19].setCellValue(fatincome);
			cell[20].setCellValue(fatemail);
			cell[21].setCellValue(motname);
			cell[22].setCellValue(motcontact);
			cell[23].setCellValue(motqual);
			cell[24].setCellValue(motoccu);
			cell[25].setCellValue(motincome);
			
			cell[27].setCellValue(roll12);
			cell[28].setCellValue(grade);

			cell[29].setCellValue(nation);
			cell[30].setCellValue(NRI_status);
			cell[31].setCellValue(NRI_add);
			
			cell[33].setCellValue(admissionstat);
			
			fread.close();
			
			workbook.write(fwrite);
			fwrite.close();
		}
		catch(Exception err)
		{
			
			throw err;
		}	

	}


	public int ICTacpcjeerollnumcheck(String roll) throws Exception
	{
		int rownum = -1;
		
		File file = new File("//10.20.10.52/Documents/#2016/ICT.xls");
		//File file = new File("ICT.xls");
		
		try
		{
			Workbook wb = WorkbookFactory.create(file);

			Sheet sh = wb.getSheet("ACPC");
			int last = sh.getLastRowNum();
		//	System.out.println("here4");
			for(int i = 1; i<=last; i++)	
			{
				Row row = sh.getRow(i);
				Cell jeerollcell = row.getCell(37);
				Cell admissionstat = row.getCell(40);
				jeerollcell = sh.getRow(i).getCell(37);
				admissionstat = sh.getRow(i).getCell(40);
				//System.out.println(admissionstat.getStringCellValue()+ "adm" + "\n");
				//System.out.println(jeerollcell.getStringCellValue() + "jee" + "\n" + roll);
				if((jeerollcell.getStringCellValue().equals(roll)) && !(admissionstat.getStringCellValue().equals("TENTATIVE"))) 
				{
					rownum = i;
					break;
				}		
			}
		}
		catch(Exception err)
		{
			
			throw err;
		}	
		return rownum;
		/* -1 if didnt found the row with the specific roll number in the file */
		/* Any other number if found the Roll number at a specific row in the file */
	}
	
	public int MECHacpcjeerollnumcheck(String roll) throws Exception
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
				//System.out.println(admissionstat.getStringCellValue());
				if((jeerollcell.getStringCellValue().equals(roll)) && !(admissionstat.getStringCellValue().equals("TENTATIVE"))) 
				{
					rownum = i;
					break;
				}		
			}
		}
		catch(Exception err)
		{
			
			throw err;
		}	
		return rownum;
		/* -1 if didnt found the row with the specific roll number in the file */
		/* Any other number if found the Roll number at a specific row in the file */
	}

	public int CHEMacpcjeerollnumcheck(String roll) throws Exception
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
				//System.out.println(admissionstat.getStringCellValue());
				if((jeerollcell.getStringCellValue().equals(roll)) && !(admissionstat.getStringCellValue().equals("TENTATIVE"))) 
				{
					rownum = i;
					break;
				}		
			}
		}
		catch(Exception err)
		{
			
			throw err;
		}	
		return rownum;
		
		/* -1 if didnt found the row with the specific roll number in the file */
		/* Any other number if found the Roll number at a specific row in the file */
	}

	public int ICTnrisponjeerollnumcheck(String roll) throws Exception
	{
		int rownum = -1;
		
		File file = new File("//10.20.10.52/Documents/#2016/ICT.xls");
		//File file = new File("ICT.xls");
		
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
				if((jeerollcell.getStringCellValue().equals(roll)) && ((admissionstat.getStringCellValue().equals("CONFIRM")) || (admissionstat.getStringCellValue().equals("CANCEL"))))
				{
					rownum = i;
					break;
				}		
			}
		}
		catch(Exception err)
		{
			
			throw err;
		}	
		return rownum;
		/* -1 if didnt found the row with the specific roll number in the file */
		/* Any other number if found the Roll number at a specific row in the file */
	}
	
	public int MECHnrisponjeerollnumcheck(String roll) throws Exception
	{
		int rownum = -1;
		
		File file = new File("//10.20.10.52/Documents/#2016/MECH.xls");
		//File file = new File("MECH.xls");
		
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
				if((jeerollcell.getStringCellValue().equals(roll)) && ((admissionstat.getStringCellValue().equals("CONFIRM")) || (admissionstat.getStringCellValue().equals("CANCEL")))) 
				{
					rownum = i;
					break;
				}		
			}
		}
		catch(Exception err)
		{
			
			throw err;
		}	
		return rownum;
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
				if((jeerollcell.getStringCellValue().equals(roll)) && ((admissionstat.getStringCellValue().equals("CONFIRM")) || (admissionstat.getStringCellValue().equals("CANCEL")))) 
				{
					rownum = i;
					break;
				}		
			}
		}
		catch(Exception err)
		{
			
			throw err;
		}	
		return rownum;
		
		/* -1 if didnt found the row with the specific roll number in the file */
		/* Any other number if found the Roll number at a specific row in the file */
	}

	public int ICTnristudrollcheck(String roll) throws Exception
	{
		int rownum = -1;
		
		File file = new File("//10.20.10.52/Documents/#2016/ICT.xls");
		//File file = new File("ICT.xls");
		
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
				if((rollcell.getStringCellValue().equals(roll)) && ((admissionstat.getStringCellValue().equals("CONFIRM")) || (admissionstat.getStringCellValue().equals("CANCEL")))) 
				{
					rownum = i;
					break;
				}		
			}
		}
		catch(Exception err)
		{
			
			throw err;
		}	
		return rownum;
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
				if((jeerollcell.getStringCellValue().equals(roll)) && ((admissionstat.getStringCellValue().equals("CONFIRM")) || (admissionstat.getStringCellValue().equals("CANCEL")))) 
				{
					rownum = i;
					break;
				}		
			}
		}
		catch(Exception err)
		{
			
			throw err;
		}	
		return rownum;
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
				if((jeerollcell.getStringCellValue().equals(roll)) && ((admissionstat.getStringCellValue().equals("CONFIRM")) || (admissionstat.getStringCellValue().equals("CANCEL")))) 
				{
					rownum = i;
					break;
				}		
			}
		}
		catch(Exception err)
		{
			
			throw err;
		}	
		return rownum;
		/* -1 if didnt found the row with the specific roll number in the file */
		/* Any other number if found the Roll number at a specific row in the file */
	}

	
	
	
	
	
	
	
	
	
	
	
	/* For the Enrollment Checkboxes */
	
	public void modviewICTACPCchkbox(String roll,ModEnrollmentDetails_GUI En) throws Exception
	{
		int rownum = -1;
		
		try
		{
			File file = new File("//10.20.10.52/Documents/#2016/ICT.xls");
			//File file = new File("ICT.xls");
			
			FileInputStream fread = null;
			fread = new FileInputStream(file);

			Workbook wb = WorkbookFactory.create(fread);
			Sheet sh = wb.getSheet("ACPC_Docs");
			
			int last = sh.getLastRowNum();

			for(int i = 1; i<=last; i++)	
			{
				Row row = sh.getRow(i);
				Cell jeerollcell = row.getCell(0);
				jeerollcell = sh.getRow(i).getCell(0);
				if((jeerollcell.getStringCellValue().equals(roll)))
				{
					rownum = i;
					break;
				}
			}
			
			if(rownum == -1)
			{
				throw new Exception("STUDENT NOT FOUND! CHECK STUDENT DOCUMENT LIST!");
			}
			else 
			{
				Row row2 = sh.getRow(rownum);
				
				Cell cell3 = row2.getCell(3);
				Cell cell4 = row2.getCell(4);
				Cell cell5 = row2.getCell(5);
				Cell cell6 = row2.getCell(6);
				Cell cell7 = row2.getCell(7);
				Cell cell8 = row2.getCell(8);
				Cell cell9 = row2.getCell(9);
				Cell cell10 = row2.getCell(10);
				
				En.setEDchckbx10Marksheet(cell3.getStringCellValue());
				En.setEDchckbx12Marksheet(cell4.getStringCellValue());
				En.setEDchckbxJeeMarksheet(cell5.getStringCellValue());
				En.setEDchckbxSchoolLeavingCertificate(cell6.getStringCellValue());
				En.setEDchckbxMeritRankReciepts(cell7.getStringCellValue());
				En.setEDchckbx20000Receipts(cell8.getStringCellValue());
				En.setEDchckbxAllotmentLetter(cell9.getStringCellValue());
				En.setEDchckbxPassportSize(cell10.getStringCellValue());

				fread.close();
				
			}			
		}
		catch(Exception err)
		{
			
			throw err;
		}
	}

	public void modviewICTNRISPONchkbox(String roll,ModEnrollmentDetails_GUI En) throws Exception
	{
		int rownum = -1;
		
		try
		{
			File file = new File("//10.20.10.52/Documents/#2016/ICT.xls");
			//File file = new File("ICT.xls");
			
			FileInputStream fread = null;
			fread = new FileInputStream(file);

			Workbook wb = WorkbookFactory.create(fread);
			Sheet sh = wb.getSheet("NRI_SPONSOR_Docs");
			
			int last = sh.getLastRowNum();

			for(int i = 1; i<=last; i++)	
			{
				Row row = sh.getRow(i);
				Cell jeerollcell = row.getCell(0);
				jeerollcell = sh.getRow(i).getCell(0);
				if(jeerollcell.getStringCellValue().equals(roll))
				{
					rownum = i;
					break;
				}
			}
			
			if(rownum == -1)
			{
				throw new Exception("STUDENT NOT FOUND! CHECK STUDENT DOCUMENT LIST!");
			}
			else 
			{
				Row row2 = sh.getRow(rownum);
				
				Cell cell3 = row2.getCell(3);
				Cell cell4 = row2.getCell(4);
				Cell cell5 = row2.getCell(5);
				Cell cell6 = row2.getCell(6);
				Cell cell7 = row2.getCell(7);
				Cell cell8 = row2.getCell(8);
				Cell cell9 = row2.getCell(9);
				Cell cell10 = row2.getCell(10);
				Cell cell11 = row2.getCell(11);
				Cell cell12 = row2.getCell(12);
				Cell cell13 = row2.getCell(13);
							
				En.setEDchckbx10Marksheet(cell3.getStringCellValue());
				En.setEDchckbx12Marksheet(cell4.getStringCellValue());
				En.setEDchckbxJeeMarksheet(cell5.getStringCellValue());
				En.setEDchckbxSchoolLeavingCertificate(cell6.getStringCellValue());
				En.setEDchckbxMeritRankReciepts(cell7.getStringCellValue());
				En.setEDchckbx20000Receipts(cell8.getStringCellValue());
				En.setEDchckbxAllotmentLetter(cell9.getStringCellValue());
				En.setEDchckbxPassportSize(cell10.getStringCellValue());
				En.setEDchckbxAffidavit(cell11.getStringCellValue());
				En.setEDchckbxCopyOfPassport(cell12.getStringCellValue());
				En.setEDchckbxNriProofCertificate(cell13.getStringCellValue());

				fread.close();
				
			}			
		}
		catch(Exception err)
		{
			
			throw err;
		}	
	}

	public void modviewICTNRISTUDchkbox(String roll,ModEnrollmentDetails_GUI En) throws Exception
	{
		int rownum = -1;
		
		try
		{
			File file = new File("//10.20.10.52/Documents/#2016/ICT.xls");
			//File file = new File("ICT.xls");
			
			FileInputStream fread = null;
			fread = new FileInputStream(file);

			Workbook wb = WorkbookFactory.create(fread);
			Sheet sh = wb.getSheet("NRI_Docs");
			
			int last = sh.getLastRowNum();

			for(int i = 1; i<=last; i++)	
			{
				Row row = sh.getRow(i);
				Cell jeerollcell = row.getCell(0);
				jeerollcell = sh.getRow(i).getCell(0);
				if(jeerollcell.getStringCellValue().equals(roll))
				{
					rownum = i;
					break;
				}
			}
			
			if(rownum == -1)
			{
				throw new Exception("STUDENT NOT FOUND! CHECK STUDENT DOCUMENT LIST!");
			}
			else 
			{
				Row row2 = sh.getRow(rownum);
				
				Cell cell3 = row2.getCell(3);
				Cell cell4 = row2.getCell(4);
				Cell cell5 = row2.getCell(5);
				Cell cell6 = row2.getCell(6);

				En.setEDchckbxLastEducationalCertificate(cell3.getStringCellValue());
				En.setEDchckbxMigrationCertificate(cell4.getStringCellValue());
				En.setEDchckbxCopyOfPassport(cell5.getStringCellValue());
				En.setEDchckbxPassportSize(cell6.getStringCellValue());

				fread.close();
				
			}			
		}
		catch(Exception err)
		{
			
			throw err;
		}	
	}

	public void modviewMECHACPCchkbox(String roll,ModEnrollmentDetails_GUI En) throws Exception
	{
		int rownum = -1;
		
		try
		{
			File file = new File("//10.20.10.52/Documents/#2016/MECH.xls");
			//File file = new File("MECH.xls");
			
			FileInputStream fread = null;
			fread = new FileInputStream(file);

			Workbook wb = WorkbookFactory.create(fread);
			Sheet sh = wb.getSheet("ACPC_Docs");
			
			int last = sh.getLastRowNum();

			for(int i = 1; i<=last; i++)	
			{
				Row row = sh.getRow(i);
				Cell jeerollcell = row.getCell(0);
				jeerollcell = sh.getRow(i).getCell(0);
				if((jeerollcell.getStringCellValue().equals(roll)))
				{
					rownum = i;
					break;
				}
			}
			
			if(rownum == -1)
			{
				throw new Exception("STUDENT NOT FOUND! CHECK STUDENT DOCUMENT LIST!");
			}
			else 
			{
				Row row2 = sh.getRow(rownum);
				
				Cell cell3 = row2.getCell(3);
				Cell cell4 = row2.getCell(4);
				Cell cell5 = row2.getCell(5);
				Cell cell6 = row2.getCell(6);
				Cell cell7 = row2.getCell(7);
				Cell cell8 = row2.getCell(8);
				Cell cell9 = row2.getCell(9);
				Cell cell10 = row2.getCell(10);
				
				En.setEDchckbx10Marksheet(cell3.getStringCellValue());
				En.setEDchckbx12Marksheet(cell4.getStringCellValue());
				En.setEDchckbxJeeMarksheet(cell5.getStringCellValue());
				En.setEDchckbxSchoolLeavingCertificate(cell6.getStringCellValue());
				En.setEDchckbxMeritRankReciepts(cell7.getStringCellValue());
				En.setEDchckbx20000Receipts(cell8.getStringCellValue());
				En.setEDchckbxAllotmentLetter(cell9.getStringCellValue());
				En.setEDchckbxPassportSize(cell10.getStringCellValue());

				fread.close();
			}			
		}
		catch(Exception err)
		{
			
			throw err;
		}
	}

	public void modviewMECHNRISPONchkbox(String roll,ModEnrollmentDetails_GUI En) throws Exception
	{
		int rownum = -1;
		
		try
		{
			File file = new File("//10.20.10.52/Documents/#2016/MECH.xls");
			//File file = new File("MECH.xls");
			
			FileInputStream fread = null;
			fread = new FileInputStream(file);

			Workbook wb = WorkbookFactory.create(fread);
			Sheet sh = wb.getSheet("NRI_SPONSOR_Docs");
			
			int last = sh.getLastRowNum();

			for(int i = 1; i<=last; i++)	
			{
				Row row = sh.getRow(i);
				Cell jeerollcell = row.getCell(0);
				jeerollcell = sh.getRow(i).getCell(0);
				if(jeerollcell.getStringCellValue().equals(roll))
				{
					rownum = i;
					break;
				}
			}
			
			if(rownum == -1)
			{
				throw new Exception("STUDENT NOT FOUND! CHECK STUDENT DOCUMENT LIST!");
			}
			else 
			{
				Row row2 = sh.getRow(rownum);
				
				Cell cell3 = row2.getCell(3);
				Cell cell4 = row2.getCell(4);
				Cell cell5 = row2.getCell(5);
				Cell cell6 = row2.getCell(6);
				Cell cell7 = row2.getCell(7);
				Cell cell8 = row2.getCell(8);
				Cell cell9 = row2.getCell(9);
				Cell cell10 = row2.getCell(10);
				Cell cell11 = row2.getCell(11);
				Cell cell12 = row2.getCell(12);
				Cell cell13 = row2.getCell(13);
							
				En.setEDchckbx10Marksheet(cell3.getStringCellValue());
				En.setEDchckbx12Marksheet(cell4.getStringCellValue());
				En.setEDchckbxJeeMarksheet(cell5.getStringCellValue());
				En.setEDchckbxSchoolLeavingCertificate(cell6.getStringCellValue());
				En.setEDchckbxMeritRankReciepts(cell7.getStringCellValue());
				En.setEDchckbx20000Receipts(cell8.getStringCellValue());
				En.setEDchckbxAllotmentLetter(cell9.getStringCellValue());
				En.setEDchckbxPassportSize(cell10.getStringCellValue());
				En.setEDchckbxAffidavit(cell11.getStringCellValue());
				En.setEDchckbxCopyOfPassport(cell12.getStringCellValue());
				En.setEDchckbxNriProofCertificate(cell13.getStringCellValue());

				fread.close();
				
			}			
		}
		catch(Exception err)
		{
			
			throw err;
		}	
	}

	public void modviewMECHNRISTUDchkbox(String roll,ModEnrollmentDetails_GUI En) throws Exception
	{
		int rownum = -1;
		
		try
		{
			File file = new File("//10.20.10.52/Documents/#2016/MECH.xls");
			//File file = new File("MECH.xls");
			
			FileInputStream fread = null;
			fread = new FileInputStream(file);

			Workbook wb = WorkbookFactory.create(fread);
			Sheet sh = wb.getSheet("NRI_Docs");
			
			int last = sh.getLastRowNum();

			for(int i = 1; i<=last; i++)	
			{
				Row row = sh.getRow(i);
				Cell jeerollcell = row.getCell(0);
				jeerollcell = sh.getRow(i).getCell(0);
				if(jeerollcell.getStringCellValue().equals(roll))
				{
					rownum = i;
					break;
				}
			}
			
			if(rownum == -1)
			{
				throw new Exception("STUDENT NOT FOUND! CHECK STUDENT DOCUMENT LIST!");
			}
			else 
			{
				Row row2 = sh.getRow(rownum);
				
				Cell cell3 = row2.getCell(3);
				Cell cell4 = row2.getCell(4);
				Cell cell5 = row2.getCell(5);
				Cell cell6 = row2.getCell(6);

				En.setEDchckbxLastEducationalCertificate(cell3.getStringCellValue());
				En.setEDchckbxMigrationCertificate(cell4.getStringCellValue());
				En.setEDchckbxCopyOfPassport(cell5.getStringCellValue());
				En.setEDchckbxPassportSize(cell6.getStringCellValue());

				fread.close();
				
			}			
		}
		catch(Exception err)
		{
			
			throw err;
		}	
	}

	public void modviewCHEMACPCchkbox(String roll,ModEnrollmentDetails_GUI En) throws Exception
	{
		int rownum = -1;
		
		try
		{
			File file = new File("//10.20.10.52/Documents/#2016/CHEM.xls");
			//File file = new File("CHEM.xls");
			
			FileInputStream fread = null;
			fread = new FileInputStream(file);

			Workbook wb = WorkbookFactory.create(fread);
			Sheet sh = wb.getSheet("ACPC_Docs");
			
			int last = sh.getLastRowNum();

			for(int i = 1; i<=last; i++)	
			{
				Row row = sh.getRow(i);
				Cell jeerollcell = row.getCell(0);
				jeerollcell = sh.getRow(i).getCell(0);
				if((jeerollcell.getStringCellValue().equals(roll)))
				{
					rownum = i;
					break;
				}
			}
			
			if(rownum == -1)
			{
				throw new Exception("STUDENT NOT FOUND! CHECK STUDENT DOCUMENT LIST!");	
			}
			else 
			{
				Row row2 = sh.getRow(rownum);
				
				Cell cell3 = row2.getCell(3);
				Cell cell4 = row2.getCell(4);
				Cell cell5 = row2.getCell(5);
				Cell cell6 = row2.getCell(6);
				Cell cell7 = row2.getCell(7);
				Cell cell8 = row2.getCell(8);
				Cell cell9 = row2.getCell(9);
				Cell cell10 = row2.getCell(10);
				
				En.setEDchckbx10Marksheet(cell3.getStringCellValue());
				En.setEDchckbx12Marksheet(cell4.getStringCellValue());
				En.setEDchckbxJeeMarksheet(cell5.getStringCellValue());
				En.setEDchckbxSchoolLeavingCertificate(cell6.getStringCellValue());
				En.setEDchckbxMeritRankReciepts(cell7.getStringCellValue());
				En.setEDchckbx20000Receipts(cell8.getStringCellValue());
				En.setEDchckbxAllotmentLetter(cell9.getStringCellValue());
				En.setEDchckbxPassportSize(cell10.getStringCellValue());

				fread.close();
				
			}			
		}
		catch(Exception err)
		{
			
			throw err;
		}
	}

	public void modviewCHEMNRISPONchkbox(String roll,ModEnrollmentDetails_GUI En) throws Exception
	{
		int rownum = -1;
		
		try
		{
			File file = new File("//10.20.10.52/Documents/#2016/CHEM.xls");
			//File file = new File("CHEM.xls");
			
			FileInputStream fread = null;
			fread = new FileInputStream(file);

			Workbook wb = WorkbookFactory.create(fread);
			Sheet sh = wb.getSheet("NRI_SPONSOR_Docs");
			
			int last = sh.getLastRowNum();

			for(int i = 1; i<=last; i++)	
			{
				Row row = sh.getRow(i);
				Cell jeerollcell = row.getCell(0);
				jeerollcell = sh.getRow(i).getCell(0);
				if(jeerollcell.getStringCellValue().equals(roll))
				{
					rownum = i;
					break;
				}
			}
			
			if(rownum == -1)
			{
				throw new Exception("STUDENT NOT FOUND! CHECK STUDENT DOCUMENT LIST!");
			}
			else 
			{
				Row row2 = sh.getRow(rownum);
				
				Cell cell3 = row2.getCell(3);
				Cell cell4 = row2.getCell(4);
				Cell cell5 = row2.getCell(5);
				Cell cell6 = row2.getCell(6);
				Cell cell7 = row2.getCell(7);
				Cell cell8 = row2.getCell(8);
				Cell cell9 = row2.getCell(9);
				Cell cell10 = row2.getCell(10);
				Cell cell11 = row2.getCell(11);
				Cell cell12 = row2.getCell(12);
				Cell cell13 = row2.getCell(13);
							
				En.setEDchckbx10Marksheet(cell3.getStringCellValue());
				En.setEDchckbx12Marksheet(cell4.getStringCellValue());
				En.setEDchckbxJeeMarksheet(cell5.getStringCellValue());
				En.setEDchckbxSchoolLeavingCertificate(cell6.getStringCellValue());
				En.setEDchckbxMeritRankReciepts(cell7.getStringCellValue());
				En.setEDchckbx20000Receipts(cell8.getStringCellValue());
				En.setEDchckbxAllotmentLetter(cell9.getStringCellValue());
				En.setEDchckbxPassportSize(cell10.getStringCellValue());
				En.setEDchckbxAffidavit(cell11.getStringCellValue());
				En.setEDchckbxCopyOfPassport(cell12.getStringCellValue());
				En.setEDchckbxNriProofCertificate(cell13.getStringCellValue());

				fread.close();
				
			}			
		}
		catch(Exception err)
		{
			
			throw err;
		}	
	}

	public void modviewCHEMNRISTUDchkbox(String roll,ModEnrollmentDetails_GUI En) throws Exception
	{
		int rownum = -1;
		
		try
		{
			File file = new File("//10.20.10.52/Documents/#2016/CHEM.xls");
			//File file = new File("CHEM.xls");
			
			FileInputStream fread = null;
			fread = new FileInputStream(file);

			Workbook wb = WorkbookFactory.create(fread);
			Sheet sh = wb.getSheet("NRI_Docs");
			
			int last = sh.getLastRowNum();

			for(int i = 1; i<=last; i++)	
			{
				Row row = sh.getRow(i);
				Cell jeerollcell = row.getCell(0);
				jeerollcell = sh.getRow(i).getCell(0);
				if(jeerollcell.getStringCellValue().equals(roll))
				{
					rownum = i;
					break;
				}
			}
			
			if(rownum == -1)
			{
				throw new Exception("STUDENT NOT FOUND! CHECK STUDENT DOCUMENT LIST!");	
			}
			else 
			{
				Row row2 = sh.getRow(rownum);
				
				Cell cell3 = row2.getCell(3);
				Cell cell4 = row2.getCell(4);
				Cell cell5 = row2.getCell(5);
				Cell cell6 = row2.getCell(6);

				En.setEDchckbxLastEducationalCertificate(cell3.getStringCellValue());
				En.setEDchckbxMigrationCertificate(cell4.getStringCellValue());
				En.setEDchckbxCopyOfPassport(cell5.getStringCellValue());
				En.setEDchckbxPassportSize(cell6.getStringCellValue());

				fread.close();
				
			}			
		}
		catch(Exception err)
		{
			
			throw err;
		}	
	}

	
	
	public int ICTacpcjeerollnumcheckchkbox(String roll) throws Exception
	{
		int rownum = -1;
		
		File file = new File("//10.20.10.52/Documents/#2016/ICT.xls");
		//File file = new File("ICT.xls");
		
		try
		{
			Workbook wb = WorkbookFactory.create(file);

			Sheet sh = wb.getSheet("ACPC_Docs");
			int last = sh.getLastRowNum();
		//	System.out.println("here4");
			for(int i = 1; i<=last; i++)	
			{
				Row row = sh.getRow(i);
				Cell jeerollcell = row.getCell(0);
				jeerollcell = sh.getRow(i).getCell(0);

				if((jeerollcell.getStringCellValue().equals(roll))) 
				{
					rownum = i;
					break;
				}		
			}
		}
		catch(Exception err)
		{
			
			throw err;
		}	
		return rownum;
		/* -1 if didnt found the row with the specific roll number in the file */
		/* Any other number if found the Roll number at a specific row in the file */
	}
	
	public int ICTnrisponjeerollnumcheckchkbox(String roll) throws Exception
	{
		int rownum = -1;
		
		File file = new File("//10.20.10.52/Documents/#2016/ICT.xls");
		//File file = new File("ICT.xls");
		
		try
		{
			Workbook wb = WorkbookFactory.create(file);
			Sheet sh = wb.getSheet("NRI_SPONSOR_Docs");
			
			int last = sh.getLastRowNum();

			for(int i = 1; i<=last; i++)	
			{
				Row row = sh.getRow(i);
				Cell jeerollcell = row.getCell(0);
				jeerollcell = sh.getRow(i).getCell(0);

				if((jeerollcell.getStringCellValue().equals(roll)))
				{
					rownum = i;
					break;
				}		
			}
		}
		catch(Exception err)
		{
			
			throw err;
		}	
		return rownum;
		/* -1 if didnt found the row with the specific roll number in the file */
		/* Any other number if found the Roll number at a specific row in the file */
	}

	public int ICTnristudrollcheckchkbox(String roll) throws Exception
	{
		int rownum = -1;
		
		File file = new File("//10.20.10.52/Documents/#2016/ICT.xls");
		//File file = new File("ICT.xls");
		
		try
		{
			Workbook wb = WorkbookFactory.create(file);
			Sheet sh = wb.getSheet("NRI_Docs");
			
			int last = sh.getLastRowNum();

			for(int i = 1; i<=last; i++)	
			{
				Row row = sh.getRow(i);
				Cell rollcell = row.getCell(0);
				rollcell = sh.getRow(i).getCell(0);

				if((rollcell.getStringCellValue().equals(roll))) 
				{
					rownum = i;
					break;
				}		
			}
		}
		catch(Exception err)
		{
			
			throw err;
		}	
		return rownum;
		/* -1 if didnt found the row with the specific roll number in the file */
		/* Any other number if found the Roll number at a specific row in the file */
	}

	public int MECHacpcjeerollnumcheckchkbox(String roll) throws Exception
	{
		int rownum = -1;
		
		File file = new File("//10.20.10.52/Documents/#2016/MECH.xls");
		//File file = new File("MECH.xls");
		
		try
		{
			Workbook wb = WorkbookFactory.create(file);

			Sheet sh = wb.getSheet("ACPC_Docs");
			int last = sh.getLastRowNum();
		//	System.out.println("here4");
			for(int i = 1; i<=last; i++)	
			{
				Row row = sh.getRow(i);
				Cell jeerollcell = row.getCell(0);
				jeerollcell = sh.getRow(i).getCell(0);

				if((jeerollcell.getStringCellValue().equals(roll))) 
				{
					rownum = i;
					break;
				}		
			}
		}
		catch(Exception err)
		{
			
			throw err;
		}	
		return rownum;
		/* -1 if didnt found the row with the specific roll number in the file */
		/* Any other number if found the Roll number at a specific row in the file */
	}
	
	public int MECHnrisponjeerollnumcheckchkbox(String roll) throws Exception
	{
		int rownum = -1;
		
		File file = new File("//10.20.10.52/Documents/#2016/MECH.xls");
		//File file = new File("MECH.xls");
		
		try
		{
			Workbook wb = WorkbookFactory.create(file);
			Sheet sh = wb.getSheet("NRI_SPONSOR_Docs");
			
			int last = sh.getLastRowNum();

			for(int i = 1; i<=last; i++)	
			{
				Row row = sh.getRow(i);
				Cell jeerollcell = row.getCell(0);
				jeerollcell = sh.getRow(i).getCell(0);

				if((jeerollcell.getStringCellValue().equals(roll)))
				{
					rownum = i;
					break;
				}		
			}
		}
		catch(Exception err)
		{
			
			throw err;
		}	
		return rownum;
		/* -1 if didnt found the row with the specific roll number in the file */
		/* Any other number if found the Roll number at a specific row in the file */
	}

	public int MECHnristudrollcheckchkbox(String roll) throws Exception
	{
		int rownum = -1;
		
		File file = new File("//10.20.10.52/Documents/#2016/MECH.xls");
		//File file = new File("MECH.xls");
		
		try
		{
			Workbook wb = WorkbookFactory.create(file);
			Sheet sh = wb.getSheet("NRI_Docs");
			
			int last = sh.getLastRowNum();

			for(int i = 1; i<=last; i++)	
			{
				Row row = sh.getRow(i);
				Cell rollcell = row.getCell(0);
				rollcell = sh.getRow(i).getCell(0);

				if((rollcell.getStringCellValue().equals(roll))) 
				{
					rownum = i;
					break;
				}		
			}
		}
		catch(Exception err)
		{
			
			throw err;
		}	
		return rownum;
		/* -1 if didnt found the row with the specific roll number in the file */
		/* Any other number if found the Roll number at a specific row in the file */
	}

	public int CHEMacpcjeerollnumcheckchkbox(String roll) throws Exception
	{
		int rownum = -1;
		
		File file = new File("//10.20.10.52/Documents/#2016/CHEM.xls");
		//File file = new File("CHEM.xls");
		
		try
		{
			Workbook wb = WorkbookFactory.create(file);

			Sheet sh = wb.getSheet("ACPC_Docs");
			int last = sh.getLastRowNum();
		//	System.out.println("here4");
			for(int i = 1; i<=last; i++)	
			{
				Row row = sh.getRow(i);
				Cell jeerollcell = row.getCell(0);
				jeerollcell = sh.getRow(i).getCell(0);

				if((jeerollcell.getStringCellValue().equals(roll))) 
				{
					rownum = i;
					break;
				}		
			}
		}
		catch(Exception err)
		{
			
			throw err;
		}	
		return rownum;
		/* -1 if didnt found the row with the specific roll number in the file */
		/* Any other number if found the Roll number at a specific row in the file */
	}
	
	public int CHEMnrisponjeerollnumcheckchkbox(String roll) throws Exception
	{
		int rownum = -1;
		
		File file = new File("//10.20.10.52/Documents/#2016/CHEM.xls");
		//File file = new File("CHEM.xls");
		
		try
		{
			Workbook wb = WorkbookFactory.create(file);
			Sheet sh = wb.getSheet("NRI_SPONSOR_Docs");
			
			int last = sh.getLastRowNum();

			for(int i = 1; i<=last; i++)	
			{
				Row row = sh.getRow(i);
				Cell jeerollcell = row.getCell(0);
				jeerollcell = sh.getRow(i).getCell(0);

				if((jeerollcell.getStringCellValue().equals(roll)))
				{
					rownum = i;
					break;
				}		
			}
		}
		catch(Exception err)
		{
			
			throw err;
		}	
		return rownum;
		/* -1 if didnt found the row with the specific roll number in the file */
		/* Any other number if found the Roll number at a specific row in the file */
	}

	public int CHEMnristudrollcheckchkbox(String roll) throws Exception
	{
		int rownum = -1;
		
		File file = new File("//10.20.10.52/Documents/#2016/CHEM.xls");
		//File file = new File("CHEM.xls");
		
		try
		{
			Workbook wb = WorkbookFactory.create(file);
			Sheet sh = wb.getSheet("NRI_Docs");
			
			int last = sh.getLastRowNum();

			for(int i = 1; i<=last; i++)	
			{
				Row row = sh.getRow(i);
				Cell rollcell = row.getCell(0);
				rollcell = sh.getRow(i).getCell(0);

				if((rollcell.getStringCellValue().equals(roll))) 
				{
					rownum = i;
					break;
				}		
			}
		}
		catch(Exception err)
		{
			
			throw err;
		}	
		return rownum;
		/* -1 if didnt found the row with the specific roll number in the file */
		/* Any other number if found the Roll number at a specific row in the file */
	}

	
	public void docICTACPC(int rownum, String jeeroll, String fname, String lname, String marksheet10, String marksheet12, String jeemarksheet, String schleaving, String meritrec, String rec20, String allotletter, String photos) throws Exception
	{
		try
		{
			File file = new File("//10.20.10.52/Documents/#2016/ICT.xls");
			//File file = new File("ICT.xls");
			
			FileInputStream fread = null;

			HSSFWorkbook workbook = null;
			HSSFSheet worksheet = null;
			
			FileOutputStream fwrite = null;
			
			fread = new FileInputStream(file); 

			workbook = new HSSFWorkbook(fread); 
			worksheet = workbook.getSheet("ACPC_Docs");

			fwrite = new FileOutputStream(file);
			
			Row row = worksheet.getRow(rownum);
			Cell[] cell = new Cell[11];
			
			for(int i = 0;(i<11); i++)
			{				
				cell[i] = row.createCell(i);
			}
			
			for(int i = 1; ((i<11)); i++)
			{
					cell[i] = worksheet.getRow(rownum).getCell(i);
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
	
	public void docICTNRISPON(int rownum, String jeeroll, String fname, String lname, String marksheet10, String marksheet12, String jeemarksheet, String schleaving, String meritrec, String rec20, String allotletter, String photos, String affi, String xerox, String nriproof) throws Exception
	{
		try
		{
			File file = new File("//10.20.10.52/Documents/#2016/ICT.xls");
			//File file = new File("ICT.xls");
			
			FileInputStream fread = null;

			HSSFWorkbook workbook = null;
			HSSFSheet worksheet = null;
			
			FileOutputStream fwrite = null;
			
			fread = new FileInputStream(file); 

			workbook = new HSSFWorkbook(fread); 
			worksheet = workbook.getSheet("NRI_SPONSOR_Docs");

			fwrite = new FileOutputStream(file);
			
			Row row = worksheet.getRow(rownum);
			Cell[] cell = new Cell[14];
			
			for(int i = 0; ((i<14)); i++)
			{
				cell[i] = row.createCell(i);
			}
			
			for(int i = 0; ((i<14)); i++)
			{
				cell[i] = worksheet.getRow(rownum).getCell(i);
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
	
	public void docICTNRI(int rownum, String roll, String fname, String lname, String lastedu, String migration, String xerox, String photos) throws Exception
	{
		try
		{
			File file = new File("//10.20.10.52/Documents/#2016/ICT.xls");
			//File file = new File("ICT.xls");
			
			FileInputStream fread = null;

			HSSFWorkbook workbook = null;
			HSSFSheet worksheet = null;
			
			FileOutputStream fwrite = null;
			
			fread = new FileInputStream(file); 

			workbook = new HSSFWorkbook(fread); 
			worksheet = workbook.getSheet("NRI_Docs");

			fwrite = new FileOutputStream(file);
			
			Row row = worksheet.getRow(rownum);
			Cell[] cell = new Cell[7];
			
			for(int i = 0; ((i<7)); i++)
			{
				cell[i] = row.createCell(i);
			}
			
			for(int i = 0; ((i<7)); i++)
			{
				cell[i] = worksheet.getRow(rownum).getCell(i);
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
	
	public void docMECHACPC(int rownum, String jeeroll, String fname, String lname, String marksheet10, String marksheet12, String jeemarksheet, String schleaving, String meritrec, String rec20, String allotletter, String photos) throws Exception
	{
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
			
			Row row = worksheet.getRow(rownum);
			Cell[] cell = new Cell[11];
			
			for(int i = 0;(i<11); i++)
			{				
				cell[i] = row.createCell(i);
			}
			
			for(int i = 0; ((i<11)); i++)
			{
					cell[i] = worksheet.getRow(rownum).getCell(i);
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
	
	public void docMECHNRISPON(int rownum, String jeeroll, String fname, String lname, String marksheet10, String marksheet12, String jeemarksheet, String schleaving, String meritrec, String rec20, String allotletter, String photos, String affi, String xerox, String nriproof) throws Exception
	{
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
			
			Row row = worksheet.getRow(rownum);
			Cell[] cell = new Cell[14];
			
			for(int i = 0; ((i<14)); i++)
			{
				cell[i] = row.createCell(i);
			}
			
			for(int i = 0; ((i<14)); i++)
			{
				cell[i] = worksheet.getRow(rownum).getCell(i);
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
	
	public void docMECHNRI(int rownum, String roll, String fname, String lname, String lastedu, String migration, String xerox, String photos) throws Exception
	{
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
			
			Row row = worksheet.getRow(rownum);
			Cell[] cell = new Cell[7];
			
			for(int i = 0; ((i<7)); i++)
			{
				cell[i] = row.createCell(i);
			}
			
			for(int i = 0; ((i<7)); i++)
			{
				cell[i] = worksheet.getRow(rownum).getCell(i);
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
	
	public void docCHEMACPC(int rownum, String jeeroll, String fname, String lname, String marksheet10, String marksheet12, String jeemarksheet, String schleaving, String meritrec, String rec20, String allotletter, String photos) throws Exception
	{
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
			
			Row row = worksheet.getRow(rownum);
			Cell[] cell = new Cell[11];
			
			for(int i = 0;(i<11); i++)
			{				
				cell[i] = row.createCell(i);
			}
			
			for(int i = 0; ((i<11)); i++)
			{
					cell[i] = worksheet.getRow(rownum).getCell(i);
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
	
	public void docCHEMNRISPON(int rownum, String jeeroll, String fname, String lname, String marksheet10, String marksheet12, String jeemarksheet, String schleaving, String meritrec, String rec20, String allotletter, String photos, String affi, String xerox, String nriproof) throws Exception
	{
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
			
			Row row = worksheet.getRow(rownum);
			Cell[] cell = new Cell[14];
			
			for(int i = 0; ((i<14)); i++)
			{
				cell[i] = row.createCell(i);
			}
			
			for(int i = 0; ((i<14)); i++)
			{
				cell[i] = worksheet.getRow(rownum).getCell(i);
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
	
	public void docCHEMNRI(int rownum, String roll, String fname, String lname, String lastedu, String migration, String xerox, String photos) throws Exception
	{
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
			
			Row row = worksheet.getRow(rownum);
			Cell[] cell = new Cell[7];
			
			for(int i = 0; ((i<7)); i++)
			{
				cell[i] = row.createCell(i);
			}
			
			for(int i = 0; ((i<7)); i++)
			{
				cell[i] = worksheet.getRow(rownum).getCell(i);
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



