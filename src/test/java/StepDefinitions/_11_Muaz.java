package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _11_Muaz {
    DialogContent dc=new DialogContent();
    @Then("User should login Admin User Management succesfully")
    public void userShouldLoginAdminUserManagementSuccesfully() {

        dc.verifyContainsTextFunction(dc.adminUserManagementText,"User Management");


    }

    @Then("User should login Admin page succesfully")
    public void userShouldLoginAdminPageSuccesfully() {
        dc.verifyContainsTextFunction(dc.adminText,"Admin");

    }

    @And("All elements should be displayed management page")
    public void allElementsShouldBeDisplayedManagementPage(DataTable items) {

        List<String> strButtons=items.asList(String.class);
        for (String strButton:strButtons){

            WebElement element=dc.getWebElement(strButton);
            dc.elementsDisplayed(element);
        }







    }
}
