package opencart.pageaction;

import opencart.pagelocatorrr.LoginPageLocator;
import opencart.utility.TestBaseOpenCart;

public class LoginPageAction extends TestBaseOpenCart {
	LoginPageLocator loginPageLocator = new LoginPageLocator();

	public void Myaccount() {
		loginPageLocator.ClickonMyAccountDrop.click();
	}

	public void Clicklogin() {
		loginPageLocator.Clickonlogin.click();
	}

	public void usercard(String u, String p) {

		loginPageLocator.EnterEmailAccout.sendKeys(u);
		loginPageLocator.Enterpassword.sendKeys(p);
	}

	public void ClickonLoginButton() {
		loginPageLocator.Clickonloginbutton.click();

	}
}