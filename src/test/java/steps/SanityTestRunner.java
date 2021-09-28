package steps;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
@CucumberOptions(
        features = "classpath:features",
        glue = "classpath:steps",
        tags = "@SanityTest",
        plugin = {"pretty","html:cucumber-report.html"}
)

public class SanityTestRunner extends AbstractTestNGCucumberTests {
    @DataProvider
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
