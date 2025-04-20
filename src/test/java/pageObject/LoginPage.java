package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseClass
{
	
	//constructor
 public LoginPage(WebDriver driver)
 {
 super(driver);
 }
 
 //Locators

@FindBy(xpath="//input[@id='input-email']") WebElement EMailAddress;
@FindBy(xpath="//input[@id='input-password']") WebElement passwordlog;
@FindBy(xpath="//input[@value='Login']") WebElement login;

//Actions

public void EnterEmail_login(String Emaillog)
{
	EMailAddress.sendKeys(Emaillog);
}

public void EnterPassword_login(String passwordLog)
{
	passwordlog.sendKeys(passwordLog);
}

public void ClickLoginBut()
{
	login.click();
}
}





