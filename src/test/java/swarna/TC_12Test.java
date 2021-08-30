package swarna;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import genericLibrary.BaseTest;
import objectRepositiry.CartPage;
import objectRepositiry.ChekoutPage;
import objectRepositiry.HomePage;

public class TC_12Test extends BaseTest {

	@Test
	public void toCheckout() {
		homePage=new HomePage(driver);
		cartPage = new CartPage(driver);
		homePage.getLoginLink().click();
		checkoutPage = new ChekoutPage(driver);
		
		//-------login with invalid emailid and password======================================================================================
		
		objectRepositiry.LoginPage loginPage=new objectRepositiry.LoginPage(driver);
		loginPage.getEmailTextField().sendKeys("swarnalakshmi7823@gmail.com");
		Reporter.log("Valiod email id entered Successfully",true);
		loginPage.getPasswordTextField().sendKeys("12345678");
		Reporter.log("valid password Successfully",true);
		loginPage.getLoginButton().click();
		String homePageTitle = "Demo Web Shop";
		Assert.assertEquals(driver.getTitle(),homePageTitle,"Cart Page is not displayed");
		Reporter.log("Homepage displayed Successfully",true);
		
		//--------add product to cart==========================================================================================================
		
		homePage.getSearchTextField().sendKeys("Laptop");
		homePage.getSearchButton().click();
		homePage.getAddToCart().click();
		homePage.getCartLink().click();
		String expectedCartPageTitle = "Demo Web Shop. Shopping Cart";
		Assert.assertEquals(driver.getTitle(),expectedCartPageTitle,"Cart Page is not displayed");
		Reporter.log("Cart page is displayed Successfully",true);
		
		//--------to verify product is added to cart or not========================================================================================
		
		String expectedproduct = "14.1-inch Laptop";
		Assert.assertEquals(checkoutPage.getProdctInCart().getText(),expectedproduct,"product is not displayed");
		Reporter.log("Product is displayed successfully",true);
		
		//--------to veryfy checkout===========================================================================================================
		
		checkoutPage.getCheckBox().click();
		checkoutPage.getCheckoutButton().click();
		String checkoutPageTitle = "Demo Web Shop. Checkout";
		Assert.assertEquals(driver.getTitle(),checkoutPageTitle,"Checkout page is not displayed");
		Reporter.log("User Checked out successfully",true);
	}
}
