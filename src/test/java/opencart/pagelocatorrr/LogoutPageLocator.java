package opencart.pagelocatorrr;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import opencart.utility.TestBaseOpenCart;

public class LogoutPageLocator extends TestBaseOpenCart {

	public LogoutPageLocator() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//span[text()='My Account']")
	public WebElement ClickonMyAccountDropdownmenu;
	@FindBy(how = How.XPATH, using = "//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[5]/a[1]")
	public WebElement ClickLogoutoption;
	@FindBy(how = How.XPATH, using = "//a[text()='Continue']")
	public WebElement ClickContinuebutton;
	@FindBy(how = How.XPATH, using = "//span[text()='My Account']")
	public WebElement UserwillclickonMyAccountDropdownmenu;
	@FindBy(how = How.XPATH, using = "//a[text()='Login']")
	public WebElement UserclickLoginoption;
	@FindBy(how = How.XPATH, using = "//body/div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/a[1]")
	public WebElement UserwillclickonForgottenPasswordlinkfromLoginpage;
	@FindBy(how = How.ID, using = "input-email")
	public WebElement UserEntertheemailaddressofanexistingaccountuserforgotthepassword;
	@FindBy(how = How.XPATH, using = "//input[@value='Continue']")
	public WebElement UserwillclickonContinuebutton;

}
