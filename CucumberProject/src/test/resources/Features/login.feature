@Login
Feature: To validate login functionality
Background:
Given user is in login page
@sanity
Scenario Outline: To validate login using invalid username and password

When user enter "<username>" and "<password>"
And user click login button
Then user must be displayed with error messsage
Examples:
|username|password|
|java|java@123|

@regression @sanity
Scenario:
To validate login without entering credentials 
When user enter empty username and password
And user click login button
Then user must be displayed with error message