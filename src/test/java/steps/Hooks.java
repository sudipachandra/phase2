package steps;

import com.SeleniumDriverManager;
//import org.junit.After;
//import org.junit.Before;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {
    public static WebDriver testDriver = null;

    @Before
    public void beforeTest() throws Throwable{
        System.out.println("before test");
        testDriver = new SeleniumDriverManager().getDriver();
        testDriver.manage().window().maximize();
    }
    @After
    public void afterTest(){
        testDriver.quit();
    }

}
