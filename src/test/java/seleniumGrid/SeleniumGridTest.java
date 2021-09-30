package seleniumGrid;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class SeleniumGridTest {
    public static void main(String[] args) throws Throwable{
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setBrowserName("REMOTE");
        caps.setPlatform(Platform.MAC);
        URL url = new URL("http://10.0.0.6:4444/wd/hub");
        System.out.println("RUNNING ON MAC MACHINE");
        WebDriver driver = new RemoteWebDriver(url,caps);
        driver.quit();
    }
}
