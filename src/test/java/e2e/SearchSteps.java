package e2e;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class SearchSteps {
    @Given("the user is on the home page")
    public void userOnHomePage() { System.out.println("At Home Page"); }

    @When("they search for {string}")
    public void performSearch(String item) { System.out.println("Searching for " + item); }

    @Then("the search results should display {string}")
    public void verifyResults(String item) { System.out.println("Found: " + item); }
}

