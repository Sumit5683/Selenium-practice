package TestNG;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class mock {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://unstop.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//span[text()=' Login ']")).click();
		String v1= "sumit@gmail.com",v2= "sumit1@gmail.com", v3= "sumit1_@gmail.com", inv1= "sumit@gmail.1com", 
				inv2= " sumit@gmail.com", inv3= "       ", inv4= "!!!!@gmail.com";
		
		driver.findElement(By.id("email")).sendKeys(v1);
		
		String vp1= "sumit@123", invvp2= "Sumit@123111111111", invvp3= "SUmit", invvp4= "Sumit1221", 
		invvp5= "Sumit@@@@", invvp6= "@@@@!1111", invvp7= " sumit@123";
		
		driver.findElement(By.id("pwd")).sendKeys(vp1);
		
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		
		
		
		


	}

}
