@Search-Cars
Feature: Acceptance testing to validate search cars page is working fine
  In order to validate the search cars page is working fine
  We will do the acceptance  testing

  @Search-Cars-Positive-Scenario
  Scenario: Validate Search Cars Page
    Given I am on the home page "https://www.carsguide.com.au/" of cars guide website
    When I move to the menu
      | Menu     |
      | buy+sell |
      | reviews  |
    And Click on "search cars" link
    And Select car brand as "BMW" from make dropdown
    And Select car model as "1 Series" from model dropdown
    And Select location as "ACT - All" from location dropdown
    And Select price mas as "10000" from price dropdown
    And Click on Find_My_Next_Car button
    Then I should see list of searched cars
    And The page title should be "Bmw 1 Series Under 10000 for Sale ACT | carsguide"
