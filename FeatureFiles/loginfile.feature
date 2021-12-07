Feature: Test Orange HRM application

Scenario: Test Login Functionality
Given User is on Login Page
When User enter valid credentials 
Then User is on Home Page

Scenario: test home Page Functionality
Given test logo is present or not
Then click on view My Details

Scenario: Test My Info Page
When user click on edit button
Then user enter first name middle name and last name
Then user enter employee id
Then user select female radio button
Then user select nationality
Then user click on save button
