package qspAppsPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessMode {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		//option.addArguments("--headless");
		//option.addArguments("--incognito");
		option.addArguments("--lang=nep");
		
		WebDriver driver= new ChromeDriver(option);
		driver.get("https://www.amazon.in");
		System.out.println(driver.getTitle());

	}

}
