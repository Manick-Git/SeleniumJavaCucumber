package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import org.testng.annotations.Test;

@CucumberOptions(
    features = "src/test/resources/features/e2e", 	// Path to your feature files
    glue = "e2e",	// Package name for step definitions
    plugin = {"pretty","html:target/e2ereport.html"},
    dryRun = false

)
public class E2ETestRunner extends AbstractTestNGCucumberTests {
	

	    public void runCucumber() {
	        // This will run the Cucumber tests with TestNG
	    }	
}