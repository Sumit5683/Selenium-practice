package tutorial;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Insta {
	

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Sumit@123");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Sumit@123");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(5000);
//		driver.findElement(By.xpath("//span[text()=\"Sign up\"]")).click();
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\dell\\Downloads\\instasc.jpg");
		FileHandler.copy(source, dest);

	}

}
