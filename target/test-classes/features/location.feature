Feature: Test Location Functionality in swiggy

  Scenario Outline: User can check their location
    Given User is on swiggy homepage
    When User gives following details
      | statename | <state> |
      | location  | <city>  |
    Then User should be navigate to restaurant page

    Examples:
    |state    |city|
    |Bangalore|HSR |




