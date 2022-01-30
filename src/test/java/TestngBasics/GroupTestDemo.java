package TestngBasics;


import org.testng.annotations.Test;

import javax.swing.*;

@Test(groups = "LoginFeatureTests")
public class GroupTestDemo {

    @Test(groups = "Regression")
    public void Test1(){
        System.out.println("Test 1");
    }

    @Test(groups = {"Smoke", "End2End"})
    public void Test2(){
        System.out.println("Test 2");
    }

    @Test(groups = "Regression")
    public void Test3(){
        System.out.println("Test 3");
    }


    @Test(groups = "Smoke")
    public void Test4(){
        System.out.println("Test 4");
    }


}
