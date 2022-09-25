package tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mock {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("Arya");
		driver.findElement(By.name("lastname")).sendKeys("Stark");
		driver.findElement(By.name("reg_email__")).sendKeys("JoeyTribiyani");
		driver.findElement(By.name("reg_passwd__")).sendKeys("sat45ty@@");
		WebElement Birth = driver.findElement(By.name("birthday_day"));
		Select day = new Select(Birth);
		day.selectByIndex(5);
		WebElement Birth1 = driver.findElement(By.name("birthday_month"));
		Select month = new Select(Birth1);
		month.selectByIndex(5);
		
		
		
	
	}

}
