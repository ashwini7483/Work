package ambika;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import objectRepositiry.ContactUsPage;
import objectRepositiry.HomePage;

public class TC_01Test extends BaseTest {

	@Test
	public void ContactUsPage1(){
		HomePage homepage = new HomePage(driver);
		String expectedLoginPageTitle = "Demo Web Shop";
	    Assert.assertEquals(driver.getTitle(),expectedLoginPageTitle, "home page is not displayed");
	    Reporter.log("homepage is displayed succeesfully",true);
		ContactUsPage contactpage = new ContactUsPage(driver);
		contactpage.getContactUsLink().click();
		String expectedTitle = "Demo Web Shop. Contact Us";
		Assert.assertEquals(driver.getTitle(), expectedTitle,"page is not displayed");
		Reporter.log("contact page is diplayed successfully ",true);
		contactpage.getfullNameTextField().sendKeys("ambika");
		contactpage.getEmailTextField().sendKeys("ambikaambate96@gmail.com");
		contactpage.getEnquiryTextArea().sendKeys("what is the cost of camera");
		contactpage.getSubmitButton().click();
		Assert.assertEquals(driver.getTitle(), expectedTitle,"page is not displayed");
		Reporter.log("contact page is diplayed successfully ",true);
		
	}
}
