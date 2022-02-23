package com.cydeo.tests.day7;

import com.cydeo.utillities.BrowserUtils;
import com.cydeo.utillities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC2 {
    /*
 TC #3: Login scenario
 1. Create new test and make set ups

3. Enter valid username
4. Enter valid password
5. Click to Log In button
6. Verify title is as expected:
Expected: Portal

USERNAME  PASSWORD
helpdesk1@cybertekschool.com  UserUser
Helpdesk2@cybertekschool.com  UserUser

     */
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
    public void crm_logIn_test() {
        //  2. Go to : https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");


        //  3. Enter valid username
        WebElement userName = driver.findElement(By.xpath("//input[@type='text']"));
        userName.sendKeys("helpdesk1@cybertekschool.com");


        //  4. Enter valid password
        WebElement passWord = driver.findElement(By.xpath("//input[@type='password']"));
        passWord.sendKeys("UserUser");


        //5. Click to Log In button
        WebElement LogInBtn = driver.findElement(By.xpath("//input[@type='submit']"));
        LogInBtn.click();


        //6. Verify title is as expected:Portal
        BrowserUtils.verifyTitle(driver, "Portal");


    }


}
