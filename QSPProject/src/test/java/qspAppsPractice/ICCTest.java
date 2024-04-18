package qspAppsPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ICCTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.icc-cricket.com/rankings/team-rankings/mens/test");
		Thread.sleep(5000);
		List<WebElement> allTeams = driver.findElements(By.xpath("//span[@class='si-fname si-text' ]"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		String s = "Sri Lanka";
		boolean flag = false;
		for (WebElement teams : allTeams) {
			if (teams.getText().equalsIgnoreCase(s)) {
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println("Sri lanka is present");
		}
		else {
		System.out.println("SriLanka is not present");
		}
	}

}
