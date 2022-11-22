package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.AccountRegistrationPage1;
import pageObject.HomePage1;

public class TC_001AccountRegistrationTest extends TestBase{
	@Test(groups={"Master","Regresion"})
	public void test_account_Registration() throws InterruptedException
	{
		logger.info("***Striting test TC_001AccountRegistrationTest****");
		try
		{
		HomePage1 hp=new HomePage1(driver);
		hp.clickMyAccount();
		logger.info("Click to my Account ");
		hp.clickRegister();
		logger.info("Click to register ");
		AccountRegistrationPage1 regpage=new AccountRegistrationPage1(driver);
		logger.info("Get the all Informatin off Customer ");
		
		regpage.setFirstName(randomString().toUpperCase());
		
		regpage.setLastName(randomString().toUpperCase());
		
		regpage.setEmail(randomStringAndNUmber()+"gmail.com");// randomly generated the email
	
		regpage.setTelePhone(randomNumber());
		String password=randomStringAndNUmber();
		regpage.setPassword(password);
		regpage.setConformPassword(password);
		regpage.setSubscribe();
		regpage.setPrivacyPolicy();
		Thread.sleep(5000);
		regpage.clickContinue();
		logger.info("Click on Continue ");
		String confmsg=regpage.getConfirmationMsg();
		logger.info("Get the Actual MASSEGE ");
		Assert.assertEquals(confmsg, "Your Account Has Been Created!","The Actual massege is not matched ");
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("The test is done ???????????????????????????????????????????");
	}
	
	
}


