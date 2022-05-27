@somke
Feature: add in wish list
  Scenario: user can add product in wish list
    Given user select product by category
When click on product to add to wish list
    Then Success massage will show
    And user click on product2 wish icon
When  click on product2 to add to wish list
    Then Success2 massage will show
    Then wish list table will show