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

public class TestCase4_ProceedToBuy extends BaseClass {
	
	@Test(dataProvider = "credentials", dataProviderClass = DataProvideUtil.class)
	public void ProceedToBuy(String username,String password, String search) throws InterruptedException
	{
	
	HomePage homepage = new HomePage(driver);
	homepage.hoveroverAccountAndList(driver);
	homepage.signinForLogin();

	LoginPage loginpage = new LoginPage(driver);
	loginpage.setUsername(driver, username);
	loginpage.clickContinue();
	loginpage.setPassword(password);
	loginpage.signin1();
	System.out.println("Login successful...");
	
	homepage.searchProduct(search);
	
	SearchResultPage searchresult = new SearchResultPage(driver);
	searchresult.clickOnFirstProd();
	System.out.println("Search shoes successful...");
	
	Thread.currentThread().sleep(1000 * 2);
	
	Set<String> Ids=driver.getWindowHandles();
	System.out.println(Ids);
	Iterator<String> itr=Ids.iterator();
	String parent=itr.next();
	String child=itr.next();
	
	driver.switchTo().window(child); 
	CartPage pp = new CartPage(driver);
	Thread.currentThread().sleep(1000 * 2);
	pp.addtocart();
	System.out.println("Add to cart successful...");
	Thread.currentThread().sleep(1000 * 2);
	
	PaymentPage payment=new PaymentPage(driver);
	payment.proceedToBuy();	
	Thread.sleep(2000);
	
	System.out.println("Proceed to buy successful...");

	driver.switchTo().window(parent);
	homepage.hoveroverAccountAndList(driver);
	loginpage.signout1();
	System.out.println("Logout successful...");

	
	
	}


}
