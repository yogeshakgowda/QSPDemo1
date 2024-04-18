package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.maccosmetics.com");
		//driver.findElement(By.xpath("//button[@data-signup-target=\"closeFormIcon\"]")).click();
		driver.findElement(By.xpath("//span[.='SHOP NOW']")).click();
	}

}
