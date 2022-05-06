package opencart.stepdefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import opencart.pageaction.LoginPageAction;
import opencart.utility.TestBaseOpenCart;
import opencart.utility.UtillOpenCart;

public class StepDeffLoginPage extends TestBaseOpenCart {
	LoginPageAction loginPageAction = new LoginPageAction();

	@Then("^Click on 'My Account' Drop menu$")
	public void click_on_My_Account_Drop_menu() throws Throwable {
		loginPageAction.Myaccount();
	}

	@Then("^click on login$")
	public void click_on_login() throws Throwable {
		loginPageAction.Clicklogin();
	}

	@Then("^Enter valid 'E-Mail Address' and 'Password' into the respective fields$")
	public void enter_valid_E_Mail_Address_and_Password_into_the_respective_fields() throws Throwable {
		loginPageAction.usercard(prop.getProperty("mrxuser"), prop.getProperty("mrxpass"));
	}

	@Then("^Click on login button$")
	public void click_on_login_button() throws Throwable {
		loginPageAction.ClickonLoginButton();
	}

	@Then("^verify customer on My Account Page$")
	public void verify_customer_on_My_Account_Page() throws Throwable {
		loginPageAction.VerifyMyAccount();

	}

	@Then("^Click on 'Edit your account information' link on the displayed 'My Account' page$")
	public void click_on_Edit_your_account_information_link_on_the_displayed_My_Account_page() throws Throwable {

		loginPageAction.EditAcct();
	}

	@When("^Naviagte to First Name and clear information$")
	public void naviagte_to_First_Name_and_clear_information() throws Throwable {
		loginPageAction.FirstNameClear();
		UtillOpenCart.takescreenshot(driver, "Fisrt Name");

	}

	@Then("^Move to Last Name and clear information$")
	public void move_to_Last_Name_and_clear_information() throws Throwable {
		loginPageAction.LastNameClear();
		UtillOpenCart.takescreenshot(driver, "Last Name");
	}

	@Then("^Naviagte to Email and clear information$")
	public void naviagte_to_Email_and_clear_information() throws Throwable {
		loginPageAction.EmailClear();
		UtillOpenCart.takescreenshot(driver, "Email");

	}

	@Then("^Move to Telephone and clear information$")
	public void move_to_Telephone_and_clear_information() throws Throwable {
		loginPageAction.TelephoneClear();
		UtillOpenCart.takescreenshot(driver, "Telephone");

	}

	@Then("^again naviagte to First Name and enter 'Sohel'$")
	public void again_naviagte_to_First_Name_and_enter_Sohel() throws Throwable {
		loginPageAction.InsertFirstName();
		UtillOpenCart.takescreenshot(driver, "New Fisrt Name");
	}

}
