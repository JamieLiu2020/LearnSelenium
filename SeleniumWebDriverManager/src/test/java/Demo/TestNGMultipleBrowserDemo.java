package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestNGMultipleBrowserDemo {
	
	WebDriver driver = null;
	String projectLocation = System.getProperty("user.dir");		

	@Parameters("browserName")
	@BeforeTest

	public void setup(String browserName){
		
		System.out.println("Browser name is: " + browserName);		
		System.out.println("Thread id is: " + Thread.currentThread().getId());
		
		if (browserName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", projectLocation + "\\drivers\\ChromeDriver\\chromedriver.exe");		
			driver = new ChromeDriver();		
		}
		else if(browserName.equalsIgnoreCase("firefox")){
			
			System.setProperty("webdriver.gecko.driver", projectLocation + "\\drivers\\geckoDriver\\geckodriver.exe");		
			driver = new ChromeDriver();		
		}
		else if(browserName.equalsIgnoreCase("ie")){
			System.out.println("Browser name is: IE");
			System.setProperty("webdriver.gecko.driver", projectLocation + "\\drivers\\geckoDriver\\geckodriver.exe");		
			driver = new FirefoxDriver();
		}
	}
	
	@Test
	public void test1() throws Exception{
		
		driver.get("http://baidu.com");
		Thread.sleep(3000);
	}
	
	@AfterTest
	public void teardown(){
		
		driver.close();
		System.out.println("Finished");
	}


}
