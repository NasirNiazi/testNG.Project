package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage1 extends BasePage1 {
	
		public AccountRegistrationPage1(WebDriver driver) {
			super(driver);
		}

		// Elements
			@FindBy(id= "input-firstname")
			WebElement txtFirstname;

			@FindBy(id = "input-lastname")
			WebElement txtLasttname;

			@FindBy(id= "input-email")
			WebElement txtEmail;

			@FindBy(id="input-telephone")
			WebElement telephone;
			
			@FindBy(id = "input-password")
			WebElement txtPassword;
			
			@FindBy(id="input-confirm")
			WebElement conformPassword;
			
			@FindBy(xpath="//input[@value='0']")
			WebElement subscribe;

			@FindBy(xpath = "//input[@name='agree']")
			WebElement chkdPolicy;

			@FindBy(xpath = "//input[@class='btn btn-primary']")
			WebElement btnContinue;

			@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
			WebElement msgConfirmation;

			public void setFirstName(String fname) {
				txtFirstname.sendKeys(fname);

			}

			public void setLastName(String lname) {
				txtLasttname.sendKeys(lname);

			}

			public void setEmail(String email) {
				txtEmail.sendKeys(email);

			}
			public void setTelePhone(String phone) 
			{
				telephone.sendKeys(phone);
			}

			public void setPassword(String pwd) {
				txtPassword.sendKeys(pwd);

			}
			public void setConformPassword(String conform) 
			{
				conformPassword.sendKeys(conform);
			}
			public void setSubscribe() 
			{
				subscribe.click();
			}


			public void setPrivacyPolicy() {
				chkdPolicy.click();

			}

			public void clickContinue() {
				//sol1 
				btnContinue.click();
				
				//sol2 
				//btnContinue.submit();
				
				//sol3
				//Actions act=new Actions(driver);
				//act.moveToElement(btnContinue).click().perform();
							
				//sol4
				//JavascriptExecutor js=(JavascriptExecutor)driver;
				//js.executeScript("arguments[0].click();", btnContinue);
				
				//Sol 5
				//btnContinue.sendKeys(Keys.RETURN);
				
				//Sol6  
				//WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
				//mywait.until(ExpectedConditions.elementToBeClickable(btnContinue)).click();
				
			}

			public String getConfirmationMsg() {
				try {
					return (msgConfirmation.getText());
				} catch (Exception e) {
					return (e.getMessage());

				}

			}
	}

