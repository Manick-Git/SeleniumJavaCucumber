package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import org.testng.annotations.Test;

@CucumberOptions(
    features = "src/test/resources/features/accounting", 	// Path to your feature files
    glue = {"accounting","hooks"},	// Package name for step definitions
    plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","pretty","html:target/accountingreport.html"},
    dryRun = false
)


public class AccountingModuleTestRunner extends AbstractTestNGCucumberTests {
	

	    public void runCucumber() {
	        // This will run the Cucumber tests with TestNG
	    }	
}