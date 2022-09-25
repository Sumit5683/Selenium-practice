package TestNG;

import org.testng.annotations.Test;

public class J2_ScreenShot_Listener extends J1_Screenshot_Base {
	
	@Test
	public void launchapp() {
		driver.get("https://www.ebay.com/");
	}

}
