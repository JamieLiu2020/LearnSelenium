package Demo;

import org.testng.annotations.Test;


@Test(groups = {"AllClassTests"})
public class TestNGGroupDemo {
	
	@Test(groups={"Sanity"})
	public void test1(){
				
		System.out.println("This is test 1.");
	}
	
	@Test(groups={"Windows.Regression","Smoke"})
	public void test2(){
				
		System.out.println("This is test 2.");
	}
	
	@Test(groups={"linux.Regression"})
	public void test3(){
				
		System.out.println("This is test 3.");
	}
	
	public void test4(){
		
		System.out.println("This is test 4.");
	}


}
