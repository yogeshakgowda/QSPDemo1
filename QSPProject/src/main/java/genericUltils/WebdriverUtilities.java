package genericUltils;

import java.util.Set;

import org.openqa.selenium.WebDriver;




public class WebdriverUtilities {

	
	public void switchWindow(WebDriver driver, String url) {
		Set<String> allWindId = driver.getWindowHandles();
		for (String winId : allWindId) {
			String actualUrl = driver.switchTo().window(winId).getCurrentUrl();
			if(actualUrl.contains(url)) {
				break;
			}
			
		}
	}
}
