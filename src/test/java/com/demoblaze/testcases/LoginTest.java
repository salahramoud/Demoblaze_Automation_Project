package com.demoblaze.testcases;

import com.demoblaze.base.BaseTest;
import com.demoblaze.pages.HomePage;
import com.demoblaze.pages.LoginPage;
import com.demoblaze.utils.ConfigUtils;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;

@Feature("Auth feature")
public class LoginTest extends BaseTest {

    @Test(groups={"E2E"} , description = "test the login functionality using email and password")
    public void shouldBeAbleToLoginWithEmailAndPassword()
    {
        HomePage homePage=new HomePage(driver);
        Boolean isWelcomeDisolayed =homePage.
                load()
                .loadLoginPage()
                .login(ConfigUtils.getInstance().getEmail(), ConfigUtils.getInstance().getPassword())
                .isWelcomeMessageDisplayed("salahramoud32@gmail.com");

        Assert.assertTrue(isWelcomeDisolayed);

    }




}
