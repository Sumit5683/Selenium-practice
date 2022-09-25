package tutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown_Multiselect {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://makeseleniumeasy.com/2017/08/18/part-1-handling-drop-down-created-using-select-tag-in-selenium/");
		
		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"post-1975\"]/div/div/select[2]"));
		Select select = new Select(dropdown);
		select.selectByIndex(1);
		select.selectByValue("Tamil");
		Thread.sleep(3000);
		List<WebElement> languages = select.getAllSelectedOptions();
		System.out.println(languages.size());  //total selected elements
		select.deselectAll();
		Thread.sleep(3000);
		select.selectByVisibleText("Kannada");
		select.selectByValue("Telgu");
		select.selectByIndex(1);
		Thread.sleep(3000);
		select.deselectByValue("Kannada");
		select.deselectByVisibleText("English");
		Thread.sleep(3000);
		List<WebElement> languages1 = select.getAllSelectedOptions();
		System.out.println(languages1.size());   //total selected options
		WebElement firstoption = select.getFirstSelectedOption();
		System.out.println(firstoption.getText());  //total selected options getting value

	}

}
