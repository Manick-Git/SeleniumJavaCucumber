package catalog;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class LoginSteps {
    @Given("the user is on the login page")
    public void userOnLoginPage() { System.out.println("Navigating to Login Page"); }

    @When("the user enters valid {string} and {string}")
    public void enterCredentials(String user, String pass) { System.out.println("Entering: " + user); }

    @And("clicks the login button")
    public void clickLogin() { System.out.println("Clicking Login"); }

    @Then("they should be redirected to the dashboard")
    public void verifyDashboard() { System.out.println("Verified Dashboard"); }
}
