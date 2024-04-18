package qspAppsPractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AirIndiaCalenderTest {

	public static void main(String[] args) {
		
		ChromeOptions option= new ChromeOptions();
		WebDriver driver= new ChromeDriver();
		option.addArguments("--disable-notifications");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.airindia.com/");
		

	}

}
