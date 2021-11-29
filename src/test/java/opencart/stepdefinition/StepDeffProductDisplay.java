package opencart.stepdefinition;

import cucumber.api.java.en.Then;
import opencart.pageaction.PDisplayPageAction;
import opencart.utility.TestBaseOpenCart;

public class StepDeffProductDisplay extends TestBaseOpenCart {

	PDisplayPageAction pDisplayPageAction = new PDisplayPageAction();

	@Then("^Enter any existing Product name into the Search text box field$")
	public void enter_any_existing_Product_name_into_the_Search_text_box_field() throws Throwable {
		pDisplayPageAction.EnterExistingProductName();
	}

	@Then("^Click on the button having search icon$")
	public void click_on_the_button_having_search_icon() throws Throwable {
		pDisplayPageAction.ClickonSearchIcon();
	}

	@Then("^Click on the Product displayed in the Search results$")
	public void click_on_the_Product_displayed_in_the_Search_results() throws Throwable {
		pDisplayPageAction.ClickonProductDisplaySearch();
	}

	@Then("^Click on the main bigger sized Thumbnail image displayed on the 'Product Display Page'$")
	public void click_on_the_main_bigger_sized_Thumbnail_image_displayed_on_the_Product_Display_Page()
			throws Throwable {
		pDisplayPageAction.ClickonMainBiggerSize();
	}

	@Then("^Click on '<' and '>' options$")
	public void click_on_and_options() throws Throwable {
		pDisplayPageAction.ClickonRightSide();
		pDisplayPageAction.ClickonLeftSide();

	}

	@Then("^Click on 'x' option or press 'ESC' keyboard key when the thumbnails are displayed in Light box view$")
	public void click_on_x_option_or_press_ESC_keyboard_key_when_the_thumbnails_are_displayed_in_Light_box_view()
			throws Throwable {
		pDisplayPageAction.ClickonXOption();
	}

	@Then("^Click on the normal sized Thumbnail images$")
	public void click_on_the_normal_sized_Thumbnail_images() throws Throwable {
		pDisplayPageAction.ClickonNormalSize();
	}

	@Then("^Click on '<' and '>' options again$")
	public void click_on_and_options_again() throws Throwable {
		pDisplayPageAction.ClickonRightSideagain();
		pDisplayPageAction.ClickonLeftSideagain();
	}

	@Then("^Click on 'x' option or press 'ESC' keyboard key again when the thumbnails are displayed in Light box view$")
	public void click_on_x_option_or_press_ESC_keyboard_key_again_when_the_thumbnails_are_displayed_in_Light_box_view()
			throws Throwable {
		pDisplayPageAction.ClickonXoptionagain();
	}

}
