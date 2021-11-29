package opencart.stepdefinition;

import cucumber.api.java.en.Then;
import opencart.pageaction.LoginPageAction;
import opencart.utility.TestBaseOpenCart;

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

}
