package com.cydeo.tests.mentorSessionPracticeAutomation;

import com.cydeo.tests.utilities.BrowserUtils;
import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class LeetCode {
    @Test
    public void exploreLeetCode(){
        Driver.getDriver().get("https://leetcode.com/");
        WebElement explore = Driver.getDriver().findElement(By.xpath("//*[span='Explore']"));
        explore.click();
        WebElement getStarted = Driver.getDriver().findElement(By.xpath("//*[@class='link']"));
        getStarted.click();
        List<WebElement> navigationBar = Driver.getDriver().findElements(By.xpath("//*[@class='nav-item__5BvG']"));
        for (WebElement eachNavBar : navigationBar) {
            Assert.assertTrue(eachNavBar.isDisplayed());
        }
        BrowserUtils.sleep(5);
        WebElement arrays101 = Driver.getDriver().findElement(By.xpath("(//i[@class='icon fa fa-play'])[4]"));
        arrays101.click();
    }
}
