package opencart.pagelocat;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import opencart.utility.TestBaseOpenCart;

public class HomePageLocator extends TestBaseOpenCart {
	{

		PageFactory.initElements(driver, this);

	}
	@FindBy(how = How.XPATH, using = "//input[@name='search']")
	public WebElement Productsearchbyiphone;
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-default btn-lg']")
	public WebElement clickonsearchbutton;
	@FindBy(how = How.XPATH, using = "//h2[text()='Products meeting the search criteria']")
	public WebElement Verifyuseronsearchresultdisplay;

}
