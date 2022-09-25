package tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radio_Button {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/flights/?utm_source=google&utm_medium=cpc&utm_campaign=DF-Brand-EM&utm_adgroup=Only%20Goibibo&utm_term=!SEM!DF!G!Brand!RSA!108599293!6504095653!602838584772!e!goibibo!c!&gclid=CjwKCAjwtcCVBhA0EiwAT1fY7xRX6rwsImW25WehW9s7lhwhysxIkH5b0izfMYep3MzVqZkAZlGcDRoCBqEQAvD_BwE");
		
		driver.findElement(By.xpath("//span[text()=\"Round-trip\"]")).click();
		System.out.println("Is the round trip selected? "+driver.findElement(By.xpath("//span[text()=\"Round-trip\"]")).isSelected());
		
		System.out.println("total radio buttons present : "+driver.findElements(By.xpath("//ul[@class=\"sc-fvNpTx eipoWL\"]")).size());

	}

}
