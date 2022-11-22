package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage1 {
	public LoginPage(WebDriver driver) 
	{
		super(driver);
	}

	@FindBy(id="input-email")
	WebElement email;
	
	@FindBy(id="input-password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement submit;
	
	public void setEmail(String eml) 
	{
		email.sendKeys(eml);
	}
	public void setPassword(String pwd) 
	{
		password.sendKeys(pwd);
	}
	public void clickLogin() 
	{
		submit.click();
	}
}
