package TestCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class ScreenShotTest {
	
	
	@Test
	public void takeScreenshotTest() {
    	WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        
        // Create directory if it doesn't exist
        File dir = new File(System.getProperty("user.dir") + "\\src\\Screen");
        if (!dir.exists()) {
            dir.mkdirs();
        }
        
        File dest = new File(dir, "Screen.jpeg");
        
        try {
            FileUtils.copyFile(src, dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
        driver.quit();
    }


}
