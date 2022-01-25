Feature: To Verify the Sign in page of Amazon
@ignore
  Scenario Outline: To verify the sign in page with invalid credentials
    Given user is on amazon home page1
    When the user clicks on addcart button1
    Then user should be navigated to signuplanding page1
    And the users should be able to enter <username> and <password> and click on sign in button

    Examples: 
      | username              | password  |
      | mykadckddvk@gmail.com | Myname920 |
      | mkxnack@gcj.com       | mcsckck   |
  @run1    
 Scenario: To check the signin button
 
Given user is on amazon home page1
    When the user clicks on addcart button1
    Then user should be navigated to signuplanding page1
    And the users should be able to enter username and  click on sign in button
    |myname@gmail.com|