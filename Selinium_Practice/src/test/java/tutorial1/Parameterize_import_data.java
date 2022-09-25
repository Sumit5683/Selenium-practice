package tutorial1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameterize_import_data {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\dell\\Desktop\\guru99_1.xlsx");
		String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(2).getStringCellValue();
		System.out.println(data);

	}

}
