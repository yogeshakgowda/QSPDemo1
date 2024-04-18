package qspAppsPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickActionsTest {

	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/button/buttonRight?sublist=1");
		WebElement rightClickBtn = driver.findElement(By.xpath("//button[@id='btn30']"));
		Actions action = new Actions(driver);
		action.contextClick(rightClickBtn).build().perform();
		WebElement yesOption = driver.findElement(By.xpath("//div[text()='Yes']"));
		action.click(yesOption).perform();
		
		

	}

}
