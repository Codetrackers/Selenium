package com.cydeo.tests.day2_locators_getText_getAttribute.Homework;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



    public class Etsy {
        public static void main(String[] args) {

            //  1. Open Chrome browser
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

            //  2. Go to https://www.etsy.com
            driver.get("https://etsy.com");

            //3. Search for “wooden spoon”
            driver.findElement(By.name("search_query")).sendKeys("wooden Spoon" + Keys.ENTER);

            //4. Verify title:
            //Expected: “Wooden spoon | Etsy”

            String exceptedTitle= "Wooden spoon | Etsy";
            String actualTitle= driver.getTitle();
            String result = (exceptedTitle.equals(actualTitle)) ? "Title passed" : "title Failed";
            System.out.println(result);

        }
    }


