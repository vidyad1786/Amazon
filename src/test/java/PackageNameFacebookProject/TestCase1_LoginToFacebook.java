package PackageNameFacebookProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import packagenameAmazonProject.LoginPage;

public class TestCase1_LoginToFacebook {
	WebDriver driver;
	@Test
	public void withValidCredentials(){
	 driver=new EdgeDriver();
		// driver=new ChromeDriver();

		// driver.get("https://www.amazon.in/");
		 driver.get("https://www.facebook.com/");
		 driver.navigate().refresh();
		 	 driver.manage().window().maximize();
	 LoginPage loginpage=new LoginPage(driver);
		 loginpage.setUsername(driver, "yogesh.kulkarni123@gmail.com");
		 loginpage.clickContinue();
		 loginpage.setPassword("");
		// loginpage.loginWithValidCredentials();
	}


		

	

}
