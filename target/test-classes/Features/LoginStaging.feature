@STG
Feature: Login Feature  - Staging
  As a user i want the ability to login to test app

  Background: 
    Given user navigates to test app website in staging env
    When user validates the home page title in staging env

  Scenario: Login to test app as a valid user in staging Env
    Then user enters "valid" username in staging env
    Then user enters "valid" password in staging env
    Then user clicks on the signin button in staging env

  Scenario: Login to test app as a invalid user in staging Env
    Then user enters "invalid" username in staging env
    Then user enters "invalid" password in staging env
    Then user clicks on the signin button in staging env
