package swarna;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import objectRepositiry.HomePage;
import objectRepositiry.LoginPage;

public class TC_11Test extends BaseTest{

	 @Test
	 public void loginWithInvalidCredentials() {
		    HomePage homePage=new HomePage(driver);
		    loginPage=new LoginPage(driver);
		    
		    //To veryfy loginpage
			homePage.getLoginLink().click();
			String loginPageTitle = "Demo Web Shop. Login";
			Assert.assertEquals(driver.getTitle(),loginPageTitle,"login Page is not displayed");
			Reporter.log("Loginpage displayed Successfully",true);
			
			//to verify by invalid emailid and pasword
			loginPage.getEmailTextField().sendKeys("9897823@gmail.com");
			Reporter.log("entered invalid email id",true);
			loginPage.getPwdTextField().sendKeys("12345678");
			Reporter.log("entered invalid passowrd",true);
			loginPage.getLoginButton().click();
			String ecpectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.";
			Assert.assertEquals(loginPage.getErrorMessage().getText(),ecpectedErrorMessage,"valid email id is entered");
	 }
}
