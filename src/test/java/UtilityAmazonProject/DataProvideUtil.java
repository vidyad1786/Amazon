package UtilityAmazonProject;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class DataProvideUtil {

	@DataProvider()
	public Object[][] credentials() throws EncryptedDocumentException, IOException {
		return ExcelUtils.fetchCredentials();
	}
	
	

	@DataProvider()
	public  Object[][] search() throws EncryptedDocumentException, IOException
	{
		FileInputStream fs=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\ExcelSheet\\dataforprojectamazon.xlsx");
		Workbook wb=		WorkbookFactory.create(fs);
		String d1	=		wb.getSheet("login").getRow(1).getCell(0).getStringCellValue();
		String d2	=		wb.getSheet("login").getRow(1).getCell(1).getStringCellValue();
	//	String d2	=		wb.getSheet().getrow.getcell.getstringfcellvalue;
	//	String d3	=		wb.getSheet().getrow.getcell.getstringfcellvalue;
	//	String d4	=		wb.getSheet().getrow.getcell.getstringfcellvalue;
	//	String d5	=		wb.getSheet().getrow.getcell.getstringfcellvalue;

		Object [][] data=new Object[3][2];
		data[0][0]=d1;
		data[0][1]=d2;
		
		data[1][0]="priya@gmail.com";
		data[1][1]="pssword";
		
		data[2][0]="ovee@gmail.com";
		data[2][1]="pssword";
		//data[2][0]=d3;
		//data[3][0]=d4;
		//data[4][0]=d5;
		
		return data;

	}
	
}
