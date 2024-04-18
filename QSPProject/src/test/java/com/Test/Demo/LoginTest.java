package com.Test.Demo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.tyss.demo.GenericUtility.FileUtility;
import com.tyss.demo.GenericUtility.WebDriverUtility;

public class LoginTest {

	@Test
	public void login(String UserName,String Password) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		WebDriverUtility wLib=new WebDriverUtility();
		FileUtility pObj=new FileUtility();
		String URL=pObj.readDataFromPropertyFile("url1");
		driver.get(URL);
		wLib.maximizeWindow(driver);
		wLib.implicitWait(driver, 10);
		
		
	}
	
	
	
	
}
