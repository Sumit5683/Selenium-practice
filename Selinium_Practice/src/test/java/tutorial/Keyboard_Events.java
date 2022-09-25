package tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyboard_Events {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://extendsclass.com/text-compare.html");
		Thread.sleep(2000);
		WebElement text = driver.findElement(By.xpath("//div[@role='presentation']"));
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.keyDown(text, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		Thread.sleep(2000);
		WebElement texting = driver.findElement(By.xpath("(//div[@role='presentation'])[5]"));
		action.keyDown(texting, Keys.CONTROL).sendKeys("v").build().perform();

	}

}
