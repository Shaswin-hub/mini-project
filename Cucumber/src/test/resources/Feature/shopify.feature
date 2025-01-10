@feature4
Feature:  login in shopify application
Scenario: validate valid username and invalide password
Given launch the edge browser and type the url
When Click to login button
And enter email in email field
And click continue button
And enter password in password field
And after click login button
Then after close the edge browser

