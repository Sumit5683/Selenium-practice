package tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class xpath1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://v1.hdfcbank.com/assets/popuppages/netbanking.htm");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[text()=\"CONTINUE TO THE NEW LOGIN PAGE FOR NETBANKING\"])[2]")).click();

	}

}
