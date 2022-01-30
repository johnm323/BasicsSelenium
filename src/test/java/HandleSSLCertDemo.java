import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HandleSSLCertDemo {

    public static void main(String[] args){

        WebDriverManager.chromedriver().setup();

        //Creating Desired capabilities and accepting insecure cert
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

        //Merging capabilities with chromeoptions
        ChromeOptions coptions = new ChromeOptions();
        coptions.merge(capabilities);

        WebDriver driver = new ChromeDriver(coptions);
        driver.manage().window().maximize();

        //Open Website
        driver.get("https://expired.badssl.com/");






    }

}
