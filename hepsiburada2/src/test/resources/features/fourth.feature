Feature: chosing location

  @konum
  Scenario: select and save location
    Given users at main page
    And user navigate to location bar
    And user select city
    And user select district
    And user select neighbourhood
    Then user save the changes
