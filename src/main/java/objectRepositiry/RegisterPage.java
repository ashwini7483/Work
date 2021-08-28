package objectRepositiry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	WebDriver driver;
	public RegisterPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
	this.driver=driver;
	}
	
	@FindBy(linkText="Register")
	private WebElement registerLink;
	
	@FindBy(id="gender-male")
	private WebElement maleRadioButton;
	
	@FindBy(id="gender-female")
	private WebElement femaleRadioButton;
	
	@FindBy(id="FirstName")
	private WebElement firstnametextfield;
	
	@FindBy(id="LastName")
	private WebElement lastnametextfield;
	
	@FindBy(id="Email")
	private WebElement emailidtextfield;
	
	@FindBy(id="Password")
	private WebElement passwordtextfield;
	
	@FindBy(id="ConfirmPassword")
	private WebElement confirmpwdtextfield;
	
	@FindBy(id="register-button")
	private WebElement registerbutton;
	
	@FindBy(linkText="Log out")
	private WebElement logout;
	
	@FindBy(className="button-1 register-continue-button")
	private WebElement ContinueButton;
	
	public WebElement getContinueButton()
	{
		return ContinueButton;
	}
	public WebElement getLogoutButton() {
		return logout;
	}
	public WebElement getRegisterLink() {
		return registerLink;
	}
	public WebElement getMaleRadioButton() {
		return getMaleRadioButton();
	}
	public WebElement getFemaleRadioButton() {
		return femaleRadioButton;
	}
	public WebElement getFirstNameTextField() {
		return firstnametextfield;
	}
	public WebElement getLastNameTextField() {
		return lastnametextfield;
	}
	public WebElement getEmailIdTextField() {
		return emailidtextfield;
	}
	public WebElement getPasswordTextField() {
		return passwordtextfield;
	}
	public WebElement getConfirmPasswordTextField() {
		return confirmpwdtextfield;
	}
	public WebElement getRegisterButton() {
		return registerbutton;
   }
}
