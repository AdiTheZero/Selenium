package Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseClass;

public class IdPage extends BaseClass {
	

	public IdPage()
	   {
		   PageFactory.initElements(driver, this);
		   
	   }
	
	@FindBy(xpath="//tbody/tr/th")
	WebElement id;
	
	
	@FindBy(xpath = "//button[contains(text(),'Go Back to Shop')]")
	WebElement backtoShop;
	
	public String getproductId()
	{
		String id=this.id.getText();
		return id;
	}
	

}
