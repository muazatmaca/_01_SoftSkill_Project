package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static Utility.GWD.driver;

public class _04_Hatice {

DialogContent dc=new DialogContent();

    @And("Click on the element in Dialog Content")
    public void clickOnTheElementInDialogContent(DataTable dt) {
        List<String> strButtons=dt.asList(String.class);

        for (String strButton: strButtons) {
            WebElement element=dc.getWebElement(strButton); // webelemnti bul
            dc.clickFunction(element);

            Actions actions = new Actions(driver);
        Action action = actions.moveToElement(element).click().build();
        action.perform();


    }
}
