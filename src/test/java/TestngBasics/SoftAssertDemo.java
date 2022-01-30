package TestngBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {

//Multiple Assert - When Hard assert fails, it does not execute the remaining steps in the test

    public void MultipleAssert(){

        String expectedTitle = "Selenium";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.selenium.dev/");
        String Actualtitle = driver.getTitle();
        Assert.assertEquals(Actualtitle, expectedTitle, "The Title does not match");

        System.out.println("If the above assertion Passes, Then we can see this statement been printed");


        String exepectedLogo = "selenium_logo";
        String actualLogo = driver.findElement(By.id("selenium_logo")).getAttribute("id");
        Assert.assertEquals(actualLogo, exepectedLogo, "The Logo is not matching");

        driver.close();

    }

// Soft Assert Test
    @Test
    public void SoftAssertTest(){

        SoftAssert softassert = new SoftAssert();
        String expectedTitle = "Seleniumm";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.selenium.dev/");
        String Actualtitle = driver.getTitle();
        softassert.assertEquals(Actualtitle, expectedTitle, "The Title does not match");

        System.out.println("*************************** Title*************************");


        String exepectedLogo = "selenium_logoo";
        String actualLogo = driver.findElement(By.id("selenium_logo")).getAttribute("id");
        softassert.assertEquals(actualLogo, exepectedLogo, "The Logo is not matching");
        System.out.println("*************************** Logo*************************");

        driver.close();
        softassert.assertAll();
    }

}
