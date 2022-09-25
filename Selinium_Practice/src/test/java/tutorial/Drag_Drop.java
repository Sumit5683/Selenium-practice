package tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_Drop {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.switchTo().frame(4);
		Thread.sleep(2000);
		WebElement drag = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='trash']"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(drag, drop).perform();
		

	}

}
