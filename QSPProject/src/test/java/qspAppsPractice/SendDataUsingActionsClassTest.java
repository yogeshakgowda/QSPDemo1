package qspAppsPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SendDataUsingActionsClassTest {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui");
		WebElement nameTextBox = driver.findElement(By.id("name"));
		Actions action = new Actions(driver);
		action.sendKeys(nameTextBox, "Abhay").sendKeys(Keys.TAB).sendKeys("abc@gmail.com").sendKeys(Keys.TAB)
				.sendKeys("Password").sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();

	}

}
