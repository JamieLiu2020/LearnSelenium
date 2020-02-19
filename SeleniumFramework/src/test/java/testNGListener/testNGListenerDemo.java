package testNGListener;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testNGListener.TestNGListener.class)

public class testNGListenerDemo {
	
	@Test
	public void test1(){
		System.out.println("this is test 1");		
	}
	
	@Test
	public void test2(){
		System.out.println("this is test 2");		
	}
	
	@Test
	public void test3(){
		System.out.println("this is test 3");		
	}


}
