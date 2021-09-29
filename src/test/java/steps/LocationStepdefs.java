package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import reports.ExtentTestManager;
import seltests.pages.HomePage;
import steps.Hooks;

import java.util.Map;

public class LocationStepdefs {
    @Given("User is on swiggy homepage")
    public void userIsOnSwiggyHomepage() {
        //System.out.println("User is on swiggy homepage");
        ExtentTestManager.logInfo("User is on swiggy homepage");
        HomePage homePage = new HomePage(Hooks.testDriver);
        homePage.navigate();
       // System.out.println("opening homepage");
        //ExtentTestManager.logInfo("opening homepage");
    }

//    @When("User gives following details")
//    public void userGivesFollowingDetails(DataTable dataTable) {
//      Map<String,String> dataMap = dataTable.asMap(String.class,String.class);
//    String state = dataMap.get("statename");
//    String city = dataMap.get("location");
//     ExtentTestManager.logInfo("user gives the details :"+ "state ="+state+ "city ="+city);
//    }

    @Then("User should be navigate to restaurant page")
    public void userShouldBeNavigateToRestaurantPage() {
       // System.out.println("User should be navigate to restaurant page");
        ExtentTestManager.logInfo("user should navigate to restaurant page");
    }
}
