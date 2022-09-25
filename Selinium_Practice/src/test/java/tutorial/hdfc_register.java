package tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class hdfc_register {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://v1.hdfcbank.com/assets/popuppages/netbanking.htm");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[text()=\"CONTINUE TO THE NEW LOGIN PAGE FOR NETBANKING\"])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"pageBody\"]/div[1]/form/div[3]/div/div/div[2]/div[2]/div[1]/div[2]/input")).sendKeys("136877305");
		Thread.sleep(3000);
//		driver.findElement(By.xpath("(//input[@type=\"password\"])[2]")).sendKeys("Sumit@456789");
//		driver.findElement(By.name("chkrsastu")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("(//a[\"LOGIN\"])[2]")).click();

	}

}
