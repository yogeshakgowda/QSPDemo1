package qspAppsPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiFrameHandlingTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
		String signupEmail = driver.findElement(By.xpath("//p[text()='Email:Admin@gmail.com']")).getText().substring(6);
		String signupPassword = driver.findElement(By.xpath("//p[text()='Password : Admin@1234']")).getText()
				.substring(11);
		String confirmSignUpPassword = driver.findElement(By.xpath("//p[text()='Confirm Password : Admin@1234']"))
				.getText().substring(19);

		driver.switchTo().frame(driver.findElement(By.xpath("(//iframe)[1]")));
		WebElement loginTextF = driver.findElement(By.id("email"));
		WebElement passwordTextF = driver.findElement(By.id("password"));
		WebElement confrmPassTF = driver.findElement(By.id("confirm-password"));
		loginTextF.sendKeys(signupEmail);
		passwordTextF.sendKeys(signupPassword);
		confrmPassTF.sendKeys(confirmSignUpPassword);
		driver.findElement(By.id("submitButton")).submit();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath("(//iframe)[2]")));
		driver.findElement(By.id("username")).sendKeys("SuperAdmin@gmail.com");
		driver.findElement(By.id("password")).sendKeys("SuperAdmin@1234");
		driver.findElement(By.id("submitButton")).submit();

	}

}
