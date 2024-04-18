package qspAppsPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModalPopUpTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/modal/multiModal?sublist=1");
		driver.findElement(By.id("multiModalButton")).click();
		driver.findElement(By.id("multiClosemodal")).click();
		System.out.println(driver.findElement(By.xpath("//p[text()='This is the secondary modal']")).getText());
		driver.findElement(By.xpath("//h3[text()='secondary Modal']/../..//button[text()='close']")).click();
		System.out.println(driver.findElement(By.xpath("//p[contains(text(), 'Lorem ipsum dolor')]")).getText());
		driver.findElement(By.id("multiclose2")).click();

	}

}
