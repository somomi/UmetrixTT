Narrative:
As a user
I want to login to the Umetrix test application with correct credentials
So that I can validate authentification

Scenario: Login with correct login and password.
Given user is on Umetrix login page
And user enters login 'asveboda@umetrix.com' and password '1qW@3er4' and presses sign in button
Then user should see correct username placed on home page's header
