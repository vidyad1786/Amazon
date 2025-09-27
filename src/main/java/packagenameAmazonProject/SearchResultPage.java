package packagenameAmazonProject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage {

	WebDriver driver;

	@FindBy(xpath = "//a[@class='a-link-normal s-no-outline']")
	List<WebElement> result;

	public void clickOnFirstProd() {
		result.get(0).click();
	}

	public SearchResultPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
