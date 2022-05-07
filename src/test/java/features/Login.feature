Feature: Sign-in page

  #	Background: User on home page (This will run before every scenario)
  #		Given The user has opened the browser
  #		When user opened the website
  #		Then the user will be on the home page
  @SmokeTest
  Scenario Outline: Sign in page valid conditions
    Given The user is on hompage
    When user sign-in into application with username <Username> and password <Password>
    Then profile page should  be opened

    Examples: 
      | Username               | Password |
      | wexom38833@ishop2k.com | test123  |
      | testers123@gmail.com   | test123  |
      | testers1234@gmail.com  | test123  |

  @RegressionTest
  Scenario Outline: Sign in page valid conditions
    Given The user is on hompage
    When user sign-in into application with username <Username> and password <Password>
    Then profile page should  be opened

    Examples: 
      | Username               | Password |
      | wexom38833@ishop2k.com | test123  |
      | testers123@gmail.com   | test123  |
      | testers1234@gmail.com  | test123  |
