import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class BrowserTest {
	
	public static void main(String[] args) throws InterruptedException{
		
		String projectLocation = System.getProperty("user.dir");
	
		
		//System.setProperty("webdriver.gecko.driver", projectLocation + "\\drivers\\geckoDriver\\geckodriver.exe");		
		System.setProperty("webdriver.chrome.driver", projectLocation + "\\drivers\\ChromeDriver\\chromedriver.exe");			
		WebDriver driver = new ChromeDriver(); 
		
		//System.setProperty("webdriver.ie.driver", projectLocation + "\\drivers\\IEDriver\\IEDriverServer.exe");						
		//WebDriver driver = new InternetExplorerDriver();
		
		driver.get("http://baidu.com");
		
		driver.findElement(By.xpath("//input[@id='kw']")).sendKeys("wwwwwwwwwwww");
		
		
		List<WebElement> listOfInputElements = driver.findElements(By.xpath("//input"));
		
		int count = listOfInputElements.size();
		
		System.out.println(count);
		
		//WebElement textBox = driver.findElement(By.id("kw"));
		
		//textBox.sendKeys("abc");
			
		
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
