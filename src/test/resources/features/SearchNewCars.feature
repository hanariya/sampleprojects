Feature: Searching for new cars
  and validate the page title

  Scenario: Searching for new car with excel data
    Given Open the page "https://www.carsguide.com.au/"
    When navigate to the menu buy+sell
    And choose the new car seach from menu
    And choose make from the given sheetname "<sheetName>" and row number <RowNumber>
    And choose model from the given sheetname "<sheetName>" and row number <RowNumber>
    And choose location from the given sheetname "<sheetName>" and row number <RowNumber>
    And choose price from the given sheetname "<sheetName>" and row number <RowNumber>
    And Click on Find_My_Next_Car button
    Then I should see list of searched cars
    And The page title should be from the given sheetname "<sheetName>" and row number <RowNumber>

    Examples:
    |sheetName| RowNumber|
    |searchNewCars|0|
    |searchNewCars|1|