package classes;


import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;

import javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import java.awt.Rectangle;
import java.io.File;
public class PrintDonation {
	
	public static void PrintBon(Incomes inc) throws DocumentException, MalformedURLException, IOException
	{		
		Image image = Image.getInstance("res//mosque.jpg");

        image.scaleToFit(75,75); 
		Document document=new Document(PageSize.A5, 10, 10, 10, 10);
		  PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(new File("Donations//"+String.valueOf(inc.getIdDonateur()+".pdf"))));
		 Font f = new Font(Font.FontFamily.TIMES_ROMAN, 10, Font.BOLD);
		  document.open();
		  
		  PdfPTable tablea = new PdfPTable(3);
		  //  tablea.setWidthPercentage(100);
		    
		  PdfPCell cell1;
		    cell1 = new PdfPCell();
		    cell1.setBorder(0);
		    cell1.addElement(image);

		    cell1.setBorderWidth(0); // remove the border

		    cell1.setPadding(5);
		    tablea.addCell(cell1);
		    cell1 = new PdfPCell(new Phrase("BON",f));
		    cell1.setHorizontalAlignment(1);
		    cell1.setBorder(0);
		    tablea.addCell(cell1);
		    
		    cell1 = new PdfPCell();
		    cell1.setBorder(0);
		    cell1.addElement(image);

		    cell1.setBorderWidth(0); // remove the border

		    cell1.setPadding(5);
		    tablea.addCell(cell1);
		    
		    tablea.setHorizontalAlignment(Element.ALIGN_CENTER); 
		    document.add(tablea);
		    
		    Paragraph paragraph;

		  paragraph=new Paragraph("Nom: "+ inc.getNomI(),f);
		  paragraph.setAlignment(1);
		  document.add(paragraph);

		  paragraph=new Paragraph("Prenom: "+ inc.getPrenomI(),f);
		  paragraph.setAlignment(1);
		  document.add(paragraph);
		  
		  paragraph=new Paragraph("Montant/Matériel: " + inc.getDonationString(),f);
		  paragraph.setAlignment(1);
		  document.add(paragraph);
		  
		  paragraph=new Paragraph("N'Gaous Le: " + inc.getDate(),f);
		  paragraph.setAlignment(1);
		  document.add(paragraph);
		  
		  document.close();
		  
	}
	

}
