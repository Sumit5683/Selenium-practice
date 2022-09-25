package tutorial1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dynamic_Webtable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/table.html");
		
		List<WebElement> rows = driver.findElements(By.xpath("/html/body/table/tbody/tr"));
		System.out.println("number of rows"+rows.size());
		
		List<WebElement> elements = driver.findElements(By.xpath("/html/body/table/tbody/tr/td"));
		System.out.println("total number of elements present : "+elements.size()+"\nelement present at 5 : "+elements.get(5).getText()+" | ");
		for(int i=0; i<elements.size(); i++) {
			System.out.print(elements.get(i).getText()+" | ");
		}
		
		List<WebElement> columns = driver.findElements(By.xpath("/html/body/table/tbody/tr[1]/td"));
		System.out.println("\nnumber of columns : "+columns.size());
		
		for(int i=1; i<=rows.size(); i++) {
			for(int j=1; j<= driver.findElements(By.xpath("/html/body/table/tbody/tr["+i+"]/td")).size(); j++) {
				 String element = driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				 System.out.print(element+" | ");
			}
			System.out.println();
		}
		
	}
}
