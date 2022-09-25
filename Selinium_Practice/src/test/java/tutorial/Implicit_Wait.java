package tutorial;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Implicit_Wait {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));

		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		WebElement electronics= driver.findElement(By.xpath("//div[text()='Electronics']"));
		Actions option = new Actions(driver);
		option.moveToElement(electronics).perform();
		
		WebElement laptop= driver.findElement(By.xpath("//a[text()='Laptop and Desktop']"));
		
		option.moveToElement(laptop).perform();
		
		WebElement all_in_pc = driver.findElement(By.xpath("//a[text()='All In One PCs']"));
		option.moveToElement(all_in_pc).click().perform();
		
		
	}

}
