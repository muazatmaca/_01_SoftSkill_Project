Feature: AddButton Functionality

  Background:

    Given Navigate to OrangeHRM
    When Enter username and password and click login button
    Then User should login succesfully

  Scenario: Seeing add button when navigating to user management page

    And Click on the element in LeftNaw
      | admin |

    Then User should login Admin User Management succesfully

    And Add button is displayed
