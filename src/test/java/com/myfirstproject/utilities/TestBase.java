package com.myfirstproject.utilities;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
public abstract class TestBase {
    /*
    TestBase class is used for calling repetitive pre-conditions and post-conditions
    Make the driver protected because it should be visible in the other classes
     */
    protected static WebDriver driver;
    @BeforeEach
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().window().maximize();
    }
    @AfterEach
    public void tearDown(){
        driver.quit();
    }
}