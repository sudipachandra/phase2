import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import seltests.pages.HomePage;
import steps.Hooks;

public class HomeStepdefs {


    @Given("user has open swiggy homepage")
    public void userHasOpenSwiggyHomepage() {
        System.out.println("userHasOpenSwiggyHomepage");
        HomePage homePage = new HomePage(Hooks.testDriver);
    homePage.navigate();
    System.out.println("opening homepage");
    }

    @When("user is on swiggy homepage")
    public void userIsOnSwiggyHomepage() {

        System.out.println("user is on swiggy homepage");
    }

    @Then("some {string} button will be on homepage")
    public void someButtonWillBeOnHomepage(String expectedText) {
        String actualText = HomePage.checkingLoginButtonText();
        Assert.assertEquals(actualText,expectedText);
      }

    @When("user click any city")
    public void userClickAnyCity() {
        HomePage homePage = new HomePage(Hooks.testDriver);
        homePage.clickCity();
    }

    @Then("user enter to swiggy signin page")
    public void userEnterToSwiggySigninPage() {
        System.out.println("user enter to swiggy signin page");
    }

    @And("some {string} button will be on signin page")
    public void someButtonWillBeOnSigninPage(String expectedText) {
    String actualText = HomePage.checkingSignInButtonText();
    Assert.assertEquals(actualText,expectedText);
    }
}
