package qspAppsPractice;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonApplicationTest {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in");
		WebElement searchTextF = driver.findElement(By.id("twotabsearchtextbox"));
		searchTextF.sendKeys("Iphone", Keys.ENTER);
		driver.findElement(By.xpath("//span[.='Apple iPhone 13 (128GB) - Green']")).click();
		Set<String> allWindowId = driver.getWindowHandles();
		for (String windowid : allWindowId) {
			String title = driver.switchTo().window(windowid).getTitle();
			if(title.contains("Apple iPhone 13")) {
				break;
			}
			
		}
		List<WebElement> allColor = driver.findElements(By.xpath("//img[@class='imgSwatch']"));
		for (WebElement color : allColor) {
			System.out.println(color.getAttribute("alt"));
			
		}

	}

}
