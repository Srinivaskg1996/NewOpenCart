package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.RegistrationPage;
import testBase.TestBase;

public class TC_001_VerifyRegistration extends TestBase
{

	@Test
	public void AccRegistration()
	{
		HomePage ar= new HomePage(driver);
		
		ar.myacc_click();
		ar.reg_click();
		
		RegistrationPage rp= new RegistrationPage(driver);
		rp.EnterFirstName("Srinivas");
		rp.EnterLastName("Gowda");
		rp.EnterEmail("Srini@125test.com");
		rp.EnterNumber("2345678");
		rp.EnterPassword("Srivas@23");
		rp.EnterConfirmPassword("Srivas@23");
		rp.ClickAgree();
		rp.clickContinue();
		System.out.println(rp.SuccessMessage());
		if((rp.SuccessMessage()).equals("Congratulations! Your new account has been successfully created!"))
		{
			System.out.println("Registration is successfull");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("Registration is Failed");
			Assert.assertTrue(false);
		}
	}
}
