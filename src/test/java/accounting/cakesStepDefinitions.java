package accounting;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class cakesStepDefinitions {
    private int cukes;

    @Given("I have {int} cukes in my belly")
    public void i_have_cukes_in_my_belly(int cukes) {
        this.cukes = cukes;
        System.out.println("cakes!");

    }

    @When("I wait 1 hour")
    public void i_wait_1_hour() {
        // Simulate waiting
        System.out.println("wait!");

        try {
            Thread.sleep(1000); // Wait for 1 second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("my belly should growl")
    public void my_belly_should_growl() {
        // Simple assertion for demonstration
        Assert.assertEquals(true, cukes > 0);
        System.out.println("growl!");
    }    

}
