package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader {
	public  Object[][] getTestData() throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\LENOVO\\OneDrive\\Desktop\\ParabankTest.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		Object[][] data = new Object[sh.getLastRowNum()][sh.getRow(0).getLastCellNum()];
	
		for(int i=0;i<sh.getLastRowNum();i++) {
			for(int j=0;j<sh.getRow(0).getLastCellNum();j++) {
				
				data[i][j]= sh.getRow(i+1).getCell(j).toString();
			}
		}
	
	return data;
	}

	
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		ExcelReader E = new ExcelReader();
		System.out.println(E.getTestData());
	}
}
