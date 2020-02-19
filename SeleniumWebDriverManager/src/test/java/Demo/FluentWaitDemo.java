package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;


public class FluentWaitDemo {
	
	public static void main(String[] args) throws Exception{
		
		test();		
	}
	
	public static void test() throws Exception{
		
		String projectLocation = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectLocation + "\\drivers\\ChromeDriver\\chromedriver.exe");			
		
		WebDriver driver = new ChromeDriver();	
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		driver.get("http://baidu.com");
		driver.findElement(By.xpath("//input[@id='kw']")).sendKeys("Automation");		
		driver.findElement(By.id("su")).click();
		
		driver.findElement(By.id("2")).click();
		
/*		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(30, TimeUnit.SECONDS)
			    .pollingEvery(5, TimeUnit.SECONDS)
			    .ignoring(NoSuchElementException.class);

			WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			     public WebElement apply(WebDriver driver) {
			       return driver.findElement(By.id("foo"));
			     }
			   });
*/		
		Thread.sleep(3000);
		driver.close();
		driver.quit();

		
	}

}
