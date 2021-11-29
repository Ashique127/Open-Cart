package opencart.stepdefinition;

import org.apache.log4j.Logger;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import opencart.pageaction.HomePageActionn;
import opencart.utility.LogsHelpper_Loggggg;
import opencart.utility.TestBaseOpenCart;
import opencart.utility.UtillOpenCart;

public class StepDefHomePage extends TestBaseOpenCart {
	HomePageActionn homePageActionn = new HomePageActionn();
	Logger logs = LogsHelpper_Loggggg.getLogss(LogsHelpper_Loggggg.class);

	@Given("^Launch application \"([^\"]*)\"$")
	public void launch_application(String URL) throws Throwable {
		launch(URL);
		UtillOpenCart.takescreenshot(driver, "Home Page");
		logs.info("Launch URL");
	}

	@Then("^product search by iphone$")
	public void product_search_by_iphone() throws Throwable {
		homePageActionn.Searchbyiphone();
		logs.info("Product Search");
	}

	@Then("^click on search button$")
	public void click_on_search_button() throws Throwable {
		homePageActionn.clicksearch();
		logs.info("Click on Search");
	}

	@Then("^Verify user on search result display$")
	public void verify_user_on_search_result_display() throws Throwable {
		homePageActionn.Verifyuserdisplay();
		UtillOpenCart.takescreenshot(driver, "Search Page Result");
		logs.info("Display Search Result");
	}

}
