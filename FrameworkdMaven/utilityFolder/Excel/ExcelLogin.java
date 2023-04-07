package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLogin {
	public Object[][] GetLoginData() throws EncryptedDocumentException, IOException {
		FileInputStream file1=new FileInputStream("\\C:\\Users\\LENOVO\\OneDrive\\Desktop\\ParabankTest.xlsx\\");
		Sheet sh1 = WorkbookFactory.create(file1).getSheet("Sheet2");
		Object[][]data=new Object[sh1.getLastRowNum()][sh1.getRow(0).getLastCellNum()];
		
		for(int i=0;i<sh1.getLastRowNum();i++) {
			for(int j=0;j<sh1.getRow(0).getLastCellNum();j++)
			{
				data[i][j]=sh1.getRow(i+1).getCell(j).toString();
				
			}
		}
		return data;
	}
	
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	ExcelLogin el=new ExcelLogin();
	System.out.println(el.GetLoginData());
}
}
