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
}
