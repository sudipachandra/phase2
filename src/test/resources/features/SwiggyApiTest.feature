Feature: Test APIs for Swiggy - Search Resturants
  @SanityTest
  Scenario: search api returns correct resturant
    When user hits search Resturant Api for "dominos" resturant
    Then the response code is 200
    And response contains "dominos"