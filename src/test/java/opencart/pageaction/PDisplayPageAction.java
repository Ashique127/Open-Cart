package opencart.pageaction;

import opencart.pagelocatorrr.PDisplayPageLocator;
import opencart.utility.TestBaseOpenCart;

public class PDisplayPageAction extends TestBaseOpenCart {
	PDisplayPageLocator pDisplayPageLocator = new PDisplayPageLocator();

	public void EnterExistingProductName() {
		pDisplayPageLocator.EnteranyexistingProductname.sendKeys("iMac");

	}

	public void ClickonSearchIcon() {
		pDisplayPageLocator.Clickonthebuttonhavingsearchicon.click();

	}

	public void ClickonProductDisplaySearch() {
		pDisplayPageLocator.ClickontheProductdisplayedintheSearchresults.click();

	}

	public void ClickonMainBiggerSize() {
		pDisplayPageLocator.ClickonthemainbiggersizedThumbnailimagedisplayed.click();
	}

	public void ClickonRightSide() {
		pDisplayPageLocator.ClickonRightoptions.click();
	}

	public void ClickonLeftSide() {
		pDisplayPageLocator.ClickonLeftoptions.click();
	}

	public void ClickonXOption() {
		pDisplayPageLocator.ClickonXoption.click();
	}

	public void ClickonNormalSize() {
		pDisplayPageLocator.ClickonthenormalsizedThumbnailimages.click();
	}

	public void ClickonRightSideagain() {
		pDisplayPageLocator.ClickonRightoptionsagain.click();
	}

	public void ClickonLeftSideagain() {
		pDisplayPageLocator.ClickonLeftoptionsagain.click();
	}

	public void ClickonXoptionagain() {
		pDisplayPageLocator.ClickonXoptionagain.click();
	}

}
