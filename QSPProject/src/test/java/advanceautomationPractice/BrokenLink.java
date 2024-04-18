package advanceautomationPractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {

	public static void main(String[] args) throws Exception {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.get("http://rmgtestingserver/domain/Online_Shopping_Application/");
	    List<WebElement> allLink = driver.findElements(By.xpath("//div[@class=\"social-icons\"]/a"));
	    System.out.println(allLink.size());
	    for(WebElement eachLink:allLink) {
	    	String link = eachLink.getAttribute("href");
	    	URL url = new URL(link);
	    	HttpURLConnection httpconnection = (HttpURLConnection)url.openConnection();
	    	int statusCode = httpconnection.getResponseCode();

	}
	}
}


