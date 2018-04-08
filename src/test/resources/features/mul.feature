Feature: Calculator

  # Multiplication
  Scenario: calculate multiply
    Given I have a calc with 12 3
    When I ask it to say multiply
    Then it should answer with mul 36

  Scenario: Calculate Multiply
    Given I have a calc with
      | 1 | 6 |
      | 2 | 3 |
      | 3 | 2 |
      | 6 | 1 |
    When I ask it to say multiply
    Then it should answer with mul 6
