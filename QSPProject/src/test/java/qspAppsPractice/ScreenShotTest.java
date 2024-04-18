package qspAppsPractice;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotTest {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File tempFile = ts.getScreenshotAs(OutputType.FILE);
		File permFile=new File("./ss/screenshot.png");
		Files.copy(tempFile, permFile);
		driver.manage().window().minimize();
		driver.quit();

	}

}
