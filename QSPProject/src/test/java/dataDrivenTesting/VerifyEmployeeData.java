package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class VerifyEmployeeData {
	public static String eID = "E00644";

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/employee.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("Data");
		int rowCount = sheet.getLastRowNum();
		int cellCount = sheet.getRow(0).getLastCellNum();
		for (int i = 0; i <= rowCount; i++) {
			for (int j = 0; j < cellCount; j++) {
				if (sheet.getRow(i).getCell(0).getStringCellValue().contains(eID)) {
					String value = sheet.getRow(i).getCell(j).getStringCellValue();
					String value1 = sheet.getRow(0).getCell(j).getStringCellValue();
					System.out.print(value1+"->");
					System.out.print(value + ", ");
					

				}
				

			}

		}

	}
}
