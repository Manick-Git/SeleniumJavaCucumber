Feature: Product Search
  
  @Regression
  Scenario: Search for an existing product
    Given the user is on the home page
    When they search for "Laptop"
    Then the search results should display "Laptop"