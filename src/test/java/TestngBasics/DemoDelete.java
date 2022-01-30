package TestngBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class DemoDelete {

    public static void main(String[] args){



        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);





        driver.get("https://www.amazon.in/");


      //  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/input[1]")).sendKeys("Smart Phone");
      //  driver.navigate();

        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Apple Watch");

        //tagname[@attribute='Value']
//input[@id='twotabsearchtextbox']

        String expected = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";

        String actual = driver.getTitle();
        System.out.println("The title of the page is "+ actual);
        Assert.assertEquals(actual,expected);




    }


}
