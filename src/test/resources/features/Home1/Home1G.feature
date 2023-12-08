
Feature: Check Box On Home Page

  Background: User is on Home Page
  
  Scenario: Verify default section of Check box
    Given User is on Home Page
    When User see the Check Box
    Then CheckBox should not be selected
    
    
    Scenario: Verify CheckBox  Selection Button
    Given User is on Home Page
    When  user clicks on the CheckBox
    Then User should be selected