Narrative:
As a user
I want to login to the Umetrix test application with correct credentials
After that I wanna navigate to Projects Web Page And create new Custom project from "Custom/ss" template

Scenario: Login with correct creds and create new Custom project.
Given user is on Umetrix login page
And user enters login 'asveboda@umetrix.com' and password '1qW@3er4' and presses sign in button
When user opens Project Web page and clicks on New project button
!--Then user is redirected to Select Your Project Type Web page
!--And user clicks Custom icon
!--Then user creates a new Custom Project from "ss" template