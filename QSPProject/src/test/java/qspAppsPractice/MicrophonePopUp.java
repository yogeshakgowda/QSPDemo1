package qspAppsPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MicrophonePopUp {

	public static void main(String[] args) {
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--use-fake-ui-for-media-stream");
		WebDriver driver= new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://webcamtests.com/check");
		
		driver.findElement(By.id("webcam-launcher")).click();
		

	}

}
