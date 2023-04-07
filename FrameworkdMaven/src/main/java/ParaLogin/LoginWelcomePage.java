package ParaLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginWelcomePage {

	@FindBy(xpath="//h1[@class='title']")private WebElement text;
	@FindBy(xpath="//a[text()='Log Out']")private WebElement Logout;
	
	public LoginWelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public String VerifyText() {
		String Actual=text.getText();
		System.out.println(Actual);
		return Actual; 
	
	}
	public void clickOnLogoutbtn() {
		Logout.click();
	}
	
}
