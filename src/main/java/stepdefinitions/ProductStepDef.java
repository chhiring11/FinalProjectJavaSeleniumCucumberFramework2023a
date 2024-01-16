package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageobjects.*;
import utils.BrowserFactory;
import utils.GenericMethods;


public class ProductStepDef {

    WebDriver driver = null;
    HomePage homePage;
    CheckoutPage checkoutPage;
    PaymentPage paymentPage;
    CreditDebitCardPage creditDebitCardPage;
    BankPaymentScreenPage bankPaymentScreenPage;


    @Before
    public void tearUp(){
        driver = BrowserFactory.launchGivenBrowser("chrome");
        driver.get("https://demo.midtrans.com/");
        homePage = new HomePage(driver);
        checkoutPage = new CheckoutPage(driver);
        paymentPage = new PaymentPage(driver);
        creditDebitCardPage = new CreditDebitCardPage(driver);
        bankPaymentScreenPage = new BankPaymentScreenPage(driver);

    }

    @Given("I am on Shopping Website")
    public void launchWebsite(){
        driver.get("https://demo.midtrans.com/");

    }

    @When("I click Buy Now button on Home Page")
    public void clickBuyNowButton(){
        homePage.clickOnBuyNowButton();
        GenericMethods.pauseExecutionFor(2);

    }

    @Then("I am on Checkout Page")
    public void verifyIfCheckoutPopupIsDisplayed(){
        Assert.assertTrue(checkoutPage.verifyIfBuyNowButtonIsRedirectedToCheckoutPopup());

    }


    @Then("I enter name on Checkout Page")
    public void enterName(){
        checkoutPage.clearNameField("Budi");
        GenericMethods.pauseExecutionFor(2);
        checkoutPage.enterNameField("Chhiring Gurung");
        GenericMethods.pauseExecutionFor(2);

    }

    @And("I enter email on Checkout Page")
    public void enterEmail(){
        checkoutPage.clearEmailField("budi@utomo.com");
        GenericMethods.pauseExecutionFor(2);
        checkoutPage.enterEmailField("chhiring1998@gmail.com");
        GenericMethods.pauseExecutionFor(2);

    }

    @And("I enter phone no on Checkout Page")
    public void enterPhoneNo(){
        checkoutPage.clearPhoneNoField("081808466410");
        GenericMethods.pauseExecutionFor(2);
        checkoutPage.enterPhoneNoField("3473451111");
        GenericMethods.pauseExecutionFor(2);
    }

    @And("I enter city on Checkout Page")
    public void enterCity(){
        checkoutPage.clearCityField("Jakarta");
        GenericMethods.pauseExecutionFor(2);
        checkoutPage.enterCityField("Elmhurst");
        GenericMethods.pauseExecutionFor(2);
    }

    @And("I enter address on Checkout Page")
    public void enterAddress(){
        checkoutPage.clearAddressField("MidPlaza 2, 4th Floor Jl.Jend.Sudirman Kav.10-11");
        GenericMethods.pauseExecutionFor(2);
        checkoutPage.enterAddressField("5432 84th Street, 2nd fl");
        GenericMethods.pauseExecutionFor(2);
    }

    @And("I enter postal code on Checkout Page")
    public void enterPostalCode(){
        checkoutPage.clearPostalCodeField("10220");
        GenericMethods.pauseExecutionFor(2);
        checkoutPage.enterPostalCodeField("11372");
        GenericMethods.pauseExecutionFor(2);

    }

    @And("I click on Checkout Button")
    public void clickOnCheckoutButton(){
        checkoutPage.clickOnCheckoutButton();
        GenericMethods.pauseExecutionFor(2);

    }

    @Then("I am on Order Summary Page")
    public void verifyOrderSummaryPagePopup(){
        driver.switchTo().frame("snap-midtrans");
        GenericMethods.pauseExecutionFor(1);
        paymentPage.clickOnDetailsButton();
        GenericMethods.pauseExecutionFor(1);
        Assert.assertTrue(paymentPage.verifyIfCheckoutButtonRedirectedToOrderSummary());
    }

