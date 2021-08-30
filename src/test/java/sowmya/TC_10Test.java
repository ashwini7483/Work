package sowmya;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import objectRepositiry.ContactUsPage;

public class TC_10Test extends BaseTest
{
	@Test
	public void contactUs()
	{
		//-------Contact the Customer for Enquiry------//
		ContactUsPage contact=new ContactUsPage(driver);
		contact.getContactUsLink().click();
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Contact Us");
		Reporter.log("ContactUs page is displayed",true);
		
		contact.getfullNameTextField().sendKeys("sowmya");
		contact.getEmailTextField().sendKeys("ghh6uukjjj@gmail.com");
		contact.getEnquiryTextArea().sendKeys("hii helooo sir");
		
		//---------Entered valid Data & Click on Submit Button-----//
		contact.getSubmitButton().click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Contact Us");
		Reporter.log("Submit the Enquiry details",true);
	}

}
