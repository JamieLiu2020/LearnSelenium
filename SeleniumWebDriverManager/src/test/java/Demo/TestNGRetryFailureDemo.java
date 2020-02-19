package Demo;

import org.junit.Assert;
import org.testng.annotations.Test;

public class TestNGRetryFailureDemo {
	
	@Test
	public void test1(){
		
		System.out.println("This is test1.");
	}
	
	@Test
	public void test2(){
		
		System.out.println("This is test2.");
		//int i=1/0;
	}
	
	@Test(retryAnalyzer = listener.RetryAnalyzer.class)
	public void test3(){
		
		System.out.println("This is test3.");
		Assert.assertTrue(0>1);
	}



}
