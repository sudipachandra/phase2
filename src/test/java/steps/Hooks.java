package steps;

import com.SeleniumDriverManager;
//import org.junit.After;
//import org.junit.Before;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.BeforeSuite;
import reports.ExtentTestManager;

public class Hooks {
    public static WebDriver testDriver = null;

    @Before
    public void beforeTest1(Scenario scenario){
        String scenarioName = scenario.getName();
        System.out.println("name is :"+scenarioName);
        //ExtentTestManager.extentTest= ExtentTestManager.getExtentReportsObj().startTest(scenarioName);
        ExtentTestManager.startTest(scenarioName);
    }

    @Before
    public void beforeTest() throws Throwable{
        System.out.println("before test");
        testDriver = new SeleniumDriverManager().getDriver();
        testDriver.manage().window().maximize();
    }
    
    @After
    public void afterTest(Scenario scenario){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        testDriver.quit();
        if(scenario.isFailed()){
            ExtentTestManager.logFailure("test failed");
        }
        ExtentTestManager.endTest();
    }

}
