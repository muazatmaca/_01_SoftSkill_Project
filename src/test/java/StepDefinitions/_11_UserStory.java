package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class _11_UserStory {
    DialogContent dc=new DialogContent();
    @Then("User should login Admin User Management succesfully")
    public void userShouldLoginAdminUserManagementSuccesfully() {

        dc.verifyContainsTextFunction(dc.adminUserManagementText,"User Management");


    }

    @Then("User should login Admin page succesfully")
    public void userShouldLoginAdminPageSuccesfully() {
        dc.verifyContainsTextFunction(dc.adminText,"Admin");

    }

    @And("Click the addButton")
    public void clickTheAddButton() {
        dc.clickFunction(dc.addButton);
    }
}
