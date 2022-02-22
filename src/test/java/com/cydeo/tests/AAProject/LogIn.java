package com.cydeo.tests.AAProject;

import com.cydeo.utillities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LogIn {


    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    @Test
    public void LogInPage() {
        driver.get("https://login2.nextbasecrm.com/");

        WebElement userNameBox = driver.findElement(By.xpath("//input[@type='text']"));
        WebElement passWordBox = driver.findElement(By.xpath("//input[@type='password']"));
        WebElement LogInBtn = driver.findElement(By.xpath("//input[@type='submit']"));


        userNameBox.sendKeys("marketing64@cydeo.com");
        passWordBox.sendKeys("UserUser");
        LogInBtn.click();

        WebElement messageBtn = driver.findElement(By.xpath("//*[.='Message'] "));
        messageBtn.click();


    //  driver.switchTo().frame("//*[@contenteditable='true'] ");
      //  messageBox.sendKeys("Test CY22-5");


        WebElement SendBox = driver.findElement(By.xpath("//*[@id='blog-submit-button-save'] "));
        SendBox.click();
    }



  /*  @Test
    public void message(){

     WebElement messageBox=   driver.findElement(By.linkText("Message"));
        messageBox.click();

*/
}



