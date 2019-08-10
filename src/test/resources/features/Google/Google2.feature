Feature: SmokeTest Google application

  @SmokeTest
  Scenario Outline: Perform SmokeTest On Google Application
    Given User navigate to the Google application
    When perform search
      | search_value | <Search_Value> |
    Then Search results should be displayed

    Examples: 
      | Search_Value                |
      | Protractor using javascript |
