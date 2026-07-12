Feature: User Profile
  
  @Regression
  Scenario: Update user bio
    Given the user is on the profile settings page
    When they update their bio to "Automation Engineer"
    And click "Save"
    Then the profile should display the new bio
