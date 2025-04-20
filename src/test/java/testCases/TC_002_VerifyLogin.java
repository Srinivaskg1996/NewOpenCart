package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.MyAccountPage;
import testBase.TestBase;

public class TC_002_VerifyLogin extends TestBase
{
  
	@Test
	public void Loginverification()
	{
		logger.info("****Starting execution****");
		HomePage LN=new HomePage(driver);
		LN.myacc_click();
		LN.login_click();
		
		logger.info("entering details in login page");
		LoginPage loginpage= new LoginPage(driver);
		loginpage.EnterEmail_login(pt.getProperty("Email"));
		loginpage.EnterPassword_login(pt.getProperty("Password"));
		loginpage.ClickLoginBut();
		
		logger.info("Verifying my account ");
		MyAccountPage ma= new MyAccountPage(driver);
		ma.GetConfirLogin();
		
		if((ma.GetConfirLogin()).equalsIgnoreCase("My Account"))
		{
			System.out.println("login successfull");
			Assert.assertTrue(true);
			logger.info("test case passed ");
		}
		else
		{
			System.out.println("login Failed");
			Assert.assertTrue(false);
			logger.info("test case Failed");
		}
		logger.info("****Ending execution****");
	}
}
