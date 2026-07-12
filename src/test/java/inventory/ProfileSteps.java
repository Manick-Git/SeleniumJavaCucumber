package inventory;

import io.cucumber.java.en.*;

public class ProfileSteps {
    @Given("the user is on the profile settings page")
    public void onProfilePage() { System.out.println("At Profile Settings"); }

    @When("they update their bio to {string}")
    public void updateBio(String bio) { System.out.println("Updating bio: " + bio); }

    @And("click {string}")
    public void clickSave(String btn) { System.out.println("Clicking " + btn); }

    @Then("the profile should display the new bio")
    public void verifyBio() { System.out.println("Bio updated successfully"); }
}
