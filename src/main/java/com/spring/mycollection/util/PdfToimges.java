package com.spring.mycollection.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PdfToimges {

	private static final Logger logger = LoggerFactory.getLogger(PdfToimges.class);




/*

	public void saveUploadedFile(String pdfFilename) {

		int pageCounter = 0;
		logger.info("PdfToimges Ŭ������ ���Դ�");
		
		PDDocument document;
		try {
			document = PDDocument.load(new File(pdfFilename));

			PDFRenderer pdfRenderer = new PDFRenderer(document);

			for (PDPage page : document.getPages()) {
				// note that the page number parameter is zero based
				BufferedImage bim = pdfRenderer.renderImageWithDPI(pageCounter, 300, ImageType.RGB);

				logger.info("�̹�����" + page + "  /   name " + pdfFilename);
				// suffix in filename will be used as the file format
				ImageIOUtil.writeImage(bim, pdfFilename + "-" + (pageCounter++) + ".png", 300);
			}
			logger.info("�� �̹�����" + pageCounter);
			document.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
	}
	*/
}
