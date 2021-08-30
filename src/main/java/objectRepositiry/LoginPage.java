package objectRepositiry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
	this.driver=driver;
	}
	
	@FindBy(id="Email")
	private WebElement emailTextField;

	@FindBy(id="Password")
	private WebElement pwdTextField ;       

	@FindBy(xpath="//input[@value='Log in']")
	private WebElement loginButton;
	public WebDriver getDriver() {
		return driver;
	}
	@FindBy(xpath="//a[text()='Log in']")
	private WebElement loginLink;

	@FindBy(xpath="//span[text()='Login was unsuccessful. Please correct the errors and try again.']")
	private WebElement errorMessage;
	
	public WebElement getErrorMessage() {
		return errorMessage;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return pwdTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
}
