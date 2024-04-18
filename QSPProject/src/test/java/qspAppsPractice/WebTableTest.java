package qspAppsPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTest {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/table");
		List<WebElement> columnData = driver.findElements(By.xpath("//th[@class='px-6 py-4 font-medium text-gray-900 whitespace-nowrap']"));
		for (WebElement data : columnData) {
			System.out.println(data.getText());	
		}
		driver.manage().window().maximize();
		driver.quit();
	}

}
