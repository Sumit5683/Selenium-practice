package tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"checkBoxOption2\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"checkBoxOption2\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"checkBoxOption3\"]")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id=\"checkBoxOption3\"]")).isSelected());  //boolean value is checkbox selected or not
		
		System.out.println("total checkboxes on website"+driver.findElements(By.xpath("//label[starts-with(for,'')]")).size());

	}

}
