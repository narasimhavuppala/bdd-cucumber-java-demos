
Feature: Calculator Add

  # Sceanrio out line gives the vairables access
  @addtag
  Scenario Outline: calculate add
    Given I have a calc with <a> <b>
    When I ask it to say add
    Then it should answer with add <result>

    Examples: 
      | a | b | result |
      | 1 | 2 |      3 |
      | 2 | 5 |      7 |
      | 7 | 9 |     16 |
