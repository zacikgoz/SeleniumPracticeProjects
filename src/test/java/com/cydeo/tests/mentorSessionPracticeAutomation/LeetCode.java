package com.cydeo.tests.mentorSessionPracticeAutomation;

import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LeetCode {
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://leetcode.com/");
    }
    @Test
    public void exploreLeetCode(){
        WebElement explore = driver.findElement(By.xpath("//*[span='Explore']"));
        explore.click();
        WebElement getStarted = driver.findElement(By.xpath("//*[@class='link']"));
        getStarted.click();
        List<WebElement> navigationBar = driver.findElements(By.xpath("//*[@class='nav-item__5BvG']"));
        for (WebElement eachNavBar : navigationBar) {
            Assert.assertTrue(eachNavBar.isDisplayed());
        }
    }
    @Test
    public void arrays101() {
        WebElement arrays101 = driver.findElement(By.xpath("(//*[@class='icon fa fa-play'])[4]"));
        arrays101.click();
    }
}
