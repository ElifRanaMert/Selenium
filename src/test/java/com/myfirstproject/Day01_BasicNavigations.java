package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        // Create chrome driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Maximize the window
        driver.manage().window().maximize();

        // Open walmart home page https://www.walmart.com/
        driver.get("https://www.walmart.com/");

        // Wait for 5 seconds at this step
        Thread.sleep(5000);

        // On the same class, navigate to the amazon home page https://www.amazon.com/
        driver.get("https://www.amazon.com/");
               //or
        //driver.navigate().to("https://www.amazon.com/");

        // Navigate back to walmart
        driver.navigate().back();

        // Navigate forward to amazon
        driver.navigate().forward();

        // Refresh the page
        driver.navigate().refresh();

        // Close/Quit the browser
        driver.quit();
            //driver.close();

        /*
        1. How do you go to a page in selenium?
        -using get or navigate methods. Get is more common

        2. What is the difference between get and navigate methods?
        - both are used to go to a page
        - get is shorter than navigate to
        - navigate has to back, forward, refresh methods as well.
        - get accepts only strings but navigate to accepts string and url

        3. What is the difference between close and quit in selenium?
        - close closed only last active window, but quit closes all active windows

        4. What is Thread.sleep()?
        - it is a JAVA wait. This HARD wait. This is not Selenium wait


         */





    }

}
