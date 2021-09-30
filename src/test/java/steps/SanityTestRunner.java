package steps;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeSuite;
import reports.ExtentTestManager;

@CucumberOptions(
        features = "classpath:features",
        glue = "classpath:steps",
        tags = "@SanityTest",
        plugin = {"pretty","html:cucumber-report.html"
        ,"json:cucumber.json"}
)

public class SanityTestRunner extends AbstractTestNGCucumberTests {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before suite running");
        String pathOfProject = System.getProperty("user.dir");
        System.out.println("pathOfProject :"+pathOfProject);
        ExtentTestManager.setExtentReportsObj(pathOfProject+"/extentReport.html");
    }

    @AfterSuite
    public void afterSuite(){
        ExtentTestManager.flushReport();
        System.out.println("after suite");
    }

    @DataProvider
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
