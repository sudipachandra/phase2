package steps;

import apis.RestCalls;
import apis.SearchResturantsAPI;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import reports.ExtentTestManager;

import java.util.Locale;

public class APIStepdefs {
    String [] responseCodeAndMessage;
    @When("user hits search Resturant Api for {string} resturant")
    public void userHitsSearchResturantApiForResturant(String nameOfResturant) throws Throwable{
       String url = SearchResturantsAPI.getSearchApiUrl(nameOfResturant);
        responseCodeAndMessage = RestCalls.getRequest(url);
        ExtentTestManager.logInfo("user hits search resturant api for Dominos resturant");
    }

    @Then("the response code is {int}")
    public void theResponseCodeIs(int expectedRC) {
        int actualRC = Integer.parseInt(responseCodeAndMessage[0]);
        Assert.assertEquals(actualRC,expectedRC);
        ExtentTestManager.logInfo("the response code is 200");
    }

    @And("response contains {string}")
    public void responseContains(String expectedResponse) {
        String actualResponse = responseCodeAndMessage[1];
        actualResponse = actualResponse.toLowerCase();
        expectedResponse = expectedResponse.toLowerCase();
        Assert.assertTrue(actualResponse.contains(expectedResponse));
        ExtentTestManager.logInfo("response contains Dominos");
    }
}
