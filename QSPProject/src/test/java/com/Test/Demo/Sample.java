package com.Test.Demo;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import com.tyss.demo.GenericUtility.BaseClass;
@Listeners(com.tyss.demo.GenericUtility.ListnerImplementationClass.class)
public class Sample extends BaseClass {

	@Test(testName = "verify this test is working")
	public void testscript5_Test()
	{
		System.out.println("----testscript5_Test----");
	}
	
	@Test
	public void testscript6_Test()
	{
		System.out.println("----testscript6_Test----");
		Assert.fail();
	}
}
