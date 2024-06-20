package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseClass;

public class CartPage extends BaseClass {
	
   public CartPage()
   {
	   PageFactory.initElements(driver, this);
   }
   
   @FindBy(xpath="//button[@routerlink='/dashboard']")
   WebElement continueShopping;
   
   @FindBy(xpath = "//button[contains(text(),'Buy Now')]")
   WebElement buy;
   
   @FindBy(xpath = "//button[contains(text(),'Checkout')]")
   WebElement checkOut;
   
   @FindBy(className ="items")
   List<WebElement> cartProducts;
   
   @FindBy(xpath = "//p[@class='itemNumber']")
public
   WebElement productId;
   
   
   public void clickonBuy()
   {
	   buy.click();
	   
   }
   
   public String getId()
   {
	   
	  String id =  productId.getText();
	  id = id.split("#")[1];
	  return id;
   }
   
   
   
   
   
	

}
