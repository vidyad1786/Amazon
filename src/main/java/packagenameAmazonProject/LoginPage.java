package packagenameAmazonProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	// step1
	@FindBy(name = "email")
	private WebElement username1;

	@FindBy(id = "continue")
	private WebElement continue1;

	@FindBy(id = "ap_password")
	private WebElement password1;

	@FindBy(id = "signInSubmit")
	private WebElement signin;

	@FindBy(xpath="//span[.='Sign Out']")
	private WebElement signout;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setUsername(WebDriver driver, String username) {
		username1.sendKeys(username);
	}

	public void clickContinue() {
		continue1.click();
	}

	public void setPassword(String password) {
		password1.sendKeys(password);
	}

	public void signin1() {
		signin.click();
	}
	public void signout1() {
		signout.click();
	}

}
