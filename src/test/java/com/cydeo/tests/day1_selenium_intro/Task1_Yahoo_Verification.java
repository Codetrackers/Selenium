package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_Yahoo_Verification {

    //TC #1: Yahoo Title Verification
    //1.Open Chrome browser
    //2.Go to https://www.yahoo.com
    //3.Verify title:
    //Expected:Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos


    public static void main(String[] args) {
        //1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        //make our page full screen
        driver.manage().window().fullscreen();

        //2.Go to https://www.yahoo.com
        driver.get("https://yahoo.com");

        //make our page full screen
        driver.manage().window().fullscreen();

        //3.Verify title:

        String expectedTitle="Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";
        String actualTitle= driver.getTitle(); // comes from browser

        if( expectedTitle.equals(actualTitle)){
            System.out.println("Verification passed");
        }else{
            System.out.println("Verification Failed");
        }











    }








}
