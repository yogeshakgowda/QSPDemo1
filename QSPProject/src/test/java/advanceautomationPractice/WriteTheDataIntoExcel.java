package advanceautomationPractice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteTheDataIntoExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/Credentials.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.createSheet("B");
		sheet.createRow(1).createCell(0).setCellValue("Name");
		sheet.getRow(1).createCell(1).setCellValue("Email");
		sheet.getRow(1).createCell(2).setCellValue("Mobile");
		sheet.getRow(1).createCell(3).setCellValue("Address");
		
		FileOutputStream fOut = new FileOutputStream("./src/test/resources/Credentials.xlsx");
		workbook.write(fOut);
		workbook.close();

	}

}
