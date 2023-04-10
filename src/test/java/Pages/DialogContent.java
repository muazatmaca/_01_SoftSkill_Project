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

    @FindBy(xpath = "//h6[text()='User Management']")
    public WebElement adminUserManagementText;

    @FindBy(xpath = "//span[text()='User Management ']")
    public WebElement userManagementButton;

    @FindBy(xpath = "//span[text()='User Management ']")
    public WebElement usersButton;


    @FindBy(xpath = "//div[@class='orangehrm-header-container']//button") // diger sayfalarda da ayni locater..
    public WebElement addButton;

   // (//button[@type='button'])[4]

    @FindBy(xpath = "//h6[text()='Admin']")
    public WebElement adminText;

    @FindBy(xpath = "((//div[@class='oxd-select-wrapper'])[1]//div)[1]")
    public WebElement userRoleSelect;

    @FindBy(xpath = "(//div[@class='oxd-select-text-input'])[1]")
    public WebElement adminSelect;

    @FindBy(xpath = "//div[@class='orangehrm-card-container']//h6")
    public WebElement AddUser;

    @FindBy(xpath = "//button[text()=' Save ']")
    public WebElement saveButton;

    @FindBy(xpath = "(//span[text()='Required'])[1]")
    public WebElement requiredText;

    public WebElement getWebElement(String strButton){
        WebElement myElement=null;

        switch (strButton){
            case "userManagementButton":return userManagementButton;
            case "usersButton":return usersButton;

            case "addButton":return addButton;
            case "userRoleSelect":return userRoleSelect;
            case "adminSelect":return adminSelect;


        }

        return null;
    }






}
