package qspAppsPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyPlaceholderInTextBoxTest {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui?scenario=4");
		WebElement nameTextBox = driver.findElement(By.id("name"));
		String nameTextBoxPlaceholder = nameTextBox.getAttribute("placeholder");
		System.out.println("Name text field placeholder: "+nameTextBoxPlaceholder);
		WebElement emailTextBox = driver.findElement(By.id("email"));
		String emailTextBoxPlaceholder = emailTextBox.getAttribute("placeholder");
		System.out.println("Email text field placeholder: "+emailTextBoxPlaceholder);
		WebElement passwordTextBox = driver.findElement(By.id("password"));
		String passwordTextBoxPlaceholder = passwordTextBox.getAttribute("placeholder");
		System.out.println("Password text field placeholder: "+passwordTextBoxPlaceholder);
		driver.manage().window().minimize();
		driver.quit();
		
	}

}
