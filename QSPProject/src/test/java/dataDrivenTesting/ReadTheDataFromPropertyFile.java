package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadTheDataFromPropertyFile {
    static WebDriver driver;
	public static void main(String[] args)  throws IOException {
			FileInputStream fis = new FileInputStream("./src/test/resources/commondata.properties");
			Properties pObj = new Properties();
			pObj.load(fis);
			String browser = pObj.getProperty("browser");
			String url = pObj.getProperty("url");
			if(browser.equals("chrome"))
			{
				driver= new ChromeDriver();
			}
			else if(browser.equals("firefox"))
			{
				driver= new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.get(url);
			
			
		}


	}


