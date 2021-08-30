package savita;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import genericLibrary.BaseTest;
import objectRepositiry.HomePage;

public class TC_08Test extends BaseTest {

	@Test
	public void addProductToCart(){
		HomePage homepage= new HomePage(driver);
	// -----Search the product-----//
		homepage.getSearchTextField().sendKeys("Blue jeans");
		homepage.getSearchButton().click();
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Search","product page is not displayed");
		Reporter.log("product page is displayed",true);
		
   //-----Add the product to cart----//		
		homepage.getAddToCart().click();
		homepage.getCartLink().click();
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Shopping Cart","Shopping cart page is not displayed");
		Reporter.log("Shopping cart page is displayed with product",true);
	}
}
