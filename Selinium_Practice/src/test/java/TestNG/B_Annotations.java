package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class B_Annotations {
	@BeforeClass
	public void before_class() {
		System.out.println("before class");
	}

	@AfterClass
	public void after_class() {
		System.out.println("\nafter class");
	}

	@BeforeTest
	public void LoginToApplication() {
		System.out.println("\nbefore test = Login to Application");
	}

	@AfterTest
	public void LogoutFromApplication() {
		System.out.println("\nafter test = Logout from Application");
	}

	@BeforeMethod
	public void ConnectDB() {
		System.out.println("\nbefore method = connected to database");
	}

	@AfterMethod
	public void DisconnectDB() {
		System.out.println("\nafter method = disconnected from database");
	}

	@Test(priority = 1, description = "checking does application is in use or not", groups = "regression")
	public void LoginTest() {
		System.out.println("\ntest 1= Application is in used");
	}

	@Test(invocationCount =2, description = "checking can we open the messages",enabled=false)
	public void Messages() {
		System.out.println("\ntest 2= Messages are open");
	}

	@Test(priority = 2, description = "checking can we open settings",groups = "regression")
	public void Settings() {
		System.out.println("\ntest 3 =Settings are open");
	}

}
