package qspAppsPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BigBasketProductTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.bigbasket.com/");
		driver.findElement(By.xpath("//div[@class='grid grid-flow-col gap-x-6 h-9 mt-3.5 mb-2.5']//input"))
				.sendKeys("apple" + Keys.ENTER);
		
		
	}

}
