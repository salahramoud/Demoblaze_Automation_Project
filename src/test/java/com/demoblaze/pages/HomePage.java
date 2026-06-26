package com.demoblaze.pages;

import com.demoblaze.base.BasePage;
import com.demoblaze.utils.ConfigUtils;
import com.demoblaze.utils.PropertiesUtils;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Properties;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver)
    {
        super(driver);

    }

    @FindBy(css ="[id=\"signin2\"]")
    private WebElement signUpPageButton;

    @FindBy(css ="[id=\"login2\"]")
    private WebElement loginPageButton;

    @FindBy(linkText = "Cart")
    private WebElement cartPageButton;

    @FindBy(css ="[id=\"nameofuser\"]")
    private WebElement welcomeMessage;

    @FindBy(linkText = "Samsung galaxy s6")
    private WebElement samsungGalaxyS6;





    @Step("load the home page")
    public HomePage load()
    {
        driver.get(ConfigUtils.getInstance().getBaseUrl());
        return this;
    }

    public SignUpPage loadSignUpPage()
    {
        signUpPageButton.click();
        return new SignUpPage(driver);
    }


    @Step("load the login page")
    public LoginPage loadLoginPage()
    {
        loginPageButton.click();
        return new LoginPage(driver);
    }

    public CartPage loadCartPage()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.id("nameofuser")));
        cartPageButton.click();
        return new CartPage(driver);
    }



    public Boolean isWelcomeMessageDisplayed(String username)
    {
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nameofuser")));
        String actualText =welcomeMessage.getText();
        return actualText.equals("Welcome "+username);

    }

    public ProductPage getSamsungGalaxyS6()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.id("nameofuser")));

        samsungGalaxyS6.click();

        return new ProductPage(driver);
    }




}
