package tutorial;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Multiple_Window {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		
		driver.findElement(By.xpath("//a[text()='Click to Start Selenium Practice Now']")).click();
		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println("total windows present :"+windowhandles);
		Iterator<String> iterator = windowhandles.iterator();
		String parent = iterator.next();
		System.out.println("parent window :"+parent);
		String child=iterator.next();
		System.out.println("child window :"+child);
		driver.switchTo().window(child);
		driver.findElement(By.id("name")).sendKeys("Hello");
		driver.switchTo().window(parent);
		
		
		
	}

}
