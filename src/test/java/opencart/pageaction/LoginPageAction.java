package opencart.pageaction;

import junit.framework.Assert;
import opencart.pagelocat.LoginPageLocator;
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

	public void VerifyMyAccount() {
		boolean xx = loginPageLocator.VerifyAccount.isDisplayed();
		Assert.assertTrue(xx);

	}

	public void EditAcct() {
		loginPageLocator.EditAccInfo.click();

	}

	public void FirstNameClear() {
		loginPageLocator.ClearFisrtName.clear();

	}

	public void LastNameClear() {
		loginPageLocator.ClearLasttName.clear();

	}

	public void EmailClear() {
		loginPageLocator.ClearEmail.clear();

	}

	public void TelephoneClear() {
		loginPageLocator.ClearTelephone.clear();

	}

	public void InsertFirstName() {
		loginPageLocator.NewFisrtName.sendKeys("Sohel");

	}
}