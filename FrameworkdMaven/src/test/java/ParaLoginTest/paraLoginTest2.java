package ParaLoginTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BrowserFactory.BaseClass;
import Excel.ExcelLogin;

import ParaLogin.LoginHomePage2;
import ParaLogin.LoginWelcomePage;
import Screenshot.Screenshot;
import junit.framework.Assert;

public class paraLoginTest2 {
	
	 WebDriver driver;
	BaseClass b;
	LoginHomePage2 l2;
	LoginWelcomePage lw;
	Screenshot s;
	String TCID;
	
	@BeforeClass
	public void openBrowser() {
		b=new BaseClass();
		driver=b.OpenChromeBrowser();
	}
	
	@DataProvider
	public Object[][] fetchData() throws EncryptedDocumentException, IOException {
		ExcelLogin  el=new ExcelLogin();
		Object[][]logindata=el.GetLoginData();
		return logindata;
		
	}
	
    @Test(dataProvider="fetchData")
    public void logindata(String Username,String Password) throws IOException {
    	try{
    	l2=new LoginHomePage2(driver);
    	l2.setUsername(Username);
    	l2.setPassword(Password);
    	l2.ClickOnLoginbtn();
    	
    	lw=new LoginWelcomePage(driver);
    	String Actual=lw.VerifyText();
    	String Expected="Accounts Overview";
    	Assert.assertEquals(Actual, Expected);
   }
   catch(Exception E) {
	   E.printStackTrace();
    	s=new Screenshot();
    	s.takescheenshot(driver,  TCID);
    	
   }
    	lw.clickOnLogoutbtn();
    	
    
    }
    
    @AfterClass
    public void close() {
    	b.closeBrowser(driver);
    }
}
