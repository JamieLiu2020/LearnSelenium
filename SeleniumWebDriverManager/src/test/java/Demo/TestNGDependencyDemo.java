package Demo;

import org.testng.annotations.Test;

public class TestNGDependencyDemo {
	
	@Test(dependsOnGroups = {"Sanity.*"})
	public void test1(){
		
		System.out.println("This is test1.");
	}
	
	@Test(groups={"Sanity1"})
	public void test2(){
		
		System.out.println("This is test2.");
	}

	@Test(groups={"Sanity2"})
	public void test3(){
		
		System.out.println("This is test3.");
	}
}
