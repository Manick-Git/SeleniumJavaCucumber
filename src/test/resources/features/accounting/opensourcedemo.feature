Feature: Verify login functionality
 
 @Regression @Smoke 
  Scenario: check successful login
    Given user is on login page
    When user enters valid username and password
    And user clicks on login button
    Then user navigates to dashboard after successful login
    Then end the test