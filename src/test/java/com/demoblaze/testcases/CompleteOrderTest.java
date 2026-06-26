package com.demoblaze.testcases;

import com.demoblaze.base.BaseTest;
import com.demoblaze.pages.HomePage;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;

@Feature("Order feature")
public class CompleteOrderTest extends BaseTest {

    @Test(description = "test order the product")
    public void shouldAbleToCompleteOrder()
    {
        HomePage homePage=new HomePage(driver);

        String actualMessage =homePage
                .load()
                .loadLoginPage()
                .login("salahramoud32@gmail.com","0147896325")
                .loadCartPage()
                .clickPlaceOrder()
                .setName("salah")
                .setCountry("Egypt")
                .setCity("Giza")
                .setCard("555")
                .setMonth("11")
                .setYear("2000")
                .clickPurchase()
                .clickOkToFinish();

        Assert.assertEquals(actualMessage ,"Thank you for your purchase!");



    }
}
