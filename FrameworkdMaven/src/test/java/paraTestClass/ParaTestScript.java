package paraTestClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import paraPages.Homepage;
import paraPages.RegistrationPage;
import paraPages.WelcomePage;

public class ParaTestScript {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://parabank.parasoft.com/parabank/register.htm");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    Homepage h=new Homepage(driver);
	    h.clickOnRegister();
	    
	    RegistrationPage r=new RegistrationPage(driver);
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
	    
	    WelcomePage w=new WelcomePage(driver);
	    w.gettext();
	    
	    
	    
	    
	    		
	}
	

}
