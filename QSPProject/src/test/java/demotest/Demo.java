package demotest;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.tyss.demo.GenericUtility.BaseClass;
@Listeners(com.tyss.demo.GenericUtility.ListnerImplementationClass.class)
public class Demo extends BaseClass {
	@Test
	public void demoTest() {
		
	}
	
	@Test(retryAnalyzer =com.tyss.demo.GenericUtility.ListenerImpClass.class)
	public void DemoTest1() {
		Assert.fail();
		
	}

}
