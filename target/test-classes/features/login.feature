Feature: Test Swiggy Application Functionality

  Scenario: User is able to open the webside succesfully
    Given user has open swiggy homepage
    When user is on swiggy homepage
    Then some "Login" button will be on homepage

  Scenario: User is able to enter signin page
    Given user has open swiggy homepage
    When user click any location
      | location | Bangalore |
    Then user enter to swiggy signin page
    And some "Sign In" button will be on signin page
