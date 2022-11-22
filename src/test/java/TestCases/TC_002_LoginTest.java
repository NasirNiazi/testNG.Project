package TestCases;

import org.testng.annotations.Test;

import pageObject.HomePage1;
import pageObject.LoginPage;

public class TC_002_LoginTest extends TestBase{
	@Test(groups= {"Sanity","Regression"})
	public void tc_002_Login() 
	{
		HomePage1 hp=new HomePage1(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(rb.getString("email1"));
		lp.setPassword("password1");
		lp.clickLogin();
	}
	

}
