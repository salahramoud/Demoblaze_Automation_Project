package com.demoblaze.testcases;

import com.demoblaze.base.BaseTest;
import com.demoblaze.pages.HomePage;
import com.demoblaze.pages.SignUpPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUPTest extends BaseTest {

    @Test (enabled = false)
    public void ShouldBeAbleToSignUpWithEmailAndPassword()
    {
        HomePage homePage=new HomePage(driver);
        boolean isTitleDisplayed = homePage
                .load()
                .loadSignUpPage()
                .signUp("salahraoud32@gmail.com","0147896325")
                .acceptAlert()
                .isSignUpTitleDisplayed();


        Assert.assertFalse(isTitleDisplayed);


    }
}
