@HomePageLaunch
Feature: HomePage launch Verification

Scenario: Verify user is able to land on home page
 Given User launch the browser
 When  user give the correct URL (https://rahulshettyacademy.com/angularpractice/
Then User should land on homepage

Scenario: Verify user is able to land on home page with invalid URL
 Given User launch the browser
 When  user give the invalid URL (https://rahulshettyacademy.com/angular
Then User should receive 404 not found error

