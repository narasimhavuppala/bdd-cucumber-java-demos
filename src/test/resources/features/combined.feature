Feature: Calculator

  # Sceanrio out line gives the vairables access
  @combinedtag
  Scenario Outline: Calculator test
    Given I have been given a calc with  <a> <b>
    When I ask calc to do "<function>"
    Then it should give me with result <result> of "<type>"

    Examples: 
      | function | a | b | result |type|
      | add      | 1 | 2 |      3 |positive|
      | add      | 2 | 5 |      7 |positive|
      | add      | 7 | 9 |     16 |positive|
      | subtract | 7 | 9 |      2 |negative|
