package TestngBasics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAnnotation_Demo_Demo{



    @Test(priority = 1, description = "Login Test")
    public void LoginTest(){
        System.out.println("Login Successful");

    }

    @Test(priority = 2, description = "Home screen Test")
    public void HomeScreen(){
        System.out.println("Home screen displayed");

    }

    @Test(priority = 3, description = "Logout Test", retryAnalyzer = TestngBasics.MyRetry.class)
    public void LogoutTest(){
        System.out.println("Logout Successful");
        Assert.assertTrue(false);

    }


}
