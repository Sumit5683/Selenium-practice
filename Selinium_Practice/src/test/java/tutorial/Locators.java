package tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Ftab%3Dwm&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Ftab%3Dwm&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
//		driver.findElement(By.name("identifier")).sendKeys("sumit");
//		driver.findElement(By.id("identifierId")).sendKeys("Sumit");
//		driver.findElement(By.tagName("input")).sendKeys("Sumit");
//		driver.close();
//		driver.get("https://ultimateqa.com/automation");
//		driver.findElement(By.xpath("//*[@id=\"subscribe-field-blog_subscription-2\"]")).sendKeys("sumitpatil");
		Thread.sleep(5000);
//		driver.findElement(By.linkText("Login automation")).click();
//		driver.findElement(By.partialLinkText("Login ")).click();
//		 class name  -- css selector  -- 
		}

}
