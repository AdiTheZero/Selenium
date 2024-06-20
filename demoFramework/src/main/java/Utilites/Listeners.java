package Utilites;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import BasePackage.BaseClass;

public class Listeners extends BaseClass implements ITestListener {
	
	ExtentReports extent;
    ExtentTest test;
	
	
	   @Override
	   public void onTestStart(ITestResult result) {
		// Log test case start
		// Create a new Extent test for the current test case
	        test = extent.createTest(result.getMethod().getMethodName());
	        
	    }
	 
	    @Override
	    public void onTestSuccess(ITestResult result) {
	        // Log test case success
	    	  test.log(Status.PASS, "Test Case: \"" + result.getMethod().getMethodName() + "\" is Passed");
	       
	    }

	    @Override
	    public void onTestFailure(ITestResult result) {
	        // Log test case failure
	    	   test.log(Status.FAIL, "Test Case: \"" + result.getMethod().getMethodName() + "\" is failed");
	           test.log(Status.FAIL, result.getThrowable());
	    }

	    @Override
	    public void onTestSkipped(ITestResult result) {
	        // Log test case skipped
	    	 test.log(Status.SKIP, "Test Case: \"" + result.getMethod().getMethodName() + "\" is Skipped");
	         test.log(Status.SKIP, result.getThrowable());
	       
	    }

	    @Override
	    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	        // Not implemented
	        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	    }

	    @Override
	    public void onTestFailedWithTimeout(ITestResult result) {
	        // Not implemented
	        ITestListener.super.onTestFailedWithTimeout(result);
	    }

	    @Override
	    public void onStart(ITestContext context) {
	        // Initialize ExtentReports and get the report object
	    	 extent = ExtentReporterNG.getReportObject();
	    }

	    @Override
	    public void onFinish(ITestContext context) {
	        // Flush the extent report to generate the final report
	    	 extent.flush();
	     
	    }
	

}
