package assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	
	public static void main(String[] args) {
		

		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		int n=9;
		for ( int i = 0; i < n; i++) {
			 driver.switchTo().newWindow(WindowType.TAB);
		}
		Set<String> allWindows = driver.getWindowHandles();
		List<String> windowHandlesList = new ArrayList<>(allWindows);
		 driver.switchTo().window(windowHandlesList.get(6));
		 driver.close();
		//commit changes
		
		
	}

}
