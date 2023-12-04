Feature: Validating products images

Background: User is logged into ProtoCommerce website

Scenario: Validating products images
Given User is on shopping page
When User clicks on iphone image
Then User should be on home page

Scenario: Validating products images
Given User is on shopping page
When User clicks on iphone image
Then User get an error msg: Image not clickable

Scenario: Validating products images
Given User is on shopping page
When User clicks on Samsung image
Then User should be on home page

Scenario: Validating products images
Given User is on shopping page
When User clicks on Samsung image
Then User get an error msg: Image not clickable

Scenario: Validating products images
Given User is on shopping page
When User clicks on Nokia image
Then User should be on home page

Scenario: Validating products images
Given User is on shopping page
When User clicks on Nokia image
Then User get an error msg: Image not clickable

Scenario: Validating products images
Given User is on shopping page
When User clicks on Blackberry image
Then User should be on home page

Scenario: Validating products images
Given User is on shopping page
When User clicks on Blackberry image
Then User get an error msg: Image not clickable


