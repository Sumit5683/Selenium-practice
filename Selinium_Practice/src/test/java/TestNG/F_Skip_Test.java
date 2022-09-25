package TestNG;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class F_Skip_Test {
	
	@Test(enabled=false)
	public void skiptest1() {
		System.out.println("Skipping this test 1");
	}
	
	@Test
	public void skiptest2() {
		System.out.println("Skipping this test 2");
		throw new SkipException("Skipping this test 21");
	}
	
	boolean x=false;
	@Test
	public void skiptest3() {
		System.out.println("Skipping this test 3");
		
		if(x==true) {
			System.out.println("Execute this test");
		}
		else {
			System.out.println("Do not execute further steps");
			throw new SkipException("Further steps are not executing");
		}
		
	}

}
