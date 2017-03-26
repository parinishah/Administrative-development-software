package sprj_DataStorage;

import java.io.FileOutputStream;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;

public class PDFconversion 
{
	public void savetopdf(String roll, String info) throws Exception
	{
		try
		{
			//System.out.println(roll);
			String filename = javax.swing.filechooser.FileSystemView.getFileSystemView().getHomeDirectory() + "/" + roll + ".pdf";
			Document docu = new Document();
			FileOutputStream fwrite = new FileOutputStream(filename);
			
			PdfWriter pdfwrite = PdfWriter.getInstance(docu,fwrite);
			docu.open();
			docu.add(new Paragraph(info));
			docu.addTitle(roll);
			docu.addAuthor("Administration Department: SEAS, Ahmedabad University");
			docu.addSubject("Individual Information of the Specified Student with the Given Roll Number");
			
			docu.close();
			pdfwrite.close();
		}
		catch(Exception err)
		{
			
			throw err;
		}

	}
}
