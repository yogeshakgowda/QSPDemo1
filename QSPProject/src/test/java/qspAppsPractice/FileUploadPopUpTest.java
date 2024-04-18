package qspAppsPractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUltils.WebdriverUtilities;

public class FileUploadPopUpTest {

	public static void main(String[] args) throws AWTException {
	
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//	    driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
//	    WebElement uploadOption = driver.findElement(By.id("fileInput"));
//	    uploadOption.sendKeys("C:\\Users\\a\\Downloads\\wallpaperflare.com_wallpaper (2).jpg");
	    
// the default button
		driver.get("https://demoapps.qspiders.com/ui/fileUpload/custom?sublist=1");
	    WebElement uploadOption = driver.findElement(By.xpath("//section[@id='customButton']//div[text()='Upload File']"));
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    String filePath="C:\\Users\\a\\Downloads\\wallpaperflare.com_wallpaper (1).jpg";
	    
 
//multi select file upload
//		driver.get("https://demoapps.qspiders.com/ui/fileUpload/multiple?sublist=3");
//	    WebElement uploadOption1 = driver.findElement(By.id("fileInput"));
//	    uploadOption.sendKeys("C:\\Users\\a\\Downloads\\wallpaperflare.com_wallpaper (2).jpg");
//	    uploadOption.sendKeys("C:\\Users\\a\\Downloads\\wallpaperflare.com_wallpaper (2).jpg");
//	    uploadOption.sendKeys(System.getProperty("user.dir")+"/src/test/resources/wallpaperflare.com_wallpaper (2).jpg");
//	    
//	    List<WebElement> filenames = driver.findElements(By.xpath("//li[@class='flex']"));
//	    for (WebElement file : filenames) {
//	    	System.out.println(file.getText());
//			
//		}
	}

}
