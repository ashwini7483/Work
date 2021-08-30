package istiyak;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import objectRepositiry.HomePage;
import objectRepositiry.LoginPage;

@Listeners(genericLibrary.ListenerImplementationClass.class)
public class TC_05Test extends BaseTest {

	@Test
	public void toLoginWithValidCredentials() throws InterruptedException {
		HomePage homePage=new HomePage(driver);
		LoginPage loginpage = new LoginPage(driver);
		homePage.getLoginLink().click();
		loginpage.getEmailTextField().sendKeys("istiyak.shamsher@gmail.com");
		loginpage.getPasswordTextField().sendKeys("2Ab15cv015#");
		loginpage.getLoginButton().click();
		String expectedLogintitle="Demo Web Shop";
		String actualLogintitle = driver.getTitle();
		Assert.assertEquals(actualLogintitle, expectedLogintitle,"Login Page is unsuccessful");
		Reporter.log("login successfully with valid user name and password",true);
	}
	
}
