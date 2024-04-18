package qspAppsPractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowAndTab {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get("https://www.amazon.in");
//		Thread.sleep(2000);
//		driver.switchTo().newWindow(WindowType.WINDOW);
//		driver.get("https://www.facebook.com/");
//		Thread.sleep(2000);
//		driver.switchTo().newWindow(WindowType.WINDOW);
//		driver.get("https://www.flipkart.com/");
//		Thread.sleep(2000);
//		driver.quit();
//		driver.get("https://www.amazon.in");
//		Thread.sleep(2000);
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.get("https://www.facebook.com/");
//		Thread.sleep(2000);
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.get("https://www.flipkart.com/");
//		Thread.sleep(2000);
//		driver.quit();
//		for(int i=1; i<=5; i++) {
//			WebDriver driver= new ChromeDriver();
//		}
		for(int i=1; i<=5; i++) {
			
			driver.switchTo().newWindow(WindowType.TAB);
			
		}

	}

}
