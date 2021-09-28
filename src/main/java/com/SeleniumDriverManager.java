package com;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumDriverManager {
    WebDriver driver=null;

    static final String browserType="CHROME";

    public WebDriver getDriver() throws Throwable{
        if(driver == null){
            setupDriver();
        }
        return driver;
    }

    public void setupDriver() throws Throwable{
        String browserType = Configuration.getProperty("browserType");
        switch (browserType){
            case "CHROME":
                driver = setupChromeDriver();
                System.out.println("RUNNING CHROME DRIVER");
            case "FIREFOX":
            //   driver = setupFFDriver();
                break;
            case "REMOTE":
                setUpRemoteWebdriver();
                System.out.println("RUNNING REMOVE DRIVER");
        }

    }

    private void setUpRemoteWebdriver() throws Throwable{
        URL url = null;
        try {
            String server = Configuration.getProperty("hubIP");
            String port = Configuration.getProperty("hubPort");
            url = new URL("http://"+server+":"+port+"/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setBrowserName("chrome");
        caps.setPlatform(Platform.MAC);
        driver = new RemoteWebDriver(url,caps);
    }

    private ChromeDriver setupChromeDriver() {
        String projectFolderPath =System.getProperty("user.dir");
        String chromeDriverPath = projectFolderPath + "/drivers/chromedriver";
        System.setProperty("webdriver.chrome.driver",chromeDriverPath);
        return new ChromeDriver();

    }
}
