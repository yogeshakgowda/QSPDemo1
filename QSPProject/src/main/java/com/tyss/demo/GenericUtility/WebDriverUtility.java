package com.tyss.demo.GenericUtility;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {

	/**
	 * This method is used to maximize the browser window
	 * 
	 * @param driver
	 */
	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}

	/**
	 * This method is used to provide Implicit wait to the WebElement
	 * 
	 * @param driver
	 */
	public void implicitWait(WebDriver driver, int sec) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}

	/**
	 * This method is used to provide pageloadTimeOut
	 * 
	 * @param driver
	 * @param sec
	 */
	public void pageLoadingTimeOut(WebDriver driver, int sec) {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(sec));
	}
	
	
	/**
	 * 
	 * This method is used to take the screen shot
	 * 
	 * @param driver
	 * @param screenShotName
	 * @return
	 * @throws IOException
	 */

	public static String getScreenShot(WebDriver driver, String screenShotName) throws IOException {
		TakesScreenshot tss = (TakesScreenshot) driver;
		File temp = tss.getScreenshotAs(OutputType.FILE);
		String Path = "./ScreenShot/" + screenShotName + ".png";
		File perm = new File(Path);
		String srcpath = perm.getAbsolutePath();
		FileUtils.copyFile(temp, perm);
		return srcpath;

}
}
