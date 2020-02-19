package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.GoogleSearchPageObject;

public class GoogleSearchPageTest {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args){
		
		googleSearchTest();
	}
	
	public static void googleSearchTest(){
		
		String projectLocation = System.getProperty("user.dir");		
		System.setProperty("webdriver.chrome.driver", projectLocation + "\\drivers\\ChromeDriver\\chromedriver.exe");		
		driver = new ChromeDriver();
		
		GoogleSearchPageObject searchPageObj = new GoogleSearchPageObject(driver);
		
		driver.get("http://baidu.com");
		
		searchPageObj.setTextInSearchBox("Automation");
		
		searchPageObj.clickSearchButton();
		
		driver.close();

	}

}
