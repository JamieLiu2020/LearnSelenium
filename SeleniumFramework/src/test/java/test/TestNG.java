package test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFile;
import demo.Log4jDemo;

public class TestNG {
	
	WebDriver driver = null;
	public static String browserName=null;
//	private static Logger logger = LogManager.getLogger(Log4jDemo.class);

	@BeforeTest
	public void setUpTest(){
		String projectLocation = System.getProperty("user.dir");
		PropertiesFile.getProperties();
		
		if(browserName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", projectLocation + "\\drivers\\ChromeDriver\\chromedriver.exe");		
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver",projectLocation + "\\Lib\\geckoDriver\\geckodriver.exe");		
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("ie")){
			System.setProperty("webdriver.gecko.driver",projectLocation + "\\Lib\\geckoDriver\\geckodriver.exe");		
			driver = new FirefoxDriver();
		}
		
		
	//	logger.info("Browser started");
	}
	
	@Test
	public void googleSearch() {
		
		
		driver.get("https://baidu.com");
		
		//enter text in search box		
		driver.findElement(By.xpath("//input[@id='kw']")).sendKeys("Automation");
		
		//click on search button
		driver.findElement(By.id("su")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@AfterTest
	public void tearDownTest(){
		
		driver.close();
		driver.quit();
		
		System.out.println("Finish");
		PropertiesFile.setProperties();
	}
}
