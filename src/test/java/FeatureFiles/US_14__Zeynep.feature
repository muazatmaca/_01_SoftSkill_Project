Feature: User Management Functionality

  Background:
    Given Navigate to OrangeHRM
    When Enter username and password and click login button
    Then User should login succesfully

  Scenario: Notification message when entering value in the password field which doesn’t have lower case character.

    And Click on the element in LeftNaw
      | admin |

    Then User should login Admin User Management succesfully

    And Click on the element in Dialog
      | addButton |

    And Password sending the keys in Dialog Content
      | add_password | abcdefgh  |

    Then Notification message schould be displayed
      | notificationMessage | different password  |