package qspAppsPractice;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseApplicationUsingCMDArguments {

	public static void main(String[] args) throws IOException  {
		Runtime runtime=Runtime.getRuntime();
		Process process = runtime.exec("taskkill /im chrome.exe /f /t");
		
	}

}
