package seltests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import seltests.pages.BasePage;


public class HomePage extends BasePage {
    public static final String HOME_PAGE_URL = "https://www.swiggy.com/";

    private WebDriver driver;
    private String loginButtonXpath = "//*[@id=\"root\"]/div[1]/div[1]/div/div[1]/div[1]/div/div[1]/div/a[1]";
    private String locationButton = "//a[text()='%location%']";
    private String signInButtonXpath = "//*[@id=\"root\"]/div[1]/header/div/div/ul/li[2]/div/span[2]";

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigate() {
        driver.get(HOME_PAGE_URL);
    }

    public String checkingLoginButtonText() {
        String loginText = driver.findElement(By.xpath(loginButtonXpath)).getText();
        return loginText;
    }

    public void clickLocation(String location) {
        driver.findElement(By.xpath(locationButton.replaceAll("%location%", location))).click();
    }

    public String checkingSignInButtonText() {
        String signInText = driver.findElement(By.xpath(signInButtonXpath)).getText();
        return signInText;

    }
}
