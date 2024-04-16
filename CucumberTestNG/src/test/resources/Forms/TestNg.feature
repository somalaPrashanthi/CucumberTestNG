@tag
Feature: Login page

  @tag1
  Scenario: Validating login page
    Given User opens chrome and enters url
    When User enters username
    And User enters password
    And clicks on login
    Then welcome back message is displayed
   

