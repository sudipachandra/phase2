package Listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class TestngSuiteListener implements ISuiteListener {
    @Override
    public void onStart(ISuite suite) {
        //ISuiteListener.super.onStart(suite);
        System.out.println("the suite is started");
    }

    @Override
    public void onFinish(ISuite suite) {
        //ISuiteListener.super.onFinish(suite);
        System.out.println("the suite is finished");
    }
}
