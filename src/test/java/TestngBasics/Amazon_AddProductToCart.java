package TestngBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Amazon_AddProductToCart {

    public static void main(String[] args) throws InterruptedException {

        JavascriptExecutor js;
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.amazon.com/");
        Thread.sleep(2000);

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("fitbit versa 2");
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();


        List<WebElement> elements = driver.findElements(By.xpath("//*[@data-component-type='s-search-result']"));
        System.out.println(elements.size());


        WebElement ele = driver.findElement(By.xpath("//span[normalize-space()='Versa Smart Watch,One Size (S & L Bands Included) (Peach/Rose Gold Aluminium)']"));

Thread.sleep(3000);

        for (WebElement ele1 : elements) {

            System.out.print(ele1.getText());
            if(ele1.getText().contains("Versa Smart Watch,One Size (S & L Bands Included) (Peach/Rose Gold Aluminium)")){

                ele.click();
                break;

            }

        }

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("add-to-cart-button")))).click();

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@class='a-button-input']")))).click();

        Thread.sleep(5000);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@class='a-button-inner']")))).click();

        wait.until(ExpectedConditions.visibilityOf( driver.findElement
                (By.xpath("//input[@id='ap_email']")))).sendKeys("XXXXXXX");

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@class='a-button-inner']")))).click();

        wait.until(ExpectedConditions.visibilityOf( driver.findElement
                (By.xpath("//input[@id='ap_password']")))).sendKeys("XXXXXX");


        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("auth-signin-button")))).click();



        driver.findElement(By.xpath("//span[@id='address-ui-widgets-countryCode']//span[@role='button']")).click();



        WebElement hiddenWebElement =driver.findElement(By.xpath("//a[normalize-space()='India']"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click()",hiddenWebElement);
        Thread.sleep(5000);


        wait.until(ExpectedConditions.visibilityOf(driver.findElement
                (By.xpath("//input[@id='address-ui-widgets-enterAddressFullName']")))).sendKeys("John Rambo");

        wait.until(ExpectedConditions.visibilityOf(driver.findElement
                (By.id("address-ui-widgets-enterAddressPhoneNumber")))).sendKeys("9880111223");

        wait.until(ExpectedConditions.visibilityOf(driver.findElement
                (By.id("address-ui-widgets-enterAddressPostalCode")))).sendKeys("560095");

        wait.until(ExpectedConditions.visibilityOf(driver.findElement
                (By.id("address-ui-widgets-enterAddressLine1")))).sendKeys("323");

        wait.until(ExpectedConditions.visibilityOf(driver.findElement
                (By.id("address-ui-widgets-enterAddressLine2")))).sendKeys("Koramangala");

        wait.until(ExpectedConditions.visibilityOf(driver.findElement
                (By.id("address-ui-widgets-landmark")))).sendKeys("Near Police Station");

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@type='submit']")))).click();


        wait.until(ExpectedConditions.visibilityOf(driver.findElement
                (By.name("address-ui-widgets-saveOriginalOrSuggestedAddress")))).click();





    }
}
