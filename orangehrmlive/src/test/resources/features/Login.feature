Feature: Login to OrangeHRM portal
  Scenario: User should able to login with valid credentials
    Given User is on OrangeHRM portal
    When User enters username
    And User enters password
    And User clicks on login button
    Then User should navigate to home page successfully!

