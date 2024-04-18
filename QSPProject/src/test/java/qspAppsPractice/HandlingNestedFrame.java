package qspAppsPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingNestedFrame {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='w-full h-96']")));
		String email = driver.findElement(By.xpath("//p[text()='Admin@gmail.com']")).getText();
		String defaultPassword = driver.findElement(By.xpath("(//p[text()='Admin@1234'])[1]")).getText();
		String confirmDefaultPassword = driver.findElement(By.xpath("(//p[text()='Admin@1234'])[2]")).getText();
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='form_container']/iframe")));
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(defaultPassword);
		driver.findElement(By.id("confirm-password")).sendKeys(confirmDefaultPassword);
		driver.findElement(By.id("submitButton")).click();
		
	}

}
