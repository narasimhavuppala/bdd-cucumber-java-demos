Feature: Calculator

  @subtag
  Scenario: calculate subtract
    Given I have a calc with 12 3
    When I ask it to say subtract
    Then it should answer with sub 9
