package com.cydeo.tests.day2_locators_getText_getAttribute.Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cydeo_Practice {
    public static void main(String[] args) {

        //TC #4: Practice Cydeo – Class locator practice
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //2- Go to: https://practice.cydeo.com/inputs
        driver.get("https://practice.cydeo.com/inputs ");


        //3- Click to “Home” link
         driver.findElement(By.className("nav-item")).click();

        //4- Verify title is as expected:
        //Expected: Practice
        String expect="Practice";
        String actual=driver.getTitle();
        if(actual.equals(expect)){
            System.out.println("passed ");
        }else{
            System.out.println("Failed ");
        }


        driver.close();
        //PS: Locate “Home” link using “className” locator






    }
}
