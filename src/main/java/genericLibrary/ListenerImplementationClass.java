package genericLibrary;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
/***
 * 
 * @author Sumanth
 *
 */
public class ListenerImplementationClass implements ITestListener {
	
	public void onFinish(ITestContext arg0) {					
	
	}
	
	public void onStart(ITestContext arg0) {								

	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {								

	}
	
	public void onTestFailure(ITestResult result) {					
		TakeScreenShotUtil screenshot=new TakeScreenShotUtil();
		screenshot.takeScreenshotAndStoreInErrorshots(result);  		
	}		

	public void onTestSkipped(ITestResult arg0) {					
		
	}		

	public void onTestStart(ITestResult arg0) {					
		
	}	
	
	public void onTestSuccess(ITestResult arg0) {					
		
	}
}
