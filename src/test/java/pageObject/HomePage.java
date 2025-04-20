package pageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BaseClass
{
//constructor
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
//Locators
	

@FindBy(xpath="//span[normalize-space()='My Account']") WebElement myAccount;
@FindBy(xpath="//a[normalize-space()='Register']") WebElement register;
@FindBy(xpath="//a[normalize-space()='Login']") WebElement login;

//Actions

public void myacc_click()
{
	myAccount.click();
}
	
public void reg_click()
{
	register.click();
}

public void login_click()
{
	login.click();
}
	
}


