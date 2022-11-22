package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage1 extends BasePage1 {
	
	public HomePage1(WebDriver driver) {
		super(driver);
	}

		// Elements
		@FindBy(xpath = "//span[text()='My Account']")
		WebElement lnkMyaccount;

		@FindBy(xpath="(//a[normalize-space()='Register'])[1]")
		WebElement lnkRegister;
		
		@FindBy(xpath="//a[text()='Login']")
		WebElement login;

		// Action Methods
		public void clickMyAccount() {
			lnkMyaccount.click();
		}

		public void clickRegister() {
			lnkRegister.click();
		}
		
		public void clickLogin() {
		
			login.click();

		
		}
		
	}


