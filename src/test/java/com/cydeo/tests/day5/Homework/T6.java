package com.cydeo.tests.day5.Homework;

import com.cydeo.utillities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T6 {

    //TC #6: Selecting date on dropdown and verifying
    //1. Open Chrome browser
    //2. Go to https://practice.cydeo.com/dropdown
    //3. Select “December 1st, 1923” and verify it is selected.
    //Select year using  : visible text
    //Select month using   : value attribute
    //Select day using : index number
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/dropdown");
    }

    //3. Select “December 1st, 1923” and verify it is selected.

    @Test

    public void december() {

        WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
        Select yearSelect = new Select(year);
        yearSelect.selectByVisibleText("1923");

        WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
        Select monthSelect = new Select(month);
        monthSelect.selectByValue("11");


        WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
        Select daySelect = new Select(day);
        daySelect.selectByIndex(0);

    }


}
