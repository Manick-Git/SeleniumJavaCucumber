package ordering;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import io.cucumber.java.en.*;

public class CartSteps {
    @Given("the user has selected a product")
    public void selectProduct() { System.out.println("Product Selected"); }

    @When("they click {string}")
    public void clickButton(String btn) { System.out.println("Clicked " + btn); }

    @Then("the cart count should increase to {string}")
    public void verifyCartCount(String count) { System.out.println("Cart updated to " + count); }
}

