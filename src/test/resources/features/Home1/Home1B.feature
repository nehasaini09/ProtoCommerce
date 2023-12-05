
Feature: HomePage Header

  Background: User is on Home Page
  
  Scenario: To validate the heading of Home Page
    Given User is on ProtoCommerce url
    When User clicks on Home Page
    Then Heading with text "ProtoCommerce" should be there
    