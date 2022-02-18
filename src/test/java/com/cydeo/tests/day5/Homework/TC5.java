package com.cydeo.tests.day5.Homework;

import com.cydeo.utillities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TC5 {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://practice.cybertekschool.com/dropdown");


//TC #5: Selecting state from State dropdown and verifying result
//1. Open Chrome browser
//2. Go to http://practice.cybertekschool.com/dropdown
//3. Select Illinois
//4. Select Virginia
//5. Select California
//6. Verify final selected option is California.
//Use all Select options. (visible text, value, index)
    }

    @Test

    public void stateVerification() throws InterruptedException {

        WebElement stateSelector = driver.findElement(By.xpath("//select[@id='state']"));
        Select stateDropDown = new Select(stateSelector);
        stateDropDown.selectByValue("IL");
        Thread.sleep(1000);
        List<WebElement> states = new ArrayList<>(stateDropDown.getOptions());
        int i = 0;
        for (WebElement each : states) {

            if(each.getText().equals("Virginia")){
                break;
            }
            i++;
        }
        System.out.println(i);


        stateDropDown.selectByIndex(i);

        Thread.sleep(1000);
        stateDropDown.selectByVisibleText("California");

        String expected= "California";
        String actual= stateDropDown.getFirstSelectedOption().getText();


        Assert.assertEquals(actual,expected);
    }




}