package tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
//		get number of rows present in webtable
		int rows = driver.findElements(By.xpath("(//table[@id='countries']//tr)")).size();
		System.out.println("Total number of Rows : " + rows);

//		get number of columns present in webtable
		int columns = driver.findElements(By.xpath("//table[@id='countries']//tr[1]//td")).size();
		System.out.println("Total number of Columns : " + columns);

//		retrive the specific cell data
		String celldata = driver.findElement(By.xpath("(//table[@id='countries']//tr[54])/td[5]")).getText();
		System.out.println("Data of the cell : " + celldata);
		int count = 1;

//		retrive all data from the table
		for (int i = 1; i <= rows; i++) {

			for (int j = 1; j <= driver.findElements(By.xpath("//table[@id='countries']//tr[" + i + "]//td")).size(); j++) {
				String s = driver.findElement(By.xpath("(//table[@id='countries']//tr[" + i + "])/td[" + j + "]")).getText();
				if (s == driver.findElement(By.xpath("(//table[@id='countries']//tr[" + i + "])/td[1]")).getText()) {
					System.out.print(count);
					count++;
				}
				System.out.print(s + " | ");
			}
			System.out.println();
		}

	}

}
