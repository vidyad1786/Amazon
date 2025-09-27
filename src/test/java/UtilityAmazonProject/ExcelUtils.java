package UtilityAmazonProject;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtils {

	public static Object[][] fetchCredentials() throws EncryptedDocumentException, IOException {
		FileInputStream s1 = new FileInputStream(
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\ExcelSheet\\dataforprojectamazon.xlsx");
		Workbook wb = WorkbookFactory.create(s1);
		String un = wb.getSheet("login").getRow(1).getCell(0).getStringCellValue();
		System.out.println(un);
		String pwd = wb.getSheet("login").getRow(1).getCell(1).getStringCellValue();
		System.out.println(pwd);
		
		String prod1 = wb.getSheet("login").getRow(1).getCell(2).getStringCellValue();
		System.out.println(prod1);
		
		
		//Object[][] credentials = { {un, pwd} };
		Object[][] credentials =new Object[1][3];
		credentials[0][0] = un;
		credentials[0][1] = pwd;
		credentials[0][2] = prod1;

		return credentials;
	}
	
	
	
}
