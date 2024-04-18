package qspAppsPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingSingleFrameTest {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/frames?sublist=0");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
		driver.findElement(By.id("username")).sendKeys("abc");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.id("submitButton")).submit();
	}

}
