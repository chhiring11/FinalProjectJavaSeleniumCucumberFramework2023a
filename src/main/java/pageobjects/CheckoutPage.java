package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

    WebDriver driver;

    public CheckoutPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//div[@class='cart-checkout']")
    WebElement checkoutButton;

    @FindBy(xpath = "//td[@class='amount']")
    WebElement totalAmountButton;

    @FindBy(xpath = "//td[normalize-space()='Name']")
    WebElement nameButton;

    @FindBy(xpath = "//td[normalize-space()='Email']")
    WebElement emailButton;

    @FindBy(xpath = "//td[normalize-space()='Phone no']")
    WebElement phoneNoButton;

    @FindBy(xpath = "//td[normalize-space()='City']")
    WebElement cityButton;

    @FindBy(xpath = "//td[normalize-space()='Address']")
    WebElement addressButton;

    @FindBy(xpath = "//td[normalize-space()='Postal Code']")
    WebElement postalCodeButton;

    @FindBy(xpath = "//input[@value='Budi']")
    WebElement nameField;

    @FindBy(xpath = "//input[@value='budi@utomo.com']")
    WebElement emailField;

    @FindBy(xpath = "//input[@value='081808466410']")
    WebElement phoneNoField;

    @FindBy(xpath = "//input[@value='Jakarta']")
    WebElement cityField;

    @FindBy(xpath = "//textarea[normalize-space()='MidPlaza 2, 4th Floor Jl.Jend.Sudirman Kav.10-11']")
    WebElement addressField;

    @FindBy(xpath = "//input[@value='10220']")
    WebElement postalCodeField;





    public boolean verifyIfBuyNowButtonIsRedirectedToCheckoutPopup(){
        return checkoutButton.isDisplayed();

    }

    public boolean verifyIfMidtransPillowHasAddedIntoCart(){
        return totalAmountButton.isDisplayed();

    }
    public boolean verifyIfNameButtonIsAvailable(){
        return nameButton.isDisplayed();
    }

    public boolean verifyIfEmailButtonIsAvailable(){
        return nameButton.isDisplayed();
    }

    public boolean verifyIfPhoneNoButtonIsAvailable(){
        return phoneNoButton.isDisplayed();
    }

    public boolean verifyIfCityButtonIsAvailable(){
        return cityButton.isDisplayed();
    }

    public boolean verifyIfAddressButtonIsAvailable(){
        return addressButton.isDisplayed();
    }

    public boolean verifyIfPostalCodeButtonIsAvailable(){
        return postalCodeButton.isDisplayed();
    }

    public void clearNameField(String text){

        nameField.clear();
    }


    public void enterNameField(String text){

        nameField.sendKeys(text);
    }

    public void clearEmailField(String text){

        emailField.clear();
    }


    public void enterEmailField(String text){

        emailField.sendKeys(text);
    }

    public void clearPhoneNoField(String text){

        phoneNoField.clear();
    }


    public void enterPhoneNoField(String text){

        phoneNoField.sendKeys(text);
    }

    public void clearCityField(String text){
        cityField.clear();
    }

    public void enterCityField(String text){
        cityField.sendKeys(text);
    }

    public void clearAddressField(String text){
        addressField.clear();
    }

    public void enterAddressField(String text){
        addressField.sendKeys(text);
    }

    public void clearPostalCodeField(String text){
        postalCodeField.clear();
    }

    public void enterPostalCodeField(String text){
        postalCodeField.sendKeys(text);
    }

    public void clickOnCheckoutButton(){

        checkoutButton.click();
    }



}
