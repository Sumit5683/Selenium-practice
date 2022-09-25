package tutorial;

import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Basic_Methods {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		String currenturl = driver.getCurrentUrl();
		System.out.println("Current Url : "+currenturl);
		
		String title = driver.getTitle();
		System.out.println("title : "+title);
		
		String pagesource = driver.getPageSource();
		System.out.println("page source : "+pagesource);
		
//		driver.navigate().to("https://www.google.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		
		List<WebElement> webelements = driver.findElements(By.xpath("//div[@class='inventory_list']/div"));
		System.out.println(webelements);
		
		driver.navigate().to("https://www.facebook.com/");
//		String windowhandle  = driver.getWindowHandle();
//		System.out.println(windowhandle);
		
		driver.findElement(By.linkText("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0")).click();
//		Set<String> windowhandles = driver.getWindowHandles();
//		System.out.println(windowhandles);
		
		Thread.sleep(5000);
		

	}

}
