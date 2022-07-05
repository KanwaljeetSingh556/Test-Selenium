
	package test;

	import org.openqa.selenium.WebDriver;

	import pages.NegativePasswordTest;
	import pages.NegativeUsernameTest;
	import pages.PositiveLoginTest;

	public class TestCases
	{
		WebDriver driver;
		PositiveLoginTest ps;
		NegativeUsernameTest  nu;
		NegativePasswordTest np;
		
		public TestCases(WebDriver driver)
		{
			this.driver = driver;
			ps = new PositiveLoginTest(driver);
			nu = new NegativeUsernameTest(driver);
			np = new NegativePasswordTest(driver);	
		}
		
		
		public void PostiveLoginAndVerify()
		{
			ps.PositiveLogin();
			ps.VerifyPositiveLogin();
			
		}
		
		
		public void NegativePasswordandVerify() 
		{
			np.NegativePasswordLogin();
			np.VerifyNegativePasswordLogin();
			
		}
		
		public void NegativeUsernameAndVerify() 
		{
			nu.NegativeUsernameLogin();
			nu.VerifyNegativeusernameLogin();
			
		}


		

		
		
		
		

	}



