package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestngListener implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
       // ITestListener.super.onTestStart(result);
        String name = result.getMethod().getMethodName();
        System.out.println("the test name is : "+name);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
       // ITestListener.super.onTestSuccess(result);
        System.out.println("the test is running successfully");
    }

    @Override
    public void onTestFailure(ITestResult result) {
       // ITestListener.super.onTestFailure(result);
        System.out.println("the test is failed");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
       // ITestListener.super.onTestSkipped(result);
        System.out.println("the test is skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        //ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
       // ITestListener.super.onTestFailedWithTimeout(result);
    }

    @Override
    public void onStart(ITestContext context) {
       // ITestListener.super.onStart(context);
        System.out.println("the test is started");
    }

    @Override
    public void onFinish(ITestContext context) {
       // ITestListener.super.onFinish(context);
        System.out.println("the test is finish");
    }
}
