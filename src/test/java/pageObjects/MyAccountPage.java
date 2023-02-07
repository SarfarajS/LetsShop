package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {
	
	public MyAccountPage(WebDriver driver)
	{
		super(driver);
	}
	
	//Element
	@FindBy(xpath="//a[@class=\"ico-account\"][text()='My account']")
	WebElement msgHeading;
	
	@FindBy(xpath="//a[text()='Log out']")
	WebElement btnLogout;
	
	//Action method
	
	public boolean isMyAccountVisible()       //my account heading display status
	{
		try 
		{
			return (msgHeading.isDisplayed());
		}
		catch(Exception e)
		{
			return (false);
		}
	}
	
	public void clickLogout()
	{
		btnLogout.click();
	}

}
