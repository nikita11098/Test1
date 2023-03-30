package paraPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

	@FindBy(id="customer.firstName")private WebElement fname;
	@FindBy(id="customer.lastName")private WebElement lname;
	@FindBy(id="customer.address.street")private WebElement add;
	@FindBy(id="customer.address.city")private WebElement city;
	@FindBy(id="customer.address.state")private WebElement state;
	@FindBy(id="customer.address.zipCode")private WebElement zcode;
	@FindBy(id="customer.phoneNumber")private WebElement phone;
	@FindBy(id="customer.ssn")private WebElement ssn;
	@FindBy(id="customer.username")private WebElement uname;
	@FindBy(id="customer.password")private WebElement pword;
	@FindBy(id="repeatedPassword")private WebElement cpword;
	@FindBy(xpath="//input[@value='Register']")private WebElement regbtn;
	
	
	public RegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setfname() {
		fname.sendKeys("Nikita");
	}
	public void setlname() {
		lname.sendKeys("Bacchav");
	}
	public void setadd() {
		add.sendKeys("D2-201,Ambika Township,Dindoli");
	}
	public void setcity() {
		city.sendKeys("Surat");
	}
	public void setstate() {
		state.sendKeys("Maharashtra");
	}
	public void setzcode() {
		zcode.sendKeys("394210");
	}
	public void setphone() {
		phone.sendKeys("9168089677");
	}
	public void setssn() {
		ssn.sendKeys("123");
	}
	public void setuname() {
		uname.sendKeys("nikitabacchav11098");
		
	}
	public void setpword() {
	    pword.sendKeys("Nikita@123");
	}
	
	public void setcpword() {
		cpword.sendKeys("Nikita@123");
	}
 	public void clickregbtn() {
 		regbtn.click();
 	}
	}
	
	
	
	
	
	
	
	