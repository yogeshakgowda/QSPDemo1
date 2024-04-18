 package qspAppsPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAppTest {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in/");
		//driver.findElement(By.xpath("//div[@id='nav-xshop-container']//a[text()='Amazon miniTV']")).click();
		List<WebElement> allLink = driver.findElements(By.xpath("//a"));
		System.out.println(allLink.size());
		for (WebElement link : allLink) {
			System.out.println("Text: "+link.getText()+" Link:"+link.getAttribute("href"));
			
		}
	}

}
