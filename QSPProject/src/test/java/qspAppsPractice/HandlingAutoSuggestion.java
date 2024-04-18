package qspAppsPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.flipkart.com");
	WebElement searchText = driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
	searchText.sendKeys("Shirt");
	List<WebElement> suggestions = driver.findElements(By.xpath("//a[@class='oleBil']"));
	
	for (WebElement option : suggestions) {
		System.out.println(option.getText());
		Thread.sleep(4000);
		if(option.getText().contains("shirt for men")) {
			option.click();
			break;
		}
	}
	
			

	}

}
