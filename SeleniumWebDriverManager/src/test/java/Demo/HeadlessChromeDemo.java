package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeDemo {
	
	public static void main(String[] args) throws Exception{
		
		test();		
	}
	
	public static void test(){
		
		String projectLocation = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectLocation + "\\drivers\\ChromeDriver\\chromedriver.exe");			
		
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver();	
		
		driver.get("http://baidu.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@id='kw']")).sendKeys("Automation");		
		driver.findElement(By.id("su")).sendKeys(Keys.RETURN);
		
		driver.close();
		driver.quit();
		
		System.out.println("Finished");
	}

}
