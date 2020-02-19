package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

public class SeleniumWaitDemo {
	
	public static void main(String[] args){
		
		seleniumWait();		
	}
	
	public static void seleniumWait() {
		
		String projectLocation = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectLocation + "\\drivers\\ChromeDriver\\chromedriver.exe");			
		
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://baidu.com");
		driver.findElement(By.xpath("//input[@id='kw']")).sendKeys("Automation");		
		driver.findElement(By.id("su")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("abc")));
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("abc")));
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("abc")));
		driver.findElement(By.id("abc")).click();
		
		driver.close();
		driver.quit();
		
	}

}
