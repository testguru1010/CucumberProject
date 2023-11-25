@DT
Feature: Login Feature
  As a user i want the ability to login to test App using Data tables in my feature

  Scenario Outline: Login to test app as a user using Data Table
    Given user navigates to test app website
    When user validates the home page title
    Then user enters "valid" username
    Then user enters "valid" password
    And user enters firstname and lastname from DT aslist
      | Hasnain | Syed    |
      | Syed    | Hasnain |
    And user enters firstname and lastname from DT asMap
      | FirstName | LastName |
      | Hasnain   | Syed     |
      | Syed      | Hasnain  |
    Then user clicks on the signin button
