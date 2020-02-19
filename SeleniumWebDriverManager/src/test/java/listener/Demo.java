package listener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(listener.TestNGListener.class)

public class Demo {
	
	@Test
	public void test1(){
		System.out.println("this is test 1");		
		
	}
	
	@Test
	public void test2(){
		System.out.println("this is test 2");	
		
		String projectLocation = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectLocation + "\\drivers\\ChromeDriver\\chromedriver.exe");			
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("http://baidu.com");
		
		driver.findElement(By.xpath("//input[@id='kw']")).sendKeys("wwwwwwwwwwww");
		driver.findElement(By.xpath("//input[@id='abc']")).sendKeys("wwwwwwwwwwww");
		
		driver.close();
		
	}
	
	@Test
	public void test3(){
		System.out.println("this is test 3");
		
		throw new SkipException("This test is skipped.");
	}
}

