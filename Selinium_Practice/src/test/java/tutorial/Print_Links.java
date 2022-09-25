package tutorial;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Print_Links {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.careerride.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("total number of links : "+links.size());
		
		for (int i=0; i<=links.size(); i++) {
			System.out.println(links.get(i).getAttribute("href"));
			System.out.println(links.get(i).getText());
		}
		
		List<WebElement> names = driver.findElements(By.xpath("/html/body/section/div/div[2]/div[1]/ul[3]"));
		System.out.println("total number of links : "+names.size());
		
		for (int i=0; i<=names.size(); i++) {
			System.out.println(names.get(i).getAttribute("href"));
			System.out.println(names.get(i).getText());
		}
		
//		dropdown options getting printed
	/*	driver.navigate().to("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		List<WebElement> options = driver.findElements(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select"));
		for(int i =0; i<=options.size(); i++) {
			System.out.println(options.get(i).getText());
		}*/
	}

}
