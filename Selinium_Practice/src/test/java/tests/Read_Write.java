package tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Read_Write {
	public static void main(String[] args) throws IOException {
		Properties properties = new Properties();
		FileInputStream inputstream = new FileInputStream("C:\\Users\\dell\\eclipse-workspace\\Selinium_Practice\\src\\main\\resources\\properties\\testdata.properties");
		properties.load(inputstream);
		String data = properties.getProperty("browser");
		System.out.println(data);
		System.out.println(properties.getProperty("url"));
		
		FileOutputStream outputstream = new FileOutputStream("C:\\\\Users\\\\dell\\\\eclipse-workspace\\\\Selinium_Practice\\\\src\\\\main\\\\resources\\\\properties\\\\testdata.properties");
		properties.setProperty("date", "2nd Apr 2022");
		properties.store(outputstream, "This is customer data");
		
		
	}

}
