
Feature: Email Text Box On Home Page

  Background: User is on Home Page
  
  Scenario: Verify default section of Email Text box
    Given User is on Home Page
    When User see the Email TextBox
    Then There should be no text
    
   Scenario: Verify Email Text box with invalid data    
   Given User is on Home Page
   When User enters invalid email id
   Then It should display error message
   
   Scenario: Verify Email Text box  with valid data  
   Given User is on Home Page
   When User enters valid email id
   Then It should be displayed on Email Text box without error message