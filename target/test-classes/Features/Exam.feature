Feature: Login


@Login
Scenario: Verify Customer can successfully login 
Given Open application URL
Then Customer will enter username
Then Customer will enter password
Then Customer will click in login option
Then Verify cutomer in home page

