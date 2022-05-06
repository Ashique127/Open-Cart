package opencart.pageaction;

import junit.framework.Assert;
import opencart.pagelocat.CheckoutPageLocator;
import opencart.utility.TestBaseOpenCart;

public class CheckoutActionPage extends TestBaseOpenCart {

	CheckoutPageLocator checkoutPageLocator = new CheckoutPageLocator();

	public void ClickCheckout() {
		checkoutPageLocator.ClickonCheckout.click();

	}

	public void VerifyEmptyContent() {
		boolean newresult = checkoutPageLocator.VerifyContent.isDisplayed();
		Assert.assertTrue(newresult);

	}

	public void EnterProdutNameImac() {
		checkoutPageLocator.Enterproductname.sendKeys("Imac");

	}

	public void ClickonSearchoption() {
		checkoutPageLocator.ClickonSearchButton.click();

	}

	public void ClickonAddtoCart() {
		checkoutPageLocator.CAddtocart.click();

	}

	public void ClickonShoppingCart() {
		checkoutPageLocator.ShoppingCart.click();

	}

	public void Checkout() {
		checkoutPageLocator.newClickonCheckout.click();

	}

	public void Verifycheck() {
		boolean verresult = checkoutPageLocator.Verifycheckoutoption.isDisplayed();
		Assert.assertTrue(verresult);

	}

}
