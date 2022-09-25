package tutorial1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
		Select s = new Select(month);
		List<WebElement> options = s.getOptions();
		
		s.selectByIndex(2);
		s.selectByIndex(3);
		Thread.sleep(2000);
		s.selectByIndex(7);
		System.out.println(options.get(2).getText());
		
		System.out.println(options.size());
		for (int i =0 ; i<options.size(); i++) {
			System.out.print(options.get(i).getText()+", ");
		}

	}

}
