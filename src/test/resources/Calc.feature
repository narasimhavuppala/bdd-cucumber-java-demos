Feature: Calculator

  # Sceanrio out line gives the vairables access
  Scenario Outline: calculate add
    Given I have a calc with <a> <b>
    When I ask it to say add
    Then it should answer with add <result>

    Examples: 
      | a | b | result |
      | 1 | 2 |      3 |
      | 2 | 5 |      7 |
      | 7 | 9 |     16 |

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
