package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.MainPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass {

	@Test(groups= {"Master","Sanity"})
	public void LoginTest()
	{
		logger.info("*************Starting TC_002_LoginTest*************");
		try {
		MainPage mp = new MainPage(driver);
		mp.clickLogin();
		
		LoginPage lp = new LoginPage(driver);
		lp.setEmail(rb.getString("email"));
		lp.setPassword(rb.getString("password"));
		lp.clickLogin();
		
		MyAccountPage macc = new MyAccountPage(driver);
		boolean target= macc.isMyAccountVisible();
		
		Assert.assertEquals(target, true);
		}
		catch(Exception e)
		{
			Assert.assertTrue(false);
		}
		
		logger.info("*************Finished TC_002_LoginTest*************");
	}
}
