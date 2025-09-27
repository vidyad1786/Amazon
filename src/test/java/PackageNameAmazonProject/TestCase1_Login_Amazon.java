package PackageNameAmazonProject;

import org.testng.annotations.Test;

import UtilityAmazonProject.DataProvideUtil;
import UtilityAmazonProject.RetryLogic;
import packagenameAmazonProject.HomePage;
import packagenameAmazonProject.LoginPage;

import org.testng.Assert;
import org.testng.IRetryAnalyzer;

public class TestCase1_Login_Amazon extends BaseClass {

	//@Test(retryAnalyzer =RetryLogic.class,dataProvider = "credentials", dataProviderClass = DataProvideUtil.class)
	
	
	
	@Test(retryAnalyzer =RetryLogic.class,dataProviderClass = DataProvideUtil.class,dataProvider ="credentials" )
	//@Test(dataProviderClass = DataProvideUtil.class,dataProvider = "search" )
	public void WithValidCredentials(String username,String password,String Search) {
		HomePage homepage = new HomePage(driver);
		homepage.hoveroverAccountAndList(driver);
		homepage.signinForLogin();
	
		LoginPage loginpage = new LoginPage(driver);
		loginpage.setUsername(driver, username);
		
		loginpage.clickContinue();
		loginpage.setPassword(password);
		
		loginpage.signin1();
		//Assert.assertEquals(false, true);
	}

}

