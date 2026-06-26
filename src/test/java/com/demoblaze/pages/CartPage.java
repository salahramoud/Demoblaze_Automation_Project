package com.demoblaze.pages;

import com.demoblaze.base.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[text() ='Place Order']")
    private WebElement placeOrderButton;

    @FindBy(id = "name")
    private WebElement nameInput;

    @FindBy(id = "country")
    private WebElement countryInput;

    @FindBy(id = "city")
    private WebElement cityInput;

    @FindBy(id = "card")
    private WebElement creditCardInput;

    @FindBy(id = "month")
    private WebElement monthInput;

    @FindBy(id = "year")
    private WebElement yearInput;


    @FindBy(xpath = "//button[text()='Purchase']")
    private WebElement purchaseButton;

    @FindBy(xpath = "//button[text()='Close']")
    private WebElement closeButton;

    @FindBy(xpath = "//button[text()='OK']")
    private WebElement okButton;


    public CartPage setName(String cname) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(nameInput));
        nameInput.sendKeys(cname);
        return this;


    }

    public CartPage setCountry(String ccountry) {
        countryInput.sendKeys(ccountry);
        return this;

    }

    public CartPage setCity(String ccity) {
        cityInput.sendKeys(ccity);
        return this;

    }

    public CartPage setCard(String ccard) {
        creditCardInput.sendKeys(ccard);
        return this;

    }

    public CartPage setMonth(String cmonth) {
        monthInput.sendKeys(cmonth);
        return this;

    }

    public CartPage setYear(String cyear) {
        yearInput.sendKeys(cyear);
        return this;

    }

    public CartPage clickPlaceOrder() {
        placeOrderButton.click();
        return this;
    }

    public CartPage clickPurchase() {
        purchaseButton.click();
        return this;
    }


    public String clickOkToFinish() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Thank you for your purchase!']")));

        String actualMessage = message.getText();

        okButton.click();

        return actualMessage;
    }
}





