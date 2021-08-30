package objectRepositiry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;
	public HomePage(WebDriver driver) {
	PageFactory.initElements(driver,this);
	this.driver=driver;
	}
	
	@FindBy(id="small-searchterms")
	private WebElement searchTextField;
	
	@FindBy(xpath="//input[@value='Search']")
	private WebElement searchButton;
	
	@FindBy(partialLinkText="Desktops")
	private WebElement desktopButton;            

	@FindBy(partialLinkText="Notebooks")
	private WebElement notebooksButton;
	
	@FindBy(partialLinkText="Accessories")
	private WebElement accessoriesButton;

	@FindBy(partialLinkText="Electronics")
	private WebElement electronicsButton;
	
	@FindBy(partialLinkText="Camera, photo")
	private WebElement cameraButton;
	
	@FindBy(linkText="Shopping cart")
	private WebElement cartLink;
	
	@FindBy(linkText="Log in")
	private WebElement loginLink;
	
	@FindBy(linkText="Register")
	private WebElement registerLink;
	
	@FindBy(linkText="Log out")
	private WebElement logout;
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSearchTextField() {
		return searchTextField;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getDesktopButton() {
		return desktopButton;
	}

	public WebElement getNotebooksButton() {
		return notebooksButton;
	}

	public WebElement getAccessoriesButton() {
		return accessoriesButton;
	}

	public WebElement getElectronicsButton() {
		return electronicsButton;
	}

	public WebElement getCameraButton() {
		return cameraButton;
	}

	public WebElement getCartLink() {
		return cartLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getLogout() {
		return logout;
	}
	
	@FindBy(xpath="//input[@value='Add to cart']")
	private WebElement addToCart;
	
	public WebElement getAddToCart() {
		return addToCart;
	}
	
	@FindBy(partialLinkText="Computers")
	private WebElement computerlink;
	
	public WebElement getComputerlink() {
		return computerlink;
	}
	
}
