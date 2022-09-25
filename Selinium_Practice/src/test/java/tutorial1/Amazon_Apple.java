package tutorial1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_Apple {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Iphone 13 Pro");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[text()='iphone 13 pro'])[3]")).click();
		driver.findElement(By.xpath("(//span[text()='Apple iPhone 13 Pro (1TB) - Graphite'])")).click();
		Thread.sleep(5000);
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parentID = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		driver.findElement(By.xpath("//input[@value='Add to Cart']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("proceedToRetailCheckout")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("email")).sendKeys("sumitpatil@gmail.com");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("You_Know_Nothing");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		

	}

}
