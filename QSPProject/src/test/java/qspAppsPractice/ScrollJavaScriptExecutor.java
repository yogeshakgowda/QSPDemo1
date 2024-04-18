package qspAppsPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollJavaScriptExecutor {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://demoapps.qspiders.com/ui/scroll");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//launching the browser using JavaScriptExecutor
		jse.executeScript("window.location=arguments[0]", "https://demoapps.qspiders.com/ui/scroll");
//		String sText =  jse.executeScript("return document.title;").toString();
//		System.out.println(sText);
//		WebElement ele = driver.findElement(By.xpath("//span[.='Write a script to horizontally scroll the page?']"));
//		String sText =  (String)jse.executeScript("return arguments[0].innerText;", ele);
//		System.out.println(sText);
		

	}

}
