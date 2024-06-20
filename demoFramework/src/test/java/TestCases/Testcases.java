package TestCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Listeners;

import org.testng.annotations.Test;

import BasePackage.BaseClass;
import Pages.BuyPages;
import Pages.CartPage;
import Pages.HomePage;
import Pages.IdPage;
import Pages.LoginPage;
import Pages.ProductPage;
import Utilites.utilites;

@Listeners(Utilites.Listeners.class)


public class Testcases extends BaseClass {
	LoginPage login =new LoginPage() ;
	HomePage homePage;
	BuyPages buypage;
	CartPage cartpage;
	ProductPage productpage;
	IdPage idpage;
	utilites screenShot;
	String productname="ZARA COAT 3";
	String cvvno="854";
	String cvname="aditya";
	String countryname="india";
   String id="studynotesspn555@gmail.com";
   String password="Adity@123";
   String productidonhistorypage;
    
    
	@Test
	public void loginTest() throws  Exception
	{
		login=new LoginPage();
		login.login(this.id, this.password);
		Thread.sleep(1000);
		homePage = new HomePage();
		Assert.assertEquals(homePage.getHeading(),"AUTOMATION");
	}
	
	@Test(dependsOnMethods = {"loginTest"})
	public void addTOcartTest() throws InterruptedException
	{
		homePage.addProduct(productname);
		Thread.sleep(2000);
	
		homePage.gotoCart();
		//Thread.sleep(2000);
		//homePage.logout();
		Thread.sleep(3000);
		cartpage =new CartPage();
		
		
	//cartpageId=cartpage.getId();
		
		
		cartpage.clickonBuy();
		
		
	}
	
	@Test(dependsOnMethods = {"addTOcartTest"})
	public void buyDetialsTest() throws InterruptedException
	{
		 buypage =new BuyPages();
		 buypage.cvCode(cvvno);
		 buypage.cvName(cvname);
		 buypage.country(countryname);
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 
		 
		 js.executeScript("window.scrollBy(0,250)", "");
		 
		 buypage.placeOrder();
		 
	    Thread.sleep(3000);
		 utilites.getScreenShot();
		 		
	}
	@Test(dependsOnMethods = {"buyDetialsTest"})
	public void placeOrderPage() throws InterruptedException
	{
		
		Thread.sleep(3000);
		productpage =new ProductPage();
		String productId=productpage.getId();
		productpage.historyPage();
		
		idpage =new IdPage();
	
		productidonhistorypage = idpage.getproductId();
		
		Assert.assertEquals(productidonhistorypage,productId);

		
	

	

	
		
		
		
	}
	

	
	
	
}
