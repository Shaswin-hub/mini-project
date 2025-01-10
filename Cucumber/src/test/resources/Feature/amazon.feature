@regression
Feature: To valid signin function of amazon application

Scenario: Validate valide username and valide password
Given Launch edge browser and hit the amazon url
When To send the username or mobile number in email field
And To click continue button
And To send password in password field
And To click the signin button
Then To close the amazon page browser