    @And("I click on Details tab")
    public void verifyProductDetailsPopup(){
        Assert.assertTrue(paymentPage.verifyIfAllProductDetailsOnOrderSummaryPopup());
    }

    @And("I close Details tab")
    public void closeDetailsTab(){
        paymentPage.closeProductDetailsButton();
        Assert.assertTrue(paymentPage.verifyIfProductDetailsPageIsClosed());
        GenericMethods.pauseExecutionFor(2);
    }

    @And("I am on Payment Page")
    public void verifyPaymentOptionsIsDisplayed(){
        Assert.assertTrue(paymentPage.verifyIfCreditDebitCardPaymentMethodIsAvailable());
    }

    @Then("I click on credit card")
    public void clickOnCreditDebitCard(){
        paymentPage.clickOnCreditDebitCard();
        GenericMethods.pauseExecutionFor(2);
    }

    @And("I am on Card Details Page")
    public void verifyCardDetailsPagePopup(){
        Assert.assertTrue(creditDebitCardPage.verifyIfOrderAmountIsDisplayed());
    }

    @And("I enter Card Number")
    public void enterCardNumber(){
        creditDebitCardPage.clickingOnCardNumber();
        GenericMethods.pauseExecutionFor(2);
        creditDebitCardPage.enterCardNumber("4811111111111114");
        GenericMethods.pauseExecutionFor(2);
    }

    @And("I enter Expiration Date")
    public void enterExpirationDate(){
        creditDebitCardPage.clickOnExpirationDate();
        GenericMethods.pauseExecutionFor(2);
        creditDebitCardPage.enterExpirationDate("0224");
        GenericMethods.pauseExecutionFor(2);
    }

    @And("I enter CVV")
    public void enterCVV(){
        creditDebitCardPage.clickOnCVV();
        GenericMethods.pauseExecutionFor(2);
        creditDebitCardPage.enterCVV("123");
        GenericMethods.pauseExecutionFor(2);
    }

    @Then("I click on Pay Now Button")
    public void clickOnPayNow(){
        creditDebitCardPage.clickOnPayNowButton();
        GenericMethods.pauseExecutionFor(3);
    }

    @Then("I am on Bank Payment Screen Page")
    public void verifyIfIAmOnBankPaymentScreenPage(){
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='3ds-iframe']")));
        GenericMethods.pauseExecutionFor(1);
        Assert.assertTrue(bankPaymentScreenPage.verifyIfIssuingBankTextIsDisplayed());
    }

    @And("I enter Password")
    public void enterPassword() {
        bankPaymentScreenPage.clickingOnPassword();
        GenericMethods.pauseExecutionFor(2);
        bankPaymentScreenPage.enterPassword("112233");
        GenericMethods.pauseExecutionFor(2);
    }

    @And("I click on Ok Button")
    public void verifyClickingOnOkButtonWillRedirectOrderSuccessfulScreen(){
        bankPaymentScreenPage.clickingOnOkButton();
        GenericMethods.pauseExecutionFor(2);
    }

    @And("I enter invalid Password")
    public void enterInvalidPassword() {
        bankPaymentScreenPage.clickingOnPassword();
        GenericMethods.pauseExecutionFor(2);
        bankPaymentScreenPage.enterPassword("123456");
        GenericMethods.pauseExecutionFor(2);
    }

    @And("I click on Ok Button after entering invalid Password")
    public void verifyClickingOnOkButtonDoesNotRedirectToOrderSuccessfulScreen(){
        bankPaymentScreenPage.clickingOnOkButton();
        GenericMethods.pauseExecutionFor(2);
    }

    @And("I click on Cancel Button")
    public void clickCancelButton(){
        bankPaymentScreenPage.clickingOnCancelButton();
        GenericMethods.pauseExecutionFor(2);

    }



    @After
    public void tearDown(){
        driver.quit();

    }

}



