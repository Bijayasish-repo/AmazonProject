Feature: Test Amazon As Guest

Scenario: User successfully logs in to Amazon homepage
	Given User is on Amazon Login Page
	When User enters "pUserName" and "pPassword"
	And User clicks on Login button
	Then User is successfully logged in 

