package qspAppsPractice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowPopupTest {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
	    driver.findElement(By.id("browserLink1")).click();
	    Set<String> allWIds = driver.getWindowHandles();
	    for (String wId : allWIds) {
			
	    	String windowUrl = driver.switchTo().window(wId).getCurrentUrl();
	    	if(windowUrl.equals("https://demoapps.qspiders.com/ui/browser/SignUpPage")) {
	    		driver.findElement(By.id("email")).sendKeys("Abhay@gmail.com");
	    		driver.findElement(By.id("password")).sendKeys("password@1");
	    		driver.findElement(By.id("confirm-password")).sendKeys("password@1");
//	    		driver.findElement(By.xpath("//button")).click();
	    	}
		}
	    
	   

	}

}
