package tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElements {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
		driver.manage().window().maximize();
		driver.findElement(By.name("enter-name")).sendKeys("Velocity");
		Thread.sleep(2000);
		driver.findElement(By.name("enter-name")).clear();
		System.out.println("class name of opentab button : "+driver.findElement(By.id("opentab")).getAttribute("class"));
		System.out.println("font size of openwindow button : "+driver.findElement(By.id("openwindow")).getCssValue("font-size"));
		System.out.println("size of openwindow button : "+driver.findElement(By.id("openwindow")).getSize());
		System.out.println("location of openwindow button : "+driver.findElement(By.id("openwindow")).getLocation());
		System.out.println("tagname of openwindow button : "+driver.findElement(By.id("openwindow")).getTagName());
		System.out.println("text of openwindow button : "+driver.findElement(By.id("openwindow")).getText());
		System.out.println("is openwindow button visible? "+driver.findElement(By.id("openwindow")).isDisplayed());
		System.out.println("is openwindow button enabled? "+driver.findElement(By.id("openwindow")).isEnabled());
		System.out.println("is openwindow button selected? "+driver.findElement(By.id("openwindow")).isSelected());
		
	}

}
