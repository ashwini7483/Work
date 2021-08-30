package sowmya;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import objectRepositiry.RegisterPage;

public class TC_09Test extends BaseTest
{
@Test
	
	public void regitration()
	{
		//------------Register With Valid Data---------//
		 RegisterPage register=new  RegisterPage(driver);
		 register.getRegisterLink().click();
		 Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Register");
		 Reporter.log("Register Page is dispalyed",true);
		  
		 //---------Entering into the Register Page ------//
		 register.getFemaleRadioButton().click();
		 register.getFirstNameTextField().sendKeys("sowmya");
		 register.getLastNameTextField().sendKeys("H M");
		 register.getEmailIdTextField().sendKeys("dsl90lfcssferoij8d7800@gmail.com");
		 register.getPasswordTextField().sendKeys("rrrrr12@123");
		 register.getConfirmPasswordTextField().sendKeys("rrrrr12@123");
		 
		 //-------Entered all the Data and Click on Register Button------//
		 register.getRegisterButton().click();
         Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Register");
         Reporter.log("Continue Page is displayed",true);
		 
		 
		 //--------Click on continue Button-------//
		 Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Register");
		 register.getContinueButton().click();
		 Assert.assertEquals(driver.getTitle(),"Demo Web Shop");
		 Reporter.log("Home Page is displayed",true);
		 
	}

}
