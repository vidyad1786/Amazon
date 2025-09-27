package packagenameAmazonProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

	WebDriver driver;
	
	@FindBy(id="add-to-cart-button")
	private WebElement addcart;
	
	public CartPage(WebDriver driver)
    {
 	   PageFactory.initElements(driver, this);
    }

	public void addtocart()
	{
		addcart.click();
	}
	

}
