package tutorial1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pop_up {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(3000);
		driver.findElement(By.id("alertButton")).click();
		driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.findElement(By.id("promtButton")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("hello");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
	}

}
