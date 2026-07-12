package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import org.testng.annotations.Test;

@CucumberOptions(
    features = "src/test/resources/features/catalog", 	// Path to your feature files
    glue = "catalog",	// Package name for step definitions
    plugin = {"pretty","html:target/accountingreport.html","json:target/catalog.json"},
    dryRun = false

)
public class CatalogModuleTestRunner extends AbstractTestNGCucumberTests {
	

	    public void runCucumber() {
	        // This will run the Cucumber tests with TestNG
	    }	
}