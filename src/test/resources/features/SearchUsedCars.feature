@Used-Cars-Search
Feature: Acceptance testing to validate search used cars page is working fine
  In order to validate the search used cars page is working fine
  We will do the acceptance  testing

  @Used-Search-Cars-Positive-Scenario
  Scenario: Validate Search Cars Page
    Given I am on the home page "https://www.carsguide.com.au/" of cars guide website
    When I move to the menu
      | Menu     |
      | buy+sell |
      | reviews  |
    And Choose on "Used cars" link
    And Select car brand as "Ford" from make dropdown
    And Select model of the car as from model dropdown
    	| Model |
    	| Capri |
    And Select location as "ACT - All" from location dropdown
    And Select price mas as "10000" from price dropdown
    And Click on Find_My_Next_Car button
    Then I should see list of searched cars
    And The page title should be "Used Ford Capri Under 10000 for Sale ACT - Second Hand Ford Capri Under $10k in ACT | carsguide"
