package com.cydeo.tests.mentorSessionPracticeAutomation;

import com.cydeo.tests.utilities.Driver;
import com.cydeo.tests.utilities.VyTrackUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class VyTrack {
    @Test
    public void driverLogin() {
        VyTrackUtils.loginAsDriver();
        //Finds the question mark icon "Get Help Tab", and clicking
        WebElement helpTab = Driver.getDriver().findElement(By.xpath("//i[@class='fa-question-circle']"));
        helpTab.click();
        //Handles the new window and switching it to the new one
        Set<String> newWindow = Driver.getDriver().getWindowHandles();
        for (String each : newWindow) {
            Driver.getDriver().switchTo().window(each);
            System.out.println("getCurrentUrl() = " + Driver.getDriver().getCurrentUrl());
        }
        //Verifies if the expected url is same with the actual url
        String expectedUrl = "https://doc.oroinc.com/";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
        Driver.closeDriver();
    }
    @Test
    public void salesLogin() {
        VyTrackUtils.loginAsSalesManager();
        //Finds the question mark icon "Get Help Tab", and clicking
        WebElement helpTab = Driver.getDriver().findElement(By.xpath("//i[@class='fa-question-circle']"));
        helpTab.click();
        //Handles the new window and switching it to the new one
        Set<String> newWindow = Driver.getDriver().getWindowHandles();
        for (String each : newWindow) {
            Driver.getDriver().switchTo().window(each);
            System.out.println("getCurrentUrl() = " + Driver.getDriver().getCurrentUrl());
        }
        //Verifies if the expected url is same with the actual url
        String expectedUrl = "https://doc.oroinc.com/";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
        Driver.closeDriver();
    }
    @Test
    public void storeLogin() {
        VyTrackUtils.loginAsStoreManager();
        //Finds the question mark icon "Get Help Tab", and clicking
        WebElement helpTab = Driver.getDriver().findElement(By.xpath("//i[@class='fa-question-circle']"));
        helpTab.click();
        //Handles new window and switching it to the new one
        Set<String> newWindow = Driver.getDriver().getWindowHandles();
        for (String each : newWindow) {
            Driver.getDriver().switchTo().window(each);
            System.out.println("getCurrentUrl() = " + Driver.getDriver().getCurrentUrl());
        }
        //Verifies if the expected url is same with the actual url
        String expectedUrl = "https://doc.oroinc.com/";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
        Driver.closeDriver();
    }
}