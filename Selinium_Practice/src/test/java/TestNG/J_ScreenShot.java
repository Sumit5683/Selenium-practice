package TestNG;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class J_ScreenShot extends J1_Screenshot_Base {

	public static void main(String[] args) throws IOException {
		Date date = new Date();
		String filename = date.toString().replace(" ", "_").replace(":", "-");
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:\\Users\\dell\\Pictures\\"+filename+".jpg"));
	}
}
