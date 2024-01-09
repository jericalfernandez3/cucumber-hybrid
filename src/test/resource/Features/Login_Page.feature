Feature: Login Page

Scenario: Login Page Title
  Given user is on login page
  When user gets the title of the page
  Then the title should be "Swag Labs"

Scenario: Login Page
  Given user is on login page
  Then username and password textfield should be displayed

Scenario: User Login
  Given user is on login page
  When user enters username "standard_user"
  And user enters password "secret_sauce"
  And user clicks login button
  Then user should be redirected to Product Page