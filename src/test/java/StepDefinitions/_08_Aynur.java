package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;

import org.testng.Assert;

public class _08_Aynur {

    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();
    @And("Click on the element in LeftNav")
    public void clickOnTheElementInLeftNav() {

    }
    @And("Add button is displayed")
    public void addButtonIsDisplayed()
    {
        dc.verifyContainsTextFunction(dc.addButton,"Add");
    }

}
