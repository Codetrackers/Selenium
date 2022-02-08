package com.cydeo.tests.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_Locator_getText {
    public static void main(String[] args) {
        //TC #1: NextBaseCRM, locators and getText() practice
        //1- Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Enter incorrect username: “incorrect”
        //driver.findElement(By.className("login-inp")).sendKeys("incorrect"+ Keys.ENTER);
        WebElement inputUser = driver.findElement(By.className("login-inp"));
        inputUser.sendKeys("incorrect");


        //4- Enter incorrect password: “incorrect”USER_PASSWORD
        //driver.findElement(By.name("USER_PASSWORD")).sendKeys("incorrect"+ Keys.ENTER);
        WebElement inputPass = driver.findElement(By.name("USER_PASSWORD"));
        inputPass.sendKeys("incorrect");

        //5- Click to log in button.
        //driver.findElement(By.className("login-btn")).click();

        WebElement loginButton = driver.findElement(By.className("login-btn"));
        loginButton.click();


        //6- Verify error message text is as expected:
        //Expected: Incorrect login or password
        WebElement errorText = driver.findElement(By.className("errortext"));
        String expected = "Incorrect login or password";
        String actual = errorText.getText();
        if (actual.equals(expected)) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

        driver.close();
    }


}

