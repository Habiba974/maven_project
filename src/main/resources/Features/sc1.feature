@somke
Feature: register with valid data
  Scenario: user put his valid data

    Given user open register page
   And  user chose his gender
    And user put his first and last name
    And user put his birthday data
    And user put his email"aliaa@gmial.com"

    And user put his Company name
    And user put his password"1234567"
    And user put his Confirm password
    When user enter register
    Then success massage will appear
