package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BaseClass
{
	//constructor
 public RegistrationPage(WebDriver driver)
 {
	 super(driver);
 }
 
 //locators
 

@FindBy(xpath="//input[@id='input-firstname']") WebElement firstName;
@FindBy(xpath="//input[@id='input-lastname']") WebElement lastName;
@FindBy(xpath="//input[@id='input-email']") WebElement eMail;
@FindBy(xpath="//input[@id='input-telephone']") WebElement telephone;
@FindBy(xpath="//input[@id='input-password']") WebElement password;
@FindBy(xpath="//input[@id='input-confirm']") WebElement passwordConfirm;
@FindBy(xpath="//input[@name='agree']") WebElement agree;
@FindBy(xpath="//input[@value='Continue']") WebElement create_but;
@FindBy(xpath= "//p[contains(text(),'Congratulations! Your new account has been success')]") WebElement confirm_msg;

//Actions
public void EnterFirstName(String fname)
{
	firstName.sendKeys(fname);
}

public void EnterLastName(String lname)
{
	lastName.sendKeys(lname);
}

public void EnterEmail(String email)
{
	eMail.sendKeys(email);
}
public void EnterNumber(String num)
{
	telephone.sendKeys(num);
}

public void EnterPassword(String passw)
{
	password.sendKeys(passw);
}

public void EnterConfirmPassword(String passw)
{
	passwordConfirm.sendKeys(passw);
}

public void ClickAgree()
{
	agree.click();
}
public void clickContinue()
{
	create_but.click();
}

public String SuccessMessage()
{
	try
	{
	return confirm_msg.getText();
	}
	catch(Exception e)
	{
	return	e.getMessage();
	}
}
}
