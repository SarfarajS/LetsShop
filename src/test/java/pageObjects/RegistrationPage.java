package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage extends BasePage {

	public RegistrationPage(WebDriver driver) {
		super(driver);
	}


	//Elements
	@FindBy (xpath ="//*[@id='FirstName']")
	WebElement txtfirstName;
	
	@FindBy (xpath="//*[@id='LastName']")
	WebElement txtlastName;
	
	@FindBy (xpath="//*[@id='Email']")
	WebElement txtemail;
	
	@FindBy (id="gender-male")
	WebElement rdMalebtn;
	
	@FindBy(xpath="//*[@id='Password']")
	WebElement txtpassword;
	
	@FindBy(id= "ConfirmPassword")
	WebElement txtconfirmpwd;
	
	@FindBy(xpath = "//input[@id= 'Newsletter']")
	WebElement ckboxNewsLetter;
	
	@FindBy (xpath= "//*[@id= 'register-button']")
	WebElement registerBtn;
	
	@FindBy(xpath="//*[text()='Your registration completed']")
	WebElement mesgConfirmation;
	
	//Action Method
	
	public void setFirstName(String fname)
	{
		txtfirstName.sendKeys(fname);
	}
	
	public void setLastName(String lname)
	{
		txtlastName.sendKeys(lname);
	}
	
	public void setEmail(String email)
	{
		txtemail.sendKeys(email);
	}
	
	
	public void clickMalerdioBtn()
	{
		rdMalebtn.click();
	}
	
	public void setPassword(String password)
	{
		txtpassword.sendKeys(password);
	}
	
	public void setConPassword(String Confpassword)
	{
		txtconfirmpwd.sendKeys(Confpassword);
	}
	
	
	public void clickNewsCheckBox()
	{
		ckboxNewsLetter.click();
	}
	
	public void clickRegisterBtn()
	{
		registerBtn.click();
	}
	
	public String getMsgConfirmation()
	{
		try {
		
			return (mesgConfirmation.getText());
		}
		catch(Exception e)
		{
			return (e.getMessage());
		}
	}



}
