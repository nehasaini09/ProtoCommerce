
Feature: Password Text Box On Home Page

  Background: User is on Home Page
  
  Scenario: Verify default section of Password Text box
    Given User is on Home Page
    When User see the Password Text Box
    Then Threre should be no text
    
    
    Scenario: Verify Password Text box with invalid password
    Given User is on Home Page
    When User enters invalid password
    Then User should see error message
    
    
    Scenario: Verify Password Text box with valid password
    Given User is on Home Page
    When User enters valid password
    Then It should be displayed in text Box without error message
    
    