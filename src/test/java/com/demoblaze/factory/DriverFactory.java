package com.demoblaze.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class DriverFactory {


    public WebDriver intializeDriver()
    {
        WebDriver driver;
        String browser=System.getProperty("browser","CHROME");

        switch (browser)
        {
            case "CHROME":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();

                break;
            case "FAIRFOX":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "SAFARI":
                driver = new SafariDriver();
                break;
            default:
                throw new RuntimeException("the browser is not supported");

        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        return driver;

    }

}
