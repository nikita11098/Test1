package BrowserFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	
	public WebDriver OpenChromeBrowser() {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://parabank.parasoft.com/parabank/index.htm");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    return driver;
	}
	public void closeBrowser(WebDriver driver) {
		driver.quit();
	}

}
