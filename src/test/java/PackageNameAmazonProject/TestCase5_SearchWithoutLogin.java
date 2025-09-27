package PackageNameAmazonProject;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

import UtilityAmazonProject.DataProvideUtil;
import packagenameAmazonProject.CartPage;
import packagenameAmazonProject.HomePage;
import packagenameAmazonProject.LoginPage;
import packagenameAmazonProject.PaymentPage;
import packagenameAmazonProject.SearchResultPage;

public class TestCase5_SearchWithoutLogin extends BaseClass {

	@Test(dataProvider = "credentials", dataProviderClass = DataProvideUtil.class)
	public void serchWithoutLogin(String username, String password, String search) throws InterruptedException {

		HomePage homepage = new HomePage(driver);

		homepage.searchProduct(search);

		Thread.currentThread().sleep(1000 * 2);

	}

}
