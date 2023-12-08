@HomeEmpStatus
Feature: Employment status HomePage validation

Scenario: Validate initial state of employmemt status 
Given User is on the Protocommerce Homepage  
 When  User is at Homepage
 Then None of the employment status radio button should be selected and the "Enterprenuer" radio button should be disabled


 Scenario: Validate "Student" as employment status
 Given User is on the Protocommerce Homepage
 When  User select the "Student" radio button
Then The "Student" radio button should be selected


 Scenario: Validate "Employed" as employment status  
 Given User is on the Protocommerce Homepage
 When  User select the "Employed" radio button
Then The "Employed" radio button should be selected

Scenario: Validate"Enterprenueur(diasabled)"  employment status
Given User is on the Protocommerce Homepage
 When User attempt to select the " enterpreneur" radio button
Then The "Enterpreneur" radio button should remain disabled