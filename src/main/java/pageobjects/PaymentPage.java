package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.GenericMethods;

public class PaymentPage {

    WebDriver driver;

    public PaymentPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//span[@class='header-detail']")
    WebElement detailsButton;


    @FindBy(xpath = "//div[@class='order-summary-subsection']")
    WebElement productDetails;

    @FindBy(xpath = "//div[@class='list-title text-actionable-bold']")
    WebElement goPayGoPayLaterPaymentMethod;

    @FindBy(xpath = "//div[@class='collapsible-payment--multiple__title']")
    WebElement virtualAccountPaymentMethod;


    @FindBy(xpath = "//div[@class='list-divider']")
    WebElement creditDebitCardPaymentMethod;

    @FindBy(xpath = "//a[contains(@href,'#/credit-card')]")
    WebElement creditDebitCardButton;


    @FindBy(xpath = "//div[@class='list-title text-actionable-bold']")
    WebElement shopeePaySPayLaterPaymentMethod;

    @FindBy(xpath = "//div[@class='close-snap-button clickable']")
    WebElement closeProductDetailsPage;

    public void clickOnDetailsButton(){

        detailsButton.click();
    }

    public boolean verifyIfCheckoutButtonRedirectedToOrderSummary(){
        return detailsButton.isDisplayed();

    }

    public boolean verifyIfAllProductDetailsOnOrderSummaryPopup(){
        return productDetails.isDisplayed();

    }

    public boolean verifyIfGoPayGoPayLaterPaymentMethodIsAvailable(){
        return goPayGoPayLaterPaymentMethod.isDisplayed();

    }


    public boolean verifyIfVirtualAccountPaymentMethodIsAvailable(){
        return virtualAccountPaymentMethod.isDisplayed();

    }

    public boolean verifyIfCreditDebitCardPaymentMethodIsAvailable(){
        return creditDebitCardPaymentMethod.isDisplayed();

    }

    public boolean verifyIfShopeePaySPayLaterPaymentMethodIsAvailable(){
        return shopeePaySPayLaterPaymentMethod.isDisplayed();

    }


    public void closeProductDetailsButton(){
        closeProductDetailsPage.click();
        GenericMethods.pauseExecutionFor(2);
    }

    public boolean verifyIfProductDetailsPageIsClosed(){
        return closeProductDetailsPage.isDisplayed();

    }


    public void clickOnCreditDebitCard(){
        creditDebitCardButton.click();
        GenericMethods.pauseExecutionFor(2);
    }

    public boolean verifyIfUserCanClickOnCreditDebitCard(){
        return creditDebitCardButton.isDisplayed();

    }





}




