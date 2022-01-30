import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;



public class JavaScriptExecutorDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
        driver.manage().window().maximize();


        //Using JavaScript Executor to get page title

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        String script = "return document.title;";
        String title = (String) jse.executeScript(script);
        System.out.println("The title of the page is "+ title);

        //Switch Frames
        driver.switchTo().frame("iframeResult");
        Thread.sleep(2000);

        //Using Javascript Executor highlight button amd  click on a button

        WebElement button =  driver.findElement(By.xpath("//button[@onclick='myFunction()']"));
        jse.executeScript("arguments[0].style.border='5px solid green'",button);
        jse.executeScript("myFunction()");
        Thread.sleep(2000);

        //Accept Alert
        driver.switchTo().alert().accept();
        Thread.sleep(2000);

        //Scroll using Javascript Executor and highlight the web element
        driver.navigate().to("https://www.w3schools.com/");
        Thread.sleep(2000);
        WebElement elementToScroll =  driver.findElement(By.xpath("//a[@class='ws-btn tut-button']"));
        jse.executeScript("arguments[0].scrollIntoView(true);", elementToScroll);
        jse.executeScript("arguments[0].style.border='5px solid red'",elementToScroll);



    }


}
