package com.cydeo.tests.day6;

import com.cydeo.utillities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T5_Windows_Practice {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        //1. Create a new class called: T5_WindowsPractice
        //2. Create new test and make set ups
        //3. Go to : https://practice.cydeo.com/windows
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/windows");
    }






    @Test
    public void window_multiple() {


        //storing the  ain pages window handle as String is good practice
        String mainHandle = driver.getWindowHandle();

        //4. Assert: Title is “Windows”
        String expected="Windows";
        String actual= driver.getTitle();
        Assert.assertEquals(expected,actual);

        //5. Click to: “Click Here” link
        WebElement clickHereBtn= driver.findElement(By.linkText("Click Here"));
        clickHereBtn.click();


        //6. Switch to new Window.
        for(String each: driver.getWindowHandles()){
            driver.switchTo().window(each);
        }






        //7. Assert: Title is “New Window”
        String expectedTitleAfterClick = "New Window";
        actual = driver.getTitle();

        Assert.assertEquals(actual, expectedTitleAfterClick);


    }


}
