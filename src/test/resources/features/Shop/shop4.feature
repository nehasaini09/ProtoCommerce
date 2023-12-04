Feature: Validating Left title

Background: User is logged into ProtoCommerce website

Scenario: Validating Left frame title
Given User is on shopping page
Then User should see a heading: Shop Title

Scenario: Validating Left frame title
Given User is on shopping page
Then User not able to see heading