package TestCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BasePackage.BaseClass;

public class ScreenShot extends BaseClass {
	 
	
	
	 TakesScreenshot ts = (TakesScreenshot) driver;
	 
	File srcFile = ts.getScreenshotAs(OutputType.FILE);
	String screen = System.getProperty("user.dir") + "\\src\\test\\java\\TestCases\\Screen+"+".jpeg";
	File path= new File(screen);
	{
	
    try {
        // Copy the screenshot from the source to the destination
        FileUtils.copyFile(srcFile, path);
    } catch (IOException e) {
        e.printStackTrace();
    }
}
	
}
