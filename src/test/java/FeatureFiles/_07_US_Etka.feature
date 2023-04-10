Feature: Notification message when entering in invalid admin name

  Background:
    Given Navigate to OrangeHRM
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Enter an invalid admin name and see the error message
    When Click the button on LeftNav
      | admin |

    Then Click the add button
      | addButton |

    And Enter invalid name
      | employeeName | firstmiddle |

    And Invalid message should be displayed