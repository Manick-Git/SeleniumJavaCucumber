package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import org.testng.annotations.Test;

@CucumberOptions(
    features = "src/test/resources/features/inventory", 	// Path to your feature files
    glue = "inventory",	// Package name for step definitions
    plugin = {"pretty","html:target/inventoryreport.html"},
    dryRun = false

)
public class InventoryTestRunner extends AbstractTestNGCucumberTests {
	

	    public void runCucumber() {
	        // This will run the Cucumber tests with TestNG
	    }	
}