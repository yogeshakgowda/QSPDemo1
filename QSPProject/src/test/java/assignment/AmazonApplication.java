package assignment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonApplication {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 13", Keys.ENTER);
		FileInputStream fis = new FileInputStream("./src/test/resources/Credentials.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.createSheet("mobilePrice");
		
		List<WebElement> mobiles = driver.findElements(By.xpath(
				"//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']/span"));
		
		int rownum=0;
			for (WebElement mobile : mobiles) {
				
				String mobilename = mobile.getText();
				
				sheet.createRow(rownum++).createCell(0).setCellValue(mobilename);				
			}
			List<WebElement> prices = driver.findElements(By.xpath(
					"//span[@class='a-price-whole']"));
			
			int rownum1=0;
				for (WebElement mobileprice : prices) {
					
					String price = mobileprice.getText();
					
					sheet.createRow(rownum1++).createCell(1).setCellValue(price);	
					
				}
			
		FileOutputStream fOut = new FileOutputStream("./src/test/resources/Credentials.xlsx");
		workbook.write(fOut);
		workbook.close();

	}

}
