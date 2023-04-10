package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;

public class _07_Etka {
    DialogContent dc = new DialogContent();
    @And("Enter invalid name")
    public void enterInvalidName() {
        dc.verifyContainsTextFunction(dc.notificationMessage, "Invalid");
    }
}
