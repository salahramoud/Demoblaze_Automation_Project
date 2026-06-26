package com.demoblaze.pages;

import com.demoblaze.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignUpPage extends BasePage {

    public SignUpPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(css = "[id=\"sign-username\"]")
    private WebElement emailSignUpInput;


    @FindBy(css = "[id=\"sign-password\"]")
    private WebElement passwordSignUpInput;



    @FindBy(xpath = "//button[text()='Sign up']")
    private WebElement signUpButton;


    @FindBy(css = "[id=signInModalLabel]")
    private WebElement SignUpTitle;

    public SignUpPage signUp(String email ,String pass)
    {
        emailSignUpInput.sendKeys(email);
        passwordSignUpInput.sendKeys(pass);
        signUpButton.click();
        return this;

    }

    public SignUpPage acceptAlert()
    {
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        return this;

    }

    public Boolean isSignUpTitleDisplayed()
    {
        return SignUpTitle.isDisplayed();
    }




}
