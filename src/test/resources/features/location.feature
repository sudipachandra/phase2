Feature: Test Location Functionality in swiggy

  Scenario Outline: User can check their location
    Given User is on swiggy homepage
    When user click any location
      | location | <location> |
    Then User should be navigate to restaurant page
    And user click any location
      | location | HSR |

    Examples:
    | location |
    | Bangalore |







