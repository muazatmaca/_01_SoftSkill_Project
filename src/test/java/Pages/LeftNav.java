package Pages;

import Utility.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {

    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@class='oxd-main-menu-item'])[1]")
    public WebElement admin;



    public WebElement getWebElement(String strButton) {

        WebElement myElement = null;

        switch (strButton) {
            case "admin":return admin;



        }

        return null;
    }

}
