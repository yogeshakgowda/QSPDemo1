package qspAppsPractice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SortedDropdownOption {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		WebElement dropdown = driver.findElement(By.id("select3"));
		Select select = new Select(dropdown);
		ArrayList<String> list = new ArrayList<String>();
		List<WebElement> options = select.getOptions();
		for (WebElement element : options) {
			list.add(element.getText());
		}
		Collections.sort(list);
		for (String finalOption : list) {
			System.out.println(finalOption);
		}
		System.out.println();
		Collections.reverse(list);
		for (String finalOption : list) {
			System.out.println(finalOption);
		}

	}

}
