package qspAppsPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedWithMultiple {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/frames/nestedWithMultiple?sublist=3");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='w-full h-96']")));
		String email = driver.findElement(By.xpath("//p[text()='Admin@gmail.com']")).getText();
		String defaultPassword = driver.findElement(By.xpath("(//p[text()='Admin@1234'])[1]")).getText();
		//String defaultPassword = driver.findElement(By.xpath("//p[.,'Default Password']"+"/following-sibling::p")).getText();
		String confirmDefaultPassword = driver.findElement(By.xpath("(//p[text()='Admin@1234'])[2]")).getText();
		WebElement mutiframe = driver.findElement(By.xpath("//div[@class='form_container']//iframe"));
		driver.switchTo().frame(mutiframe);
		driver.switchTo().frame(0);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(1);
		driver.findElement(By.id("password")).sendKeys(defaultPassword);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(2);
		driver.findElement(By.id("confirm")).sendKeys(confirmDefaultPassword);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(3);
		driver.findElement(By.id("submitButton")).click();
		


	}

}
