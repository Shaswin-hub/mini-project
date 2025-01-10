@feature1
Feature: To validate login in facebook application

@smoke
Scenario: To validate invalid username and password
Given To launch the edge browser and hit the url
When To enter the invalid username in email field

And To enter invalid password in password field

And To click login button

Then 	To close the edge browser



@sanity
Scenario Outline:To validate valid username and password

Given  launch the edge browser and hit the url

When  enter the invalid username "<emailfield>" in email field

And  enter invalid password "<passwordfield>" in password field

And  click login button

Then 	 close the edge browser
Examples:
|emailfield|passwordfield|
|abc@gmail.com|1245698|
|fgddg@gmailcom|25896|
|atob@gmail.com|25896|
