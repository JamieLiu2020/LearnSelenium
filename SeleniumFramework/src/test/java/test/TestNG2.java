package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG2 {
	
	WebDriver driver = null;

	@BeforeTest
	public void setUpTest(){
		
		String projectLocation = System.getProperty("user.dir");		
		System.setProperty("webdriver.chrome.driver", projectLocation + "\\drivers\\ChromeDriver\\chromedriver.exe");		
		driver = new ChromeDriver();
	}
	
	@Test
	public void googleSearch3() {
		
		
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
	}
}
