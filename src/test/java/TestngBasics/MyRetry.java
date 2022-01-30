package TestngBasics;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

//Added Annotation in one of the test case , pleaes refer TestAnnotation_Demo_Demo class to see the retry annotation

public class MyRetry implements IRetryAnalyzer {

    private int retryCount = 0;
    private static final int maxRetryCount = 3;

    public boolean retry(ITestResult result) {
        if (retryCount < maxRetryCount) {
            retryCount++;
            return true;
        }
        return false;
    }
}




