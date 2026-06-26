package com.demoblaze.base;

import com.demoblaze.factory.DriverFactory;
import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void setup()
    {
        driver =new DriverFactory().intializeDriver();
    }

    @AfterMethod(alwaysRun = true)
    public void teardown(ITestResult result)
    {
        String testCaseName =result.getMethod().getMethodName();
        File destFile= new File("target" +File.separator +"screenshots" +File.separator +testCaseName+".png");
        takeScreenshot(destFile);
        driver.quit();

    }

    public void takeScreenshot(File destFile)
    {
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file ,destFile);
            InputStream inputStream=new FileInputStream(destFile);
            Allure.addAttachment("screenshots",inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }



}
