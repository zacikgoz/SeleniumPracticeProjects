package com.cydeo.tests.mentorSessionPracticeAutomation;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class TC_04 {
    public static void main(String[] args) throws InterruptedException {
        //1-open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //2-goto https://vytrack.com/
        driver.get("https://vytrack.com/");

        //3-click Login label
        WebElement loginLabel = driver.findElement(By.xpath("//*[@id='top-menu']//a[.='LOGIN']"));
        Thread.sleep(2000);
        loginLabel.click();

        //4-enter username "User1"
        WebElement userName = driver.findElement(By.xpath("//*[@type='text']"));
        userName.sendKeys("User1");

        //5-enter password "UserUser123"
        WebElement password = driver.findElement(By.xpath("//*[@type='password']"));
        password.sendKeys("UserUser123");

        //6-verify the password is hidden
        String expectedPassword = password.getAttribute("type");
        if(expectedPassword.equals("password")){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
        driver.close();
    }
}
/*TC:6 As a user I should be able to see the password as
"*******"*/