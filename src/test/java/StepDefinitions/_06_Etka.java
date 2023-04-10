package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;

public class _06_Etka {
    DialogContent dc = new DialogContent();
    @And("Do not match message should be displayed")
    public void doNotMatchMessageShouldBeDisplayed() {
        dc.verifyContainsTextFunction(dc.matchErrorMessage, "do not");
    }
}
