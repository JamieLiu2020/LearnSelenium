package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.GoogleSearchPage;

public class GoogleSearchTest {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args){
		
		googleSearch();
	}
	
	
	public static void googleSearch() {
		
		String projectLocation = System.getProperty("user.dir");		
		System.setProperty("webdriver.chrome.driver", projectLocation + "\\drivers\\ChromeDriver\\chromedriver.exe");		
		driver = new ChromeDriver();
		
		driver.get("https://baidu.com");
		
		//enter text in search box		
		//driver.findElement(By.xpath("//input[@id='kw']")).sendKeys("Automation");
		
		GoogleSearchPage.textbox_search(driver).sendKeys("Automation");
		
		//click on search button
		//driver.findElement(By.id("su")).click();
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);

		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();
		
		System.out.println("Finish");	
		
	}

}
