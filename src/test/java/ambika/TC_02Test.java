package ambika;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import objectRepositiry.CartPage;
import objectRepositiry.HomePage;

@Listeners(genericLibrary.ListenerImplementationClass.class)
public class TC_02Test extends BaseTest {

	@Test
	public void CartPage(){
		HomePage homepage= new HomePage(driver);
		String expectedLoginPageTitle = "Demo Web Shop";
	    Assert.assertEquals(driver.getTitle(),expectedLoginPageTitle, "home page is not displayed");
	    Reporter.log("homepage is displayed succeesfully",true);
	    CartPage cartpage = new CartPage(driver);
	    WebElement product = driver.findElement(By.xpath("//img[@alt='Picture of Build your own expensive computer']"));
	    product.click();
	    String expectedproductpage = "Demo Web Shop. Build your own expensive computer";
	    Assert.assertEquals(driver.getTitle(),expectedproductpage,"product  page is not displayed");
	    Reporter.log("product page is displayed",true);
		homepage.getAddToCart().click();
		homepage.getCartLink().click();
		String expectedCartPageTitle = "Demo Web Shop. Shopping Cart";
		Assert.assertEquals(driver.getTitle(),expectedCartPageTitle,"Cart Page is not displayed");
		Reporter.log("Cart page is displayed successfully",true);
		cartpage.getCheckBox().click();
		cartpage.getUpdateShoppingCart().click();	
		Assert.assertEquals(driver.getTitle(),expectedCartPageTitle,"Cart Page is not displayed");
		Reporter.log("Cart page is displayed successfully",true);
	}
}
