package Utilites;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
public class ExtentReporterNG {
	/**
     * Get an ExtentReports object configured for generating test reports.
     *
     * @return An ExtentReports object.
     */
    public static ExtentReports getReportObject() {
        // Create a SimpleDateFormat to format the current date and time
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyy HH-mm-ss");
        Date date = new Date();
        String actualDate = format.format(date);
        // Define the path for the Extent Report file
        String path = System.getProperty("user.dir") + "/Reports/ExtentReport " + actualDate + ".html";
        
        // Create an ExtentSparkReporter object to configure report settings
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("Web Automation Results");
        reporter.config().setDocumentTitle("Test Results");
        reporter.config().setTheme(Theme.DARK);
        
        // Create an ExtentReports object and attach the ExtentSparkReporter
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);
        
        // Set system information in the report
        extent.setSystemInfo("Tester", "Aditya kumar");
        
        return extent;
    }

}
