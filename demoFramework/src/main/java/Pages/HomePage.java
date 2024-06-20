package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import BasePackage.BaseClass;


public class HomePage extends BaseClass{
	
  public HomePage()
  {
	  PageFactory.initElements(driver, this);
  }
  
  @FindBy(className ="card")
  List<WebElement> productList;
  
  @FindBy(xpath = "//button[@routerlink='/dashboard/cart']")
  WebElement cartBtn;
  
  @FindBy(className = "fa-sign-out")
  WebElement logOut;
  
  @FindBy(xpath = "//h3")
  WebElement heading;
  
  public void addProduct(String productName)
  {	
	  for (WebElement product : productList) {
		boolean flag = product.findElement(By.tagName("b")).getText().equalsIgnoreCase(productName);
		if(flag) {
			product.findElement(By.className("fa-shopping-cart")).click();
			break;
		}
		else {
			System.out.println("Product not Found....");
		}
	 }
   } 
  
 public  void gotoCart()
  {
	  cartBtn.click();
  }
  
  public void logout()
  {
	  logOut.click();
  }
  
  public String getHeading() {
	  return heading.getText();
  }
  
}
