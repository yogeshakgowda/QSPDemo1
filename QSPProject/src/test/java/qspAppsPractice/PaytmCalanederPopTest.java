package qspAppsPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PaytmCalanederPopTest {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tickets.paytm.com/flights/");
		driver.findElement(By.xpath("//label[text()='Round Trip']")).click();// round tripcheckbox
		WebElement fromDropdown = driver.findElement(By.id("srcCode"));
		fromDropdown.click();
		WebElement fromTextBox = driver.findElement(By.id("text-box"));
		Actions action = new Actions(driver);
		action.keyDown(fromTextBox, Keys.CONTROL).sendKeys(fromTextBox, "a").keyUp(fromTextBox, Keys.CONTROL)
				.sendKeys("bengalore").perform();
		List<WebElement> fromOptions = driver.findElements(By.xpath("//div[@class='_2wpHf']"));
		for (WebElement option : fromOptions) {
			String cityText = option.getText();
			if(cityText.contains("Bengaluru"))
			{
				option.click();
				break;
			}	
		}
		WebElement toDropdown = driver.findElement(By.id("destCode"));
		toDropdown.click();
		WebElement toTextBox = driver.findElement(By.id("text-box"));
		action.keyDown(toTextBox, Keys.CONTROL).sendKeys(toTextBox, "a").keyUp(toTextBox, Keys.CONTROL)
				.sendKeys("Delhi").perform();
		List<WebElement> toOptions = driver.findElements(By.xpath("//div[@class='_2wpHf']"));
		for (WebElement option : toOptions) {
			String cityText = option.getText();
			if(cityText.contains("Delhi"))
			{
				option.click();	
				break;
				
			}
		
		}
		WebElement departureDate = driver.findElement(By.id("departureDate"));
		departureDate.click();
		driver.findElement(By.xpath("//div[text()='15']")).click();
		driver.findElement(By.xpath("//div[text()='17']")).click();
		driver.findElement(By.id("numPax")).click();
		driver.findElement(By.xpath("(//img[@src='//travel-assets-akamai.paytm.com/travel/mweb-flights/assets/1eab75c8.svg'])[1]")).click();
		driver.findElement(By.xpath("(//img[@src='//travel-assets-akamai.paytm.com/travel/mweb-flights/assets/1eab75c8.svg'])[2]")).click();
		driver.findElement(By.xpath("//div[text()='Done']")).click();
		driver.findElement(By.id("flightSearch")).click();
		driver.manage().window().minimize();
		driver.quit();

	}

}
