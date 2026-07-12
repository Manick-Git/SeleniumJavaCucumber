package utils;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TestListener implements ITestListener {
	
	ExtentReports extent;
	
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test Started: " + result.getName());
        
        ExtentReports extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark/Spark.html");
        extent.attachReporter(spark);       

        
    }
    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Passed: " + result.getName());
        
        extent.createTest("ScreenCapture").addScreenCaptureFromPath("extent.png")
        .pass(MediaEntityBuilder.createScreenCaptureFromPath("extent.png").build());
    }
    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test Failed: " + result.getName());
    }
    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test Skipped: " + result.getName());
    }
    // Other overridden methods
}