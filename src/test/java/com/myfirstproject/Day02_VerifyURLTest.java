package com.myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_VerifyURLTest {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Navigate to amazon homepage
        driver.get("https://www.amazon.com");

        // Verify if page google homepage url is "https://www.amazon.com"
        String currentURL = driver.getCurrentUrl();

        System.out.println("CurrentURL : " + currentURL);

        if (currentURL.equals("https://www.amazon.com")){
            System.out.println("PASS");
        }else {
            System.out.println("FAILS : Actual URL is " + currentURL + " but excepted URL is https://www.amazon.com");
        }

        driver.quit();

    }
}

/*
QUOTE OF THE DAY :
-Testers do not write a code to PASS
-We write a code to CATCH A BUG

-Our test case failed for this reason. FAILS : Actual URL is https://www.amazon.com/ but excepted URL is https://www.amazon.com
-As tester we should not fix the code to fix

STEPS:
1- Communicate with the Test Lead, Team Lead, or BA to check if that is a documentation issue.
If it is a documentation issue, BA should fix the AC, and then we should update the script.
2- If it is an actual bug, then we should communicate with the team to see if a ticket should be raised
or a new story should be created...
 */
