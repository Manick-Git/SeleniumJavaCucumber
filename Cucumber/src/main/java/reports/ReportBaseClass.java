package reports;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * This class consists of operations that are supposed to be done before the test case suite begins
 */
public class ReportBaseClass {

  @BeforeSuite
  public void beforeSuite() throws IOException {
	  System.out.println("Inside before Suite method");
  }

  @AfterSuite
  public void afterSuite() {
    //service.shutdown();
	System.out.println("Inside after Suite method");
  }
}