package objectRepositiry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

	WebDriver driver;
	public CartPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
	this.driver=driver;
	}
	
	@FindBy(xpath="//input[@value='Update shopping cart']")
	private WebElement UpdateShoppingCart;
	
	@FindBy(id="termsofservice")
	private WebElement checkBox;
	
	@FindBy(id="checkout")
	private WebElement checkout;
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getUpdateShoppingCart() {
		return UpdateShoppingCart;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getCheckout() {
		return checkout;
	}
	
	
}
