package qspAppsPractice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptPopupHandlingTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");
	    driver.findElement(By.id("buttonAlert1")).click();
	    Alert alert = driver.switchTo().alert();
	    System.out.println(alert.getText());
	    alert.sendKeys("yes");
	    alert.accept();
	    

	}

}
