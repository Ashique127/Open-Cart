package opencart.stepdefinition;

import cucumber.api.java.en.Then;
import opencart.pageaction.LogoutPageAction;
import opencart.utility.TestBaseOpenCart;

public class StepDeffLogoutPage extends TestBaseOpenCart {
	LogoutPageAction logoutPageAction = new LogoutPageAction();

	@Then("^Click on 'My Account' Dropdown menu$")
	public void click_on_My_Account_Dropdown_menu() throws Throwable {
		logoutPageAction.MyAccountN();
	}

	@Then("^Click 'Logout' option$")
	public void click_Logout_option() throws Throwable {
		logoutPageAction.Logout();
	}

	@Then("^Click on 'Continue' button$")
	public void click_on_Continue_button() throws Throwable {
		logoutPageAction.ContinueN();
	}

	@Then("^User will click on 'My Account' Dropdownmenu$")
	public void user_will_click_on_My_Account_Dropdownmenu() throws Throwable {
		logoutPageAction.UsermyAccountN();
	}

	@Then("^User will click 'Login' option$")
	public void user_will_click_Login_option() throws Throwable {
		logoutPageAction.Userloginoption();
	}

	@Then("^User will click on 'Forgotten Password' link from Login page$")
	public void user_will_click_on_Forgotten_Password_link_from_Login_page() throws Throwable {
		logoutPageAction.ForgotPasswordLink();
	}

	@Then("^Enter the email address of an existing account user forgot the password$")
	public void enter_the_email_address_of_an_existing_account_user_forgot_the_password() throws Throwable {
		logoutPageAction.Enteremail();
	}

	@Then("^User will click on 'Continue' button$")
	public void user_will_click_on_Continue_button() throws Throwable {
		logoutPageAction.Userclickoncontinue();
	}

}
