Feature: Validating Header

Background: User is on home page

Scenario: Validating ProtoCommerce header
Given User is on shopping page
When User clicks on ProtoCommerce Title
Then User should be on home page

Scenario: Validating ProtoCommerce header
Given User is on shopping page
When  User clicks on Checkout button
Then User should be on checkout page

Scenario: Validating ProtoCommerce header
Given User is on shopping page
When User clicks on Checkout button
Then User get an error msg: button not clickable

	

  