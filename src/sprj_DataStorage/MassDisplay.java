package sprj_DataStorage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Calendar;
import java.util.Date;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MassDisplay 
{
	public void massDisplayStore(String branch, Boolean fname, Boolean lname, Boolean gen, Boolean add, Boolean pcontact,  Boolean scontact, Boolean email, Boolean cat, Boolean fatincome, Boolean admtype, Boolean board, Boolean jeescore, Boolean jeeroll, Boolean acpcrank, Boolean admstat, Boolean yearofjoin) throws Exception
	{
		//GregorianCalendar g = new GregorianCalendar();
		//Date d = new Date(g.getTimeInMillis());
		Date date = new Date(); // your date
	    Calendar cal = Calendar.getInstance();
	    cal.setTime(date);
	    int year = cal.get(Calendar.YEAR);
	    int month = cal.get(Calendar.MONTH) +1;
	    int day = cal.get(Calendar.DAY_OF_MONTH);
	    
	    int hour = cal.get(Calendar.HOUR_OF_DAY) % 12;
	    int minute = cal.get(Calendar.MINUTE);
	    //int second = cal.get(Calendar.SECOND);
	    
		
	   // System.out.println(year + month + ));
	    
		String today = day + "-" + month + "-" + year + "--" + hour + "-" + minute;
		
		try
		{
			/* From the files codes */
			FileInputStream readfread = new FileInputStream("//10.20.10.52/Documents/#2016/"+branch+".xls");
			//FileInputStream readfread = new FileInputStream(branch+".xls");
			
			
			Workbook readwb = WorkbookFactory.create(readfread);
			Sheet readshacpc = readwb.getSheet("ACPC");
			Sheet readshnrispon = readwb.getSheet("NRI_SPONSOR");
			Sheet readshnri = readwb.getSheet("NRI");
			
			int readlastacpc = readshacpc.getLastRowNum();
			int readlastnri = readshnri.getLastRowNum();
			int readlastnrispon = readshnrispon.getLastRowNum();

			/* To new file codes */
			String filename = javax.swing.filechooser.FileSystemView.getFileSystemView().getHomeDirectory() + "/" + branch + "_Output_" + today + ".xls";
			FileOutputStream writefwrite = new FileOutputStream(filename);
			FileInputStream writefread = new FileInputStream(filename);

			HSSFWorkbook writeworkbook = null;
			HSSFSheet writeworksheet = null;
			
			writeworkbook = new HSSFWorkbook(); 
			writeworksheet = writeworkbook.createSheet("Sheet1");
			
			int k = 0;
			
			for(int h = 0; h<=0; h++,k++)
			{
				int i = 0;
				Row readracpc = readshacpc.getRow(h);
				Row writeout = writeworksheet.createRow(k);

				if(fname)
				{
					Cell readcfname = readracpc.getCell(1);
					readcfname = readshacpc.getRow(h).getCell(1);
					
					Cell writefname = writeout.createCell(i);
					writefname = writeworksheet.getRow(k).getCell(i);
					
					writefname.setCellValue(readcfname.getStringCellValue());
					++i;
				}
				if(lname)
				{
					Cell readcfname = readracpc.getCell(3);
					readcfname = readshacpc.getRow(h).getCell(3);
					
					Cell writefname = writeout.createCell(i);
					writefname = writeworksheet.getRow(k).getCell(i);
					
					writefname.setCellValue(readcfname.getStringCellValue());
					++i;
				}
				if(gen)
				{
					Cell readcfname = readracpc.getCell(4);
					readcfname = readshacpc.getRow(h).getCell(4);
					
					Cell writefname = writeout.createCell(i);
					writefname = writeworksheet.getRow(k).getCell(i);
					
					writefname.setCellValue(readcfname.getStringCellValue());
					++i;
				}
				if(add)
				{
					Cell readcfname = readracpc.getCell(6);
					readcfname = readshacpc.getRow(h).getCell(6);
					
					Cell writefname = writeout.createCell(i);
					writefname = writeworksheet.getRow(k).getCell(i);
					
					writefname.setCellValue(readcfname.getStringCellValue());
					++i;
				}
				if(pcontact)
				{
					Cell readcfname = readracpc.getCell(10);
					readcfname = readshacpc.getRow(h).getCell(10);
					
					Cell writefname = writeout.createCell(i);
					writefname = writeworksheet.getRow(k).getCell(i);
					
					writefname.setCellValue(readcfname.getStringCellValue());
					++i;
				}
				if(scontact)
				{
					Cell readcfname = readracpc.getCell(11);
					readcfname = readshacpc.getRow(h).getCell(11);
					
					Cell writefname = writeout.createCell(i);
					writefname = writeworksheet.getRow(k).getCell(i);
					
					writefname.setCellValue(readcfname.getStringCellValue());
					++i;
				}
				if(email)
				{
					Cell readcfname = readracpc.getCell(12);
					readcfname = readshacpc.getRow(h).getCell(12);
					
					Cell writefname = writeout.createCell(i);
					writefname = writeworksheet.getRow(k).getCell(i);
					
					writefname.setCellValue(readcfname.getStringCellValue());
					++i;
				}
				if(cat)
				{
					Cell readcfname = readracpc.getCell(13);
					readcfname = readshacpc.getRow(h).getCell(13);
					
					Cell writefname = writeout.createCell(i);
					writefname = writeworksheet.getRow(k).getCell(i);
					
					writefname.setCellValue(readcfname.getStringCellValue());
					++i;
				}
				if(fatincome)
				{
					Cell readcfname = readracpc.getCell(19);
					readcfname = readshacpc.getRow(h).getCell(19);
					
					Cell writefname = writeout.createCell(i);
					writefname = writeworksheet.getRow(k).getCell(i);
					
					writefname.setCellValue(readcfname.getStringCellValue());
					++i;
				}
				if(admtype)
				{
					Cell readcfname = readracpc.getCell(26);
					readcfname = readshacpc.getRow(h).getCell(26);
					
					Cell writefname = writeout.createCell(i);
					writefname = writeworksheet.getRow(k).getCell(i);
					
					writefname.setCellValue(readcfname.getStringCellValue());
					++i;
				}
				if(board)
				{
					Cell readcfname = readracpc.getCell(30);
					readcfname = readshacpc.getRow(h).getCell(30);
					
					Cell writefname = writeout.createCell(i);
					writefname = writeworksheet.getRow(k).getCell(i);
					
					writefname.setCellValue(readcfname.getStringCellValue());
					++i;
				}
				if(jeescore)
				{
					Cell readcfname = readracpc.getCell(35);
					readcfname = readshacpc.getRow(h).getCell(35);
					
					Cell writefname = writeout.createCell(i);
					writefname = writeworksheet.getRow(k).getCell(i);
					
					writefname.setCellValue(readcfname.getStringCellValue());
					++i;
				}
				if(jeeroll)
				{
					Cell readcfname = readracpc.getCell(37);
					readcfname = readshacpc.getRow(h).getCell(37);
					
					Cell writefname = writeout.createCell(i);
					writefname = writeworksheet.getRow(k).getCell(i);
					
					writefname.setCellValue(readcfname.getStringCellValue());
					++i;
				}
				if(acpcrank)
				{
					Cell readcfname = readracpc.getCell(38);
					readcfname = readshacpc.getRow(h).getCell(38);
					
					Cell writefname = writeout.createCell(i);
					writefname = writeworksheet.getRow(k).getCell(i);
					
					writefname.setCellValue(readcfname.getStringCellValue());
					++i;
				}
				if(admstat)
				{
					Cell readcfname = readracpc.getCell(40);
					readcfname = readshacpc.getRow(h).getCell(40);
					
					Cell writefname = writeout.createCell(i);
					writefname = writeworksheet.getRow(k).getCell(i);
					
					writefname.setCellValue(readcfname.getStringCellValue());
					++i;
				}
				if(yearofjoin)
				{
					Cell readcfname = readracpc.getCell(41);
					readcfname = readshacpc.getRow(h).getCell(41);
					
					Cell writefname = writeout.createCell(i);
					writefname = writeworksheet.getRow(k).getCell(i);
					
					writefname.setCellValue(readcfname.getStringCellValue());
				}				
			}
			
			for(int j = 1; j<=readlastacpc; j++,k++)
			{
				int i = 0;
				Row readracpc = readshacpc.getRow(j);
				Row writeout = writeworksheet.createRow(k);

				if(fname)
				{
					Cell readcfname = readracpc.getCell(1);
					readcfname = readshacpc.getRow(j).getCell(1);
					
					Cell writefname = writeout.createCell(i);
					writefname = writeworksheet.getRow(k).getCell(i);
					
					if(readcfname.getStringCellValue() != null)
					writefname.setCellValue(readcfname.getStringCellValue());
					++i;
				}
				if(lname)
				{
					Cell readcfname = readracpc.getCell(3);
					readcfname = readshacpc.getRow(j).getCell(3);
			
					Cell writefname = writeout.createCell(i);
					writefname = writeworksheet.getRow(k).getCell(i);

					if(readcfname.getStringCellValue() != null)
					writefname.setCellValue(readcfname.getStringCellValue());
					++i;
				}
				if(gen)
				{
					Cell readcfname = readracpc.getCell(4);
					readcfname = readshacpc.getRow(j).getCell(4);
					
					Cell writefname = writeout.createCell(i);
					writefname = writeworksheet.getRow(k).getCell(i);
					
					if(readcfname.getStringCellValue() != null)
					writefname.setCellValue(readcfname.getStringCellValue());
					++i;
				}
				if(add)
				{
					Cell readcfname = readracpc.getCell(6);
					readcfname = readshacpc.getRow(j).getCell(6);
					
					Cell writefname = writeout.createCell(i);
					writefname = writeworksheet.getRow(k).getCell(i);
					
					if(readcfname.getStringCellValue() != null)
					writefname.setCellValue(readcfname.getStringCellValue());
					++i;
				}
				if(pcontact)
				{
					Cell readcfname = readracpc.getCell(10);
					readcfname = readshacpc.getRow(j).getCell(10);
					
					Cell writefname = writeout.createCell(i);
					writefname = writeworksheet.getRow(k).getCell(i);
					
					if(readcfname.getStringCellValue() != null)
					writefname.setCellValue(readcfname.getStringCellValue());
					++i;
				}	
				if(scontact)
				{
					Cell readcfname = readracpc.getCell(11);
					readcfname = readshacpc.getRow(j).getCell(11);
					
					Cell writefname = writeout.createCell(i);
					writefname = writeworksheet.getRow(k).getCell(i);
					
					if(readcfname.getStringCellValue() != null)
					writefname.setCellValue(readcfname.getStringCellValue());
					++i;
				}
				if(email)
				{
					Cell readcfname = readracpc.getCell(12);
					readcfname = readshacpc.getRow(j).getCell(12);
					
					Cell writefname = writeout.createCell(i);
					writefname = writeworksheet.getRow(k).getCell(i);
					
					if(readcfname.getStringCellValue() != null)
					writefname.setCellValue(readcfname.getStringCellValue());
					++i;
				}
				if(cat)
				{
					Cell readcfname = readracpc.getCell(13);
					readcfname = readshacpc.getRow(j).getCell(13);
					
					Cell writefname = writeout.createCell(i);
					writefname = writeworksheet.getRow(k).getCell(i);
					
					if(readcfname.getStringCellValue() != null)
					writefname.setCellValue(readcfname.getStringCellValue());
					++i;
				}
				if(fatincome)
				{
					Cell readcfname = readracpc.getCell(19);
					readcfname = readshacpc.getRow(j).getCell(19);
					
					Cell writefname = writeout.createCell(i);
					writefname = writeworksheet.getRow(k).getCell(i);
					
					if(readcfname.getStringCellValue() != null)
					writefname.setCellValue(readcfname.getStringCellValue());
					++i;
				}
				if(admtype)
				{
					Cell readcfname = readracpc.getCell(26);
					readcfname = readshacpc.getRow(j).getCell(26);
					
					Cell writefname = writeout.createCell(i);
					writefname = writeworksheet.getRow(k).getCell(i);
					
					if(readcfname.getStringCellValue() != null)
					writefname.setCellValue(readcfname.getStringCellValue());
					++i;
				}
				if(board)
				{
					Cell readcfname = readracpc.getCell(30);
					readcfname = readshacpc.getRow(j).getCell(30);
					
					Cell writefname = writeout.createCell(i);
					writefname = writeworksheet.getRow(k).getCell(i);
					
					if(readcfname.getStringCellValue() != null)
					writefname.setCellValue(readcfname.getStringCellValue());
					++i;
				}
				if(jeescore)
				{
					Cell readcfname = readracpc.getCell(35);
					readcfname = readshacpc.getRow(j).getCell(35);
					
					Cell writefname = writeout.createCell(i);
					writefname = writeworksheet.getRow(k).getCell(i);
					
					if(readcfname.getStringCellValue() != null)
					writefname.setCellValue(readcfname.getStringCellValue());
					++i;
				}
				if(jeeroll)
				{
					Cell readcfname = readracpc.getCell(37);
					readcfname = readshacpc.getRow(j).getCell(37);
					
					Cell writefname = writeout.createCell(i);
					writefname = writeworksheet.getRow(k).getCell(i);
					
					if(readcfname.getStringCellValue() != null)
					writefname.setCellValue(readcfname.getStringCellValue());
					++i;
				}
				if(acpcrank)
				{
					Cell readcfname = readracpc.getCell(38);
					readcfname = readshacpc.getRow(j).getCell(38);
					
					Cell writefname = writeout.createCell(i);
					writefname = writeworksheet.getRow(k).getCell(i);
	
					if(((int)readcfname.getNumericCellValue()) != 0)
					writefname.setCellValue((readcfname.getNumericCellValue()));
					++i;
				}
				if(admstat)
				{
					Cell readcfname = readracpc.getCell(40);
					readcfname = readshacpc.getRow(j).getCell(40);
					
					Cell writefname = writeout.createCell(i);
					writefname = writeworksheet.getRow(k).getCell(i);
					
					if(readcfname.getStringCellValue() != null)
					writefname.setCellValue(readcfname.getStringCellValue());
					++i;
				}
				if(yearofjoin)
				{
					Cell readcfname = readracpc.getCell(41);
					readcfname = readshacpc.getRow(j).getCell(41);
					
					Cell writefname = writeout.createCell(i);
					writefname = writeworksheet.getRow(k).getCell(i);

					if(((int)readcfname.getNumericCellValue()) != 0)
					writefname.setCellValue(readcfname.getNumericCellValue());
				}				

			}
	
			
			for(int l = 1; l<= readlastnrispon; l++,k++)
			{
				int i = 0;
				Row readnrispon = readshnrispon.getRow(l);
				Row writeout = writeworksheet.createRow(k);
				
				if(fname)
				{
					Cell readcfname = readnrispon.getCell(1);
					readcfname = readshnrispon.getRow(l).getCell(1);
					
					Cell writefname = writeout.createCell(i);
					writefname = writeworksheet.getRow(k).getCell(i);
					
					writefname.setCellValue(readcfname.getStringCellValue());
					++i;
				}
				if(lname)
				{
					Cell readcfname = readnrispon.getCell(3);
					readcfname = readshnrispon.getRow(l).getCell(3);
					
					Cell writefname = writeout.createCell(i);
					writefname = writeworksheet.getRow(k).getCell(i);
					
					writefname.setCellValue(readcfname.getStringCellValue());
					++i;
				}
				if(gen)
				{
					Cell readcfname = readnrispon.getCell(4);
					readcfname = readshnrispon.getRow(l).getCell(4);
					
					Cell writefname = writeout.createCell(i);
					writefname = writeworksheet.getRow(k).getCell(i);
					
					writefname.setCellValue(readcfname.getStringCellValue());
					++i;
				}
				if(add)
				{
					Cell readcfname = readnrispon.getCell(6);
					readcfname = readshacpc.getRow(l).getCell(6);
					
					Cell writefname = writeout.createCell(i);
					writefname = writeworksheet.getRow(k).getCell(i);
					
					writefname.setCellValue(readcfname.getStringCellValue());
					++i;
				}
				if(pcontact)
				{
					Cell readcfname = readnrispon.getCell(10);
					readcfname = readshnrispon.getRow(l).getCell(10);
					
					Cell writefname = writeout.createCell(i);
					writefname = writeworksheet.getRow(k).getCell(i);
					
					writefname.setCellValue(readcfname.getStringCellValue());
					++i;
				}
				if(scontact)
				{
					Cell readcfname = readnrispon.getCell(11);
					readcfname = readshacpc.getRow(l).getCell(11);
					
					Cell writefname = writeout.createCell(i);
					writefname = writeworksheet.getRow(k).getCell(i);
					
					writefname.setCellValue(readcfname.getStringCellValue());
					++i;
				}
				if(email)
				{
					Cell readcfname = readnrispon.getCell(12);
					readcfname = readshnrispon.getRow(l).getCell(12);
					
					Cell writefname = writeout.createCell(i);
					writefname = writeworksheet.getRow(k).getCell(i);
					
					writefname.setCellValue(readcfname.getStringCellValue());
					++i;
				}
				if(cat)
				{
					Cell readcfname = readnrispon.getCell(13);
					readcfname = readshnrispon.getRow(l).getCell(13);
					
					Cell writefname = writeout.createCell(i);
					writefname = writeworksheet.getRow(k).getCell(i);
					
					writefname.setCellValue(readcfname.getStringCellValue());
					++i;
				}
				if(fatincome)
				{
					Cell readcfname = readnrispon.getCell(19);
					readcfname = readshnrispon.getRow(l).getCell(19);
					
					Cell writefname = writeout.createCell(i);
					writefname = writeworksheet.getRow(k).getCell(i);
					
					writefname.setCellValue(readcfname.getStringCellValue());
					++i;
				}
				if(admtype)
				{
					Cell readcfname = readnrispon.getCell(26);
					readcfname = readshnrispon.getRow(l).getCell(26);
					
					Cell writefname = writeout.createCell(i);
					writefname = writeworksheet.getRow(k).getCell(i);
					
					writefname.setCellValue(readcfname.getStringCellValue());
					++i;
				}
				if(board)
				{
					Cell readcfname = readnrispon.getCell(30);
					readcfname = readshnrispon.getRow(l).getCell(30);
					
					Cell writefname = writeout.createCell(i);
					writefname = writeworksheet.getRow(k).getCell(i);
					
					writefname.setCellValue(readcfname.getStringCellValue());
					++i;
				}
				if(jeescore)
				{
					Cell readcfname = readnrispon.getCell(35);
					readcfname = readshnrispon.getRow(l).getCell(35);
					
					Cell writefname = writeout.createCell(i);
					writefname = writeworksheet.getRow(k).getCell(i);
					
					writefname.setCellValue(readcfname.getStringCellValue());
					++i;
				}
				if(jeeroll)
				{
					Cell readcfname = readnrispon.getCell(37);
					readcfname = readshnrispon.getRow(l).getCell(37);
					
					Cell writefname = writeout.createCell(i);
					writefname = writeworksheet.getRow(k).getCell(i);
					
					writefname.setCellValue(readcfname.getStringCellValue());
					++i;
				}
				if(acpcrank)
				{
					Cell readcfname = readnrispon.getCell(38);
					readcfname = readshnrispon.getRow(l).getCell(38);
					
					Cell writefname = writeout.createCell(i);
					writefname = writeworksheet.getRow(k).getCell(i);
					
					writefname.setCellValue(readcfname.getNumericCellValue());
					++i;
				}
				if(admstat)
				{
					Cell readcfname = readnrispon.getCell(47);
					readcfname = readshnrispon.getRow(l).getCell(47);
					
					Cell writefname = writeout.createCell(i);
					writefname = writeworksheet.getRow(k).getCell(i);
					
					writefname.setCellValue(readcfname.getStringCellValue());
					++i;
				}
				if(yearofjoin)
				{
					Cell readcfname = readnrispon.getCell(48);
					readcfname = readshnrispon.getRow(l).getCell(48);
					
					Cell writefname = writeout.createCell(i);
					writefname = writeworksheet.getRow(k).getCell(i);
					
					writefname.setCellValue(readcfname.getNumericCellValue());
				}
			}
					
			for(int m = 1; m<= readlastnri; m++,k++)
			{
				int i = 0;
				Row readnri = readshnri.getRow(m);
				Row writeout = writeworksheet.createRow(k);

				if(fname)
				{
					Cell readcfname = readnri.getCell(1);
					readcfname = readshnri.getRow(m).getCell(1);
					
					Cell writefname = writeout.createCell(i);
					writefname = writeworksheet.getRow(k).getCell(i);
					
					writefname.setCellValue(readcfname.getStringCellValue());
					++i;
				}
				if(lname)
				{
					Cell readcfname = readnri.getCell(3);
					readcfname = readshnri.getRow(m).getCell(3);
					
					Cell writefname = writeout.createCell(i);
					writefname = writeworksheet.getRow(k).getCell(i);
					
					writefname.setCellValue(readcfname.getStringCellValue());
					++i;
				}
				if(gen)
				{
					Cell readcfname = readnri.getCell(4);
					readcfname = readshnri.getRow(m).getCell(4);
					
					Cell writefname = writeout.createCell(i);
					writefname = writeworksheet.getRow(k).getCell(i);
					
					writefname.setCellValue(readcfname.getStringCellValue());
					++i;
				}
				if(add)
				{
					Cell readcfname = readnri.getCell(6);
					readcfname = readshacpc.getRow(m).getCell(6);
					
					Cell writefname = writeout.createCell(i);
					writefname = writeworksheet.getRow(k).getCell(i);
					
					writefname.setCellValue(readcfname.getStringCellValue());
					++i;
				}
				if(pcontact)
				{
					Cell readcfname = readnri.getCell(10);
					readcfname = readshnri.getRow(m).getCell(10);
					
					Cell writefname = writeout.createCell(i);
					writefname = writeworksheet.getRow(k).getCell(i);
					
					writefname.setCellValue(readcfname.getStringCellValue());
					++i;
				}
				if(scontact)
				{
					Cell readcfname = readnri.getCell(11);
					readcfname = readshacpc.getRow(m).getCell(11);
					
					Cell writefname = writeout.createCell(i);
					writefname = writeworksheet.getRow(k).getCell(i);
					
					writefname.setCellValue(readcfname.getStringCellValue());
					++i;
				}
				if(email)
				{
					Cell readcfname = readnri.getCell(12);
					readcfname = readshnri.getRow(m).getCell(12);
					
					Cell writefname = writeout.createCell(i);
					writefname = writeworksheet.getRow(k).getCell(i);
					
					writefname.setCellValue(readcfname.getStringCellValue());
					++i;
				}
				if(cat)
				{
					Cell readcfname = readnri.getCell(13);
					readcfname = readshnri.getRow(m).getCell(13);
					
					Cell writefname = writeout.createCell(i);
					writefname = writeworksheet.getRow(k).getCell(i);
					
					writefname.setCellValue(readcfname.getStringCellValue());
					++i;
				}
				if(fatincome)
				{
					Cell readcfname = readnri.getCell(19);
					readcfname = readshnri.getRow(m).getCell(19);
					
					Cell writefname = writeout.createCell(i);
					writefname = writeworksheet.getRow(k).getCell(i);
					
					writefname.setCellValue(readcfname.getStringCellValue());
					++i;
				}
				if(admtype)
				{
					Cell readcfname = readnri.getCell(26);
					readcfname = readshnri.getRow(m).getCell(26);
					
					Cell writefname = writeout.createCell(i);
					writefname = writeworksheet.getRow(k).getCell(i);
					
					writefname.setCellValue(readcfname.getStringCellValue());
					++i;
				}
				if(board)
				{
					++i;
				}
				if(jeescore)
				{
					++i;
				}
				if(jeeroll)
				{
					++i;
				}
				if(acpcrank)
				{
					++i;
				}
				if(admstat)
				{
					Cell readcfname = readnri.getCell(33);
					readcfname = readshnri.getRow(m).getCell(33);
					
					Cell writefname = writeout.createCell(i);
					writefname = writeworksheet.getRow(k).getCell(i);
					
					writefname.setCellValue(readcfname.getStringCellValue());
					++i;
				}
				if(yearofjoin)
				{
					Cell readcfname = readnri.getCell(34);
					readcfname = readshnri.getRow(m).getCell(34);
					
					Cell writefname = writeout.createCell(i);
					writefname = writeworksheet.getRow(k).getCell(i);
					
					writefname.setCellValue(readcfname.getNumericCellValue());
				}				
			}

		
			writeworkbook.write(writefwrite);
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

/*
if(fname.booleanValue())
{
	int k = 0;
	for(int j = 0; j<=readlastacpc; j++,k++)
	{
		Row readracpc = readshacpc.getRow(j);
		Cell readcfname = readracpc.getCell(1);
		readcfname = readshacpc.getRow(j).getCell(1);

		Row writeout = writeworksheet.createRow(k);
		Cell writefname = writeout.createCell(i);
		writefname = writeworksheet.getRow(k).getCell(i);
		
		writefname.setCellValue(readcfname.getStringCellValue());
	}
	
	for(int l = 1; l<= readlastnrispon; l++,k++)
	{
		Row readnrispon = readshnrispon.getRow(l);
		Cell readcfname = readnrispon.getCell(1);
		readcfname = readshnrispon.getRow(l).getCell(1);
		
		Row writeout = writeworksheet.createRow(k);
		Cell writefname = writeout.createCell(i);
		writefname = writeworksheet.getRow(k).getCell(i);
		
		writefname.setCellValue(readcfname.getStringCellValue());										
	}
	
	for(int m = 1; m<= readlastnri; m++,k++)
	{
		Row readnri = readshnri.getRow(m);
		Cell readcfname = readnri.getCell(1);
		readcfname = readshnri.getRow(m).getCell(1);
		
		Row writeout = writeworksheet.createRow(k);
		Cell writefname = writeout.createCell(i);
		writefname = writeworksheet.getRow(k).getCell(i);
		
		writefname.setCellValue(readcfname.getStringCellValue());										
	}
	writeworkbook.write(writefwrite);
	
	writefwrite.close();
	writefread.close();
	readfread.close();
	++i;
}

if(lname.booleanValue())
{
	int k = 0;
	for(int j = 0; j<=readlastacpc; j++,k++)
	{
		Row readracpc = readshacpc.getRow(j);
		Cell readcfname = readracpc.getCell(3);
		readcfname = readshacpc.getRow(j).getCell(3);

		Row writeout = writeworksheet.createRow(k);
		Cell writefname = writeout.createCell(i);
		writefname = writeworksheet.getRow(k).getCell(i);
		
		writefname.setCellValue(readcfname.getStringCellValue());
	}
	
	for(int l = 1; l<= readlastnrispon; l++,k++)
	{
		Row readnrispon = readshnrispon.getRow(l);
		Cell readcfname = readnrispon.getCell(3);
		readcfname = readshnrispon.getRow(l).getCell(3);
		
		Row writeout = writeworksheet.createRow(k);
		Cell writefname = writeout.createCell(i);
		writefname = writeworksheet.getRow(k).getCell(i);
		
		writefname.setCellValue(readcfname.getStringCellValue());										
	}
	
	for(int m = 1; m<= readlastnri; m++,k++)
	{
		Row readnri = readshnri.getRow(m);
		Cell readcfname = readnri.getCell(1);
		readcfname = readshnri.getRow(m).getCell(1);
		
		Row writeout = writeworksheet.createRow(k);
		Cell writefname = writeout.createCell(i);
		writefname = writeworksheet.getRow(k).getCell(i);
		
		writefname.setCellValue(readcfname.getStringCellValue());										
	}
	writeworkbook.write(writefwrite);
	
	writefwrite.close();
	writefread.close();
	readfread.close();
	++i;
}
*/
