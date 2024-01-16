package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.GenericMethods;

public class BankPaymentScreenPage {

        WebDriver driver;

        public BankPaymentScreenPage(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }

    @FindBy(xpath = "//h1[contains(@class, 'left')]")
    WebElement issuingBankText;


    @FindBy(xpath = "(//label[contains(@class, 'col-xs-5 control-label')])[1]")
    WebElement merchantNameField;

    @FindBy(xpath = "(//label[contains(@class, 'col-xs-5 control-label')])[2]")
    WebElement amountField;

    @FindBy(xpath = "(//label[contains(@class, 'col-xs-5 control-label')])[3]")
    WebElement transactionTimeField;

    @FindBy(xpath = "(//label[contains(@class, 'col-xs-5 control-label')])[4]")
    WebElement cardNumberField;

//    @FindBy(xpath = "(//input[@type='password']")
//    WebElement passwordField;

//    @FindBy(xpath = "(//input[@class='form-control input-xs']")
//    WebElement passwordField;

//    @FindBy(xpath = "(//input[contains(@placeholder,'112233')]")
//    WebElement passwordField;

//    @FindBy(xpath = "(//input[contains(@id,'otp')]")
//    WebElement passwordField;

    @FindBy(id = "otp")
    WebElement passwordField;
//After doing all above xpath, simple id locator worked. How to know which locator to use?

    @FindBy(name = "ok")
    WebElement okButton;

//    @FindBy(xpath = "//button[@name='ok']")
//    WebElement okButton;

    @FindBy(name = "cancel")
    WebElement cancelButton;
    public boolean verifyIfIssuingBankTextIsDisplayed(){
        return issuingBankText.isDisplayed();

    }

    public boolean verifyIfMerchantNameFieldIsDisplayed(){
        return merchantNameField.isDisplayed();

    }

    public boolean verifyIfAmountIsDisplayed(){
        return amountField.isDisplayed();

    }

    public boolean verifyIfTransactionTimeIsDisplayed(){
        return transactionTimeField.isDisplayed();

    }

    public boolean verifyIfCardNumberIsDisplayed(){
        return cardNumberField.isDisplayed();

    }

    public void clickingOnPassword(){
        passwordField.click();
    }

    public void enterPassword(String text){
        passwordField.sendKeys(text);
    }

    public boolean verifyIfClickingOnOKButtonRedirectToOrderSuccessfullScreen() {
        return passwordField.isDisplayed();

    }

    public void clickingOnOkButton(){
        okButton.click();
    }

    public boolean verifyIfClickingOnOKButton(){
        return okButton.isDisplayed();

    }

    public void clickingOnCancelButton(){
        cancelButton.click();
    }




}
