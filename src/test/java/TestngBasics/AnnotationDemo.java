package TestngBasics;

import org.testng.annotations.*;

public class AnnotationDemo {

    //Before Test
    @BeforeTest
    public void BeforeTest(){

        System.out.println("Before Test");
    }

    // After Test
    @AfterTest
    public void AfterTest(){
        System.out.println("After Test");
    }

    //Before Method
    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("Before Method");
    }

    //Before Method
    @AfterMethod
    public void AfterMethod(){
        System.out.println("After Method");
    }

    @Test(priority = 1)
    public void TestOne(){
        System.out.println("Test One");
    }

    @Test(priority = 2)
    public void TestTwo(){
        System.out.println("Test Two");

    }

    @Test(priority = 3)
    public void TestThree(){
        System.out.println("Test Three");

    }

}
