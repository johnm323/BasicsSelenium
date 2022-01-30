package TestngBasics;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipDemo {


    @Test(enabled = false)
    public void TestOne(){

        System.out.println("Testing One");
    }

    @Test
    public void TestTwo(){

        System.out.println("Testing Two");
        throw new SkipException("Skipping tne test");

    }


}
