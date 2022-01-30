import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class TakeScreenShotsDemo {

    public static void main(String[] args) throws IOException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Open Website
        driver.get("https://www.amazon.com/");

        //Create object reference for Data Class so that you can use the data to append with screenshotName
        Date currentDate = new Date();
       String screenshotFileName = currentDate.toString().replace(" ", "-").replace(":", "-");

        //Take Screenshot
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File(".//screenshot//" +screenshotFileName+".png"));




    }

}
