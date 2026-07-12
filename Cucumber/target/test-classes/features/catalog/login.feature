Feature: User Login
  Scenario: Successful login with valid credentials
    Given the user is on the login page
    When the user enters valid "admin" and "password123"
    And clicks the login button
    Then they should be redirected to the dashboard