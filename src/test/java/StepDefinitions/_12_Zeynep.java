package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.Then;

public class _12_Zeynep {
    DialogContent dc=new DialogContent();
    @Then("Add User heading is displayed")
    public void addUserHeadingIsDisplayed() {
        dc.verifyContainsTextFunction(dc.AddUser,"Add User");
    }
}
