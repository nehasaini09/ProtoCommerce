@HomePage
Feature: HomePage Verification

Scenario: Verify ProtoCommerce title
 Given User is at the Protocommerce Homepage
 When  User is on Homepage
Then User should see "ProtoCommerce" as title


Scenario: Validate homepage footer
 Given User is on  Protocommerce Homepage
 When  User is at the Homepage
Then User should see the footer as "Copyright © ProtoCommerce 2018"