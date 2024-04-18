package qspAppsPractice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import genericUltils.WebdriverUtilities;

public class WindowPopUpHandling {

	public static void main(String[] args) {
		WebdriverUtilities utils= new WebdriverUtilities();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//a[text()=' BUSES ']")).click();
		utils.switchWindow(driver, "www.bus.irctc.co.in/home");
		
				Actions action = new Actions(driver);

				action.sendKeys(driver.findElement(By.id("departFrom")), "Ranchi").pause(2000).perform();
				action.click(driver.findElement(By.xpath("//li[@class='ui-menu-item']")))
						.sendKeys(driver.findElement(By.id("goingTo")), "Delhi").pause(2000).perform();
				action.click(driver.findElement(By.xpath("//div[.='Delhi']"))).perform();
				action.click(driver.findElement(By.xpath("//a[text()='15']"))).perform();
				action.click(driver.findElement(By.xpath("//button[text()='Search Bus ']"))).perform();
				//driver.close();
				
			
			
//			utils.switchWindow(driver, "train-search");
//			driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
			
			

		}

	}


