package opencart.pagelocat;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import opencart.utility.TestBaseOpenCart;

public class PDisplayPageLocator extends TestBaseOpenCart {

	{

		PageFactory.initElements(driver, this);

	}
	@FindBy(how = How.XPATH, using = "//input[@name='search']")
	public WebElement EnteranyexistingProductname;
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-default btn-lg']")
	public WebElement Clickonthebuttonhavingsearchicon;
	@FindBy(how = How.XPATH, using = "//img[@alt='iMac']")
	public WebElement ClickontheProductdisplayedintheSearchresults;
	@FindBy(how = How.XPATH, using = "//body/div[@id='product-product']/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/img[1]")
	public WebElement ClickonthemainbiggersizedThumbnailimagedisplayed;
	@FindBy(how = How.XPATH, using = "//button[@class='mfp-arrow mfp-arrow-right mfp-prevent-close']")
	public WebElement ClickonRightoptions;
	@FindBy(how = How.XPATH, using = "//button[@class='mfp-arrow mfp-arrow-left mfp-prevent-close']")
	public WebElement ClickonLeftoptions;
	@FindBy(how = How.XPATH, using = "//button[@class='mfp-close']")
	public WebElement ClickonXoption;
	@FindBy(how = How.XPATH, using = "//img[@src='https://demo.opencart.com/image/cache/catalog/demo/imac_1-228x228.jpg']")
	public WebElement ClickonthenormalsizedThumbnailimages;
	@FindBy(how = How.XPATH, using = "//button[@class='mfp-arrow mfp-arrow-right mfp-prevent-close']")
	public WebElement ClickonRightoptionsagain;
	@FindBy(how = How.XPATH, using = "//button[@class='mfp-arrow mfp-arrow-left mfp-prevent-close']")
	public WebElement ClickonLeftoptionsagain;
	@FindBy(how = How.XPATH, using = "//button[@class='mfp-close']")
	public WebElement ClickonXoptionagain;
}
