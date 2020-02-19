package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsBasicDemo {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args){
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("ExtentReport.html");
		
		// create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
     // creates a toggle for the given test, adds all log events under it    
        ExtentTest test1 = extent.createTest("Google Search test one", "Sample description");
		
		String projectLocation = System.getProperty("user.dir");		
		System.setProperty("webdriver.chrome.driver", projectLocation + "\\drivers\\ChromeDriver\\chromedriver.exe");		
		driver = new ChromeDriver();
		
		test1.log(Status.INFO,"Starting Test");

		driver.get("http://baidu.com");
		
		test1.pass("Navigated to Baidu.com");
		
		//enter text in search box		
		driver.findElement(By.id("kw")).sendKeys("Automation");
		test1.pass("Entered text in searchbox");
		
		//click on search button
		driver.findElement(By.id("su")).sendKeys(Keys.RETURN);
		test1.pass("Pressed keyboard enter key");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();
		driver.quit();
		test1.pass("Closed the browser");
		
		test1.info("Test completed");
		
		// calling flush writes everything to the log file
        extent.flush();
		
		System.out.println("Finish");

	}

}
