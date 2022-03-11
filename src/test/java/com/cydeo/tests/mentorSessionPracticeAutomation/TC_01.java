package com.cydeo.tests.mentorSessionPracticeAutomation;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class TC_01 {
    public static void main(String[] args) {
        //1-open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //2-goto https://vytrack.com/
        driver.get("https://vytrack.com/");

        //3-verify Home is displayed
        WebElement homeLink = driver.findElement(By.xpath("//*[@id='top-menu-nav']//a[.='Home']"));
        System.out.println("homeLink.isDisplayed() = " + homeLink.isDisplayed());
    }

    public static class TC_03 {
        public static void main(String[] args) {
            //1-open a chrome browser
            WebDriver driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            //2-goto https://vytrack.com/
            driver.get("https://vytrack.com/");

            //3-click Login label
            WebElement loginTab = driver.findElement(By.xpath("//*[@id='top-menu']//a[.='LOGIN']"));
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            loginTab.click();

            String currentURL = driver.getCurrentUrl();
            if(currentURL.contains("login")){
                System.out.println("expectedUrl contains \"login\" = " + currentURL);
            }else{
                System.out.println("Test Failed");
            }
            driver.close();
        }
    }
}
/*TC:1 As a user I should be able to see Home is displayed


*/