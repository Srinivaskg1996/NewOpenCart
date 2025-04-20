package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BaseClass {
	
	//constructor
	public MyAccountPage(WebDriver driver)
	{
		super(driver);
	}

	//Locator
	
	@FindBy(xpath="//h2[normalize-space()='My Account']") WebElement myAccount;
	
	//Actions
	public String GetConfirLogin()
	{
		try
		{
			return myAccount.getText();
		}
		catch(Exception e)
		{
			return e.getMessage();
		}
		
	}
}
