package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.GenericMethods;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@class='btn buy']")
    WebElement buyNowButton;



    public void clickOnBuyNowButton(){

        buyNowButton.click();
    }

    public boolean verifyIfBuyNowButtonIsAvailable(){
        Actions action = new Actions(driver);
        action.moveToElement(buyNowButton).build().perform();
        GenericMethods.pauseExecutionFor(1);
        return buyNowButton.isDisplayed();


    }





}
