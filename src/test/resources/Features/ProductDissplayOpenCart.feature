Feature: Product Display   


@Sanity4
Scenario: Successfully verify product search & display
Given Launch application "<URL>"
Then Enter any existing Product name into the Search text box field 
Then Click on the button having search  icon
Then Click on the Product displayed in the Search results
Then Click on the main bigger sized Thumbnail image displayed on the 'Product Display Page' 
Then Click on '<' and '>' options 
Then Click on 'x' option or press 'ESC' keyboard key when the thumbnails are displayed in Light box view
Then Click on the normal sized Thumbnail images
Then Click on '<' and '>' options again
Then Click on 'x' option or press 'ESC' keyboard key again when the thumbnails are displayed in Light box view 