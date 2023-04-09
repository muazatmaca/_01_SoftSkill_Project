Feature: Login Functionality

  Background:

    Given Navigate to OrangeHRM
    When Enter username and password and click login button
    Then User should login succesfully

  Scenario: in the password rest than eight characters.

    And Click on the element in LeftNaw
      | admin |

    Then User should login Admin User Management succesfully

    And Click on the element in Dialog
      | addButton |






