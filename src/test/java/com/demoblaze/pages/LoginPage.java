package com.demoblaze.pages;

import com.demoblaze.base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage  extends BasePage {

    public LoginPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(css = "[id=\"loginusername\"]")
    private WebElement emailLoginInput;


    @FindBy(css = "[id=\"loginpassword\"]")
    private WebElement passwordLoginInput;



    @FindBy(xpath = "//button[text()='Log in']")
    private WebElement loginButton;

    @FindBy(xpath = "//button[text()='Close']")
    private WebElement closeButton;


    @Step("login with email and password")
    public HomePage login( String email ,String pass)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername")));
        emailLoginInput.sendKeys(email);
        passwordLoginInput.sendKeys(pass);
        loginButton.click();
        return new HomePage(driver);
    }












}
