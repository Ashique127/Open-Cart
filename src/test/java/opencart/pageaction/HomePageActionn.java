package opencart.pageaction;

import junit.framework.Assert;
import opencart.pagelocatorrr.HomePageLocator;
import opencart.utility.TestBaseOpenCart;
import opencart.utility.UtillOpenCart;

public class HomePageActionn extends TestBaseOpenCart {

	HomePageLocator homePageLocator = new HomePageLocator();

	public void Searchbyiphone() {
		homePageLocator.Productsearchbyiphone.sendKeys(UtillOpenCart.Cellphone);
	}

	public void clicksearch() {
		homePageLocator.clickonsearchbutton.click();

	}

	public void Verifyuserdisplay() {
		boolean result = homePageLocator.Verifyuseronsearchresultdisplay.isDisplayed();
		Assert.assertTrue(result);
	}
}
