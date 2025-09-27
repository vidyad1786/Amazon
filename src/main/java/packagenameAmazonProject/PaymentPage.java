package packagenameAmazonProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {
	
	WebDriver driver;
	
	@FindBy(name="proceedToRetailCheckout")
	private WebElement buy;
	
	public PaymentPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void  proceedToBuy()
	{
		buy.click();
	}
	

}
