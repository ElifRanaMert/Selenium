package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_VerifyTitleTest {
    public static void main(String[] args) {

//        WebDriverManager.chromedriver().setup();  //NO NEEd TO USE THIS

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Navigate to amazon homepage
        driver.get("https://www.amazon.com");

        // Verify if page title contains "Amazon"
        String actualTitle = driver.getTitle(); // Returns the page title as String
        if (actualTitle.contains("Amazon")) {
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
            System.out.println("Actual title : " + actualTitle + "does not contain expected title : Amazon");
        }
        driver.quit();






    }
}
