Feature: Logout and forgot password


@Sanity2
Scenario: User can logout successfully 
Given Launch application "<URL>"
Then Click on 'My Account' Dropdown menu
Then Click 'Logout' option
Then Click on 'Continue' button


@Sanity3
Scenario: User can successfully get the credentials 
Given Launch application "<URL>"
Then User will click on 'My Account' Dropdownmenu
Then User will click 'Login' option
Then User will click on 'Forgotten Password' link from Login page
Then Enter the email address of an existing account user forgot the password
Then User will click on 'Continue' button