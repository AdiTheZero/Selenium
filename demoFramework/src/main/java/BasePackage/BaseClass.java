package BasePackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public static WebDriver driver;
 	String url="https://rahulshettyacademy.com/client/";
 	
 	@BeforeClass
	public void start()
	{
     driver =new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15000));
     driver.get(url);
	}
 	

 	
	@AfterClass
	public void end()
	{
		driver.quit();
	}

}
