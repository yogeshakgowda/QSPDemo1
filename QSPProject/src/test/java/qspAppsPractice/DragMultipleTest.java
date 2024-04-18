package qspAppsPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragMultipleTest {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToMultiple?sublist=2");
		List<WebElement> draggableElements = driver.findElements(By.className("draggable-elemment"));
		WebElement mobileAccesories = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		WebElement laptopAccesories = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		Actions action = new Actions(driver);
		for (WebElement element : draggableElements) {
			if(element.getText().contains("Mobile")) {
				action.dragAndDrop(element, mobileAccesories).perform();
			}
//					else {
//						action.clickAndHold(element).perform();
//
//					}
		}

	}

}
