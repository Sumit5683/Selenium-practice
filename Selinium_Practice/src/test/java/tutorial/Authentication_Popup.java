package tutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Authentication_Popup {

/*	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://the-internet.herokuapp.com/basic_auth");      //without handling it looks like as this
//		https://admin:admin@the-internet.herokuapp.com/basic_auth  --we can directly use authorization through url thats the one way to handle it
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		*/
	public static String username = "admin";
	public static String password = "admin";
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://"+username+":"+password+"@the-internet.herokuapp.com/basic-auth");  //antoher way to handle

	}

}
