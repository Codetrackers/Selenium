package com.cydeo.tests.day3;

import com.cydeo.utillities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3 {
    public static void main(String[] args) {
       //TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();




        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");





        //3- Verify “Log in” button text is as expected:
        //Expected: Log In
      //  WebElement signInButton=driver.findElement(By.cssSelector("input[type='submit']"));
        WebElement signInButton=driver.findElement(By.cssSelector("input[value='Log In']"));
String expectedButton="Log In";
String actualButton= signInButton.getAttribute("value");
if(actualButton.equals(expectedButton)){
    System.out.println("pass");
}else{
    System.out.println("failed");
}

driver.close();







    }
}
