package TestNG;

import org.testng.annotations.Test;

public class A_LoginTest {
	
	@Test(priority=1,description="This is Login Test")
	public void loginTest() {
		System.out.println("Login successful");
	}
	
	@Test(priority=2,description="This is Logout Test")
	public void LogoutTest() {
		System.out.println("Logout Successful");
	}

}
