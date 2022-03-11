package com.cydeo.tests.mentorSessionPracticeAutomation;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class TC_02 {
    public static void main(String[] args) {
        //1-open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //2-goto https://vytrack.com/
        driver.get("https://vytrack.com/");

        //3-verify About us is displayed
        WebElement aboutLink = driver.findElement(By.xpath("//*[@id='top-menu']//a[.='About us']"));
        System.out.println("aboutLink.isDisplayed() = " + aboutLink.isDisplayed());

        driver.close();
    }
}
/*TC:2 As a user I should be able to see About is displayed

*/