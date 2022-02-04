package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws Exception {

        //1- Set up the "browser driver"
        WebDriverManager.chromedriver().setup();

        //2- Create instance of the " selenium driver"
        // this is a line opening empty browser
        WebDriver driver = new ChromeDriver();


        //3- Go to tesla.com
        driver.get("https://tesla.com");


       // stop on page for 3 second
        Thread.sleep(3000);


        //4- use selenium to navigate back
        driver.navigate().back();

        // stop on page for 3 second
        Thread.sleep(1000);

        // use selenium to navigate forward
        driver.navigate().forward();

        // stop on page for 3 second
        Thread.sleep(1000);

        // use selenium to navigate refresh
        driver.navigate().refresh();

        // use navigation().to();
        driver.navigate().to("https://google.com");

        // get title of the page
        System.out.println("driver.getTitle() = " + driver.getTitle());

       //System.out.println("driver.getTitle() = " + driver.getTitle());

      driver.manage().window().maximize();
      driver.manage().window().fullscreen();






    }
}
