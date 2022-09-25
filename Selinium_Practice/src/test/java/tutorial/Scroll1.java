package tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jsonapi.org/examples/");
		driver.manage().window().maximize();
		WebElement abc = driver.findElement(By.xpath("(//code[@class='hljs http'])[11]"));
		Actions x = new Actions(driver);
		x.moveToElement(abc).perform();

	}

}
