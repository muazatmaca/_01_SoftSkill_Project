package Pages;

import Utility.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent{


    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(),this);
    }
    @FindBy(xpath = "//input[@placeholder='Username']")
    public WebElement username;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//p[text()='My Actions']")
    public WebElement myActionsText;

    public WebElement getWebElement(String strButton){
        WebElement myElement=null;

        switch (strButton){




        }

        return null;
    }






}
