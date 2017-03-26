package sprj_DataStorage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class LoginDetails  
{
	public int check(String id, String pass) throws Exception
	{
		int rownum = -1;
		try
		{
			File file = new File("//10.20.10.52/Documents/#2016/LoginFile.xls");
			//File file = new File("LoginFile.xls");
			
			FileInputStream fread = new FileInputStream(file);
			
			HSSFWorkbook wb = null;
			HSSFSheet sh = null;
			
			wb = new HSSFWorkbook(fread); 
			sh = wb.getSheet("Sheet1");

			int last = sh.getLastRowNum();
			
			for(int i=1; i<=last; i++)
			{
				Row r = sh.getRow(i);
				Cell cellid = r.getCell(0);
				Cell cellpass = r.getCell(1);

				cellid = sh.getRow(i).getCell(0);
				cellpass = sh.getRow(i).getCell(1);
				
				if((cellid.getStringCellValue().equals(id)) && (cellpass.getStringCellValue().equals(pass)))
				{
					rownum = i;
					break;
				}
			}

			fread.close();
			
			return rownum;
		}
		catch(Exception err)
		{
			throw err;
		}
	}
	
	public void createacc(String id, String pass) throws Exception
	{
		int flag = -1;
		for(int j = 0; j<pass.length(); j++)
		{
			if(!Character.isWhitespace(pass.charAt(j)))
			{
				flag = 0;
				break;
			}
		}
			
		try
		{
			if(flag==0)
			{
				int last = 0; 
				File file = new File("//10.20.10.52/Documents/#2016/LoginFile.xls");
				
				FileInputStream fread = null;

				HSSFWorkbook wb = null;
				HSSFSheet sh = null;
				
				FileOutputStream fwrite = null;
				
				fread = new FileInputStream(file); 

				wb = new HSSFWorkbook(fread); 
				sh = wb.getSheet("Sheet1");

				fwrite = new FileOutputStream(file);
				
				last = sh.getLastRowNum() +1;
				
				Row newrow = sh.createRow(last);
				Cell cellid = newrow.createCell(0);
				Cell cellpass = newrow.createCell(1);

				cellid = sh.getRow(last).createCell(0);
				cellpass = sh.getRow(last).createCell(1);
				
				cellid.setCellValue(id);
				cellpass.setCellValue(pass);
				
				fread.close();
				
				wb.write(fwrite);
				fwrite.close();
			}
			else
			{
				throw new Exception("PASSWORD FIELD CANNOT CONTAIN NO CHARACTER");
				
			}
		}
		catch(Exception err)
		{
			throw err;
		}

	}
	
	public int deleteacc(String id, String pass) throws Exception
	{
		try
		{
			int rownum = -1;
			File file = new File("//10.20.10.52/Documents/#2016/LoginFile.xls");

			FileInputStream fread = new FileInputStream(file);
			
			HSSFWorkbook wb = null;
			HSSFSheet sh = null;
			
			wb = new HSSFWorkbook(fread); 
			sh = wb.getSheet("Sheet1");

			FileOutputStream fwrite = new FileOutputStream(file);

			int last = sh.getLastRowNum();
			
			for(int i=1; i<=last; i++)
			{
				Row r = sh.getRow(i);
				Cell cellid = r.getCell(0);
				Cell cellpass = r.getCell(1);

				cellid = sh.getRow(i).getCell(0);
				cellpass = sh.getRow(i).getCell(1);
				
				if((cellid.getStringCellValue().equals(id)) && (cellpass.getStringCellValue().equals(pass)))
				{
					rownum = i;
					break;
				}
			}
			
			if(rownum != -1)
			{
				Row rowdel = sh.getRow(rownum);
				Cell celli = rowdel.createCell(0);
				Cell cellp = rowdel.createCell(1);

				celli = sh.getRow(rownum).getCell(0);
				cellp = sh.getRow(rownum).getCell(1);
				
				celli.setCellValue("");
				cellp.setCellValue("");
			}
			
			fread.close();
			wb.write(fwrite);
			fwrite.close();
			
			return rownum;
		}
		catch(Exception err)
		{
			throw err;
		}
	}
	
	public int changepass(String id, String passo, String passn) throws Exception
	{
		int flag = -1;
		for(int j = 0; j<passn.length(); j++)
		{
			if(!Character.isWhitespace(passn.charAt(j)))
			{
				flag = 0;
				break;
			}
		}

		try
		{
			int rownum = -1;
			if(flag == 0)
			{
				File file = new File("//10.20.10.52/Documents/#2016/LoginFile.xls");

				FileInputStream fread = new FileInputStream(file);
				
				HSSFWorkbook wb = null;
				HSSFSheet sh = null;
				
				wb = new HSSFWorkbook(fread); 
				sh = wb.getSheet("Sheet1");

				FileOutputStream fwrite = new FileOutputStream(file);

				int last = sh.getLastRowNum();
				
				for(int i=1; i<=last; i++)
				{
					Row r = sh.getRow(i);
					Cell cellid = r.getCell(0);
					Cell cellpass = r.getCell(1);

					cellid = sh.getRow(i).getCell(0);
					cellpass = sh.getRow(i).getCell(1);
					
					if((cellid.getStringCellValue().equals(id)) && (cellpass.getStringCellValue().equals(passo)))
					{
						rownum = i;
						break;
					}
				}
				
				if(rownum != -1)
				{
					Row rchan = sh.getRow(rownum);
					Cell cellpassn = rchan.createCell(1);
					cellpassn.setCellValue(passn);
				}
				
				fread.close();
				wb.write(fwrite);
				fwrite.close();
				return rownum;
			}
			else
			{
				throw new Exception("NEW PASSWORD FIELD CANNOT CONTAIN NO CHARACTER");
			}
		}
		catch(Exception err)
		{
			throw err;
		}

	}
}
