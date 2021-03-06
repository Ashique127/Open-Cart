package opencart.pagelocat;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import opencart.utility.TestBaseOpenCart;

public class LoginPageLocator extends TestBaseOpenCart {

	public LoginPageLocator() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.XPATH, using = "//span[text()='My Account']")
	public WebElement ClickonMyAccountDrop;
	@FindBy(how = How.XPATH, using = "//a[text()='My Account']")
	public WebElement Clickonlogin;
	@FindBy(how = How.ID, using = "input-email")
	public WebElement EnterEmailAccout;
	@FindBy(how = How.ID, using = "input-password")
	public WebElement Enterpassword;
	@FindBy(how = How.XPATH, using = "//input[@value='Login']")
	public WebElement Clickonloginbutton;
	@FindBy(how = How.XPATH, using = "//h2[text()='My Account']")
	public WebElement VerifyAccount;
	@FindBy(how = How.XPATH, using = "//a[text()='Edit Account']")
	public WebElement EditAccInfo;
	@FindBy(how = How.XPATH, using = "//input[@id='input-firstname']")
	public WebElement ClearFisrtName;
	@FindBy(how = How.XPATH, using = "//input[@id='input-lastname']")
	public WebElement ClearLasttName;
	@FindBy(how = How.XPATH, using = "//input[@id='input-email']")
	public WebElement ClearEmail;
	@FindBy(how = How.XPATH, using = "//input[@id='input-telephone']")
	public WebElement ClearTelephone;
	@FindBy(how = How.XPATH, using = "//input[@id='input-firstname']")
	public WebElement NewFisrtName;
}
