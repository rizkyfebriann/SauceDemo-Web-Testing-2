@Web
Feature: Login Feature

    @Login
    Scenario Outline: Login
      Given user input "<invalidusername>" and "<password>"
      And user click login button
      Then user cannot login
#      And user click sidebar button
#      Then user click logout
      When user login again with "<validusername>" and "<password>"
      And user click login button
      Then user success login with valid account

      Examples:
      |validusername  | password    |invalidusername |
      |standard_user  |secret_sauce |locked_out_user |


