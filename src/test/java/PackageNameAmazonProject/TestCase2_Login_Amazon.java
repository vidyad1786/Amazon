package PackageNameAmazonProject;

import org.testng.annotations.Test;

import UtilityAmazonProject.DataProvideUtil;
import packagenameAmazonProject.HomePage;
import packagenameAmazonProject.LoginPage;

public class TestCase2_Login_Amazon extends BaseClass {

	@Test(dataProvider = "credentials", dataProviderClass = DataProvideUtil.class)
	public void WithValidCredentials(String username,String password,String search) {
		HomePage homepage = new HomePage(driver);
		homepage.hoveroverAccountAndList(driver);
		homepage.signinForLogin();

		LoginPage loginpage = new LoginPage(driver);
		loginpage.setUsername(driver, username);
		loginpage.clickContinue();
		loginpage.setPassword(password);
		loginpage.signin1();
		homepage.searchProduct(search);
		
	}

}
