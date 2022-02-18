package com.cydeo.tests.day4_findElement_checkBox;

import com.cydeo.utillities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1 {
    public static void main(String[] args) {
        //DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        //TC #1: XPATH and cssSelector Practices

        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();


        //2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");


        //3. Locate all the WebElements on the page using XPATH and/or CSS
        //locator only (total of 6)
        // a. “Home” link

        //1- locate homeLink using css selector, class value
        WebElement homeLink_example1= driver.findElement(By.cssSelector("a[class='nav-link']")) ;

        //2- locate homeLink using css selector syntax #2
        WebElement homeLink_example2= driver.findElement(By.cssSelector("a.nav-link")) ;

        //3- locate homeLink using css selector, href value
        WebElement homeLink_example3= driver.findElement(By.cssSelector("a[href='/']")) ;



        //b. “Forgot password” header
        //locate header CssSelector: locate parent element and move down to h2
        WebElement header_ex1= driver.findElement(By.cssSelector("div.example>h2"));


        //locate header Xpath: locate web element text Forgot Password;
        WebElement header_ex2= driver.findElement(By.xpath("//h2[text()='Forgot Password']"));



        //c. “E-mail” text
        WebElement emailLAble_ex1= driver.findElement(By.xpath("//label[@for='email']"));
        WebElement emailLAble_ex2= driver.findElement(By.xpath("//input[contains(@type,'')]"));



        //d. E-mail input box
        WebElement inputBox= driver.findElement(By.xpath("//input[@name='email']"));




        //e. “Retrieve password” button
        //button[@type='submit']
        //button[@class='radius']
        WebElement retrievePasswordBtn = driver.findElement(By.xpath("//button[@id='form_submit']"));




        //f. “Powered by Cydeo text
        WebElement powerByCydeo= driver.findElement(By.xpath("//div[@style='text-align: center;']"));



        //4. Verify all web elements are displayed.
        System.out.println("homeLink_example1.isDisplayed() = " + homeLink_example1.isDisplayed());
        System.out.println("header_ex1.isDisplayed() = " + header_ex1.isDisplayed());
        System.out.println("emailLAble_ex1.isDisplayed() = " + emailLAble_ex1.isDisplayed());
        System.out.println("inputBox.isDisplayed() = " + inputBox.isDisplayed());
        System.out.println("retrievePasswordBtn.isDisplayed() = " + retrievePasswordBtn.isDisplayed());
        System.out.println("powerByCydeo.isDisplayed() = " + powerByCydeo.isDisplayed());

        


        driver.close();
        //First solve the task with using cssSelector only. Try to create 2 different
        //cssSelector if possible
        //
        //Then solve the task using XPATH only. Try to create 2 different
        //XPATH locator if possible



    }
}
