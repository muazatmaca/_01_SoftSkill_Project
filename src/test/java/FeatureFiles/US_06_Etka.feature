Feature: Password and Password Confirm do not much Function

  Background:
    Given Navigate to OrangeHRM
    When Enter username and password and click login button
    Then User should login succesfully

  Scenario: Fill the password and password confirm and see the error message

    When Click on the element in LeftNaw
      | admin |

    Then Click on the element in Dialog
      | addButton |

    And Password sending the keys in Dialog Content
      | add_password        | Admin123. |
      | add_passwordConfirm | admin123. |

    And Do not match message should be displayed




