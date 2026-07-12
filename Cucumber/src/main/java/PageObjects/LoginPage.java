package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="username")
	WebElement txt_email;
	
	@FindBy(name="password")
	WebElement txt_password;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement btn_login;	

	
	public void enterPassword(String pwd) {
		txt_password.sendKeys(pwd);
	}
	
	public void submit() {
		btn_login.click();
	}

	public void enterUserName(String uname) {
		// TODO Auto-generated method stub
		txt_email.sendKeys(uname);
	}
}
