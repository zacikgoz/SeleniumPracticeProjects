package com.cydeo.tests.mentorSessionPracticeAutomation;

import com.cydeo.tests.utilities.ConfigurationReader;
import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class VyTrack {


    public class US2 {
        WebDriver driver;
        @BeforeMethod
        public void setUp() {
            String browserType = ConfigurationReader.getProperty("browser");
            driver = WebDriverFactory.getDriver(browserType);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("https://qa1.vytrack.com/");
        }
        @Test
        public void login(){
            WebElement username = driver.findElement(By.xpath("//*[@id='prependedInput']"));
            username.sendKeys("user1");
            WebElement password = driver.findElement(By.xpath("//*[@id='prependedInput2']"));
            password.sendKeys("UserUser123");
            WebElement login = driver.findElement(By.xpath("//*[@id='_submit']"));
            login.click();
        }
        @Test
        public void getHelpTab(){
            WebElement helpTab = driver.findElement(By.xpath("//i[@title='Get help']"));
            helpTab.click();
        }

    }
}
