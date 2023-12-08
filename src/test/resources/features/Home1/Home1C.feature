
Feature:Home Page credentials

  Background: user is on Home Page 
  
  Scenario: validate Home Page with invalid credentials
    Given User is on Home Page
    When User Enters invalid credentials 
    And  Press Submit button
    Then It should display error message
    
  Scenario: Validate the HomePage with all the mandatory field empty
    Given User is on Home Page
    When Users clicks SUBMIT button without entering mandatory feild 
    Then It should display error message
    
  Scenario: Validate the HomePage with valid credentials
    Given User is on Home Page
    When Users clicks SUBMIT button entering mandatory feild with valid data
    Then It should dislay success message "Success! The Form has been submitted successfully!."
    