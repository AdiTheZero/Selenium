package Utilites;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BasePackage.BaseClass;

public class utilites extends BaseClass{
	static int count=1;
	
	 public static void getScreenShot() {
	        TakesScreenshot ts = (TakesScreenshot) driver;
	        File src = ts.getScreenshotAs(OutputType.FILE);

	        // Define the path and file name for the screenshot
	        String screenshotPath = System.getProperty("user.dir") + "/Reports/Screenshots/+"+count+".jpeg";
	        File dest = new File(screenshotPath);

	        try {
	            // Copy the screenshot from the source to the destination
	            FileUtils.copyFile(src, dest);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        
	        count++;

	       
	    }

}
