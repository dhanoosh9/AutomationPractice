Feature: Sauce Demo page login functionality

  Scenario Outline: Valid login conditions
    Given The homepage of saucedemo site
    Then Enter the username <username> and password <password>
    And Click on login button

    Examples: 
      | username      | password     |
      | standard_user | secret_sauce |
