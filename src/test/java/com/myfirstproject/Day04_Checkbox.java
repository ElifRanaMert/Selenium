package com.myfirstproject;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
public class Day04_Checkbox {
    WebDriver driver;
    @BeforeEach//runs before each test method
    public void setUp(){
        driver = new ChromeDriver();//creating driver
        driver.manage().window().maximize();//maximizing window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//implicit wait
    }
    @Test
    public void checkboxTest(){
//        Go to https://testcenter.techproeducation.com/index.php?page=checkboxes
        driver.get("https://testcenter.techproeducation.com/index.php?page=checkboxes");
//        Locate the elements of checkboxes
        WebElement checkbox1 = driver.findElement(By.id("box1"));
        WebElement checkbox2 = driver.findElement(By.id("box2"));
//        Then click on checkbox1 if box is NOT selected
        if (!checkbox1.isSelected()){
            checkbox1.click();
        }
//        Then click on checkbox2 if box is not selected
        if (!checkbox2.isSelected()){
            checkbox2.click();
        }
//        Then verify that checkbox1 and checkbox 2 is checked.
        Assertions.assertTrue(checkbox1.isSelected());//if checkbox1 is checked PASS
        Assertions.assertTrue(checkbox2.isSelected());//if checkbox2 is selected PASS
    }
    @AfterEach
    public void tearDown(){
//        driver.quit();
    }
}