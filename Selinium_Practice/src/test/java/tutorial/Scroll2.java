package tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jsonapi.org/examples/");
		driver.manage().window().maximize();
		WebElement abc = driver.findElement(By.xpath("(//code[@class='hljs http'])[11]"));
		JavascriptExecutor a = (JavascriptExecutor)driver;
		a.executeScript("window.scrollBy(0.800)");
		a.executeScript("arguments[0].srollIntoView(true)",abc);

	}

}
