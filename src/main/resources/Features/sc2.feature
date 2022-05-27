@somke
Feature: user login
  Scenario:guest user could Login with valid credentials
    Given user open login page
    And user put his email"aliaa@gmial.com"
And user put his password"1234567"
    When user enter login
Then user can see my account display
