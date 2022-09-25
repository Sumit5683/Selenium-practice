package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class D_Assertion {
	
	@Test
	public void titleTest() {
		SoftAssert softassert = new SoftAssert();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.instagram.com");
		
		System.out.println("Verifying Title");
		String expected_title = "Instagram";
		String actual_title= driver.getTitle();
		softassert.assertEquals(actual_title, expected_title);
		
		System.out.println("Verifying Text");
		String Expected_text = driver.findElement(By.xpath("//a[text()='Forgot password?']")).getText();
		String Actual_text = "Forgot password?";
		softassert.assertEquals(Expected_text, Actual_text, "Visual conext");
		
		driver.quit();
		softassert.assertAll();
	}
}
