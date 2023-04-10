Feature: Notification message when entering in invalid admin name

  Background:
    Given Navigate to OrangeHRM
    When Enter username and password and click login button
    Then User should login succesfully

  Scenario: Enter an invalid admin name and see the error message
    When Click on the element in LeftNaw
      | admin |

    Then Click on the element in Dialog
      | addButton |

    And Enter invalid name
      | employeeName | firstmiddle |

    And Invalid message should be displayed