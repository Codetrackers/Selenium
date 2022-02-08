package com.cydeo.tests.day2_locators_getText_getAttribute.Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBank {
    public static void main(String[] args) {
        //TC #2: Zero Bank header verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        //2. Go to http://zero.webappsecurity.com/login.html
        driver.manage().window().maximize();
        driver.get("http://zero.webappsecurity.com/login.html");

        //3. Verify header text
      WebElement headerText=driver.findElement(By.tagName("h3"));

        //Expected:

        String expected= "Log in to ZeroBank";
        String actual= headerText.getText();
if(expected.equals(actual)){
    System.out.println("passed");
}else{
    System.out.println("Not Passed");
}
driver.close();



    }
}
