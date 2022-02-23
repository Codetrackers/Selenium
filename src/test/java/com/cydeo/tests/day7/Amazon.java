package com.cydeo.tests.day7;

import com.cydeo.utillities.BrowserUtils;
import com.cydeo.utillities.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Amazon {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        //TC #1: Window Handle practice
        // 1. Create new test and make set ups

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Test
    public void Amazon(){
        //2. Go to : https://www.amazon.com/
        driver.get("https://www.amazon.com/");



        //3. Copy-paste the lines from below into your class
        ((JavascriptExecutor) driver).executeScript("window.open('https://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://facebook.com','_blank');");

                //4. Create a logic to switch to the tab where Etsy.com is open
        BrowserUtils.switchWindowAndVerify(driver,"etsy","Etsy");

    }

    @AfterMethod
    public void close(){
        driver.quit();
    }


}
