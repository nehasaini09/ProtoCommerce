@HomeDateofBirth
Feature: Date of Birth on HomePage validation

Scenario: Verify Date of Birth text box and date picker display
 Given User is on the Protocommerce Homepage
 When  User is on the Homepage
Then User should see a text box with default mm/dd/yyyy and date picker icon

Scenario: validate  mm/dd/yyyy format for date of birth
 Given User is on the Protocommerce Homepage
 When  User enter valid date of birth in the text box
Then The entered date should be displayed in the text box

Scenario: Validate invalid date of birth in mm/dd/yyyy format
 Given User is on the Protocommerce Homepage
 When  User enter invalid date of birth in the text box
Then An error message should be displayed indicating an invalid date format

Scenario: Verify Date picker
 Given User is on the Protocommerce Homepage
 When  User click on the date picker icon and select the date
Then The selected date should be displayed in the text box



