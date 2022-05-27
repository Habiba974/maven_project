@somke
Feature: search for any product
  Scenario: user could search for any product
    Given user writ any product in search
When user click search button
   Then user go to page1
And user can search for product by using SKU
    When user click search button2
    Then user go to page