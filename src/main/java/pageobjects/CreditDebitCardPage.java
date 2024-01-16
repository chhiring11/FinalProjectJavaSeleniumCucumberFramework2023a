package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.GenericMethods;

public class CreditDebitCardPage {

    WebDriver driver;

    public CreditDebitCardPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//div[contains(@class,'header-amount')]")
    WebElement orderAmountText;

//    @FindBy(xpath = "//div[contains(@class, 'card-number')]")
//    WebElement cardNumberField;


//    @FindBy(xpath = "//input[contains(@placeholder,'1234')]")
//    WebElement cardNumberField;

//    After trying multiple times, I finally got this correct. The moral is try with different locators even if it is xpath.
//    Try with contains method and even with basic method
    @FindBy(xpath = "//input[@autocomplete='cc-number']")
    WebElement cardNumberField;


    @FindBy(xpath = "//input[contains(@id,'card-expiry')]")
    WebElement expirationDateField;


    @FindBy(xpath = "//input[contains(@id,'card-cvv')]")
    WebElement cVVField;


    @FindBy(xpath = " //button[@type='button']")
    WebElement payNowButton;



    public boolean verifyIfOrderAmountIsDisplayed(){
        return orderAmountText.isDisplayed();
    }


    public void clickingOnCardNumber(){
        cardNumberField.click();
    }

    public void enterCardNumber(String text){
        cardNumberField.sendKeys(text);
    }

    public void clickOnExpirationDate(){
        expirationDateField.click();
    }

    public void enterExpirationDate(String text){
        expirationDateField.sendKeys(text);
    }

    public void clickOnCVV(){
        cVVField.click();
    }

    public void enterCVV(String text){
        cVVField.sendKeys(text);
    }

    public void clickOnPayNowButton(){
        payNowButton.click();
    }



}
