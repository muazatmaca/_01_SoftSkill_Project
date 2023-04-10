package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static Utility.GWD.driver;

public class _07_Etka {
    DialogContent dc = new DialogContent();
    @And("Enter invalid name")
    public void enterInvalidName(DataTable dt) {
        List <List<String>> items=dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++)
        {
            WebElement element=dc.getWebElement(items.get(i).get(0));
            dc.sendKeysFunction(element,items.get(i).get(1));

            Actions actions = new Actions(driver);
            Action action = actions.moveToElement(element).click().build();
            action.perform();


        }

    }
    @And("Invalid message should be displayed")
    public void invalidMessageShouldBeDisplayed() {
        dc.verifyContainsTextFunction(dc.invalidMessage, "Invalid");
    }


}
