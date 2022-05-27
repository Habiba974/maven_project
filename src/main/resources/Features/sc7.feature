@somke
Feature: confirm"follow us" links open
  Scenario: confirm"follow us" links open the corresponding websites
    Given user go to follow us and click in facebook icon
   And user will go to page in facebook
    And user go to follow us and click in twitter icon
    Then user will go to page in twitter
    When user go to follow us and click in youtube icon
    Then user will go to page in youtube