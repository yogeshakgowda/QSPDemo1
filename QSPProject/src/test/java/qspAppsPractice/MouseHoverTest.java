package qspAppsPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverTest {

	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/mouseHover?sublist=0");
		Actions action = new Actions(driver);
		WebElement info = driver.findElement(By.xpath("//img[@class='w-5 h-5 mt-5 ml-3 cursor-pointer ']s"));
		action.moveToElement(info).build().perform();
		List<WebElement> informations = driver.findElements(By.xpath("//li[@class='text-sm list-disc ml-5 p-1']"));
		for (WebElement information : informations) {
			System.out.println(information.getText());
		}
		
		

	}

}
