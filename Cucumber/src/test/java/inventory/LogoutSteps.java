package inventory;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import io.cucumber.java.en.*;

public class LogoutSteps {
    @Given("the user is logged into the system")
    public void userLoggedIn() { System.out.println("User is authenticated"); }

    @When("they select the {string} option")
    public void selectLogout(String option) { System.out.println("Selecting " + option); }

    @Then("they should see the login screen again")
    public void verifyLoggedOut() { System.out.println("Back at Login Screen"); }
}

