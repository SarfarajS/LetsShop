package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

	
	public MainPage(WebDriver driver) {
			super(driver);
		}

		//Element
		@FindBy (xpath= "//*[text()='Register']")
		WebElement lnkRegister;
		
		@FindBy(xpath="//*[text()='Log in']")
		WebElement lnkLogin;
		
		//Action Method
		public void clicklnkRegister()
		{
			lnkRegister.click();
		}
		
		public void clickLogin()
		{
			lnkLogin.click();
		}
}



	