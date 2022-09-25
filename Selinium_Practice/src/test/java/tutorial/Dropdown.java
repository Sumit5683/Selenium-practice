package tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
		driver.manage().window().maximize();
		WebElement dropdown = driver.findElement(By.name("dropdown-class-example"));
		Select select = new Select(dropdown);
		
		select.selectByIndex(2);
		Thread.sleep(5000);
		select.selectByValue("option3");
		Thread.sleep(5000);
		select.selectByVisibleText("Option1");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//option[text()='Select']")).click();

	} 

}
