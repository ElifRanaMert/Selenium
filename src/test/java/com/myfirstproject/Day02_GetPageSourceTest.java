package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_GetPageSourceTest {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Test if amazon contains "Registry" on the homepage
        driver.get("https://www.amazon.com");
        String pageSource = driver.getPageSource();

        System.out.println(pageSource);

        if (pageSource.contains("Registry")){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL Registry is not exist in this page");
        }

        driver.quit();


    }
}
