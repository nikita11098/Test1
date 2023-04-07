package paraPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage2 {

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
	
	
	public RegistrationPage2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setfname(String Fname) {
		fname.sendKeys(Fname);
	}
	public void setlname(String Lname) {
		lname.sendKeys(Lname);
	}
	public void setadd(String Address) {
		add.sendKeys(Address);
	}
	public void setcity(String City) {
		city.sendKeys(City);
	}
	public void setstate(String State) {
		state.sendKeys(State);
	}
	public void setzcode(String Zip) {
		zcode.sendKeys(Zip);
	}
	public void setphone(String Phone) {
		phone.sendKeys(Phone);
	}
	public void setssn(String SSN) {
		ssn.sendKeys(SSN);
	}
	public void setuname(String UserName) {
		uname.sendKeys(UserName);
		
	}
	public void setpword(String Password) {
	    pword.sendKeys(Password);
	}
	
	public void setcpword(String Cpassword) {
		cpword.sendKeys(Cpassword);
	}
 	public void clickregbtn() {
 		regbtn.click();
 	}
	}
	
	
	
	
	
	
	
	