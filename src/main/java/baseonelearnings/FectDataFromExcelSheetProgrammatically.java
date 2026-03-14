package baseonelearnings;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FectDataFromExcelSheetProgrammatically {

	static Object[][] test(String filepath,String sheetName) throws EncryptedDocumentException, IOException {
		Object[][] data=null;
		
		FileInputStream fis=new FileInputStream(filepath);
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet(sheetName);
		
		int totalrows=sheet.getPhysicalNumberOfRows();
		int totalcols=sheet.getRow(0).getPhysicalNumberOfCells();
		
		data=new Object[totalrows-1][totalcols];
		
		for(int i=1;i<totalrows;i++) {
			Row row=sheet.getRow(i);
			for(int j=0;j<totalcols;j++) {
				data[i-1][j]=row.getCell(j).toString();
			}
		}
		workbook.close();
	    fis.close();
		
		return data;
	}
	

}
