package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _13_Zeynep {
    DialogContent dc= new DialogContent();
    @And("Password sending the keys in Dialog Content")
    public void passwordSendingTheKeysInDialogContent(DataTable dt) {
       List < List<String> > items=dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++)
        {
            WebElement element=dc.getWebElement(items.get(i).get(0));
            dc.sendKeysFunction(element,items.get(i).get(1));
        }

    }

    @Then("Notification message schould be displayed")
    public void notificationMessageSchouldBeDisplayed() {
        dc.verifyContainsTextFunction(dc.notificationMessage,"least 8 characters");

    }
}
