package objectRepositiry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChekoutPage {

	WebDriver driver;
	public ChekoutPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
	this.driver=driver;
	}
	@FindBy(id="termsofservice")
	private WebElement checkBox;
	
	public WebElement getCheckBox() {
		return checkBox;
	}
	@FindBy(id="checkout")
	private WebElement checkoutButton;
	
	@FindBy(id="BillingNewAddress_City")
	private WebElement bilingCity;
	
	@FindBy(id="BillingNewAddress_Address1")
	private WebElement billingAddress;
	
	@FindBy(id="BillingNewAddress_ZipPostalCode")
	private WebElement billingZipCode;
	
	@FindBy(id="BillingNewAddress_PhoneNumber")
	private WebElement billingPhoneNumber;
	
	@FindBy(xpath="//input[@onclick='Billing.save()']")
	private WebElement billingButton;
	
	@FindBy(xpath="//input[@onclick='Shipping.save()']")
	private WebElement shippingContinueButton;
	
	@FindBy(xpath="//input[@onclick='ShippingMethod.save()']")
	private WebElement shippingMethodContinueButton;
	
	@FindBy(xpath="//input[@onclick='PaymentMethod.save()']")
	private WebElement paymentMethodcontinueButton;
	
	@FindBy(xpath="//input[@onclick='PaymentInfo.save()']")
	private WebElement paymentInfoContinueButton;
	
	@FindBy(xpath="//input[@onclick='ConfirmOrder.save()']")
	private WebElement confirmOrderButton;
	
	@FindBy(xpath="//h1[text()='Thank you']")
	private WebElement thankYouMessage;
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getCheckoutButton() {
		return checkoutButton;
	}

	public WebElement getBilingCity() {
		return bilingCity;
	}

	public WebElement getBillingAddress() {
		return billingAddress;
	}

	public WebElement getBillingZipCode() {
		return billingZipCode;
	}

	public WebElement getBillingPhoneNumber() {
		return billingPhoneNumber;
	}

	public WebElement getBillingButton() {
		return billingButton;
	}

	public WebElement getShippingContinueButton() {
		return shippingContinueButton;
	}

	public WebElement getShippingMethodContinueButton() {
		return shippingMethodContinueButton;
	}

	public WebElement getPaymentMethodcontinueButton() {
		return paymentMethodcontinueButton;
	}

	public WebElement getPaymentInfoContinueButton() {
		return paymentInfoContinueButton;
	}

	public WebElement getConfirmOrderButton() {
		return confirmOrderButton;
	}

	public WebElement getThankYouMessage() {
		return thankYouMessage;
	}
	
	@FindBy(xpath="//table[@class='cart']/..//a[text()='14.1-inch Laptop']")
	private WebElement prodctInCart;
	
	public WebElement getProdctInCart() {
		return prodctInCart;
	}
	
	@FindBy(xpath="//input[@title='Continue']")
	private WebElement billingcontinueButton;
	
	public WebElement getBillingcontinueButton() {
		return billingcontinueButton;
	}

	@FindBy(name="BillingNewAddress.CountryId")
	private WebElement countrylistbox;
	
	public WebElement getCountrylistbox() {
		return countrylistbox;
	}
	
	
	
}
