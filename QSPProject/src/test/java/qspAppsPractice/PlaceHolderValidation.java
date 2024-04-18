package qspAppsPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlaceHolderValidation {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui?scenario=4");
		List<WebElement> elements = driver.findElements(By.xpath("//input[@value='']"));
		for (WebElement element : elements) {
			if(element.getAttribute("placeholder").contains("Enter")) {
				System.out.println("Yes placeholder is present: "+element.getAttribute("type")+":Text field placeholder: "+element.getAttribute("placeholder"));
			}
			else {
				System.out.println("Place holder is not present");
			}
			
		}
	}

}
