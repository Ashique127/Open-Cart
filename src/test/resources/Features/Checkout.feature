Feature: Checkout


@Sanity5
Scenario: Validate navigating to Checkout page when there are 
no products added to the Shopping Cart
Given Launch application "<URL>"
When Click on 'Checkout' header option
Then verify user on the empty page



@Sanity6
Scenario: Validate navigating to Checkout page from 'Shopping Cart' page
Given Launch application "<URL>"
When enter any existing Product name into the Search text box field
Then click on the button having search icon
And Click on 'Add to Cart' button on the Product displayed in the Search results
Then Click on the 'shopping cart!' link in the displayed success message
Then Click on 'Checkout' button in the 'Shopping Cart' page
Then verify checkout button is enable