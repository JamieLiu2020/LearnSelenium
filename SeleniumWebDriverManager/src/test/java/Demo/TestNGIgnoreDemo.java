package Demo;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore
public class TestNGIgnoreDemo {
	
	@Test

	public void test1(){
		
		System.out.println("This is test1.");
	}
	
	@Test
	public void test2(){
		
		System.out.println("This is test2.");
	}
	
	@Test
	public void test3(){
		
		System.out.println("This is test3.");
	}

}
