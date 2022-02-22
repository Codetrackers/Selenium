package com.cydeo.tests.day6.Homework;

import com.cydeo.utillities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC3 {
    //TC #3: Information alert practice
    //1. Open browser
    //2. Go to website: http://practice.cydeo.com/javascript_alerts
    //3. Click to “Click for JS Prompt” button
    //4. Send “hello” text to alert
    //5. Click to OK button from the alert
    //6. Verify “You entered:  hello” text is displayed.

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver.get("http://practice.cydeo.com/javascript_alerts");

    }

    @Test
    public void SJBtnClick() throws InterruptedException {
    //3. Click to “Click for JS Prompt” button
       WebElement SJBtn= driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
       SJBtn.click();



        //4. Send “hello” text to alert
        Alert alert= driver.switchTo().alert();
       // alert.accept();

      alert.sendKeys("hello");
        alert.accept();
        //5. Click to OK button from the alert

      WebElement textVerify=  driver.findElement(By.xpath("//p[.='You entered: hello']"));
      String expected="You entered: hello";
        String actualResultText= textVerify.getText();
        Assert.assertEquals(actualResultText,expected);

    }






}