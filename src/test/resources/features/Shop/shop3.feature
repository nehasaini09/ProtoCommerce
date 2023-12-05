Feature: Validating Left title

Background: User is on home page

Scenario: Validating Left frame title
Given User is on shopping page
Then User should see a heading: Shop Title

Scenario: Validating Left frame title
Given User is on shopping page
Then User not able to see heading