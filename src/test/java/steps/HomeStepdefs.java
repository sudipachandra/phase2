package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import reports.ExtentTestManager;
import seltests.pages.HomePage;
import steps.Hooks;

import java.util.Map;

public class HomeStepdefs {

    private HomePage homePage = new HomePage(Hooks.testDriver);

    @Given("user has open swiggy homepage")
    public void userHasOpenSwiggyHomepage() {
       // System.out.println("userHasOpenSwiggyHomepage");
        homePage.navigate();
        //System.out.println("opening homepage");
        ExtentTestManager.logInfo("user has open swiggy application");
    }

    @When("user is on swiggy homepage")
    public void userIsOnSwiggyHomepage() {
        ExtentTestManager.logInfo("user is on swiggy homepgae");
       // System.out.println("user is on swiggy homepage");
    }

    @Then("some {string} button will be on homepage")
    public void someButtonWillBeOnHomepage(String expectedText) {
        String actualText = homePage.checkingLoginButtonText();
        Assert.assertEquals(actualText, expectedText);
        ExtentTestManager.logInfo("some button will be on homepage named :"+expectedText);
    }

    @When("user click any location")
    public void userClickAnyLocation(DataTable dataTable) {
        Map<String,String> dataMap = dataTable.asMap(String.class, String.class);
        String location = dataMap.get("location");
        ExtentTestManager.logInfo("user gives the location as :"+location);
        homePage.clickLocation(location);

    }

    @Then("user enter to swiggy signin page")
    public void userEnterToSwiggySigninPage() {
        ExtentTestManager.logInfo("user enter to swiggy signin page");
    }

    @And("some {string} button will be on signin page")
    public void someButtonWillBeOnSigninPage(String expectedText) {
        String actualText = homePage.checkingSignInButtonText();
        Assert.assertEquals(actualText, expectedText);
        ExtentTestManager.logInfo("some button will be on signin page named :"+expectedText);
    }
}
