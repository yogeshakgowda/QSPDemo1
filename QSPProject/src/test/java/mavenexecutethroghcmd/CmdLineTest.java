package mavenexecutethroghcmd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CmdLineTest {

	@Test
	public void newTest()
	{
		WebDriver driver=null;
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		if(BROWSER.equals("chrome")) {
			driver=new ChromeDriver();
		}
		driver.get(URL);
		System.out.println(driver.findElement(By.xpath("//div[text()='Google offered in:  ']")).getText());
	}
}
