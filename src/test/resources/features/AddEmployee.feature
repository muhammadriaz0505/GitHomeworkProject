Feature: This feature is going to add employees in HRM application

  Background:
    When user enters valid admin username and password
    And user clicks on login button
    Then admin user is successfully logged in
    When user clicks on PIM option
    And user clicks on add employee option
  @smoke
  Scenario: Add an employee

    When user enters firstName, middleName and lastName
    And user clicks on save button
    Then employee added successfully
