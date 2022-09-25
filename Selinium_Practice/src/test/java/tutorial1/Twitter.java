package tutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Twitter {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.twitter.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@data-testid='loginButton']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='text']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
	}

}
