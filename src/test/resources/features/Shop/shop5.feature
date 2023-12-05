Feature: Validating upper right frame

Background: User is on home page
 
 Scenario: Validating paginator next button
Given User is on shopping page
When User clicks on next image button
Then User should see next image

Scenario: Validating paginator next button
Given User is on shopping page
When User clicks on previous image button
Then User should see previous image