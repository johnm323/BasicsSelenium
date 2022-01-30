import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAuthenticationDemo {

    public static void main(String[] args){

        String username = "admin";
        String password = "admin";

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Open Website and pass username and password within the URL
      //  driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

        //Open Website by passing variable names in username and password fields within the URL
        driver.get("https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");

    }

}
