package genericLibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
/***
 * 
 * @author Swarna
 *
 */
public class BaseTest implements IAutoConstants {

	public static WebDriver driver;
	public ExcelUtil readExcelData ;
	public WebDriverWait explicitWait;

	@Parameters("browser")
	@BeforeClass(alwaysRun=true)
	public void openApplication(@Optional("chrome")String browserName) {

		//pre-condition : Launching the browser
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty(CHROME_KEY,CHROME_PATH);
			driver=new ChromeDriver();
			Reporter.log("Successfully Launched Chrome Browser",true);
		}else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty(FIREFOX_KEY,FIREFOX_PATH);
			driver=new FirefoxDriver();
			Reporter.log("Successfully Launched Firefox Browser",true);
		}else {
			Reporter.log("Enter valid Browser name");
		}

		driver.manage().window().maximize();
		Reporter.log("Browser window is maximized successfully",true);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		explicitWait = new WebDriverWait(driver, 10);

		readExcelData = new ExcelUtil();		

		//Step1 : navigate to application
		driver.get(DEFAULT_URL);
		String expectedLoginPageTitle = "Demo Web Shop";
		Assert.assertEquals(driver.getTitle(),expectedLoginPageTitle,"Login Page is not displayed");
		Reporter.log("Login page is displayed successfully",true);
	}

	@AfterMethod(alwaysRun=true)
	public void logoutFromApplication() {
		Reporter.log("Logged out successfully",true);
	}
    //to quit browser
	@AfterClass(alwaysRun=true)
	public void CloseApp() {
		driver.quit();
	}

}


