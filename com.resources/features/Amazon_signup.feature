Feature: Amazon sign up verification

  Scenario: Verify whether able to navigate to the the signup page
    Given user is on amazon home page
    When the user clicks on addcart button
    Then user should be navigated to signuplanding page
    And the users should be able to click on the signup button
    And the user should be able to see the sign up page
 