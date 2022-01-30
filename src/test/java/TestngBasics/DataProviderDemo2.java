package TestngBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.netty.handler.codec.serialization.ObjectEncoder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo2 {

    @Test(dataProvider = "dataset3")
    public void test(String username, String password){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
        driver.close();

    }





    @DataProvider
    public Object[][] dataset3(){

        return new Object[][]
                {

                        {"standard_user", "secret_sauce"},
                        {"locked_out_user", "secret_sauce"},
                        {"problem_user", "secret_sauce"},
                        {"performance_glitch_user", "secret_sauce"},

                };

    }


}
