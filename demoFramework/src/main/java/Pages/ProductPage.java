package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseClass;

public class ProductPage  extends BaseClass {
	
	  public ProductPage()
	   {
		   PageFactory.initElements(driver, this);
	   }
	  
	  @FindBy(xpath="//label[@class='ng-star-inserted']")
	public
	  WebElement productId;
	  
	  @FindBy(xpath = "//label[contains(text(),'Orders History Page')]")
	  WebElement productHistroy;
	  
	  @FindBy(xpath = "//button[contains(text(),'Click To Download Order Details in CSV')]")
	  WebElement downloadCsv;
	  
	  @FindBy(xpath = "//button[contains(text(),'Click To Download Order Details in Excel')]")
	  WebElement downloadExcel;
	  
	  @FindBy(xpath = "//h1[contains(text(),'Thankyou for the order.')]")
	  WebElement heading;
  
	  
	  public String getId()
	   {
		   
		  String id =  productId.getText();
		  id = id.split(" ")[1];
		 
		  return id;
	   }
	  public void historyPage()
	  {
		  productHistroy.click();
	  }
}


