package opencart.pagelocatorrr;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import opencart.utility.TestBaseOpenCart;

public class ExamLocatores extends TestBaseOpenCart {
	{
		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.XPATH, using = "//input[@id='user-name']")
	public WebElement Customerusehisusername;
	@FindBy(how = How.XPATH, using = "//input[@id='user-name']")
	public WebElement Customerenterpassword;
	@FindBy(how = How.XPATH, using = "//input[@name='login-button']")
	public WebElement ClickloginButton;

}
