package TestngBasics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LaunchAppDemoExtToBase extends BaseClass {

    @Test
    public void launchApp(){

        driver.get("https://www.selenium.dev/");
         Assert.assertTrue(false);

    }


}
