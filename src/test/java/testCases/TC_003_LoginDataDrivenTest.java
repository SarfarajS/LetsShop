package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.MainPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC_003_LoginDataDrivenTest extends BaseClass {
	
	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)
	public void test_loginDDT(String email,String pwd,String exp)  //taking from excel through DataProvider
	{
		logger.info("*************Starting TC_003_LoginDDTest*************");
	
		try {
		MainPage mp = new MainPage(driver);
		mp.clickLogin();
		
		LoginPage lp = new LoginPage(driver);
		lp.setEmail(email);
		lp.setPassword(pwd);
		lp.clickLogin();
		
		MyAccountPage maccpage = new MyAccountPage(driver);
		boolean target= maccpage.isMyAccountVisible();
		
		if(exp.equals("Valid"))
		{
			if(target==true)
			{
				maccpage.clickLogout();
				Assert.assertTrue(true);
			}else
			{
				Assert.assertTrue(false);
			}
		}
		
		if(exp.equals("Invalid"))
		{
			if(target==true)
			{
				maccpage.clickLogout();
				Assert.assertTrue(false);
			}else
			{
				Assert.assertTrue(true);
			}
		}
		
	}catch(Exception e)
		{
			Assert.fail();
		}
		
		logger.info("*************Finished TC_003_LoginDDTest*************");
	}
	
}
