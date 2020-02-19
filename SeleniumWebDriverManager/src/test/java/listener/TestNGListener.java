package listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener implements ITestListener {
	
	  public void onTestStart(ITestResult result) {
		  System.out.println("Test started: " + result.getName());
		  
	  }
	  
	  public void onTestSuccess(ITestResult result) {
		  System.out.println("Test is successful: " + result.getName());
		  
	  }
	  
	  public void onTestFailure(ITestResult result) {
		  System.out.println("Test failed: " + result.getName());

	  }
	 

	  public void onTestSkipped(ITestResult result) {
		  System.out.println("Test is skipped: " + result.getName());

	  }
	  
	  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		  System.out.println("Test : " + result.getName());
		  
	  }

	  public void onTestFinish(ITestResult result) {
		  System.out.println("Test is finished: " + result.getName());

	  }
	  
	  public void onStart(ITestContext context) {
		return;
	  }
	  
	  public void onFinish(ITestContext context) {
			return;
		  }
	
}
