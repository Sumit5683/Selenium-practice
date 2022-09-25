package tutorial;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart_books {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@title=\"Search for products, brands and more\"]")).sendKeys("books");
		driver.findElement(By.xpath("//div[text()=' to read']")).click();
		Actions act = new Actions(driver);
		WebElement space = driver.findElement(By.xpath("//div[@class='_1TmfNK']"));
		act.moveToElement(space).perform();
		driver.findElement(By.xpath("//a[text()='ThePowerofyourSubconsciousMind']")).click();
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parentID = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		WebElement book = driver.findElement(By.xpath("//a[text()='ThePowerofyourSubconsciousMind']"));
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(book.isDisplayed(), true, "The book is added to cart");
		soft.assertAll();

	}

}
