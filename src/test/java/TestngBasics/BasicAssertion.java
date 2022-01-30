package TestngBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicAssertion {


    @Test
    public void AssertTest(){


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String expectedTitle = "Selenium";
        driver.get("https://www.selenium.dev/");
        String actualTitle = driver.getTitle();
        System.out.println("The title of the page is "+ actualTitle);
        Assert.assertEquals(actualTitle, expectedTitle, "The title does not Expected");


    }


}
