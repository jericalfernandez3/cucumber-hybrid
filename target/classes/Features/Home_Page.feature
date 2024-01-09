Feature: Home Page

Scenario: Login Page Title
  Given user is on login page
  When user gets the title of the page
  Then the title should be "Swag Labs"