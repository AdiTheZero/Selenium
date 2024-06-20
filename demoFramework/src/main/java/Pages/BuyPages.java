package Pages;
 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseClass;

public class BuyPages extends BaseClass{
	
	 public BuyPages()
	   {
		   PageFactory.initElements(driver, this);
	   }
	 
	 @FindBy(xpath="//div[(contains(text(),'CVV Code'))]/following-sibling::input")
     WebElement cvCode;
	 
	 @FindBy(xpath = "//div[(contains(text(),'Name on Card'))]/following-sibling::input")
	 WebElement cvName;
	 
//	 @FindBy(className = "btn-primary")
//	 WebElement applyBtn;
	 
	 @FindBy(xpath = "//div/input[@placeholder='Select Country']")
	 WebElement selectCountry;
	 
	 
	 @FindBy(xpath="//section[@class='ta-results list-group ng-star-inserted']/button[2]")
	 WebElement dropdownCountry;
	 
	 @FindBy(xpath ="//a[contains(text(),'Place')]")
	public  WebElement placeOrder;
	 
	 
	 public void cvCode(String s)
	 {
		 cvCode.sendKeys(s);
		 
	 }
	 public void cvName(String n)
	 {
		 cvName.sendKeys(n);
	 }
	 
	 public void country(String c)
	 {
		 selectCountry.sendKeys(c);
		 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 dropdownCountry.click();
	 }
	 
	 
	 
	 public void placeOrder() throws InterruptedException
	 {
		// Thread.sleep(2000);
		 placeOrder.click();
	 }
	 
	 
}
