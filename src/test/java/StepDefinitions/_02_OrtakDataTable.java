package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _02_OrtakDataTable {
    DialogContent dc=new DialogContent();

    LeftNav ln=new LeftNav();

    @And("Click on the element in LeftNaw")
    public void clickOnTheElementInLeftNaw(DataTable items) {

        List<String> strButtons=items.asList(String.class);

        for (String strButton:strButtons){

            WebElement element=ln.getWebElement(strButton);
            ln.clickFunction(element);
        }

    }

    @And("Click on the element in Dialog")
    public void clickOnTheElementInDialog(DataTable items) {

        List<String> strButtons=items.asList(String.class);

        for (String strButton:strButtons){
            WebElement element=dc.getWebElement(strButton);
            dc.clickFunction(element);
        }


    }

    @And("User sending the keys in Dialog Content")
    public void userSendingTheKeysInDialogContent(DataTable dt) {
        List<List<String>> items=dt.asLists(String.class);
        for (int i = 0; i < items.size(); i++) {

            WebElement element=dc.getWebElement(items.get(i).get(0));
            dc.sendKeysFunction(element,items.get(i).get(1));
        }

    }
}
