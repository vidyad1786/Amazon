package packagenameAmazonProject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;

	// step1
	@FindBy(xpath = "//span[@class='nav-line-2 ']")
	private WebElement accountAndList;

	@FindBy(xpath = "//span[.='Sign in']")
	private WebElement signin;

	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	private WebElement search;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void hoveroverAccountAndList(WebDriver driver) {
		Actions action = new Actions(driver);
		action.moveToElement(accountAndList).perform();
	}

	public void signinForLogin() {
		signin.click();
	}

	public void searchProduct(String prodName) {
  		search.sendKeys(prodName+ Keys.ENTER);
	}

}
