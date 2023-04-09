package StepDefinitions;

import Pages.DialogContent;
import Utility.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _01_LoginSteps {
    DialogContent dc=new DialogContent();
    @Given("Navigate to OrangeHRM")
    public void navigateToOrangeHRM() {
        GWD.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {

        dc.sendKeysFunction(dc.username,"Admin");
        dc.sendKeysFunction(dc.password,"admin123");
        dc.clickFunction(dc.loginButton);

    }

    @Then("User should login succesfully")
    public void userShouldLoginSuccesfully() {
        dc.verifyContainsTextFunction(dc.myActionsText,"My Actions");
    }
}
