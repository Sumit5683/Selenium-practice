package tutorial1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multiple_dropdown {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://makeseleniumeasy.com/2017/08/18/part-1-handling-drop-down-created-using-select-tag-in-selenium/");
		
		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"post-1975\"]/div/div/select[2]"));
		Select select = new Select(dropdown);
		select.selectByIndex(1);
		select.selectByIndex(2);
		select.selectByIndex(3);
		
		List<WebElement> languages = select.getAllSelectedOptions();
		System.out.println(languages.size());
		
		WebElement lang = select.getFirstSelectedOption();
		System.out.println(lang.getText());
		
		for (int i=0; i<select.getOptions().size(); i++) {
			System.out.print(select.getOptions().get(i).getText()+", ");
		}

	}

}
