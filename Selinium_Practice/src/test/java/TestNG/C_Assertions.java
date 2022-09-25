package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class C_Assertions {
	
	@Test
	public void titleTest() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		
		String expected_title = "Instagram";
		String actual_title= driver.getTitle();
		
		Assert.assertEquals(actual_title, expected_title);
		driver.quit();
		
	}

}
