package testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.MainPage;
import pageObjects.RegistrationPage;
import testBase.BaseClass;

public class TC_001_AccountRegistration extends BaseClass {
	
	@Test(groups= {"Master","Regression"})
	public void test_Account_Registration() throws InterruptedException
	{
	
		logger.info("**************Starting TC_001_AccountRegistration Test***************");
		
		try {
		MainPage mp = new MainPage(driver);
		mp.clicklnkRegister();
		
		logger.info("clicked on Register link");
		
		
		RegistrationPage rp = new RegistrationPage(driver);
		
		logger.info("Providing customer data");
		
		rp.clickMalerdioBtn();
		rp.setFirstName(randomString());
		rp.setLastName(randomString());
		rp.setEmail(randomString()+"@gmail.com");
		rp.clickNewsCheckBox();
		
		String password =randomAlphaNumeric();
		rp.setPassword(password);
		rp.setConPassword(password);
		rp.clickRegisterBtn();
		String registerValidation= rp.getMsgConfirmation();
		
		logger.info("Validating expected message");
		
		Assert.assertEquals(registerValidation, "Your registration completed");
		
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("*************TC_001_AccountRegistration Test finished*************");
	}
}
