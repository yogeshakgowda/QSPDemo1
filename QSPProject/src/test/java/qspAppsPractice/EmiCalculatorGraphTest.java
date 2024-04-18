package qspAppsPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EmiCalculatorGraphTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://emicalculator.net/");
	    List<WebElement> charts = driver.findElements(By.cssSelector("path[class='highcharts-point']"));
	   Actions action = new Actions(driver);
			   
	    for (WebElement chart : charts) {
	    	action.moveToElement(chart).perform();
	    	System.out.println(chart.getAttribute("d"));
	    	
		}

	}

}
