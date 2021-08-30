package vijay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import objectRepositiry.CartPage;
import objectRepositiry.HomePage;

public class TC_14Test extends BaseTest {

	@Test
	public void RemoveFromCart() throws InterruptedException {
		HomePage h = new HomePage(driver);
		CartPage c = new CartPage(driver);
		
		//---- to search product=======================================================================================================
		h.getSearchTextField().sendKeys("laptop");
		h.getSearchButton().click();
		
		//---- to verify login page====================================================================================================
		String ExpectedSearchPageTitle = "Demo Web Shop. Search";
		Assert.assertEquals(driver.getTitle(), ExpectedSearchPageTitle,"Search page is not displayed");
		Reporter.log("Search Page is displayed successfully",true);
		
		//-----to add product to cart==================================================================================================
		WebElement laptop = driver.findElement(By.xpath("//h2[@class='product-title']"));
		String product = laptop.getText();
		h.getAddToCart().click();
		
		WebElement SuccessMessageElement = driver.findElement(By.xpath("//p[@class='content']"));
		String ExpectedSucessmessage = "The product has been added to your shopping cart";
		Assert.assertEquals(SuccessMessageElement.getText(), ExpectedSucessmessage,"Product is not added to cart");
		Reporter.log("Product is added to CartPage Successfully",true);
		
		//------to veryfy product in cart page=========================================================================================
		h.getCartLink().click();   
		String ExpectedCartPageTitle = "Demo Web Shop. Shopping Cart";
		Assert.assertEquals(driver.getTitle(), ExpectedCartPageTitle,"CartPage is not displayed");
		Reporter.log("CartPage Is Displayed Successfully",true);
		
		WebElement ProductInCart =driver.findElement(By.xpath("//a[@class='product-name']"));
		String ProductnameInCart = ProductInCart.getText();
		Assert.assertEquals(ProductnameInCart, product, "Product is not added to the cartPage" );
		Reporter.log("Product is Present in the CartPage",true);
		
		//------to remove product from cart============================================================================================
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		String CartQuantityBefore = driver.findElement(By.xpath("//span[@class='cart-qty']")).getText();
		c.getUpdateShoppingCart().click();
		String CartQuantityAfter = driver.findElement(By.xpath("//span[@class='cart-qty']")).getText();
		if(CartQuantityBefore.equals(CartQuantityAfter))
		{
			Reporter.log("Product is not Removed From The Cart Page");
		}else
		{
			Reporter.log("Product Is Successfully Removed From The Cart Page");
		}
	}
}
