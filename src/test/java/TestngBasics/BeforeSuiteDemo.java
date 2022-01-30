package TestngBasics;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class BeforeSuiteDemo {

    @BeforeSuite
    public void BeforeSuiteTest(){
        System.out.println("Executed Before Suite");
    }

    @AfterSuite
    public void AfterSuiteTest(){
        System.out.println("Executed After Suite");
    }

    @Test
    public void test(){
        System.out.println("********");
    }

    public class Testingdemo extends BeforeSuiteDemo{

        @Test(priority = 1)
        public void test1(){
            System.out.println("test one executed");
        }

        @Test(priority = 2)
        public void test2(){
            System.out.println("test one executed");
        }

    }

}


