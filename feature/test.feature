Feature: OrangeHrmLogin

Scenario: Simple login
 Given I launch chrome browser
 And I open orange hrm homepage
 When enter username and password
 And Click on login button
 Then user must successfully login to the Dashboard page
 And Close the browser

 