Feature: Logout
  Scenario: User logs out from the application
    Given the user is logged into the system
    When they select the "Logout" option
    Then they should see the login screen again
