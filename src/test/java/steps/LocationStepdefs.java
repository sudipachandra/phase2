package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import seltests.pages.HomePage;
import steps.Hooks;

import java.util.Map;

public class LocationStepdefs {
    @Given("User is on swiggy homepage")
    public void userIsOnSwiggyHomepage() {
        System.out.println("User is on swiggy homepage");
        HomePage homePage = new HomePage(Hooks.testDriver);
        homePage.navigate();
        System.out.println("opening homepage");
    }

    @When("User gives following details")
    public void userGivesFollowingDetails(DataTable dataTable) {
      Map<String,String> dataMap = dataTable.asMap(String.class,String.class);
    String state = dataMap.get("statename");
    String city = dataMap.get("location");

    }

    @Then("User should be navigate to restaurant page")
    public void userShouldBeNavigateToRestaurantPage() {
        System.out.println("User should be navigate to restaurant page");
    }
}
