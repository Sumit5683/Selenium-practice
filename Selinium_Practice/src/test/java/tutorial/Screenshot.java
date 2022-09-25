package tutorial;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		Date date = new Date();
		System.out.println(date);
		String date1 = date.toString().replace(" ", "_").replace(":","-");
		System.out.println(date1);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rolls-roycemotorcars.com/en_US/showroom/ghost.html");
 		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='No thanks']")).click();
		
		WebElement pic = driver.findElement(By.xpath("(//picture[@class='rrmc-preload-picture rrmc-preload-target'])[2]"));
		Actions action = new Actions(driver);
		action.moveToElement(pic).perform();
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest = new File("F:\\Software testing\\Selenium\\Screenshot\\"+date +".jpg");
		FileHandler.copy(source, dest);
		FileUtils.copyDirectory(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE), 
				new File("F:\\Software testing\\Selenium\\Screenshot\\"+date1+".jpg"));

	}

}
