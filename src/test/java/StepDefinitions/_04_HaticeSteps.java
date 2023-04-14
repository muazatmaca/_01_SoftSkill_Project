package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
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
        List < List<String> > items=dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++)
        {
            WebElement element=dc.getWebElement(items.get(i).get(0));
            dc.sendKeysFunction(element,items.get(i).get(1));
        }

    }
}


