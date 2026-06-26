package com.demoblaze.testcases;

import com.demoblaze.base.BaseTest;
import com.demoblaze.pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Feature;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

@Feature("Cart feature")
public class AddToCartTest extends BaseTest {

    @Test(priority = 1 , description = "test adding product to cart")
    public void shouldBeAbleToAddProductToCart()
    {
        HomePage homePage=new HomePage(driver);
        String actualAlert =
                homePage
                .load()
                .loadLoginPage()
                .login("salahramoud32@gmail.com","0147896325")
                .getSamsungGalaxyS6()
                .addProductToCart();


        Assert.assertEquals(actualAlert,"Product added.");




    }



}
