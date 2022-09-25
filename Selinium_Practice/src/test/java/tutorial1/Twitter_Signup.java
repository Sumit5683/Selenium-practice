package tutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Twitter_Signup {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.twitter.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Sign up with phone or email']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("name")).sendKeys("Joey");
		driver.findElement(By.name("name")).clear();
		driver.findElement(By.name("phone_number")).sendKeys("1234567890");
		WebElement Birth = driver.findElement(By.xpath("//select[@id='SELECTOR_1']"));
		Select month = new Select(Birth);
		month.selectByVisibleText("June");
		WebElement Birth1 = driver.findElement(By.xpath("//select[@id='SELECTOR_2']"));
		Select day = new Select(Birth1);
		day.selectByVisibleText("1");
		WebElement Birth2 = driver.findElement(By.xpath("//select[@id='SELECTOR_3']"));
		Select year = new Select(Birth2);
		year.selectByVisibleText("2001");
		driver.findElement(By.xpath("//span[text()='Next']")).click();

	}

}
