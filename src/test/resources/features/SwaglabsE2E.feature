Feature: SWAGLABS end to end testing

  Scenario Outline: Users should able to order product successfully
    Given User is on swaglabs url
    When User enters username as "<username>" and password as "<password>"
    And User clicks login button
    Then User should able to navigate to Products screen
    When User selects product from the list "<list>"
    And User clicks ADD TO CARD button
    Then Selected product should be added to the card
    When User clicks on card icon
    Then User should navigate to Your Cart page
    When User clicks on checkout button
    Then User should navigate to Checkout: Your Information page
    When User enters first name as "<firstName>"
    And User enters last name as "<lastName>"
    And User enters zip or postal code as "<zipCode>"
    And User clicks Continue button
    Then User should navigate to Checkout: Overview page
    When User clicks on Finish button
    Then User should navigate to Finish page
    And User should see messages as "THANK YOU FOR YOUR ORDER"
    And Your order has been dispatched, and will arrive just as fast as the pony can get there!


    Examples:
    |username               |password     |list                             |firstName|lastName|zipCode |
    |standard_user          |secret_sauce |Sauce Labs Bolt T-Shirt          |John     |Cena    |123456  |
    |locked_out_user        |secret_sauce |Test.allTheThings() T-Shirt (Red)|Kevin    |Kala    |102452  |
    |problem_user           |secret_sauce |Sauce Labs Bike Light            |Smith    |Joy     |147858  |
    |performance_glitch_user|secret_sauce |Sauce Labs Bolt T-Shirt          |Leo      |Elbert  |465000  |