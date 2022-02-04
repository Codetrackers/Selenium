package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Warm_UpTAsk {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();


        driver.get("https://practice.cydeo.com");
        System.out.println("title: "+ driver.getTitle());

        System.out.println("result: "+ driver.getCurrentUrl());

driver.quit();



    }
}
