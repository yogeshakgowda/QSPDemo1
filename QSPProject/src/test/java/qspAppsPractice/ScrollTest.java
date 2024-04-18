package qspAppsPractice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollTest {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/scroll");
		driver.findElement(By.xpath("//a[text()='Open In New Tab']")).click();
		JavascriptExecutor jSE= (JavascriptExecutor)driver;
		Actions action = new Actions(driver);
		Set<String> allWindow = driver.getWindowHandles();
		for (String window : allWindow) {
			String url = driver.switchTo().window(window).getCurrentUrl();
			if(url.contains("newTabVertical")) {
				action.scrollByAmount(0, 1000);
				break;
			}
			
		}
		
	}

}
