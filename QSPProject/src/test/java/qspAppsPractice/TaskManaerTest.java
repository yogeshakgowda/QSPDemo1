package qspAppsPractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class TaskManaerTest {

	public static void main(String[] args) throws AWTException, IOException {
		//for opening task manager
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_ESCAPE);
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyRelease(KeyEvent.VK_SHIFT);
//		r.keyRelease(KeyEvent.VK_ESCAPE);
//		r.keyPress(KeyEvent.VK_CONTROL);
		
//		Runtime run = Runtime.getRuntime();
//		Process p = run.exec("taskkill /im chrome.exe /f /t");
		
		
		
	}

}
