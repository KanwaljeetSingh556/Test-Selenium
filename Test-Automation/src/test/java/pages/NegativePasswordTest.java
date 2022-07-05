package pages;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import appliutilities.DriverSetUp;
import gUtilities.ReadProperties;
import junit.framework.Assert;

public class NegativePasswordTest
{
	WebDriver driver;
	ReadProperties read;
	BasePageObject bs;
	public NegativePasswordTest(WebDriver driver) 
	{
		this.driver = driver;
		
		    read = new ReadProperties("Test-Data/NegativePasswordLogin.properties");
			 bs = new BasePageObject(driver);
			 driver.manage().window().maximize();
		
	}
	
	
	@Before
	public void NegativePasswordLogin()
	{
	bs.openUrl(read.readData("URL"));
	bs.find(PositiveLoginTest.usernameLocator).sendKeys(read.readData("username"));
	bs.find(PositiveLoginTest.passwordLocator).sendKeys(read.readData("password"));
	bs.find(PositiveLoginTest.submitButtonLocator).click();	
	
	}
	
	@Test
	public void VerifyNegativePasswordLogin() 
	{
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		WebElement error = bs.find(PositiveLoginTest.errorMessageLocator);
		String expectedText = error.getText();
		Assert.assertEquals(expectedText, "Your password is invalid!");
		System.out.println("assertion complete");
		
	}

}
