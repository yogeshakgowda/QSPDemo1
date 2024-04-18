package qspAppsPractice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUltils.WebdriverUtilities;

public class MultiplePopUpWindow {

	public static void main(String[] args) {
		WebdriverUtilities utils = new WebdriverUtilities();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.get("https://demoapps.qspiders.com/ui/browser/multipleWindow?sublist=2");
	    driver.findElement(By.id("browserButton3")).click();
	    utils.switchWindow(driver, "Login");
	    driver.findElement(By.id("username")).sendKeys("abc@gmail.com");
	    driver.close();
	    utils.switchWindow(driver, "SignUp");
	    driver.findElement(By.id("username")).sendKeys("abc@gmail.com");
	    driver.close();
		}

	}


