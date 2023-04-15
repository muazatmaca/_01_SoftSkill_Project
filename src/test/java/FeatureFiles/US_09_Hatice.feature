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

    And Username sending the keys in Diyalog Content
      | userName | HaticeDere |

  Scenario: Register With The Same Username

    And Click on the element in LeftNaw
      | admin |
    Then User should login Admin User Management succesfully

    And Click on the element in Dialog
      | addButton |

    And Username sending the keys in Diyalog Content
      | userName | HaticeDere |

    Then Already exist message should be displayed