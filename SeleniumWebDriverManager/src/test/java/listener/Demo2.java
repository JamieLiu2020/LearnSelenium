package listener;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(listener.TestNGListener.class)

public class Demo2 {
	
	@Test
	public void test4(){
		System.out.println("this is test 4");		
		
	}
	
	@Test
	public void test5(){
		System.out.println("this is test 5");	

	}
	
	@Test
	public void test6(){
		System.out.println("this is test 6");
		
		throw new SkipException("This test is skipped.");
	}
}

