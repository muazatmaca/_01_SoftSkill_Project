package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _04_HaticeSteps {

    DialogContent dc = new DialogContent();

    @And("Enter employee Name")
    public void enterEmployeeName(DataTable dt) {
        List<List<String>> items = dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement element = dc.getWebElement(items.get(i).get(0));
            dc.sendKeysFunction(element, items.get(i).get(1));


        }
    }


    @And("Username sending the keys in Diyalog Content")
    public void usernameSendingTheKeysInDiyalogContent(DataTable dt) {
        List<List<String>> items = dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement element = dc.getWebElement(items.get(i).get(0));
            dc.sendKeysFunction(element, items.get(i).get(1));
        }

    }

    @And("Click on the saveButton element in Dialog Content")
    public void clickOnTheSaveButtonElementInDialogContent(DataTable items) throws InterruptedException {
        List<String> strButtons=items.asList(String.class);

        for (String strButton: strButtons) {
            WebElement element=dc.getWebElement(strButton);
            Thread.sleep(500);
            dc.clickFunction(element);
        }
        }




    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
       // dc.verifyContainsTextFunction(dc.successMsg,"");
    }
}