package test;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import appliutilities.DriverSetUp;


public class TestBatches
{
	TestCases test;
	public TestBatches() 
	{
		DriverSetUp ds = new DriverSetUp();
		WebDriver driver = ds.getRemoteDriver();
		 test = new TestCases(driver);
		
		
	}
	
@Test
	public void TestBatch1() 

	{
		test.PostiveLoginAndVerify();
		test.NegativePasswordandVerify();
		
		
	}
	
	@Test
	public void TestBatch2()
	{
		test.PostiveLoginAndVerify();
		test.NegativeUsernameAndVerify();
	}
	
	
	

}
