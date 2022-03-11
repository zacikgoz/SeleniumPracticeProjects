package com.cydeo.tests.utilities;

import org.openqa.selenium.By;

public class VyTrackUtils {
    public static void login(String username, String password) {
        //go to website
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        // pass username
        // Driver.getDriver().findElement(By.cssSelector("#prependedInput"));
        Driver.getDriver().findElement(By.id("prependedInput")).sendKeys(username);
        //pass password
        Driver.getDriver().findElement(By.cssSelector("#prependedInput2")).sendKeys(password);
        //click login button
        Driver.getDriver().findElement(By.tagName("button")).click();

    }
    public static void loginAsDriver(){
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        Driver.getDriver().findElement(By.xpath("//*[@id='prependedInput']")).sendKeys(ConfigurationReader.getProperty("driver_username"));
        Driver.getDriver().findElement(By.xpath("//*[@id='prependedInput2']")).sendKeys(ConfigurationReader.getProperty("driver_password"));
        Driver.getDriver().findElement(By.xpath("//*[@id='_submit']")).click();
    }
    public static void loginAsSalesManager(){
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        Driver.getDriver().findElement(By.xpath("//*[@id='prependedInput']")).sendKeys(ConfigurationReader.getProperty("sales_manager_username"));
        Driver.getDriver().findElement(By.xpath("//*[@id='prependedInput2']")).sendKeys(ConfigurationReader.getProperty("sales_manager_password"));
        Driver.getDriver().findElement(By.xpath("//*[@id='_submit']")).click();
    }
    public static void loginAsStoreManager(){
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        Driver.getDriver().findElement(By.xpath("//*[@id='prependedInput']")).sendKeys(ConfigurationReader.getProperty("store_manager_username"));
        Driver.getDriver().findElement(By.xpath("//*[@id='prependedInput2']")).sendKeys(ConfigurationReader.getProperty("store_manager_password"));
        Driver.getDriver().findElement(By.xpath("//*[@id='_submit']")).click();
    }

}
