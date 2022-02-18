package com.cydeo.tests.day6;

import com.cydeo.utillities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC1 {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://practice.cydeo.com/javascript_alerts");
    }
    //TC #1: Information alert practice
    //1. Open browser
    //2. Go to website: http://practice.cydeo.com/javascript_alerts



    //


    @Test
    public void alert_test1() {
        WebElement JSKey = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        //3. Click to “Click for JS Alert” button
        JSKey.click();
        //4. Click to OK button from the alert
        Alert alert = driver.switchTo().alert();
        alert.accept();



       //5. Verify “You successfully clicked an alert” text is displayed.
        WebElement resultText= driver.findElement(By.xpath("//p[@id='result']"));
        Assert.assertTrue(resultText.isDisplayed(),"result text is Not Display ");

    }

    @AfterMethod
    public void close (){
      driver.close();
    }
}
