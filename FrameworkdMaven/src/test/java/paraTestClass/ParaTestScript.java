package paraTestClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BrowserFactory.BaseClass;
import paraPages.Homepage;
import paraPages.RegistrationPage;
import paraPages.WelcomePage;

public class ParaTestScript {
	WebDriver driver;
	BaseClass b;
	Homepage h;
	RegistrationPage r;
	WelcomePage w;
	
       @BeforeClass
       public void OpenBrowser() {
    	   b=new BaseClass();
    	   driver=b.OpenChromeBrowser();
    	   
       }
	    @Test
	    public void RegistrationData() {
	    h=new Homepage(driver);
	    h.clickOnRegister();
       
	    
	    r=new RegistrationPage(driver);
	    r.setfname();
	    r.setlname();
	    r.setadd();
	    r.setcity();
	    r.setstate();
	    r.setzcode();
	    r.setphone();
	    r.setssn();
	    r.setuname();
	    r.setpword();
	    r.setcpword();
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
