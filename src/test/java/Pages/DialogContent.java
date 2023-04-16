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

    @FindBy(xpath = "//label[text()='User Role']")
    public WebElement userRoleSelectTxt;

    @FindBy(xpath = "//label[text()='Status']")
    public WebElement userStatusSelectTxt;

    @FindBy(xpath = "(//div[@class='oxd-select-text--after'])[1]")
    public WebElement userRoleSelect;

    @FindBy(xpath = "(//div[@role='listbox'])//*[3]")
    public WebElement adminSelect;

    @FindBy(xpath = "(//div[@class='oxd-select-text--after'])[2]")
    public WebElement userStatusSelect;

    @FindBy(xpath="(//div[@role='listbox'])//*[2]")
    public WebElement EnabledSelect;


    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    public WebElement userName;

    @FindBy(xpath = "//div[@class='orangehrm-card-container']//h6")
    public WebElement AddUser;

    @FindBy(xpath = "//div[@class='oxd-form-actions']//button[@type='submit']")
    public WebElement saveButton;


    @FindBy(xpath = "(//span[text()='Required'])[1]")
    public WebElement requiredText;

    @FindBy(xpath = "(//input[@type='password'])[1]")
    public WebElement add_password;

    @FindBy(xpath = "(//*[@class='oxd-input-group oxd-input-field-bottom-space'])[5]//span")
    public WebElement notificationMessage;

    @FindBy(xpath = "(//input[@type='password'])[2]")
    public WebElement add_passwordConfirm;

    @FindBy(xpath = "//span[text()='Passwords do not match']")
    public WebElement matchErrorMessage;

    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    public WebElement employeeName;

    @FindBy(xpath="(//div[@role='listbox'])//*[2]")
    public WebElement employeeNameselect;

    @FindBy(xpath = "")
    WebElement successMsg;

    @FindBy(xpath = "//span[text()='Invalid']")
    public WebElement invalidMessage;

    @FindBy(xpath = "//span[text()='Already exists']")
    public WebElement alreadyExistsMsg;

    public WebElement getWebElement(String strButton){
        WebElement myElement=null;

        switch (strButton){
            case "userManagementButton":return userManagementButton;
            case "usersButton":return usersButton;
            case "addButton":return addButton;
            case "userRoleSelect":return userRoleSelect;
            case "adminSelect":return adminSelect;
            case "userStatusSelect" : return  userStatusSelect;
            case  "EnabledSelect" : return EnabledSelect;
            case "userStatusSelectTxt" :return userStatusSelectTxt;
            case "userName" : return userName;
            case "add_password":return add_password;
            case "notificationMessage":return notificationMessage;
            case "add_passwordConfirm":return add_passwordConfirm;
            case "matchErrorMessage":return matchErrorMessage;
            case "employeeName":return employeeName;
            case "employeeNameselect" :return employeeNameselect;
            case "saveButton" :return saveButton;
            case "successMsg" :return successMsg;
            case "invalidMessage":return invalidMessage;
            case "alreadyExists" : return alreadyExistsMsg;
            case "userRoleSelectTxt":return userRoleSelectTxt;

        }

        return null;
    }






}
