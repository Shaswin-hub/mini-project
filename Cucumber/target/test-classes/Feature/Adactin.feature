@feature5
Feature: To validate login to adactin hotel link
Scenario: Validate valid username and valid password
Given Launch the edge browser and hit the url
When Enter valid username in username field
And Enter valid password in password field
And Click login button
And Select the location in location field
And Select hotel in hotel field
And Select room in room field
And Click submit button
And Select the hotel 
And Click continew button
Then Close the edge browser