Feature: Password and Password Confirm do not much Function

  Background:
    Given Navigate to OrangeHRM
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Fill the password and password confirm and see the error message

    When Click the button on LeftNav
      | admin |

    Then Click the add button
      | addButton |

    And Enter password and password confirm
      | addPassword        | Admin123. |
      | addPasswordConfirm | admin123. |

    And Do not match message should be displayed




