package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;

import org.testng.Assert;

public class _08_Aynur {
    DialogContent dc=new DialogContent();
    @And("Add button is displayed")
    public void addButtonIsDisplayed()
    {
        dc.verifyContainsTextFunction(dc.addButton,"Add");
    }


}
