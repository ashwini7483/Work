package ashwini;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import genericLibrary.BaseTest;
import objectRepositiry.HomePage;

public class TC_03Test extends BaseTest {

	@Test
	public void addProductToCart() {
		HomePage homePage=new HomePage(driver);
		
		//to search the product=========================================================================================================
		homePage.getSearchTextField().sendKeys("laptop");
		homePage.getSearchButton().click();
		String expectedSearchPageTitle = "Demo Web Shop. Search";
		Assert.assertEquals(driver.getTitle(),expectedSearchPageTitle,"Search Page is not displayed");
		Reporter.log("Search page is displayed successfully",true);
		
		//add item to cart==============================================================================================================
		homePage.getAddToCart().click();
		
		//to verify product in the cart=================================================================================================
		homePage.getCartLink().click();
		String expectedCartPageTitle = "Demo Web Shop. Shopping Cart";
		Assert.assertEquals(driver.getTitle(),expectedCartPageTitle,"Cart Page is not displayed");
		Reporter.log("Cart page is displayed successfully",true);
		WebElement productName = driver.findElement(By.xpath("//input[@name='removefromcart']/../..//a[text()='14.1-inch Laptop']"));
		String expectedProductName = "14.1-inch Laptop";
		Assert.assertEquals(productName.getText(),expectedProductName,"product is not displayed");
		Reporter.log("Product is present in the cart",true);
   }
}
 