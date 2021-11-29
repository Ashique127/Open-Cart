Feature: Signin


@Sanity1
Scenario: User can signin successfully 
Given Launch application "<URL>"
Then Click on 'My Account' Drop menu
Then click on login
Then Enter valid 'E-Mail Address' and 'Password' into the respective fields
Then Click on login button