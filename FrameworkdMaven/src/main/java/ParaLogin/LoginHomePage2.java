package ParaLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginHomePage2 {
	@FindBy(xpath="//input[@name='username']")private WebElement Lusername;
	@FindBy(xpath="//input[@name='password']")private WebElement Lpassword;
	@FindBy(xpath="//input[@value='Log In']")private WebElement Loginbtn;
	
public LoginHomePage2(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
 public void setUsername(String Username) {
	 Lusername.sendKeys(Username);
 }
 public void setPassword(String Password) {
	 Lpassword.sendKeys(Password);
 }
 public void ClickOnLoginbtn() {
	 Loginbtn.click();
 }

}
 