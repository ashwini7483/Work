package vijay;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import objectRepositiry.LoginPage;

public class TC_13Test extends BaseTest {

	@Test
	
	public void LoginValidation() {
		LoginPage loginpage = new LoginPage(driver);
		
		//-------- to verify loginpage================================================================================================= 
		
		loginpage.getLoginLink().click();
		String LoginPageTitle = "Demo Web Shop. Login";
		Assert.assertEquals(driver.getTitle(), LoginPageTitle, "Login Page is not displayed");
		Reporter.log("LoginPage is displayed successfully",true);
		
		//------- to login inti application with ivalid credentials====================================================================
		
		loginpage.getEmailTextField().sendKeys("nvjvijay1997@gmail.com");
		loginpage.getPasswordTextField().sendKeys("12345678");
		loginpage.getLoginButton().click();
		
		String ExpectedErrorMessage="Login was unsuccessful. Please correct the errors and try again.";
		WebElement Errormessage = loginpage.getErrorMessage();
		Assert.assertEquals(Errormessage.getText(), ExpectedErrorMessage,"ErrorMessage is not Matching");
		Reporter.log("ErrorMessage is displayed correctly",true);	
	}
}
