package genericLibrary;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import objectRepositiry.HomePage;

public class toSearchForProduct {

	public WebDriver driver;
	HomePage homePage = new HomePage(driver);
	public void searchProduct(String product,String title, WebDriver driver) {
		homePage.getSearchTextField().sendKeys(product);
		homePage.getSearchButton().click();
		String expectedSearchPageTitle = title;
		Assert.assertEquals(driver.getTitle(),expectedSearchPageTitle,"Search Page is not displayed");
		Reporter.log("Search page is displayed successfully",true);
	}
	
}
