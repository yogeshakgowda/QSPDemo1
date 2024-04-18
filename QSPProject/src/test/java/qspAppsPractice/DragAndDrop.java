package qspAppsPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=1");
		List<WebElement> draggableElements = driver.findElements(By.className("draggableS"));
		WebElement mobileAccesories = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		WebElement laptopAccesories = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		Actions action = new Actions(driver);
		for (WebElement element : draggableElements) {
			if(element.getText().contains("Mobile")) {
				action.dragAndDrop(element, mobileAccesories).pause(2000).perform();
			}
			else if(element.getText().contains("Laptop")) {
				action.dragAndDrop(element, laptopAccesories).pause(2000).perform();
			}
			
		}
	}

}
