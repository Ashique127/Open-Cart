Feature: Signin


@Sanity1
Scenario: User can signin successfully 
Given Launch application "<URL>"
Then Click on 'My Account' Drop menu
Then click on login
Then Enter valid 'E-Mail Address' and 'Password' into the respective fields
Then Click on login button
Then verify customer on My Account Page
Then Click on 'Edit your account information' link on the displayed 'My Account' page
When Naviagte to First Name and clear information
Then Move to Last Name and clear information 
Then Naviagte to Email and clear information
Then Move to Telephone and clear information
Then again naviagte to First Name and enter 'Sohel'


