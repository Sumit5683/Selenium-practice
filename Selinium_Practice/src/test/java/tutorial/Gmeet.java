package tutorial;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gmeet {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		DesiredCapabilities caps = new DesiredCapabilities();
		ChromeOptions options = new ChromeOptions();

		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_settings.popups", 0);
		prefs.put("profile.default_content_setting_values.notifications", 1);

		options.setExperimentalOption("prefs", prefs);
		caps.setCapability(ChromeOptions.CAPABILITY, options);
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://meet.google.com/");
		WebElement lang = driver.findElement(By.xpath("//select[@name='lang-selector']"));
		Select abc = new Select(lang);
		abc.selectByValue("/intl/en/meet/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//span[text()='Start a meeting'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("identifier")).sendKeys("sumitpatil@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		

	}

}
