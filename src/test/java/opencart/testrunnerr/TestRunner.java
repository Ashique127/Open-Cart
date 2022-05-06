package opencart.testrunnerr;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import opencart.utility.TestBaseOpenCart;

@CucumberOptions(features = { "src/test/resources/Features" }, plugin = {
		"json:target/cucumber.json" }, glue = "opencart.stepdefinition", tags = { "@Sanity1, @Sanity2, @Sanity3, @Sanity4, @Sanity5, @Sanity6" })

public class TestRunner extends AbstractTestNGCucumberTests {

	@BeforeTest

	public void LaunchApplicationURL() {
		TestBaseOpenCart lunchh = new TestBaseOpenCart();
		lunchh.initilize();

	}

	@AfterTest(enabled = false)
	public void CloseApplicationURL() {
		TestBaseOpenCart lunchh = new TestBaseOpenCart();
		lunchh.driver.quit();

	}
}
