Feature: Midtrans Pillow Purchase Functionality

  Scenario: I purchase Midtrans pillow with valid Password
    Given I am on Shopping Website
    When I click Buy Now button on Home Page
    Then I am on Checkout Page
    Then I enter name on Checkout Page
    And I enter email on Checkout Page
    And I enter phone no on Checkout Page
    And I enter city on Checkout Page
    And I enter address on Checkout Page
    And I enter postal code on Checkout Page
    And I click on Checkout Button
    Then I am on Order Summary Page
    And I click on Details tab
    And I close Details tab
    And I am on Payment Page
    Then I click on credit card
    And I am on Card Details Page
    And I enter Card Number
    And I enter Expiration Date
    And I enter CVV
    Then I click on Pay Now Button
    Then I am on Bank Payment Screen Page
    And I enter Password
    And I click on Ok Button

  Scenario: I purchase Midtrans pillow with invalid Password
    Given I am on Shopping Website
    When I click Buy Now button on Home Page
    Then I am on Checkout Page
    Then I enter name on Checkout Page
    And I enter email on Checkout Page
    And I enter phone no on Checkout Page
    And I enter city on Checkout Page
    And I enter address on Checkout Page
    And I enter postal code on Checkout Page
    And I click on Checkout Button
    Then I am on Order Summary Page
    And I click on Details tab
    And I close Details tab
    And I am on Payment Page
    Then I click on credit card
    And I am on Card Details Page
    And I enter Card Number
    And I enter Expiration Date
    And I enter CVV
    Then I click on Pay Now Button
    Then I am on Bank Payment Screen Page
    And I enter invalid Password
    And I click on Ok Button after entering invalid Password

  Scenario: I purchase Midtrans pillow without Password
    Given I am on Shopping Website
    When I click Buy Now button on Home Page
    Then I am on Checkout Page
    Then I enter name on Checkout Page
    And I enter email on Checkout Page
    And I enter phone no on Checkout Page
    And I enter city on Checkout Page
    And I enter address on Checkout Page
    And I enter postal code on Checkout Page
    And I click on Checkout Button
    Then I am on Order Summary Page
    And I click on Details tab
    And I close Details tab
    And I am on Payment Page
    Then I click on credit card
    And I am on Card Details Page
    And I enter Card Number
    And I enter Expiration Date
    And I enter CVV
    Then I click on Pay Now Button
    Then I am on Bank Payment Screen Page
    And I click on Cancel Button


