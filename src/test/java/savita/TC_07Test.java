package savita;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import objectRepositiry.RegisterPage;

public class TC_07Test extends BaseTest {

	@Test
	public void registerswithinvaliddata(){	
		RegisterPage register=new RegisterPage(driver);
  //----Register with invalid data----//		
		register.getRegisterLink().click();
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Register","register page is not displayed");
		Reporter.log("Register page is displayed", true);
		register.getFemaleRadioButton().click();
		register.getFirstNameTextField().sendKeys("savitha");
		register.getLastNameTextField().sendKeys("Masareddy");
		register.getEmailIdTextField().sendKeys(" #$@gmail.com");
		register.getPasswordTextField().sendKeys("123abc");
		register.getConfirmPasswordTextField().sendKeys("123abc");
		register.getRegisterButton().submit();
        Assert.assertEquals(driver.getTitle(),"Demo Web Shop","Homepage is not displayed");
        Reporter.log("Home page is displayed", true);
  }
}
