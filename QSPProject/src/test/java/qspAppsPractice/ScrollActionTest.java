package qspAppsPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollActionTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		Actions action = new Actions(driver);
		// action.scrollByAmount(0, 3000).perform();
		action.scrollToElement(driver.findElement(By.xpath("//span[@class='navFooterBackToTopText']")))
				.click(driver.findElement(By.xpath("//span[@class='navFooterBackToTopText']"))).build().perform();

	}

}
