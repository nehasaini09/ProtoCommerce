Feature: Validating Left frame button

Background: User is on home page
Scenario: Validating category1 button
Given User is on shopping page
When User clicks on category1 button
Then User should be on home page

Scenario: Validating category1 button
Given User is on shopping page
When User clicks on category1 button
Then User get an error msg: button not clickable

Scenario: Validating category2 button
Given User is on shopping page
When User clicks on category2 button
Then User should be on home page

Scenario: Validating category2 button
Given User is on shopping page
When User clicks on category2 button
Then User get an error msg: button not clickable

Scenario: Validating category3 button
Given User is on shopping page
When User clicks on category3 button
Then User should be on home page

Scenario: Validating category3 button
Given User is on shopping page
When User clicks on category3 button
Then User get an error msg: button not clickable