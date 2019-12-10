package v1;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;



public class HelloWorld {
	
	public static final String DEST = "results/chapter1/hello_world.pdf";
	
	public static void main(String args[]) throws IOException {
		File file = new File(DEST);
		file.getParentFile().mkdirs();
		new HelloWorld().createPdf(DEST);
	}
	
	public void createPdf(String dest) throws IOException {
		//Initialize PDF Writer
		FileOutputStream fos = new FileOutputStream(dest);
		PdfWriter writer = new PdfWriter(fos);
		
		//Initialize PDF document
		
		PdfDocument pdf = new PdfDocument(writer);
		
		//Initialize document
		Document document = new Document(pdf);
		
		//Add paragraph to the document
		document.add(new Paragraph("Hello World! Este é um teste do dia 12 de dezembro"));
		
		//Close Document
		document.close();
		
		
	}
	

}
