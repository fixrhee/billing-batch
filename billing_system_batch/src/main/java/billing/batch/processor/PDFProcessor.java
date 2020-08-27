package billing.batch.processor;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.xhtmlrenderer.pdf.ITextRenderer;
import com.lowagie.text.DocumentException;

public class PDFProcessor {

	public void createPDF(String invoiceNo, String payload) throws DocumentException, IOException {
		String outputFile = invoiceNo + ".pdf";
		OutputStream os = new FileOutputStream(outputFile);
		ITextRenderer renderer = new ITextRenderer();
		renderer.setDocumentFromString(payload);
		renderer.layout();
		renderer.createPDF(os);
		os.close();
	}
}
