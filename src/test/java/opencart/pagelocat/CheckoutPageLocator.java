package opencart.pagelocat;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import opencart.utility.TestBaseOpenCart;

public class CheckoutPageLocator extends TestBaseOpenCart {

	public CheckoutPageLocator() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.XPATH, using = "//span[text()='Checkout']")
	public WebElement ClickonCheckout;

	@FindBy(how = How.XPATH, using = "//div[@id='content']")
	public WebElement VerifyContent;

	@FindBy(how = How.XPATH, using = "//input[@name='search']")
	public WebElement Enterproductname;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-default btn-lg']")
	public WebElement ClickonSearchButton;

	@FindBy(how = How.XPATH, using = "//span[text()='Add to Cart']")
	public WebElement CAddtocart;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
	public WebElement ShoppingCart;

	@FindBy(how = How.XPATH, using = "/html/body/header/div/div/div[3]/div/ul/li[2]/div/p/a[2]/strong")
	public WebElement newClickonCheckout;

	@FindBy(how = How.XPATH, using = "//a[@class='btn btn-primary']")
	public WebElement Verifycheckoutoption;

}
