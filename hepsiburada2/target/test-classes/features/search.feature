Feature: search with one character

  @arama
  Scenario: try to search with one character
    Given user is on the main page
    And user click search box
    And user texts single char
    Then user click search button