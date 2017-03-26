package sprj_DataStorage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Date;
import java.util.GregorianCalendar;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReCreateExcel 
{
	public void createDupli(String branch) throws Exception
	{
		GregorianCalendar g = new GregorianCalendar();
		Date d = new Date(g.getTimeInMillis());
		String today   = d.toString();		
		
		try
		{
			/* From the files codes */
			FileInputStream readfread = new FileInputStream("//10.20.10.52/Documents/#2016/"+branch+".xls");
			
			Workbook readwb = WorkbookFactory.create(readfread);
			Sheet readshacpc = readwb.getSheet("ACPC");
			Sheet readshnrispon = readwb.getSheet("NRI_SPONSOR");
			Sheet readshnri = readwb.getSheet("NRI");
			Sheet readshacpcdocs = readwb.getSheet("ACPC_Docs");
			Sheet readshnrispondocs = readwb.getSheet("NRI_SPONSOR_Docs");
			Sheet readshnridocs = readwb.getSheet("NRI_Docs");

			
			int readlastacpc = readshacpc.getLastRowNum();
			int readlastnri = readshnri.getLastRowNum();
			int readlastnrispon = readshnrispon.getLastRowNum();
			int readlastacpcdocs = readshacpcdocs.getLastRowNum();
			int readlastnridocs = readshnridocs.getLastRowNum();
			int readlastnrispondocs = readshnrispondocs.getLastRowNum();
			
			//System.out.println(readlastnrispon + "nrispon\n");

			/* To new file codes */
			String filename = javax.swing.filechooser.FileSystemView.getFileSystemView().getHomeDirectory() + "/" + branch + "_Copy_"+ today + ".xls";
			FileOutputStream writefwrite = new FileOutputStream(filename);
			FileInputStream writefread = new FileInputStream(filename);

			HSSFWorkbook writewb = new HSSFWorkbook();
			HSSFSheet writeshacpc = writewb.createSheet("ACPC");
			HSSFSheet writeshnrispon = writewb.createSheet("NRI_SPONSOR");
			HSSFSheet writeshnri = writewb.createSheet("NRI");
			HSSFSheet writeshacpcdocs = writewb.createSheet("ACPC_Docs");
			HSSFSheet writeshnrispondocs = writewb.createSheet("NRI_SPONSOR_Docs");
			HSSFSheet writeshnridocs = writewb.createSheet("NRI_Docs");

			
			for(int i = 0; i<=0; i++)
			{
				Row readacpc = readshacpc.getRow(i);
				Row writeacpc = writeshacpc.createRow(i);
				
				for(int j = 0; j<42; j++)
				{
					Cell readcell = readacpc.getCell(j);
					readcell = readshacpc.getRow(i).getCell(j);
					
					Cell writecell = writeacpc.createCell(j);
					writecell = writeshacpc.getRow(i).getCell(j);
					writecell.setCellValue(readcell.getStringCellValue());
				}
			}
			
			for(int i = 1; i<=readlastacpc; i++)
			{
				Row readacpc = readshacpc.getRow(i);
				Row writeacpc = writeshacpc.createRow(i);
				
				for(int j = 1; j<42; j++)
				{
					Cell readcell = readacpc.getCell(j);
					readcell = readshacpc.getRow(i).getCell(j);
					
					Cell writecell = writeacpc.createCell(j);
					writecell = writeshacpc.getRow(i).getCell(j);
					
					if((j == 27) || (j == 28) || (j == 38) || (j == 41))
					{
						if(readacpc.getCell(j) != null)
							writecell.setCellValue(readcell.getNumericCellValue());
					}
					else
					{
						//System.out.println(j);
						if(readacpc.getCell(j) != null)
							writecell.setCellValue(readcell.getStringCellValue());
					}
				}
			}
			
			
			for(int i = 0; i<=0; i++)
			{
				Row readnrispon = readshnrispon.getRow(i);
				Row writenrispon = writeshnrispon.createRow(i);
				
				for(int j = 0; j<49; j++)
				{
					Cell readcell = readnrispon.getCell(j);
					readcell = readshnrispon.getRow(i).getCell(j);
					
					Cell writecell = writenrispon.createCell(j);
					writecell = writeshnrispon.getRow(i).getCell(j);
					writecell.setCellValue(readcell.getStringCellValue());
				}
			}

			
			for(int i = 1; i<=readlastnrispon; i++)
			{
				Row readnrispon = readshnrispon.getRow(i);
				Row writenrispon = writeshnrispon.createRow(i);
				
				for(int j = 0; j<49; j++)
				{
					Cell readcell = readnrispon.getCell(j);
					readcell = readshnrispon.getRow(i).getCell(j);
					
					Cell writecell = writenrispon.createCell(j);
					writecell = writeshnrispon.getRow(i).getCell(j);
					
					if((j == 27) || (j == 28) || (j == 38) || (j == 48))
					{
						if(readnrispon.getCell(j) != null)
							writecell.setCellValue((int)readcell.getNumericCellValue());
					}
					else
					{
						//System.out.println(j +" \n");
						if(readnrispon.getCell(j) != null)
							writecell.setCellValue(readcell.getStringCellValue());
					}
				}
			}
			
			
			for(int i = 0; i<=0; i++)
			{
				Row readnri = readshnri.getRow(i);
				Row writenri = writeshnri.createRow(i);
				
				for(int j = 0; j<35; j++)
				{
					Cell readcell = readnri.getCell(j);
					readcell = readshnri.getRow(i).getCell(j);
					
					Cell writecell = writenri.createCell(j);
					writecell = writeshnri.getRow(i).getCell(j);
					writecell.setCellValue(readcell.getStringCellValue());
				}
			}

			for(int i = 1; i<=readlastnri; i++)
			{
				Row readnri = readshnri.getRow(i);
				Row writeout = writeshnri.createRow(i);
				
				for(int j = 0; j<35; j++)
				{
					Cell readcell = readnri.getCell(j);
					readcell = readshnri.getRow(i).getCell(j);
					
					Cell writecell = writeout.createCell(j);
					writecell = writeshnri.getRow(i).getCell(j);
					
					if(j == 34)
					{
						if(readnri.getCell(j) != null)
							writecell.setCellValue(readcell.getNumericCellValue());
					}
					else
					{
						if(readnri.getCell(j) != null)
							writecell.setCellValue(readcell.getStringCellValue());
					}
				}
			}

						
			for(int i = 0; i<=readlastacpcdocs; i++)
			{
				Row readacpcdocs = readshacpcdocs.getRow(i);
				Row writeacpcdocs = writeshacpcdocs.createRow(i);
				
				for(int j = 0; j<42; j++)
				{
					Cell readcell = readacpcdocs.getCell(j);
					readcell = readshacpcdocs.getRow(i).getCell(j);
					
					Cell writecell = writeacpcdocs.createCell(j);
					writecell = writeshacpcdocs.getRow(i).getCell(j);
					if(readacpcdocs.getCell(j) != null)
						writecell.setCellValue(readcell.getStringCellValue());
				}
			}

			for(int i = 0; i<=readlastnrispondocs; i++)
			{
				Row readnrispondocs = readshnrispondocs.getRow(i);
				Row writenrispondocs = writeshnrispondocs.createRow(i);
				
				for(int j = 0; j<42; j++)
				{
					Cell readcell = readnrispondocs.getCell(j);
					readcell = readshnrispondocs.getRow(i).getCell(j);
					
					Cell writecell = writenrispondocs.createCell(j);
					writecell = writeshnrispondocs.getRow(i).getCell(j);
					if(readnrispondocs.getCell(j) != null)
						writecell.setCellValue(readcell.getStringCellValue());
				}
			}

			for(int i = 0; i<=readlastnridocs; i++)
			{
				Row readnridocs = readshnridocs.getRow(i);
				Row writenridocs = writeshnridocs.createRow(i);
				
				for(int j = 0; j<42; j++)
				{
					Cell readcell = readnridocs.getCell(j);
					readcell = readshnridocs.getRow(i).getCell(j);
					
					Cell writecell = writenridocs.createCell(j);
					writecell = writeshnridocs.getRow(i).getCell(j);
					if(readnridocs.getCell(j) != null)
						writecell.setCellValue(readcell.getStringCellValue());
				}
			}

			writewb.write(writefwrite);
			writefwrite.close();
			writefread.close();
			readfread.close();		
		}
		catch(Exception err)
		{
			
			throw err;
		}
	}
	
		
}
