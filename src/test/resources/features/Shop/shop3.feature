Feature: Validating Footer

Background: User is logged into ProtoCommerce website
 Scenario: Validating ProtoCommerce Footer
 Given User is on shopping page
 Then User should see a msg: Copyright © ProtoCommerce 2018
 
 Scenario: Validating ProtoCommerce Footer
 Given User is on shopping page
 Then User cannot see any msg