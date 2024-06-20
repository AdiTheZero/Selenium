package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseClass;

public class LoginPage extends BaseClass {
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="userEmail")
	WebElement userId;
	
	@FindBy(id="userPassword")
	WebElement userPassword;
	
	@FindBy(id="login")
	WebElement loginBtn;
	
	public void login(String id,String pass)
	{
		userId.sendKeys(id); 
		userPassword.sendKeys(pass);
		loginBtn.click();
	}
	

}
