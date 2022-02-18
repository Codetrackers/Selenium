package com.cydeo.tests.day5.Homework;

import com.cydeo.utillities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T7 {

   //TC #7: Selecting value from non-select dropdown
    //1. Open Chrome browser
    //2. Go to https://practice.cydeo.com/dropdown
    //3. Click to non-select dropdown
    //4. Select Facebook from dropdown
    //5. Verify title is “Facebook - Log In or Sign Up”
   WebDriver driver;

    @BeforeMethod
    public void setupMethod() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void facebook(){
        driver.get("https://practice.cydeo.com/dropdown");

WebElement dropDownBtn=driver.findElement(By.xpath("//a[@class='btn btn-secondary dropdown-toggle']"));
dropDownBtn.click();
WebElement dropDownFacebook= driver.findElement(By.xpath("//a[@href='https://www.facebook.com/']"));
dropDownFacebook.click();


String expectedTitle= "Facebook - Log In or Sign Up";
String actual= driver.getTitle();
        Assert.assertEquals(actual,expectedTitle);


driver.close();

    }





}
