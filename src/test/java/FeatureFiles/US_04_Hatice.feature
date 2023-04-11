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

    And Click on the element in Dialog
      |userRoleSelect|


