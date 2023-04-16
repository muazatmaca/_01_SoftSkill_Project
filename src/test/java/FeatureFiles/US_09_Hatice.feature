Feature: Already Taken Name Functionality

  Background:

  Background:
    Given Navigate to OrangeHRM
    When Enter username and password and click login button
    Then User should login succesfully

  Scenario: Notification message when entering a username which already taken

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
      |employeeName|j|

    And Click on the element in Dialog
      |employeeNameselect|

    And Username sending the keys in Diyalog Content
      | userName | BedirSalih |

    And Password sending the keys in Dialog Content
      | add_password | 484448Bd.  |
      |add_passwordConfirm|484448Bd.|

    And Click on the element in Dialog
      |saveButton|

    Then Success message should be displayed



  Scenario: Register With The Same Username

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
      |employeeName|j|

    And Click on the element in Dialog
      |employeeNameselect|

    And Username sending the keys in Diyalog Content
      | userName | BedirSalih |

    And Password sending the keys in Dialog Content
      | add_password | 484448Bd.  |
      |add_passwordConfirm|484448Bd.|

    And Click on the element in Dialog
      |saveButton|

    Then Already exist message should be displayed