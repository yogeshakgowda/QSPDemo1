package com.tyss.demo.GenericUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	public  WebDriverUtility wUtil= new WebDriverUtility();
	public FileUtility fUtil= new FileUtility();
	public  WebDriver driver;
	public static WebDriver sdriver;
	
	
	//@Parameters("BROWSER")
	@BeforeClass
	public void launchTheBrowser() throws IOException {
	
		String BROWSER = fUtil.readDataFromPropertyFile("browser");
		
		if(BROWSER.equalsIgnoreCase("chrome")) {
			driver= new ChromeDriver();
		}

		else if(BROWSER.equalsIgnoreCase("firefox")) {
			driver= new FirefoxDriver();
		}
		else if(BROWSER.equalsIgnoreCase("edge")) {
			driver= new EdgeDriver();
		}		
		wUtil.maximizeWindow(driver);
		Reporter.log("Browser launched ", true);
		
		
	}
	
	
	@BeforeMethod
	public void loginToApplication() throws Throwable {
	String URL1 = fUtil.readDataFromPropertyFile("url1");
	String URL2 = fUtil.readDataFromPropertyFile("url2");
	wUtil.implicitWait(driver, 10);
	sdriver= driver;
	driver.get(URL1);
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get(URL2);
	sdriver= driver;
	}
	
	
	
	@AfterClass
	public void closeTheBrowser() {
		driver.quit();

}
	
	
}
