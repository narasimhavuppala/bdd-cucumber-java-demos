Feature: Calculator

  Scenario: calculate add
    Given I have a calc with 12 3
    When I ask it to say add
    Then it should answer with add 15

  Scenario: calculate subtract
    Given I have a calc with 12 3
    When I ask it to say subtract
    Then it should answer with sub 9

# Multiplication

  Scenario: calculate multiply
    Given I have a calc with 12 3
    When I ask it to say multiply
    Then it should answer with mul 36

  Scenario: calculate divide
    Given I have a calc with 12 3
    When I ask it to say divide
    Then it should answer with div 4
