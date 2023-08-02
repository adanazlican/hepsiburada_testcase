@wip
Feature: Login feature

  @login
  Scenario: Login with valid credentials
    Given User on the hepsiburada website
    When user navigate login page
    When user enter correct email
    And user click giris yap
    And user enter correct password
    Then user click gy again


