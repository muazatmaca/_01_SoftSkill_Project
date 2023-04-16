package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.Then;

public class _09_HaticeSteps {
    DialogContent dc= new DialogContent();



    @Then("Already exist message should be displayed")
    public void alreadyExistMessageShouldBeDisplayed() {
        dc.verifyContainsTextFunction(dc.alreadyExistsMsg,"Already exists");
    }
}