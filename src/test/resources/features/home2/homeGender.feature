
@HomeGender
Feature: Gender HomePage validation
Background: 
Given User is on the Protocommerce Homepage

@GenderDefalt
Scenario: Verify default selection of gender

When User can see options for select "Gender"
Then The gender should be "Male" as default

@GenderDropdown
Scenario Outline: Verify Gender selection dropdown functionality
 When The user click on gender dropdown "<option>" in homepage
 Then it should be set to corresponding gender
  Examples: 
      | value |  
      | Male  |
      | Female|
      
 



 

