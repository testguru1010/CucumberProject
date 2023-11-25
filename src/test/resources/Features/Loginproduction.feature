@PRD
Feature: Login production Feature
  As a user i want the ability to login to test aapp

  Scenario Outline: Login to test app as a user on production
    Given user navigates to test app website
    When user validates the home page title
    Then user enters "<username>" username
    Then user enters "<password>" password
    And user validates capcha image
    Then user clicks on the signin button

    Examples: 
      | username | password |
      | valid    | valid    |
      | invalid  | invalid  |
      | valid    | invalid  |
      | invalid  | invalid  |
