package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class _03_Aynur {

    DialogContent dc=new DialogContent();

    @And("Click on add button")
    public void clickOnAddButton(){
        dc.clickFunction(dc.addButton);

    }

    @And("Click on save button")
    public void clickOnSaveButton(){
        dc.clickFunction(dc.saveButton);
    }


    @Then("Required text is displayed")
    public void requiredTextIsDisplayed() {

        dc.verifyContainsTextFunction(dc.requiredText,"Required");
    }
}

