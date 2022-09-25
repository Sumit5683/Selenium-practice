package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class B1_Annotations {//before class, after class, before group, after group
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("Executing before running the class");
	}
	
	@AfterClass
	public void afterclass() {
//		for cleaning up the data after class is used
		System.out.println("Executing after running the complete class");
	}
	
	@BeforeGroups(value = "regression")
	public void beforegroup() {
		System.out.println("before group method");
	}
	
	@AfterGroups(value = "regression")
	public void aftergroup() {
		System.out.println("after group method");
	}

	
	@Test(priority=1,groups="regression")
	public void test1() {
		System.out.println("test 1");
	}
	
	@Test(priority=2)
	public void Test2() {
		System.out.println("test 2");
	}
	
	@Test(groups={"regression","bvt"})
	public void Test3() {
		System.out.println("test 3");
	}
	
	
}
