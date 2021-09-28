package seltests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import seltests.pages.BasePage;

public class HomePage extends BasePage {
    static WebDriver driver;
    String HOME_PAGE_URL = "https://www.swiggy.com/";
    private static String loginButtonXpath = "//*[@id=\"root\"]/div[1]/div[1]/div/div[1]/div[1]/div/div[1]/div/a[1]";
    private static String cityButton = "//*[@id=\"root\"]/div[1]/div[1]/div/div[1]/div[1]/div/ul/li[2]/a";
    private static String signInButtonXpath = "//*[@id=\"root\"]/div[1]/header/div/div/ul/li[2]/div/span[2]";

    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public void navigate(){
        driver.get(HOME_PAGE_URL);
    }
   public static String checkingLoginButtonText(){
        String loginText = driver.findElement(By.xpath(loginButtonXpath)).getText();
        return loginText;
   }
   public static void clickCity(){
        driver.findElement(By.xpath(cityButton)).click();
   }
   public static String checkingSignInButtonText(){
       String signInText = driver.findElement(By.xpath(signInButtonXpath)).getText();
       return signInText;

   }
}
