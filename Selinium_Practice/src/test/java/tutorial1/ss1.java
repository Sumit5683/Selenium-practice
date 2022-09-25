package tutorial1;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ss1 {
//	static Date date = new Date();
//	static String date1 = date.toString().replace(" ", "_").replace(":", "-");
	public static WebDriver driver;
//	public 	static File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	public static File path = new File("C:\\Users\\dell\\Pictures\\selenium\\Screenshot"+date1+".jpg");

	public static void screesnshot() throws IOException {
		Date date = new Date();
		String date1 = date.toString().replace(" ", "_").replace(":", "-");
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File path = new File("C:\\Users\\dell\\Pictures\\selenium\\Screenshot"+date1+".jpg");
		FileHandler.copy(source, path);
	}
}
