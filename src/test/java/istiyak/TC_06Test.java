package istiyak;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import genericLibrary.SelectClassUtil;
import objectRepositiry.CartPage;
import objectRepositiry.ChekoutPage;
import objectRepositiry.HomePage;
import objectRepositiry.LoginPage;

public class TC_06Test extends BaseTest {

	
	@Test
	public void TC_06Test() throws InterruptedException {
		HomePage homePage=new HomePage(driver);
		LoginPage loginpage=new LoginPage(driver);
		homePage.getLoginLink().click();
		loginpage.getEmailTextField().sendKeys("istiyak.shamsher@gmail.com");
		loginpage.getPasswordTextField().sendKeys("2Ab15cv015#");
		loginpage.getLoginButton().click();
		homePage.getComputerlink().click();
		homePage.getNotebooksButton().click();
		homePage.getAddToCart().click();
		homePage.getCartLink().click();
		String expectedCartPageTitle = "Demo Web Shop. Shopping Cart";
		Assert.assertEquals(driver.getTitle(),expectedCartPageTitle,"Cart Page is not displayed");
		Reporter.log("Cart page is displayed successfully",true);
		CartPage cartpage=new CartPage(driver);
		cartpage.getCheckBox().click();
		cartpage.getCheckout().click();
		ChekoutPage chekoutPage=new ChekoutPage(driver);
		if (chekoutPage.getBilingCity().isDisplayed()) {
			SelectClassUtil select=new SelectClassUtil();
			select.selectDropDownByVisibleText(chekoutPage.getCountrylistbox(), countryoption);
			chekoutPage.getBilingCity().sendKeys(city);
			chekoutPage.getBillingAddress().sendKeys(adresss1);
			chekoutPage.getBillingZipCode().sendKeys(postalcode);
			chekoutPage.getBillingPhoneNumber().sendKeys(phoneNo);
		}
		chekoutPage.getBillingcontinueButton().click();
		chekoutPage.getShippingContinueButton().click();
		chekoutPage.getShippingMethodContinueButton().click();
		chekoutPage.getPaymentMethodcontinueButton().click();
		chekoutPage.getPaymentInfoContinueButton().click();
		chekoutPage.getConfirmOrderButton().click();
		String confirmatiomMessage=chekoutPage.getThankYouMessage().getText();
		Assert.assertEquals(confirmatiomMessage, comfirmMessage,"order is not confirmed");
		Reporter.log("order is placed successfully with valid shippng adress",true);
	}
}
