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

public class DropdownTest {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		WebElement dropdown1 = driver.findElement(By.id("select1"));
		Select select1 = new Select(dropdown1);
		//select1.selectByIndex(1);
		select1.selectByValue("+92");
		driver.findElement(By.id("phone")).sendKeys("9988007713");
		
		WebElement dropdown2 = driver.findElement(By.id("select2"));
		Select select2 = new Select(dropdown2);
		select2.selectByVisibleText("Male");
		WebElement dropdown3 = driver.findElement(By.id("select3"));
		Select select3 = new Select(dropdown3);
		select3.selectByVisibleText("India");
		
		WebElement dropdown4 = driver.findElement(By.id("select5"));
		Select select4 = new Select(dropdown4);
		select4.selectByIndex(27);
		
		WebElement dropdown5 = driver.findElement(By.xpath("//label[text()='City']/following-sibling::select"));
		Select select5 = new Select(dropdown5);
		select5.selectByValue("Godda");
		
		driver.findElement(By.id("continuebtn")).submit();
		

	}

}
