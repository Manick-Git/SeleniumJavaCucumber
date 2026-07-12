package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import org.testng.annotations.Test;

@CucumberOptions(
    features = "src/test/resources/features/ordering", 	// Path to your feature files
    glue = "ordering",	// Package name for step definitions
    plugin = {"pretty","html:target/orderingreport.html"},
    dryRun = false

)
public class OrderingTestRunner extends AbstractTestNGCucumberTests {
	

	    public void runCucumber() {
	        // This will run the Cucumber tests with TestNG
	    }	
}