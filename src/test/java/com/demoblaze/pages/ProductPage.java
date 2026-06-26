package com.demoblaze.pages;

import com.demoblaze.base.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage extends BasePage {

    public ProductPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(linkText = "Add to cart")
    private WebElement addToCartButton;



    public String addProductToCart()
    {
        addToCartButton.click();

        Alert alert = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.alertIsPresent());

        String alertText = alert.getText();

        alert.accept();

        return alertText;
    }

}
