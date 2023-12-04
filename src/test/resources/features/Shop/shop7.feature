Feature: Validating Add buttons

Background: User is logged into ProtoCommerce website

Scenario: Validating iphone X add button
Given User is on shopping page
When User clicks on iphone X add button
Then User should see product added to checkout button

Scenario: Validating iphone X add button
Given User is on shopping page
When User clicks on iphone X add button
Then User get an error msg: button not clickable

Scenario: Validating Samsung add button
Given User is on shopping page
When User clicks on Samsung add button
Then User should see product added to checkout button

Scenario: Validating Samsung add button
Given User is on shopping page
When User clicks on Samsung add button
Then User get an error msg: button not clickable

Scenario: Validating Nokia add button
Given User is on shopping page
When User clicks on Nokia add button
Then User should see product added to checkout button

Scenario: Validating Nokia add button
Given User is on shopping page
When User clicks on Nokia add button
Then User get an error msg: button not clickable

Scenario: Validating Blackberry add button
Given User is on shopping page
When User clicks on Blackberry add button
Then User should see product added to checkout button

Scenario: Validating Blackberry add button
Given User is on shopping page
When User clicks on Blackberry add button
Then User get an error msg: button not clickable