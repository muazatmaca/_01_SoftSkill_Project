package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _03_Aynur {

    DialogContent dc=new DialogContent();
    @And("Click on the element in Dialog Content")
    public void clickOnTheElementInDialogContent(DataTable dt) {
        List<String> strButtons=dt.asList(String.class);

        for (String strButton: strButtons) {
            WebElement element=dc.getWebElement(strButton);
            dc.clickFunction(element);
        }
    }

    @Then("Required text is displayed")
    public void requiredTextIsDisplayed() {

        dc.verifyContainsTextFunction(dc.requiredText,"Required");
    }


}

