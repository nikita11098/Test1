package paraPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	@FindBy(xpath="//p[text()=\"Your account was created successfully. You are now logged in.\"]")private WebElement text;
	@FindBy(xpath="//a[text()=\"Log Out\"]")private WebElement logout;
	
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String gettext() {
		String Actual=text.getText();
		return Actual;
	
	}
   public void Logout() {
	   logout.click();
	   
   }
}
