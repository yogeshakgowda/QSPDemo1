package qspAppsPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui");
		driver.findElement(By.cssSelector("[placeholder='Enter your name'][name='name']")).sendKeys("Abhay");
		// driver.findElement(By.xpath("//label[text()='Name']/following-sibling::input")).sendKeys("Abhay");//
		// Xpath by
		// followingsibling
		driver.findElement(By.xpath("//label[@for='email']/following-sibling::input")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//section[@class='relative']/input")).sendKeys("Password@1");
		driver.findElement(By.xpath("//span[@class='absolute text-slate-600 text-[18px] bg-gray-100']")).click();
//		driver.findElement(By.xpath("//button[contains(text(),'Regi')]")).submit();
//		driver.manage().window().minimize();
//		driver.quit();

		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		for (WebElement link : allLinks) {
			System.out.println(link.getText());
		}

	}

}
