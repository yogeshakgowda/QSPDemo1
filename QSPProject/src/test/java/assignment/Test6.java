package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.youtube.com/");
		WebElement search = driver.findElement(By.xpath("//input[@id='search']"));
		search.sendKeys("song");
		search.sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//div[.='song new']")).click();
		

	}

}
