import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesDemo {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		String projectLocation = System.getProperty("user.dir");	
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("ignoreProtectedModeSettings", true);
		
		
		System.setProperty("webdriver.ie.driver", projectLocation + "\\drivers\\IEDriver\\IEDriverServer.exe");						
		driver = new InternetExplorerDriver(caps);
		
		//System.setProperty("webdriver.chrome.driver", projectLocation + "\\drivers\\ChromeDriver\\chromedriver.exe");		
		//driver = new ChromeDriver();
		
		driver.get("http://baidu.com");
		driver.findElement(By.id("kw")).sendKeys("Automation");
		driver.findElement(By.id("su")).click();
		
		driver.close();
		driver.quit();
		
	}

}
