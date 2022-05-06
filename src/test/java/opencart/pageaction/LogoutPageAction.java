package opencart.pageaction;

import opencart.pagelocat.LogoutPageLocator;
import opencart.utility.TestBaseOpenCart;

public class LogoutPageAction extends TestBaseOpenCart {
	LogoutPageLocator logoutPageLocator = new LogoutPageLocator();

	public void MyAccountN() {
		logoutPageLocator.ClickonMyAccountDropdownmenu.click();
	}

	public void Logout() {
		logoutPageLocator.ClickLogoutoption.click();
	}

	public void ContinueN() {
		logoutPageLocator.ClickContinuebutton.click();
	}

	public void UsermyAccountN() {
		logoutPageLocator.UserwillclickonMyAccountDropdownmenu.click();
	}

	public void Userloginoption() {
		logoutPageLocator.UserclickLoginoption.click();
	}

	public void ForgotPasswordLink() {
		logoutPageLocator.UserwillclickonForgottenPasswordlinkfromLoginpage.click();
	}

	public void Enteremail() {
		logoutPageLocator.UserEntertheemailaddressofanexistingaccountuserforgotthepassword
				.sendKeys(prop.getProperty("mrxuser"));
	}

	public void Userclickoncontinue() {
		logoutPageLocator.UserwillclickonContinuebutton.click();
	}

}
