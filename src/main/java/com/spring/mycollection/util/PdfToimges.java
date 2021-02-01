package com.spring.mycollection.util;

import java.io.File;


import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

public class PdfToimges {
	@SuppressWarnings("unchecked")
	public static void main(String args) throws Exception {

		PDDocument document = new PDDocument();
		PDPage newPage = new PDPage();
		document.addPage(newPage);
		document.save(new File("C:/Users/test.pdf"));
		document.close();

	}
}
