Feature: Shop button functionality

Background: User is on home page
       Scenario: Validating shop button
       Given User is on login page
       When User clicks on shop button
       Then User should be on shopping page
       
       
   Scenario: Validating shop button
       Given User is on login page
       When User clicks on shop button
       Then User should get an error message: button not clickable
       
       
