package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import TestCases.TestBase;

public class MyAccount2 extends BasePage1 {
	
  public MyAccount2(WebDriver driver) 
  {
	  super(driver);
  }
	@FindBy(xpath="//h2[text()='My Account']")
	WebElement myAccount;
//	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']")
//	WebElement logout;
	
	public boolean getTextMyAccount()
{
		try {
		return myAccount.isDisplayed();
		}catch(Exception e) 
		{
			return false;
		}
		}
//	public void setlogout() 
//	{
//		logout.click();
//	}
	
	}
