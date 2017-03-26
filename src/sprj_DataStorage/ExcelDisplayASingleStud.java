package sprj_DataStorage;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDisplayASingleStud 
{
	
	public ExcelDisplayASingleStud(){}
	
	public String ICTACPCcheck(String roll) throws Exception
	{
		int rownum = -1;
		String str = null;
		
		try
		{
			File file = new File("//10.20.10.52/Documents/#2016/ICT.xls");
			FileInputStream fread = null;
			fread = new FileInputStream(file);
			
			Workbook wb = WorkbookFactory.create(fread);
			Sheet sh = wb.getSheet("ACPC");
			
			 
			
			int last = sh.getLastRowNum();

			//System.out.println("last" + last);
			
			for(int i = 1; i<=last; i++)	
			{
				Row row1 = sh.getRow(i);
				Cell jeerollcell = row1.getCell(37);
				jeerollcell = sh.getRow(i).getCell(37);
				if(jeerollcell.getStringCellValue().equals(roll))
				{
					//System.out.println(i);
					rownum = i;
					break;
				}
			}
						
						
			if(rownum == -1)
			{
				str = "There is No Student Data Existing in the File ICT, Sheet ACPC";
			}
			else 
			{
				
				Row row2 = sh.getRow(rownum);
				
				Cell cell0 = row2.getCell(0);
				if(cell0 == null)
				{
					
					cell0 = row2.createCell(0);
				}
				Cell cell1 = row2.getCell(1);
				Cell cell2 = row2.getCell(2);
				Cell cell3 = row2.getCell(3);
				Cell cell4 = row2.getCell(4);
				Cell cell6 = row2.getCell(6);
				Cell cell7 = row2.getCell(7);
				Cell cell8 = row2.getCell(8);
				Cell cell9 = row2.getCell(9);
				Cell cell10 = row2.getCell(10);
				Cell cell12 = row2.getCell(12);
				Cell cell13 = row2.getCell(13);
				Cell cell14 = row2.getCell(14);
				Cell cell15 = row2.getCell(15);
				Cell cell16 = row2.getCell(16);
				Cell cell19 = row2.getCell(19);
				Cell cell20 = row2.getCell(20);
				Cell cell21 = row2.getCell(21);
				Cell cell26 = row2.getCell(26);
				Cell cell28 = row2.getCell(28);
				Cell cell30 = row2.getCell(30);
				Cell cell31 = row2.getCell(31);
				Cell cell33 = row2.getCell(33);
				Cell cell34 = row2.getCell(34);
				Cell cell35 = row2.getCell(35);
				Cell cell36 = row2.getCell(36);
				Cell cell37 = row2.getCell(37);
				Cell cell38 = row2.getCell(38);
				Cell cell39 = row2.getCell(39);
				Cell cell40 = row2.getCell(40);
				Cell cell41 = row2.getCell(41);
				
				str =   "----Personal Details----\n" + 
						"Enrollment Number:                            " + cell0.getStringCellValue() + "\n" +
						"First Name:                                            " + cell1.getStringCellValue() + "\n" +
						"Middle Name:                                        " + cell2.getStringCellValue() + "\n" +
						"Last Name:                                            " + cell3.getStringCellValue() + "\n" +
						"Gender:                                                   " + cell4.getStringCellValue() + "\n" +
						"Address:                                                  " + cell6.getStringCellValue() + "\n" +
						"State:                                                       " + cell7.getStringCellValue() + "\n" +
						"City:                                                          " + cell8.getStringCellValue() + "\n" +
						"PINCODE:                                              " + cell9.getStringCellValue() + "\n" +
						"Primary Contact Number:                    " + cell10.getStringCellValue() + "\n" +
						"Email ID:                                                 " + cell12.getStringCellValue() + "\n" +
						"Category:                                                " + cell13.getStringCellValue() + "\n" +
						"Date of Birth:                                          " + cell14.getStringCellValue() + "\n" +
						
						"\n----Guardian Details----\n" +
						"Father's Name:                                      " + cell15.getStringCellValue() + "\n" +
						"Father's Contact:                                   " + cell16.getStringCellValue() + "\n" +
						"Father's Income:                                   " + cell19.getStringCellValue() + "\n" +						
						"Father's Email ID:                                 " + cell20.getStringCellValue() + "\n" +
						"Mother's Name:                                     " + cell21.getStringCellValue() + "\n" +
						
						"\n\n" + 
						"Admission Type:                                    " + cell26.getStringCellValue() + "\n" +
						
						"\n----Academic Details----\n" +
						"12th Passing Year:                               " + String.valueOf(cell28.getNumericCellValue()) + "\n" +
						"School Board:                                        " + cell30.getStringCellValue() + "\n" +
						"School Name:                                         " + cell31.getStringCellValue() + "\n" +
						"PCM Percentage:                                   " + cell33.getStringCellValue() + "\n" +
						"PCM Percentile:                                      " + cell34.getStringCellValue() + "\n" +
						"JEE Score:                                               " + cell35.getStringCellValue() + "\n" +
						"JEE Percentile:                                       " + cell36.getStringCellValue() + "\n" +
						"JEE Roll Number:                                  " + cell37.getStringCellValue() + "\n" +
						"ACPC Rank:                                            " + String.valueOf(cell38.getNumericCellValue()) + "\n" +
						
						"\n----Enrollment Details----\n" + 
						"Branch:                                                     " + cell39.getStringCellValue() + "\n" +
						"Admission Status:                                 " + cell40.getStringCellValue() + "\n" +
						"Year of Joining:                                      " + String.valueOf(cell41.getNumericCellValue()) + "\n";
			}
			
			fread.close();
			
			
		}
		catch(Exception err)
		{
			
			throw err;
		}
		
		return str;
	}
	
	public String MECHACPCcheck(String roll) throws Exception
	{
		int rownum = -1;
		String str = null;
		
		try
		{
			File file = new File("//10.20.10.52/Documents/#2016/MECH.xls");
			FileInputStream fread = null;
			fread = new FileInputStream(file);
			//HSSFWorkbook wb = null;
			
			Workbook wb = WorkbookFactory.create(fread);
			Sheet sh = wb.getSheet("ACPC");
			
			int last = sh.getLastRowNum();
			//System.out.println(last);
			
			for(int i = 1; i<=last; i++)	
			{
				Row row1 = sh.getRow(i);
				Cell jeerollcell = row1.getCell(37);
				jeerollcell = sh.getRow(i).getCell(37);
				if(jeerollcell.getStringCellValue().equals(roll))
				{
					//System.out.println(i);
					rownum = i;
					break;
				}
			}
			
			//System.out.println(rownum);
			
			
						
			if(rownum == -1)
			{
				str = "There is No Student Data Existing in the File MECH, Sheet ACPC";
			}
			else 
			{
				Row row2 = sh.getRow(rownum);
				
				Cell cell0 = row2.getCell(0);
				if(cell0 == null)
				{
					
					cell0 = row2.createCell(0);
				}
				Cell cell1 = row2.getCell(1);
				Cell cell2 = row2.getCell(2);
				Cell cell3 = row2.getCell(3);
				Cell cell4 = row2.getCell(4);
				Cell cell6 = row2.getCell(6);
				Cell cell7 = row2.getCell(7);
				Cell cell8 = row2.getCell(8);
				Cell cell9 = row2.getCell(9);
				Cell cell10 = row2.getCell(10);
				Cell cell12 = row2.getCell(12);
				Cell cell13 = row2.getCell(13);
				Cell cell14 = row2.getCell(14);
				Cell cell15 = row2.getCell(15);
				Cell cell16 = row2.getCell(16);
				Cell cell19 = row2.getCell(19);
				Cell cell20 = row2.getCell(20);
				Cell cell21 = row2.getCell(21);
				Cell cell26 = row2.getCell(26);
				Cell cell28 = row2.getCell(28);
				Cell cell30 = row2.getCell(30);
				Cell cell31 = row2.getCell(31);
				Cell cell33 = row2.getCell(33);
				Cell cell34 = row2.getCell(34);
				Cell cell35 = row2.getCell(35);
				Cell cell36 = row2.getCell(36);
				Cell cell37 = row2.getCell(37);
				Cell cell38 = row2.getCell(38);
				Cell cell39 = row2.getCell(39);
				Cell cell40 = row2.getCell(40);
				Cell cell41 = row2.getCell(41);
							
				
				str =   "----Personal Details----\n" + 
						"Enrollment Number:                            " + cell0.getStringCellValue() + "\n" +
						"First Name:                                            " + cell1.getStringCellValue() + "\n" +
						"Middle Name:                                        " + cell2.getStringCellValue() + "\n" +
						"Last Name:                                            " + cell3.getStringCellValue() + "\n" +
						"Gender:                                                   " + cell4.getStringCellValue() + "\n" +
						"Address:                                                  " + cell6.getStringCellValue() + "\n" +
						"State:                                                       " + cell7.getStringCellValue() + "\n" +
						"City:                                                          " + cell8.getStringCellValue() + "\n" +
						"PINCODE:                                              " + cell9.getStringCellValue() + "\n" +
						"Primary Contact Number:                    " + cell10.getStringCellValue() + "\n" +
						"Email ID:                                                 " + cell12.getStringCellValue() + "\n" +
						"Category:                                                " + cell13.getStringCellValue() + "\n" +
						"Date of Birth:                                          " + cell14.getStringCellValue() + "\n" +
						
						"\n----Guardian Details----\n" +
						"Father's Name:                                      " + cell15.getStringCellValue() + "\n" +
						"Father's Contact:                                   " + cell16.getStringCellValue() + "\n" +
						"Father's Income:                                   " + cell19.getStringCellValue() + "\n" +						
						"Father's Email ID:                                 " + cell20.getStringCellValue() + "\n" +
						"Mother's Name:                                     " + cell21.getStringCellValue() + "\n" +
						
						"\n\n" + 
						"Admission Type:                                    " + cell26.getStringCellValue() + "\n" +
						
						"\n----Academic Details----\n" +
						"12th Passing Year:                               " + String.valueOf(cell28.getNumericCellValue()) + "\n" +
						"School Board:                                        " + cell30.getStringCellValue() + "\n" +
						"School Name:                                         " + cell31.getStringCellValue() + "\n" +
						"PCM Percentage:                                   " + cell33.getStringCellValue() + "\n" +
						"PCM Percentile:                                      " + cell34.getStringCellValue() + "\n" +
						"JEE Score:                                               " + cell35.getStringCellValue() + "\n" +
						"JEE Percentile:                                       " + cell36.getStringCellValue() + "\n" +
						"JEE Roll Number:                                  " + cell37.getStringCellValue() + "\n" +
						"ACPC Rank:                                            " + String.valueOf(cell38.getNumericCellValue()) + "\n" +
						
						"\n----Enrollment Details----\n" + 
						"Branch:                                                     " + cell39.getStringCellValue() + "\n" +
						"Admission Status:                                 " + cell40.getStringCellValue() + "\n" +
						"Year of Joining:                                      " + String.valueOf(cell41.getNumericCellValue()) + "\n";
			}
			
			fread.close();
			
			
		}
		catch(Exception err)
		{
			
			throw err;
		}
		
		return str;
	}

	public String CHEMACPCcheck(String roll) throws Exception
	{
		int rownum = -1;
		String str = null;
		
		try
		{
			File file = new File("//10.20.10.52/Documents/#2016/CHEM.xls");
			FileInputStream fread = null;
			fread = new FileInputStream(file);

			Workbook wb = WorkbookFactory.create(fread);
			Sheet sh = wb.getSheet("ACPC");
			
	
			
			int last = sh.getLastRowNum();

			for(int i = 1; i<=last; i++)	
			{
				Row row1 = sh.getRow(i);
				Cell jeerollcell = row1.getCell(37);
				jeerollcell = sh.getRow(i).getCell(37);
				if(jeerollcell.getStringCellValue().equals(roll))
				{
					rownum = i;
					break;
				}
			}
			
			
						
						
			if(rownum == -1)
			{
				str = "There is No Student Data Existing in the File CHEM, Sheet ACPC";
			}
			else 
			{
				
				Row row2 = sh.getRow(rownum);
				
				Cell cell0 = row2.getCell(0);
				if(cell0 == null)
				{
					
					cell0 = row2.createCell(0);
				}
				Cell cell1 = row2.getCell(1);
				Cell cell2 = row2.getCell(2);
				Cell cell3 = row2.getCell(3);
				Cell cell4 = row2.getCell(4);
				Cell cell6 = row2.getCell(6);
				Cell cell7 = row2.getCell(7);
				Cell cell8 = row2.getCell(8);
				Cell cell9 = row2.getCell(9);
				Cell cell10 = row2.getCell(10);
				Cell cell12 = row2.getCell(12);
				Cell cell13 = row2.getCell(13);
				Cell cell14 = row2.getCell(14);
				Cell cell15 = row2.getCell(15);
				Cell cell16 = row2.getCell(16);
				Cell cell19 = row2.getCell(19);
				Cell cell20 = row2.getCell(20);
				Cell cell21 = row2.getCell(21);
				Cell cell26 = row2.getCell(26);
				Cell cell28 = row2.getCell(28);
				Cell cell30 = row2.getCell(30);
				Cell cell31 = row2.getCell(31);
				Cell cell33 = row2.getCell(33);
				Cell cell34 = row2.getCell(34);
				Cell cell35 = row2.getCell(35);
				Cell cell36 = row2.getCell(36);
				Cell cell37 = row2.getCell(37);
				Cell cell38 = row2.getCell(38);
				Cell cell39 = row2.getCell(39);
				Cell cell40 = row2.getCell(40);
				Cell cell41 = row2.getCell(41);
				
				
				str =   "----Personal Details----\n" + 
						"Enrollment Number:                            " + cell0.getStringCellValue() + "\n" +
						"First Name:                                            " + cell1.getStringCellValue() + "\n" +
						"Middle Name:                                        " + cell2.getStringCellValue() + "\n" +
						"Last Name:                                            " + cell3.getStringCellValue() + "\n" +
						"Gender:                                                   " + cell4.getStringCellValue() + "\n" +
						"Address:                                                  " + cell6.getStringCellValue() + "\n" +
						"State:                                                       " + cell7.getStringCellValue() + "\n" +
						"City:                                                          " + cell8.getStringCellValue() + "\n" +
						"PINCODE:                                              " + cell9.getStringCellValue() + "\n" +
						"Primary Contact Number:                    " + cell10.getStringCellValue() + "\n" +
						"Email ID:                                                 " + cell12.getStringCellValue() + "\n" +
						"Category:                                                " + cell13.getStringCellValue() + "\n" +
						"Date of Birth:                                          " + cell14.getStringCellValue() + "\n" +
						
						"\n----Guardian Details----\n" +
						"Father's Name:                                      " + cell15.getStringCellValue() + "\n" +
						"Father's Contact:                                   " + cell16.getStringCellValue() + "\n" +
						"Father's Income:                                   " + cell19.getStringCellValue() + "\n" +						
						"Father's Email ID:                                 " + cell20.getStringCellValue() + "\n" +
						"Mother's Name:                                     " + cell21.getStringCellValue() + "\n" +
						
						"\n\n" + 
						"Admission Type:                                    " + cell26.getStringCellValue() + "\n" +
						
						"\n----Academic Details----\n" +
						"12th Passing Year:                               " + String.valueOf(cell28.getNumericCellValue()) + "\n" +
						"School Board:                                        " + cell30.getStringCellValue() + "\n" +
						"School Name:                                         " + cell31.getStringCellValue() + "\n" +
						"PCM Percentage:                                   " + cell33.getStringCellValue() + "\n" +
						"PCM Percentile:                                      " + cell34.getStringCellValue() + "\n" +
						"JEE Score:                                               " + cell35.getStringCellValue() + "\n" +
						"JEE Percentile:                                       " + cell36.getStringCellValue() + "\n" +
						"JEE Roll Number:                                  " + cell37.getStringCellValue() + "\n" +
						"ACPC Rank:                                            " + String.valueOf(cell38.getNumericCellValue()) + "\n" +
						
						"\n----Enrollment Details----\n" + 
						"Branch:                                                     " + cell39.getStringCellValue() + "\n" +
						"Admission Status:                                 " + cell40.getStringCellValue() + "\n" +
						"Year of Joining:                                      " + String.valueOf(cell41.getNumericCellValue()) + "\n";
				
			}
			
			fread.close();
			
			
		}
		catch(Exception err)
		{
			
			throw err;
		}
		
		return str;
	}

	public String ICTNRISPONcheck(String roll) throws Exception
	{
		int rownum = -1;
		String str = null;
		
		try
		{
			File file = new File("//10.20.10.52/Documents/#2016/ICT.xls");
			FileInputStream fread = null;
			fread = new FileInputStream(file);
			
			Workbook wb = WorkbookFactory.create(fread);
			Sheet sh = wb.getSheet("NRI_SPONSOR");
			
		
			
			int last = sh.getLastRowNum();

			for(int i = 1; i<=last; i++)	
			{
				Row row1 = sh.getRow(i);
				Cell jeerollcell = row1.getCell(37);
				jeerollcell = sh.getRow(i).getCell(37);
				if(jeerollcell.getStringCellValue().equals(roll))
				{
					rownum = i;
					break;
				}
			}
			
			
						
			if(rownum == -1)
			{
				str = "There is No Student Data Existing in the File ICT, Sheet NRI_SPONSOR";
			}
			else 
			{
				Row row2 = sh.getRow(rownum);
				
				Cell cell0 = row2.getCell(0);
				if(cell0 == null)
				{
					
					cell0 = row2.createCell(0);
				}
				Cell cell1 = row2.getCell(1);
				Cell cell2 = row2.getCell(2);
				Cell cell3 = row2.getCell(3);
				Cell cell4 = row2.getCell(4);
				Cell cell6 = row2.getCell(6);
				Cell cell7 = row2.getCell(7);
				Cell cell8 = row2.getCell(8);
				Cell cell9 = row2.getCell(9);
				Cell cell10 = row2.getCell(10);
				Cell cell12 = row2.getCell(12);
				Cell cell13 = row2.getCell(13);
				Cell cell14 = row2.getCell(14);
				Cell cell15 = row2.getCell(15);
				Cell cell16 = row2.getCell(16);
				Cell cell19 = row2.getCell(19);
				Cell cell20 = row2.getCell(20);
				Cell cell21 = row2.getCell(21);
				Cell cell26 = row2.getCell(26);
				Cell cell28 = row2.getCell(28);
				Cell cell30 = row2.getCell(30);
				Cell cell31 = row2.getCell(31);
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
				Cell cell46 = row2.getCell(46);
				Cell cell47 = row2.getCell(47);
				Cell cell48 = row2.getCell(48);
							
				
				str =   "----Personal Details----\n" + 
						"Enrollment Number:                            " + cell0.getStringCellValue() + "\n" +
						"First Name:                                            " + cell1.getStringCellValue() + "\n" +
						"Middle Name:                                        " + cell2.getStringCellValue() + "\n" +
						"Last Name:                                            " + cell3.getStringCellValue() + "\n" +
						"Gender:                                                   " + cell4.getStringCellValue() + "\n" +
						"Address:                                                  " + cell6.getStringCellValue() + "\n" +
						"State:                                                       " + cell7.getStringCellValue() + "\n" +
						"City:                                                          " + cell8.getStringCellValue() + "\n" +
						"PINCODE:                                              " + cell9.getStringCellValue() + "\n" +
						"Primary Contact Number:                    " + cell10.getStringCellValue() + "\n" +
						"Email ID:                                                 " + cell12.getStringCellValue() + "\n" +
						"Category:                                                " + cell13.getStringCellValue() + "\n" +
						"Date of Birth:                                          " + cell14.getStringCellValue() + "\n" +
						
						"\n----Guardian Details----\n" +
						"Father's Name:                                      " + cell15.getStringCellValue() + "\n" +
						"Father's Contact:                                   " + cell16.getStringCellValue() + "\n" +
						"Father's Income:                                   " + cell19.getStringCellValue() + "\n" +						
						"Father's Email ID:                                 " + cell20.getStringCellValue() + "\n" +
						"Mother's Name:                                     " + cell21.getStringCellValue() + "\n" +
						
						"\n\n" + 
						"Admission Type:                                    " + cell26.getStringCellValue() + "\n" +
						
						"\n----Academic Details----\n" +
						"12th Passing Year:                               " + String.valueOf(cell28.getNumericCellValue()) + "\n" +
						"School Board:                                        " + cell30.getStringCellValue() + "\n" +
						"School Name:                                         " + cell31.getStringCellValue() + "\n" +
						"PCM Percentage:                                   " + cell33.getStringCellValue() + "\n" +
						"PCM Percentile:                                      " + cell34.getStringCellValue() + "\n" +
						"JEE Score:                                               " + cell35.getStringCellValue() + "\n" +
						"JEE Percentile:                                       " + cell36.getStringCellValue() + "\n" +
						"JEE Roll Number:                                  " + cell37.getStringCellValue() + "\n" +
						"ACPC Rank:                                            " + String.valueOf(cell38.getNumericCellValue()) + "\n" +
						
						"\n----Sponsor's Details----\n" + 
						"Sponsor's Name:                                            " + cell39.getStringCellValue() + "\n" +
						"Sponsor's Gender:                                          " + cell40.getStringCellValue() + "\n" +
						"Sponsor's Nationality:                                    " + cell41.getStringCellValue() + "\n" +
						"Sponsor's NRI Status:                                   " + cell42.getStringCellValue() + "\n" +
						"Sponsor's Relation With Applicant:             " + cell43.getStringCellValue() + "\n" +
						"Sponsor's Contact Number:                          " + cell44.getStringCellValue() + "\n" +
						"Sponsor's Address:                                        " + cell45.getStringCellValue() + "\n" +

						"\n----Enrollment Details----\n" + 
						"Branch:                                                     " + cell46.getStringCellValue() + "\n" +
						"Admission Status:                                 " + cell47.getStringCellValue() + "\n" +
						"Year of Joining:                                      " + String.valueOf(cell48.getNumericCellValue()) + "\n";
				
			}
			
			fread.close();
			
		}
		catch(Exception err)
		{
			
			throw err;
		}
		
		return str;
	}

	public String MECHNRISPONcheck(String roll) throws Exception
	{
		int rownum = -1;
		String str = null;
		
		try
		{
			File file = new File("//10.20.10.52/Documents/#2016/MECH.xls");
			FileInputStream fread = null;
			fread = new FileInputStream(file);
			
			Workbook wb = WorkbookFactory.create(fread);
			Sheet sh = wb.getSheet("NRI_SPONSOR");
			
			
			int last = sh.getLastRowNum();

			for(int i = 1; i<=last; i++)	
			{
				Row row1 = sh.getRow(i);
				Cell jeerollcell = row1.getCell(37);
				jeerollcell = sh.getRow(i).getCell(37);
				if(jeerollcell.getStringCellValue().equals(roll))
				{
					rownum = i;
					break;
				}
			}
			
			
						
						
			if(rownum == -1)
			{
				str = "There is No Student Data Existing in the File MECH, Sheet NRI_SPONSOR";
			}
			else 
			{
				Row row2 = sh.getRow(rownum);
				
				Cell cell0 = row2.getCell(0);
				if(cell0 == null)
				{
					
					cell0 = row2.createCell(0);
				}
				Cell cell1 = row2.getCell(1);
				Cell cell2 = row2.getCell(2);
				Cell cell3 = row2.getCell(3);
				Cell cell4 = row2.getCell(4);
				Cell cell6 = row2.getCell(6);
				Cell cell7 = row2.getCell(7);
				Cell cell8 = row2.getCell(8);
				Cell cell9 = row2.getCell(9);
				Cell cell10 = row2.getCell(10);
				Cell cell12 = row2.getCell(12);
				Cell cell13 = row2.getCell(13);
				Cell cell14 = row2.getCell(14);
				Cell cell15 = row2.getCell(15);
				Cell cell16 = row2.getCell(16);
				Cell cell19 = row2.getCell(19);
				Cell cell20 = row2.getCell(20);
				Cell cell21 = row2.getCell(21);
				Cell cell26 = row2.getCell(26);
				Cell cell28 = row2.getCell(28);
				Cell cell30 = row2.getCell(30);
				Cell cell31 = row2.getCell(31);
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
				Cell cell46 = row2.getCell(46);
				Cell cell47 = row2.getCell(47);
				Cell cell48 = row2.getCell(48);
				
				str =   "----Personal Details----\n" + 
						"Enrollment Number:                            " + cell0.getStringCellValue() + "\n" +
						"First Name:                                            " + cell1.getStringCellValue() + "\n" +
						"Middle Name:                                        " + cell2.getStringCellValue() + "\n" +
						"Last Name:                                            " + cell3.getStringCellValue() + "\n" +
						"Gender:                                                   " + cell4.getStringCellValue() + "\n" +
						"Address:                                                  " + cell6.getStringCellValue() + "\n" +
						"State:                                                       " + cell7.getStringCellValue() + "\n" +
						"City:                                                          " + cell8.getStringCellValue() + "\n" +
						"PINCODE:                                              " + cell9.getStringCellValue() + "\n" +
						"Primary Contact Number:                    " + cell10.getStringCellValue() + "\n" +
						"Email ID:                                                 " + cell12.getStringCellValue() + "\n" +
						"Category:                                                " + cell13.getStringCellValue() + "\n" +
						"Date of Birth:                                          " + cell14.getStringCellValue() + "\n" +
						
						"\n----Guardian Details----\n" +
						"Father's Name:                                      " + cell15.getStringCellValue() + "\n" +
						"Father's Contact:                                   " + cell16.getStringCellValue() + "\n" +
						"Father's Income:                                   " + cell19.getStringCellValue() + "\n" +						
						"Father's Email ID:                                 " + cell20.getStringCellValue() + "\n" +
						"Mother's Name:                                     " + cell21.getStringCellValue() + "\n" +
						
						"\n\n" + 
						"Admission Type:                                    " + cell26.getStringCellValue() + "\n" +
						
						"\n----Academic Details----\n" +
						"12th Passing Year:                               " + String.valueOf(cell28.getNumericCellValue()) + "\n" +
						"School Board:                                        " + cell30.getStringCellValue() + "\n" +
						"School Name:                                         " + cell31.getStringCellValue() + "\n" +
						"PCM Percentage:                                   " + cell33.getStringCellValue() + "\n" +
						"PCM Percentile:                                      " + cell34.getStringCellValue() + "\n" +
						"JEE Score:                                               " + cell35.getStringCellValue() + "\n" +
						"JEE Percentile:                                       " + cell36.getStringCellValue() + "\n" +
						"JEE Roll Number:                                  " + cell37.getStringCellValue() + "\n" +
						"ACPC Rank:                                            " + String.valueOf(cell38.getNumericCellValue()) + "\n" +
						
						"\n----Sponsor's Details----\n" + 
						"Sponsor's Name:                                            " + cell39.getStringCellValue() + "\n" +
						"Sponsor's Gender:                                          " + cell40.getStringCellValue() + "\n" +
						"Sponsor's Nationality:                                    " + cell41.getStringCellValue() + "\n" +
						"Sponsor's NRI Status:                                   " + cell42.getStringCellValue() + "\n" +
						"Sponsor's Relation With Applicant:             " + cell43.getStringCellValue() + "\n" +
						"Sponsor's Contact Number:                          " + cell44.getStringCellValue() + "\n" +
						"Sponsor's Address:                                        " + cell45.getStringCellValue() + "\n" +

						"\n----Enrollment Details----\n" + 
						"Branch:                                                     " + cell46.getStringCellValue() + "\n" +
						"Admission Status:                                 " + cell47.getStringCellValue() + "\n" +
						"Year of Joining:                                      " + String.valueOf(cell48.getNumericCellValue()) + "\n";
				
			}
			
			fread.close();
			
		}
		catch(Exception err)
		{
			
			throw err;
		}
		
		return str;
	}

	public String CHEMNRISPONcheck(String roll) throws Exception
	{
		int rownum = -1;
		String str = null;
		
		try
		{
			File file = new File("//10.20.10.52/Documents/#2016/CHEM.xls");
			FileInputStream fread = null;
			fread = new FileInputStream(file);
			
			Workbook wb = WorkbookFactory.create(fread);
			Sheet sh = wb.getSheet("NRI_SPONSOR");
			
			
			int last = sh.getLastRowNum();

			for(int i = 1; i<=last; i++)	
			{
				Row row1 = sh.getRow(i);
				Cell jeerollcell = row1.getCell(37);
				jeerollcell = sh.getRow(i).getCell(37);
				if(jeerollcell.getStringCellValue().equals(roll))
				{
					rownum = i;
					break;
				}
			}
			
			
						
			if(rownum == -1)
			{
				str = "There is No Student Data Existing in the File CHEM, Sheet NRI_SPONSOR";
			}
			else 
			{
				
				Row row2 = sh.getRow(rownum);
				
				Cell cell0 = row2.getCell(0);
				if(cell0 == null)
				{
					
					cell0 = row2.createCell(0);
				}
				Cell cell1 = row2.getCell(1);
				Cell cell2 = row2.getCell(2);
				Cell cell3 = row2.getCell(3);
				Cell cell4 = row2.getCell(4);
				Cell cell6 = row2.getCell(6);
				Cell cell7 = row2.getCell(7);
				Cell cell8 = row2.getCell(8);
				Cell cell9 = row2.getCell(9);
				Cell cell10 = row2.getCell(10);
				Cell cell12 = row2.getCell(12);
				Cell cell13 = row2.getCell(13);
				Cell cell14 = row2.getCell(14);
				Cell cell15 = row2.getCell(15);
				Cell cell16 = row2.getCell(16);
				Cell cell19 = row2.getCell(19);
				Cell cell20 = row2.getCell(20);
				Cell cell21 = row2.getCell(21);
				Cell cell26 = row2.getCell(26);
				Cell cell28 = row2.getCell(28);
				Cell cell30 = row2.getCell(30);
				Cell cell31 = row2.getCell(31);
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
				Cell cell46 = row2.getCell(46);
				Cell cell47 = row2.getCell(47);
				Cell cell48 = row2.getCell(48);
							
				
				str =   "----Personal Details----\n" + 
						"Enrollment Number:                            " + cell0.getStringCellValue() + "\n" +
						"First Name:                                            " + cell1.getStringCellValue() + "\n" +
						"Middle Name:                                        " + cell2.getStringCellValue() + "\n" +
						"Last Name:                                            " + cell3.getStringCellValue() + "\n" +
						"Gender:                                                   " + cell4.getStringCellValue() + "\n" +
						"Address:                                                  " + cell6.getStringCellValue() + "\n" +
						"State:                                                       " + cell7.getStringCellValue() + "\n" +
						"City:                                                          " + cell8.getStringCellValue() + "\n" +
						"PINCODE:                                              " + cell9.getStringCellValue() + "\n" +
						"Primary Contact Number:                    " + cell10.getStringCellValue() + "\n" +
						"Email ID:                                                 " + cell12.getStringCellValue() + "\n" +
						"Category:                                                " + cell13.getStringCellValue() + "\n" +
						"Date of Birth:                                          " + cell14.getStringCellValue() + "\n" +
						
						"\n----Guardian Details----\n" +
						"Father's Name:                                      " + cell15.getStringCellValue() + "\n" +
						"Father's Contact:                                   " + cell16.getStringCellValue() + "\n" +
						"Father's Income:                                   " + cell19.getStringCellValue() + "\n" +						
						"Father's Email ID:                                 " + cell20.getStringCellValue() + "\n" +
						"Mother's Name:                                     " + cell21.getStringCellValue() + "\n" +
						
						"\n\n" + 
						"Admission Type:                                    " + cell26.getStringCellValue() + "\n" +
						
						"\n----Academic Details----\n" +
						"12th Passing Year:                               " + String.valueOf(cell28.getNumericCellValue()) + "\n" +
						"School Board:                                        " + cell30.getStringCellValue() + "\n" +
						"School Name:                                         " + cell31.getStringCellValue() + "\n" +
						"PCM Percentage:                                   " + cell33.getStringCellValue() + "\n" +
						"PCM Percentile:                                      " + cell34.getStringCellValue() + "\n" +
						"JEE Score:                                               " + cell35.getStringCellValue() + "\n" +
						"JEE Percentile:                                       " + cell36.getStringCellValue() + "\n" +
						"JEE Roll Number:                                  " + cell37.getStringCellValue() + "\n" +
						"ACPC Rank:                                            " + String.valueOf(cell38.getNumericCellValue()) + "\n" +
						
						"\n----Sponsor's Details----\n" + 
						"Sponsor's Name:                                            " + cell39.getStringCellValue() + "\n" +
						"Sponsor's Gender:                                          " + cell40.getStringCellValue() + "\n" +
						"Sponsor's Nationality:                                    " + cell41.getStringCellValue() + "\n" +
						"Sponsor's NRI Status:                                   " + cell42.getStringCellValue() + "\n" +
						"Sponsor's Relation With Applicant:             " + cell43.getStringCellValue() + "\n" +
						"Sponsor's Contact Number:                          " + cell44.getStringCellValue() + "\n" +
						"Sponsor's Address:                                        " + cell45.getStringCellValue() + "\n" +

						"\n----Enrollment Details----\n" + 
						"Branch:                                                     " + cell46.getStringCellValue() + "\n" +
						"Admission Status:                                 " + cell47.getStringCellValue() + "\n" +
						"Year of Joining:                                      " + String.valueOf(cell48.getNumericCellValue()) + "\n";
				
			}
			
			fread.close();
			
		}
		catch(Exception err)
		{
			
			throw err;
		}
		
		return str;
	}

	public String ICTNRISTUDcheck(String roll) throws Exception
	{
		int rownum = -1;
		String str = null;
		
		try
		{
			File file = new File("//10.20.10.52/Documents/#2016/ICT.xls");
			FileInputStream fread = null;
			fread = new FileInputStream(file);
			
			
			Workbook wb = WorkbookFactory.create(fread);
			Sheet sh = wb.getSheet("NRI");
			
			
			int last = sh.getLastRowNum();

			for(int i = 1; i<=last; i++)	
			{
				Row row1 = sh.getRow(i);
				Cell jeerollcell = row1.getCell(27);
				jeerollcell = sh.getRow(i).getCell(27);
				if(jeerollcell.getStringCellValue().equals(roll))
				{
					rownum = i;
					break;
				}
			}
			
			
						
						
			if(rownum == -1)
			{
				str = "There is No Student Data Existing in the File ICT, Sheet NRI";
			}
			else 
			{
				Row row2 = sh.getRow(rownum);
				
				Cell cell0 = row2.getCell(0);
				if(cell0 == null)
				{
					
					cell0 = row2.createCell(0);
				}
				
				Cell cell1 = row2.getCell(1);
				Cell cell2 = row2.getCell(2);
				Cell cell3 = row2.getCell(3);
				Cell cell4 = row2.getCell(4);
				Cell cell6 = row2.getCell(6);
				Cell cell7 = row2.getCell(7);
				Cell cell8 = row2.getCell(8);
				Cell cell9 = row2.getCell(9);
				Cell cell10 = row2.getCell(10);
				Cell cell12 = row2.getCell(12);
				Cell cell13 = row2.getCell(13);
				Cell cell14 = row2.getCell(14);
				Cell cell15 = row2.getCell(15);
				Cell cell16 = row2.getCell(16);
				Cell cell19 = row2.getCell(19);
				Cell cell20 = row2.getCell(20);
				Cell cell21 = row2.getCell(21);
				Cell cell26 = row2.getCell(26);
				Cell cell27 = row2.getCell(27);
				Cell cell28 = row2.getCell(28);
				Cell cell29 = row2.getCell(29);
				Cell cell30 = row2.getCell(30);
				Cell cell31 = row2.getCell(31);
				Cell cell32 = row2.getCell(32);
				Cell cell33 = row2.getCell(33);
				Cell cell34 = row2.getCell(34);
				
				str =   "----Personal Details----\n" + 
						"Enrollment Number:                            " + cell0.getStringCellValue() + "\n" +
						"First Name:                                            " + cell1.getStringCellValue() + "\n" +
						"Middle Name:                                        " + cell2.getStringCellValue() + "\n" +
						"Last Name:                                            " + cell3.getStringCellValue() + "\n" +
						"Gender:                                                   " + cell4.getStringCellValue() + "\n" +
						"Address:                                                  " + cell6.getStringCellValue() + "\n" +
						"State:                                                       " + cell7.getStringCellValue() + "\n" +
						"City:                                                          " + cell8.getStringCellValue() + "\n" +
						"PINCODE:                                              " + cell9.getStringCellValue() + "\n" +
						"Primary Contact Number:                    " + cell10.getStringCellValue() + "\n" +
						"Email ID:                                                 " + cell12.getStringCellValue() + "\n" +
						"Category:                                                " + cell13.getStringCellValue() + "\n" +
						"Date of Birth:                                          " + cell14.getStringCellValue() + "\n" +
						
						"\n----Guardian Details----\n" +
						"Father's Name:                                      " + cell15.getStringCellValue() + "\n" +
						"Father's Contact:                                   " + cell16.getStringCellValue() + "\n" +
						"Father's Income:                                   " + cell19.getStringCellValue() + "\n" +						
						"Father's Email ID:                                 " + cell20.getStringCellValue() + "\n" +
						"Mother's Name:                                     " + cell21.getStringCellValue() + "\n" +
						
						"\n\n" + 
						"Admission Type:                                    " + cell26.getStringCellValue() + "\n" +
						
						"\n----Academic Details----\n" +
						"12th Roll Number:                                  " + cell27.getStringCellValue() + "\n" +
						"Overall Grade:                                         " + cell28.getStringCellValue() + "\n" +
						
						"\n----NRI Deatils----\n" +
						"Nationality:                                               " + cell29.getStringCellValue() + "\n" +
						"NRI Status:                                              " + cell30.getStringCellValue() + "\n" +
						"NRI Address:                                           " + cell31.getStringCellValue() + "\n" +
						
						"\n----Enrollment Details----\n" + 
						"Branch:                                                     " + cell32.getStringCellValue() + "\n" +
						"Admission Status:                                 " + cell33.getStringCellValue() + "\n" +
						"Year of Joining:                                      " + String.valueOf(cell34.getNumericCellValue()) + "\n";
				
			}
			fread.close();
			
		}
		catch(Exception err)
		{
			
			throw err;
		}
		
		return str;
	}

	public String MECHNRISTUDcheck(String roll) throws Exception
	{
		int rownum = -1;
		String str = null;
		
		try
		{
			File file = new File("//10.20.10.52/Documents/#2016/MECH.xls");
			FileInputStream fread = null;

			fread = new FileInputStream(file);
			
			Workbook wb = WorkbookFactory.create(fread);
			Sheet sh = wb.getSheet("NRI");
			
			int last = sh.getLastRowNum();

			for(int i = 1; i<=last; i++)	
			{
				Row row1 = sh.getRow(i);
				Cell jeerollcell = row1.getCell(27);
				jeerollcell = sh.getRow(i).getCell(27);
				if(jeerollcell.getStringCellValue().equals(roll))
				{
					rownum = i;
					break;
				}
			}
			
			
						
			if(rownum == -1)
			{
				str = "There is No Student Data Existing in the File MECH, Sheet NRI";
			}
			else 
			{
				Row row2 = sh.getRow(rownum);
				
				Cell cell0 = row2.getCell(0);
				if(cell0 == null)
				{
					
					cell0 = row2.createCell(0);
				}
				
				Cell cell1 = row2.getCell(1);
				Cell cell2 = row2.getCell(2);
				Cell cell3 = row2.getCell(3);
				Cell cell4 = row2.getCell(4);
				Cell cell6 = row2.getCell(6);
				Cell cell7 = row2.getCell(7);
				Cell cell8 = row2.getCell(8);
				Cell cell9 = row2.getCell(9);
				Cell cell10 = row2.getCell(10);
				Cell cell12 = row2.getCell(12);
				Cell cell13 = row2.getCell(13);
				Cell cell14 = row2.getCell(14);
				Cell cell15 = row2.getCell(15);
				Cell cell16 = row2.getCell(16);
				Cell cell19 = row2.getCell(19);
				Cell cell20 = row2.getCell(20);
				Cell cell21 = row2.getCell(21);
				Cell cell26 = row2.getCell(26);
				Cell cell27 = row2.getCell(27);
				Cell cell28 = row2.getCell(28);
				Cell cell29 = row2.getCell(29);
				Cell cell30 = row2.getCell(30);
				Cell cell31 = row2.getCell(31);
				Cell cell32 = row2.getCell(32);
				Cell cell33 = row2.getCell(33);
				Cell cell34 = row2.getCell(34);
							
				
				str =   "----Personal Details----\n" + 
						"Enrollment Number:                            " + cell0.getStringCellValue() + "\n" +
						"First Name:                                            " + cell1.getStringCellValue() + "\n" +
						"Middle Name:                                        " + cell2.getStringCellValue() + "\n" +
						"Last Name:                                            " + cell3.getStringCellValue() + "\n" +
						"Gender:                                                   " + cell4.getStringCellValue() + "\n" +
						"Address:                                                  " + cell6.getStringCellValue() + "\n" +
						"State:                                                       " + cell7.getStringCellValue() + "\n" +
						"City:                                                          " + cell8.getStringCellValue() + "\n" +
						"PINCODE:                                              " + cell9.getStringCellValue() + "\n" +
						"Primary Contact Number:                    " + cell10.getStringCellValue() + "\n" +
						"Email ID:                                                 " + cell12.getStringCellValue() + "\n" +
						"Category:                                                " + cell13.getStringCellValue() + "\n" +
						"Date of Birth:                                          " + cell14.getStringCellValue() + "\n" +
						
						"\n----Guardian Details----\n" +
						"Father's Name:                                      " + cell15.getStringCellValue() + "\n" +
						"Father's Contact:                                   " + cell16.getStringCellValue() + "\n" +
						"Father's Income:                                   " + cell19.getStringCellValue() + "\n" +						
						"Father's Email ID:                                 " + cell20.getStringCellValue() + "\n" +
						"Mother's Name:                                     " + cell21.getStringCellValue() + "\n" +
						
						"\n\n" + 
						"Admission Type:                                    " + cell26.getStringCellValue() + "\n" +
						
						"\n----Academic Details----\n" +
						"12th Roll Number:                                  " + cell27.getStringCellValue() + "\n" +
						"Overall Grade:                                         " + cell28.getStringCellValue() + "\n" +
						
						"\n----NRI Deatils----\n" +
						"Nationality:                                               " + cell29.getStringCellValue() + "\n" +
						"NRI Status:                                              " + cell30.getStringCellValue() + "\n" +
						"NRI Address:                                           " + cell31.getStringCellValue() + "\n" +
						
						"\n----Enrollment Details----\n" + 
						"Branch:                                                     " + cell32.getStringCellValue() + "\n" +
						"Admission Status:                                 " + cell33.getStringCellValue() + "\n" +
						"Year of Joining:                                      " + String.valueOf(cell34.getNumericCellValue()) + "\n";
				
				
				
			}
			
			fread.close();
			
		}
		catch(Exception err)
		{
			
			throw err;
		}
		
		return str;
	}
	
	public String CHEMNRISTUDcheck(String roll) throws Exception
	{
		int rownum = -1;
		String str = null;
		
		try
		{
			File file = new File("//10.20.10.52/Documents/#2016/CHEM.xls");
			FileInputStream fread = null;
			fread = new FileInputStream(file);
			
			Workbook wb = WorkbookFactory.create(fread);
			Sheet sh = wb.getSheet("NRI");
			 
			
			int last = sh.getLastRowNum();

			for(int i = 1; i<=last; i++)	
			{
				Row row1 = sh.getRow(i);
				Cell jeerollcell = row1.getCell(27);
				jeerollcell = sh.getRow(i).getCell(27);
				if(jeerollcell.getStringCellValue().equals(roll))
				{
					rownum = i;
					break;
				}
			}
			
			
						
						
			if(rownum == -1)
			{
				str = "There is No Student Data Existing in the File CHEM, Sheet NRI";
			}
			else 
			{
				Row row2 = sh.getRow(rownum);
				
				Cell cell0 = row2.getCell(0);
				if(cell0 == null)
				{
					
					cell0 = row2.createCell(0);
				}
				
				Cell cell1 = row2.getCell(1);
				Cell cell2 = row2.getCell(2);
				Cell cell3 = row2.getCell(3);
				Cell cell4 = row2.getCell(4);
				Cell cell6 = row2.getCell(6);
				Cell cell7 = row2.getCell(7);
				Cell cell8 = row2.getCell(8);
				Cell cell9 = row2.getCell(9);
				Cell cell10 = row2.getCell(10);
				Cell cell12 = row2.getCell(12);
				Cell cell13 = row2.getCell(13);
				Cell cell14 = row2.getCell(14);
				Cell cell15 = row2.getCell(15);
				Cell cell16 = row2.getCell(16);
				Cell cell19 = row2.getCell(19);
				Cell cell20 = row2.getCell(20);
				Cell cell21 = row2.getCell(21);
				Cell cell26 = row2.getCell(26);
				Cell cell27 = row2.getCell(27);
				Cell cell28 = row2.getCell(28);
				Cell cell29 = row2.getCell(29);
				Cell cell30 = row2.getCell(30);
				Cell cell31 = row2.getCell(31);
				Cell cell32 = row2.getCell(32);
				Cell cell33 = row2.getCell(33);
				Cell cell34 = row2.getCell(34);
				
				str =   "----Personal Details----\n" + 
						"Enrollment Number:                            " + cell0.getStringCellValue() + "\n" +
						"First Name:                                            " + cell1.getStringCellValue() + "\n" +
						"Middle Name:                                        " + cell2.getStringCellValue() + "\n" +
						"Last Name:                                            " + cell3.getStringCellValue() + "\n" +
						"Gender:                                                   " + cell4.getStringCellValue() + "\n" +
						"Address:                                                  " + cell6.getStringCellValue() + "\n" +
						"State:                                                       " + cell7.getStringCellValue() + "\n" +
						"City:                                                          " + cell8.getStringCellValue() + "\n" +
						"PINCODE:                                              " + cell9.getStringCellValue() + "\n" +
						"Primary Contact Number:                    " + cell10.getStringCellValue() + "\n" +
						"Email ID:                                                 " + cell12.getStringCellValue() + "\n" +
						"Category:                                                " + cell13.getStringCellValue() + "\n" +
						"Date of Birth:                                          " + cell14.getStringCellValue() + "\n" +
						
						"\n----Guardian Details----\n" +
						"Father's Name:                                      " + cell15.getStringCellValue() + "\n" +
						"Father's Contact:                                   " + cell16.getStringCellValue() + "\n" +
						"Father's Income:                                   " + cell19.getStringCellValue() + "\n" +						
						"Father's Email ID:                                 " + cell20.getStringCellValue() + "\n" +
						"Mother's Name:                                     " + cell21.getStringCellValue() + "\n" +
						
						"\n\n" + 
						"Admission Type:                                    " + cell26.getStringCellValue() + "\n" +
						
						"\n----Academic Details----\n" +
						"12th Roll Number:                                  " + cell27.getStringCellValue() + "\n" +
						"Overall Grade:                                         " + cell28.getStringCellValue() + "\n" +
						
						"\n----NRI Deatils----\n" +
						"Nationality:                                               " + cell29.getStringCellValue() + "\n" +
						"NRI Status:                                              " + cell30.getStringCellValue() + "\n" +
						"NRI Address:                                           " + cell31.getStringCellValue() + "\n" +
						
						"\n----Enrollment Details----\n" + 
						"Branch:                                                     " + cell32.getStringCellValue() + "\n" +
						"Admission Status:                                 " + cell33.getStringCellValue() + "\n" +
						"Year of Joining:                                      " + String.valueOf(cell34.getNumericCellValue()) + "\n";
				
			}
			
			fread.close();
			
		}
		catch(Exception err)
		{
			
			throw err;
		}
		
		return str;
	}


}