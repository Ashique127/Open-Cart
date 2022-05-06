package opencart.stepdefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import opencart.pageaction.CheckoutActionPage;
import opencart.utility.TestBaseOpenCart;
import opencart.utility.UtillOpenCart;

public class StepDepCheckout extends TestBaseOpenCart {

	CheckoutActionPage checkoutActionPage = new CheckoutActionPage();

	@When("^Click on 'Checkout' header option$")
	public void click_on_Checkout_header_option() throws Throwable {
		checkoutActionPage.ClickCheckout();

	}

	@Then("^verify user on the empty page$")
	public void verify_user_on_the_empty_page() throws Throwable {
		checkoutActionPage.VerifyEmptyContent();
		UtillOpenCart.takescreenshot(driver, "Empty Content");

	}

	@When("^enter any existing Product name into the Search text box field$")
	public void enter_any_existing_Product_name_into_the_Search_text_box_field() throws Throwable {
		checkoutActionPage.EnterProdutNameImac();

	}

	@Then("^click on the button having search icon$")
	public void click_on_the_button_having_search_icon() throws Throwable {
		checkoutActionPage.ClickonSearchoption();

	}

	@Then("^Click on 'Add to Cart' button on the Product displayed in the Search results$")
	public void click_on_Add_to_Cart_button_on_the_Product_displayed_in_the_Search_results() throws Throwable {
		checkoutActionPage.ClickonAddtoCart();
	}

	@Then("^Click on the 'shopping cart!' link in the displayed success message$")
	public void click_on_the_shopping_cart_link_in_the_displayed_success_message() throws Throwable {
		checkoutActionPage.ClickonShoppingCart();
	}

	@Then("^Click on 'Checkout' button in the 'Shopping Cart' page$")
	public void click_on_Checkout_button_in_the_Shopping_Cart_page() throws Throwable {
		checkoutActionPage.Checkout();
		UtillOpenCart.takescreenshot(driver, "Checkout Shopping Cart");
	}

	@Then("^verify checkout button is enable$")
	public void verify_checkout_button_is_enable() throws Throwable {
		checkoutActionPage.Verifycheck();

	}

}
