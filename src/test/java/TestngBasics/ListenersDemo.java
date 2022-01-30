package TestngBasics;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

// Need to add Listeners paramaters in .xml file (Refer Listenerxml.xml file)

public class ListenersDemo extends BaseClass implements ITestListener {
    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("Starting to execute tests");
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("Test cases passed");

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("Take screenshot on failure");
        try {
            TakescreenShot();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
