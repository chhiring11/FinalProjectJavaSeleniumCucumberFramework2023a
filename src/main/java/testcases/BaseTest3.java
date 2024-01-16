//package testcases;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.FindBy;
//import org.testng.Assert;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import pageobjects.*;
//import utils.BrowserFactory;
//import utils.GenericMethods;
//
//
//public class BaseTest3 {
////    public static Properties prop = new Properties();
//
//    WebDriver driver = null;
//    HomePage homePage;
//    CheckoutPage checkoutPage;
//    PaymentPage paymentPage;
//    CreditDebitCardPage creditDebitCardPage;
//    BankPaymentScreenPage bankPaymentScreenPage;
//
//
//
//    @BeforeClass
//    public void setUp(){
//
//        driver = BrowserFactory.launchGivenBrowser("chrome");
//        driver.get("https://demo.midtrans.com/");
//        homePage = new HomePage(driver);
//        checkoutPage = new CheckoutPage(driver);
//        paymentPage = new PaymentPage(driver);
//        creditDebitCardPage = new CreditDebitCardPage(driver);
//        bankPaymentScreenPage = new BankPaymentScreenPage(driver);
//
//
//    }
//
//    @Test(priority = 1)
//    public void verifyClickingOnBuyNowButtonRedirectUserToCheckoutPopup(){
//        homePage.clickOnBuyNowButton();
//        GenericMethods.pauseExecutionFor(2);
//        Assert.assertTrue(checkoutPage.verifyIfBuyNowButtonIsRedirectedToCheckoutPopup());
//
//    }
//
//    @Test(priority = 2)
//    public void verifyMidtransPillowAddedToCartWithCostOf20000(){
//        Assert.assertTrue(checkoutPage.verifyIfMidtransPillowHasAddedIntoCart());
//
//    }
//
//
//    @Test(priority = 3)
//    public void verifyIfNameButtonIsDisplayedOnCheckoutPage(){
//        Assert.assertTrue(checkoutPage.verifyIfNameButtonIsAvailable());
//    }
//
//    @Test(priority = 4)
//    public void verifyIfEmailButtonIsDisplayedOnCheckoutPage(){
//        Assert.assertTrue(checkoutPage.verifyIfEmailButtonIsAvailable());
//    }
//
//    @Test(priority = 5)
//    public void verifyIfPhoneNoButtonIsDisplayedOnCheckoutPage(){
//        Assert.assertTrue(checkoutPage.verifyIfPhoneNoButtonIsAvailable());
//    }
//
//    @Test(priority = 6)
//    public void verifyIfCityButtonIsDisplayedOnCheckoutPage(){
//        Assert.assertTrue(checkoutPage.verifyIfCityButtonIsAvailable());
//    }
//
//    @Test(priority = 7)
//    public void verifyIfAddressButtonIsDisplayedOnCheckoutPage(){
//        Assert.assertTrue(checkoutPage.verifyIfAddressButtonIsAvailable());
//    }
//
//    @Test(priority = 8)
//    public void verifyIfPostalCodeButtonIsDisplayedOnCheckoutPage(){
//        Assert.assertTrue(checkoutPage.verifyIfPostalCodeButtonIsAvailable());
//    }
//
//    @Test (priority = 9)
//    public void veriyNameIsEditableAndUserCanEnterTheirName() {
//        checkoutPage.clearNameField("Budi");
//        GenericMethods.pauseExecutionFor(2);
//        checkoutPage.enterNameField("Chhiring Gurung");
//        GenericMethods.pauseExecutionFor(2);
//    }
//
//    @Test (priority = 10)
//    public void veriyEmailIsEditableAndUserCanEnterTheirEmail() {
//        checkoutPage.clearEmailField("budi@utomo.com");
//        GenericMethods.pauseExecutionFor(2);
//        checkoutPage.enterEmailField("chhiring1998@gmail.com");
//        GenericMethods.pauseExecutionFor(2);
//    }
//
//    @Test (priority = 11)
//    public void veriyPhoneNoIsEditableAndUserCanEnterTheirPhoneNo() {
//        checkoutPage.clearPhoneNoField("081808466410");
//        GenericMethods.pauseExecutionFor(2);
//        checkoutPage.enterPhoneNoField("3473451111");
//        GenericMethods.pauseExecutionFor(2);
//    }
//
//    @Test(priority = 12)
//    public void verifyCityIsEditableAndUserCanEnterTheirPhoneNo(){
//        checkoutPage.clearCityField("Jakarta");
//        GenericMethods.pauseExecutionFor(2);
//        checkoutPage.enterCityField("Elmhurst");
//        GenericMethods.pauseExecutionFor(2);
//    }
//
//    @Test(priority = 13)
//    public void verifyAddressIsEditableAndUserCanEnterTheirAddress(){
//        checkoutPage.clearAddressField("MidPlaza 2, 4th Floor Jl.Jend.Sudirman Kav.10-11");
//        GenericMethods.pauseExecutionFor(2);
//        checkoutPage.enterAddressField("5432 84th Street, 2nd fl");
//        GenericMethods.pauseExecutionFor(2);
//    }
//
//    @Test(priority = 14)
//    public void verifyPostalCodeIsEditableAndUserCanEnterTheirPostalCode(){
//        checkoutPage.clearPostalCodeField("10220");
//        GenericMethods.pauseExecutionFor(2);
//        checkoutPage.enterPostalCodeField("11372");
//        GenericMethods.pauseExecutionFor(2);
//    }
//
//    @Test(priority = 15)
//    public void verifyClickingOnCheckoutButtonRedirectUserToOrderSummaryPopup(){
//        checkoutPage.clickOnCheckoutButton();
//        GenericMethods.pauseExecutionFor(2);
//
//    }
//
//    @Test(priority = 16)
//    public void verifyProductdetailsOnOrderSummaryPopup(){
//        driver.switchTo().frame("snap-midtrans");
//        GenericMethods.pauseExecutionFor(1);
//        paymentPage.clickOnDetailsButton();
//        GenericMethods.pauseExecutionFor(1);
//        Assert.assertTrue(paymentPage.verifyIfCheckoutButtonRedirectedToOrderSummary());
//
//    }
//
//    @Test(priority = 17)
//    public void verifyDetailsOfProductOnOrderSummaryPopup(){
//        Assert.assertTrue(paymentPage.verifyIfAllProductDetailsOnOrderSummaryPopup());
//
//    }
//
//
//    @Test(priority=18)
//    public void verifyGoPayGoPayLaterPaymentMethodIsAvailable(){
//        Assert.assertTrue(paymentPage.verifyIfGoPayGoPayLaterPaymentMethodIsAvailable());
//
//    }
//
//    @Test(priority = 19)
//    public void verifyVirtualAccountPaymentMethodIsAvailable(){
//        Assert.assertTrue(paymentPage.verifyIfVirtualAccountPaymentMethodIsAvailable());
//
//    }
//
//    @Test(priority = 20)
//    public void verifyCreditDebitCardPaymentMethodIsAvailable(){
//        Assert.assertTrue(paymentPage.verifyIfCreditDebitCardPaymentMethodIsAvailable());
//
//    }
//
//    @Test(priority = 21)
//    public void verifyShopeePaySPayLaterPaymentMethodIsAvailable(){
//        Assert.assertTrue(paymentPage.verifyIfShopeePaySPayLaterPaymentMethodIsAvailable());
//
//    }
//
//    @Test(priority = 22)
//    public void verifyProductDetailsPageIsClosed(){
//        paymentPage.closeProductDetailsButton();
//        Assert.assertTrue(paymentPage.verifyIfProductDetailsPageIsClosed());
//        GenericMethods.pauseExecutionFor(2);
//
//    }
//
//    @Test(priority = 23)
//    public void verifyClickingOnCreditDebitCardRedirectingToCardDetailsScreen(){
//        paymentPage.clickOnCreditDebitCard();
//        GenericMethods.pauseExecutionFor(2);
//    }
//
//    @Test(priority = 24)
//    public void verifyOrderAmountIsDisplayed(){
//        Assert.assertTrue(creditDebitCardPage.verifyIfOrderAmountIsDisplayed());
//
//    }
//
//
//    @Test (priority = 25)
//    public void verifyCardNumberIsEntered() {
//        creditDebitCardPage.clickingOnCardNumber();
//        GenericMethods.pauseExecutionFor(2);
////        Below code is not working
//        creditDebitCardPage.enterCardNumber("4811111111111114");
//        GenericMethods.pauseExecutionFor(2);
//    }
//
//
//    @Test (priority = 26)
//    public void verifyExpirationDateIsEntered() {
//        creditDebitCardPage.clickOnExpirationDate();
//        GenericMethods.pauseExecutionFor(2);
//        creditDebitCardPage.enterExpirationDate("0224");
//        GenericMethods.pauseExecutionFor(2);
//    }
//
//    @Test (priority = 27)
//    public void verifyCVVIsEntered() {
//        creditDebitCardPage.clickOnCVV();
//        GenericMethods.pauseExecutionFor(2);
//        creditDebitCardPage.enterCVV("123");
//        GenericMethods.pauseExecutionFor(2);
//    }
//
//    @Test(priority = 28)
//    public void verifyClickingOnPayNowRedirectToBankPaymentScreen() {
//        creditDebitCardPage.clickOnPayNowButton();
//        GenericMethods.pauseExecutionFor(3);
//        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='3ds-iframe']")));
//        GenericMethods.pauseExecutionFor(1);
//        Assert.assertTrue(bankPaymentScreenPage.verifyIfIssuingBankTextIsDisplayed());
//    }
//
//    @Test(priority = 29)
//    public void verifyMerchantNameIsAvailableOnBankPaymentScreen(){
//        Assert.assertTrue(bankPaymentScreenPage.verifyIfMerchantNameFieldIsDisplayed());
//    }
//
//    @Test(priority = 30)
//    public void verifyAmountIsAvailableOnBankPaymentScreen(){
//        Assert.assertTrue(bankPaymentScreenPage.verifyIfAmountIsDisplayed());
//    }
//
//    @Test(priority = 31)
//    public void verifyTransactionTimeIsAvailableOnBankPaymentScreen(){
//        Assert.assertTrue(bankPaymentScreenPage.verifyIfTransactionTimeIsDisplayed());
//    }
//
//    @Test(priority = 32)
//    public void verifyCardNumberIsAvailableOnBankPaymentScreen(){
//        Assert.assertTrue(bankPaymentScreenPage.verifyIfCardNumberIsDisplayed());
//    }
//
////    @Test (priority = 33)
////    public void verifyPasswordIsEntered() {
//////        bankPaymentScreenPage.clickOnPasswordField();
//////        GenericMethods.pauseExecutionFor(2);
////        bankPaymentScreenPage.enterPassword("112233");
////        GenericMethods.pauseExecutionFor(2);
////    }
//
////    @Test (priority = 33)
////    public void verifyPasswordIsEntered() {
////        bankPaymentScreenPage.clickingOnPassword();
////        GenericMethods.pauseExecutionFor(2);
////        bankPaymentScreenPage.enterPassword("112233");
////        GenericMethods.pauseExecutionFor(2);
////    }
////
////    @Test(priority = 34)
////    public void verifyClickingOnOKButtonRedirectToOrderSuccessfullScreen(){
////        Assert.assertTrue(bankPaymentScreenPage.verifyIfClickingOnOKButtonRedirectToOrderSuccessfullScreen());
////    }
//
//    @Test(priority = 34)
//    public void verifyClickingOnCancelButton(){
//        bankPaymentScreenPage.clickingOnCancelButton();
//        GenericMethods.pauseExecutionFor(2);
//    }
//
////    @Test (priority = 36)
////    public void verifyInvalidPasswordIsEntered() {
////        bankPaymentScreenPage.clickingOnPassword();
////        GenericMethods.pauseExecutionFor(2);
////        bankPaymentScreenPage.enterPassword("123456");
////        GenericMethods.pauseExecutionFor(2);
////    }
//
//
//
//    @AfterClass
//    public void tearDown(){
//        driver.quit();
//    }
//}
//
