package objectRepositiry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {

	public ContactUsPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
	}
	
	@FindBy(linkText="Contact us")
	private WebElement ContactUsLink;
	
	public WebElement getContactUsLink()
	{
		return ContactUsLink ;
	}
	
	@FindBy(id="FullName")
	private WebElement fullNameTextField;
	
	public WebElement getfullNameTextField()
	{
		return fullNameTextField;
	}
	
	@FindBy(id="Email")
	private WebElement EmailTextField;
	public WebElement getEmailTextField()
	{
		return EmailTextField;
	}
	
	@FindBy(id="Enquiry")
	private WebElement EnquiryTextArea;
	public WebElement getEnquiryTextArea()
	{
		return EnquiryTextArea;
	}
	
	@FindBy(name="send-email")
	private WebElement SubmitButton;
	public WebElement getSubmitButton()
	{
		return SubmitButton;
	}
}
