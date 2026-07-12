package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(
    features = "src/test/resources/features", 	// Path to your feature files
    glue = {"accounting", "catalog","e2e","inventory","ordering","hooks"},	// Package name for step definitions
    plugin = {"pretty","html:target/regressionreport.html","json:target/cucumber.json"},
    dryRun = false,
    monochrome = true,
    tags = "@Regression"
)

public class RegressionTestRunner extends AbstractTestNGCucumberTests {	
	 
	    public void runCucumber() {
	        // This will run the Cucumber tests with TestNG
	    }	
}