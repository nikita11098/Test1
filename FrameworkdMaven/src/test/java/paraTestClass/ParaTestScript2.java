package paraTestClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BrowserFactory.BaseClass;
import Excel.ExcelReader;
import paraPages.Homepage;
import paraPages.RegistrationPage;
import paraPages.RegistrationPage2;
import paraPages.WelcomePage;

public class ParaTestScript2 {
	WebDriver driver;
	BaseClass b;
	Homepage h;
	RegistrationPage2 r;
	WelcomePage w;
	
       @BeforeClass
       public void OpenBrowser() {
    	   b=new BaseClass();
    	   driver=b.OpenChromeBrowser();
    	   
       }
       @DataProvider
       public Object[][] getData() throws EncryptedDocumentException, IOException {
    	   ExcelReader E=new ExcelReader();
    	   Object[][] data = E.getTestData();
    	  return data; 
    	   
       }
       
       
       
	    @Test(dataProvider="getData")
	    public void RegistrationData(String Fname,String Lname,String Address,String City,String State,String Zip,String Phone,String SSN,String UserName,String Password,String Cpassword) {
	    h=new Homepage(driver);
	    h.clickOnRegister();
       
	    
	    r=new RegistrationPage2(driver);
	    r.setfname(Fname);
	    r.setlname(Lname);
	    r.setadd(Address);
	    r.setcity(City);
	    r.setstate(State);
	    r.setzcode(Zip);
	    r.setphone(Phone);
	    r.setssn(SSN);
	    r.setuname(UserName);
	    r.setpword(Password);
	    r.setcpword(Cpassword);
	    r.clickregbtn();
	    
	    w=new WelcomePage(driver);
	    String Actual=w.gettext();
        String Expected="Your account was created successfully. You are now logged in.";
	    Assert.assertEquals(Actual, Expected);
	    
	    w.Logout();
	    }
	    
	    
	   @AfterClass
	   public void closeBrowser() {
		   b.closeBrowser(driver);

	
		
	}
	

}
