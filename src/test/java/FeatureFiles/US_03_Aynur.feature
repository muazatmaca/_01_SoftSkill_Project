Feature: SaveButton Functionality

  Background:

    Given Navigate to OrangeHRM
    When Enter username and password and click login button
    Then User should login succesfully

  Scenario: Seeing notification message when pressing saveButton without entering mandotary fields

    And Click on the element in LeftNav
      | admin |

    Then User should login Admin User Management succesfully

    And Click on the element in Dialog Content
      | addButton  |
      | saveButton |

    Then Required text is displayed


