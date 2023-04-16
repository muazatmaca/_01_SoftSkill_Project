Feature: User Mandatory Field Funtionality


  Background:
    Given Navigate to OrangeHRM
    When Enter username and password and click login button
    Then User should login succesfully

  Scenario:Validating user account by providing the Mandatory fields

    And Click on the element in LeftNaw
      | admin |

    Then User should login Admin User Management succesfully

    And Click on the element in Dialog
      | addButton |

    And  Click on the element in Dialog
      |userRoleSelect|
      |adminSelect   |
      |userStatusSelect|
      |EnabledSelect|

    And User sending the keys in Dialog Content
      |employeeName|h|

    And Click on the element in Dialog
    |employeeNameselect|

    And  Username sending the keys in Diyalog Content
    |userName|Hatice2|

    And Password sending the keys in Dialog Content
      | add_password | 484448Bd.  |
      |add_passwordConfirm|484448Bd.|

    And Click on the element in Dialog
    |saveButton|

    Then Success message should be displayed












