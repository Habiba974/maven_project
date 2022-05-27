@somke
Feature: user add product
  Scenario:user add product to cart
    Given user chose product that he want
   When add to cart
    Then success massage will show
And add product by category
    And chose  product
    When add product
    Then success  will show
    Then table of shop cart will show