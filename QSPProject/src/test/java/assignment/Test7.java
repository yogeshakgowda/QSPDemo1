package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test7 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		WebElement appliances = driver.findElement(By.xpath("//span[.='Appliances']"));
		appliances.click();
		Thread.sleep(2000);
		WebElement tvAppliences = driver.findElement(By.xpath("//span[.='TVs & Appliances']"));
		Actions action = new Actions(driver);
		action.moveToElement(tvAppliences).perform();
		driver.findElement(By.xpath("//a[.='Samsung']")).click();

	}

}
