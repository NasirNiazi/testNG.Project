package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage1;
import pageObject.LoginPage;
import pageObject.MyAccount2;

public class TC_003_MyAccount extends TestBase{
	@Test(groups={"Master","Regression"})
	public void tc_003_MyAccount() 
	{
		try {
		logger.info("*************the test is start***************** TC_003_MyAccount");
		HomePage1 ph= new HomePage1(driver);
		ph.clickMyAccount();
		ph.clickLogin();
		
		 LoginPage lp= new  LoginPage(driver);
		 lp.setEmail(rb.getString("email1"));
		 lp.setPassword(rb.getString("password1"));
		 lp.clickLogin();
		 
		 MyAccount2 ma= new MyAccount2(driver);
		 boolean target= ma.getTextMyAccount();
		 Assert.assertEquals(target, true,"invalid text ");
		
		}catch (Exception e) 
		{
			Assert.fail();
		}
		
		logger.info("the test is fanished TC_003_MyAccount");
	}
	

}
