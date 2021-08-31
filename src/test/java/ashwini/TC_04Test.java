package ashwini;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import objectRepositiry.CartPage;
import objectRepositiry.ChekoutPage;
import objectRepositiry.HomePage;

@Listeners(genericLibrary.ListenerImplementationClass.class)
public class TC_04Test extends BaseTest {

	@Test
	public void removeAllproductAtATime() throws InterruptedException {
		HomePage homePage=new HomePage(driver);
		CartPage remove=new CartPage(driver);
		
		//to add three product to cart=====================================================================================================
		homePage.getSearchTextField().sendKeys("laptop");
		homePage.getSearchButton().click();
		String expectedSearchPageTitle = "Demo Web Shop. Search";
		Assert.assertEquals(driver.getTitle(),expectedSearchPageTitle,"Search Page is not displayed");
		Reporter.log("Search page is displayed successfully",true);
		homePage.getAddToCart().click();
		
		homePage.getSearchTextField().sendKeys("smartphone");
		homePage.getSearchButton().click();
		Assert.assertEquals(driver.getTitle(),expectedSearchPageTitle,"Search Page is not displayed");
		Reporter.log("Search page is displayed successfully",true);
		homePage.getAddToCart().click();
		
		homePage.getSearchTextField().sendKeys("blue jeans");
		homePage.getSearchButton().click();
		Assert.assertEquals(driver.getTitle(),expectedSearchPageTitle,"Search Page is not displayed");
		Reporter.log("Search page is displayed successfully",true);
		homePage.getAddToCart().click();
		
		//to verify cart page is displayed===========================================================================================
		homePage.getCartLink().click();
		String expectedCartPageTitle = "Demo Web Shop. Shopping Cart";
		Assert.assertEquals(driver.getTitle(),expectedCartPageTitle,"Cart Page is not displayed");
		Reporter.log("Cart page is displayed successfully",true);
		
	    driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
	    driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
	    driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
	    
	    driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		String CartQuantityBefore = driver.findElement(By.xpath("//span[@class='cart-qty']")).getText();
		remove.getUpdateShoppingCart().click();
		String CartQuantityAfter = driver.findElement(By.xpath("//span[@class='cart-qty']")).getText();
		if(CartQuantityBefore.equals(CartQuantityAfter))
		{
			Reporter.log("Product is not Removed From The Cart Page");
		}else
		{
			Reporter.log("Product Is Successfully Removed From The Cart Page");
		}
	    remove.getUpdateShoppingCart().click();
	    
	}
}