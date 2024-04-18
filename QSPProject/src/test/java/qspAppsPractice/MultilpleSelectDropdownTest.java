package qspAppsPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultilpleSelectDropdownTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1&scenario=2");
		WebElement countryDropdown = driver.findElement(By.id("select-multiple-native"));
		Select select = new Select(countryDropdown);
		if (select.isMultiple()) {
			select.selectByValue("Canada");
			select.selectByValue("Germany");
			select.selectByValue("China");
			List<WebElement> selectedOption = select.getAllSelectedOptions();
			for (WebElement option : selectedOption) {
				System.out.println("Selected option: " + option.getText());

			}
		} else {
			System.out.println("The dropdown is not a multi-select dropdown.");
		}

	}

}
