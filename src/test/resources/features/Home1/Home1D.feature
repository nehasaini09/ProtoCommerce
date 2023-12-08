
Feature: Name Text Box on HomePage

  Background: User is on Home Page
  
   Scenario: Verify default section of Name Text box
    Given User is on Home Page
    When User see the Name text box
    Then There should be no text
    
   Scenario: Verify Name Text box with invalid name
    Given User is on Home Page
    When User enters invalid Name in text box
    Then There should be error message
    
    Scenario: Verify Name Text box with valid name
    Given User is on Home Page
    When User enters valid Name in text box
    Then User should see the name in text box without error message