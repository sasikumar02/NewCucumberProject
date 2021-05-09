@ForgetPassword
Feature:
To validate forget password feature

Background:
Given user is in login page
And user click forget password link

@smoke
Scenario:
To validate forget password and search account using mobile number
When user searches the account using incorrect mobile number
Then user must not displayed with any accounts