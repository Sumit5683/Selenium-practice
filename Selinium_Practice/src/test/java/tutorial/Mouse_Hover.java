package tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_Hover {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com.au/");
		
		WebElement electronics = driver.findElement(By.xpath("(//a[text()='Electronics'])[2]"));
		Actions action =new Actions(driver);
		action.moveToElement(electronics).perform();

	}

}
