package baseonelearnings;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderRelated {
	
	
	@DataProvider(name="testvalues")
	public Object[][] testData() throws EncryptedDocumentException, IOException{
		String path = "C:\\Users\\Rithesh\\Desktop\\data.xlsx";
        String sheet = "Sheet1";
        
		return FectDataFromExcelSheetProgrammatically.test(path, sheet);
		
	}
	
	//in main class
	
	@Test(dataProvider="testvalues",dataProviderClass=DataProviderRelated.class)
	public void test(String username,String password) {
		System.out.println(username+"-"+password);
	}

}
