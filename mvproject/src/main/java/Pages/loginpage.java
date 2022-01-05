package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Util.TestBaseclass;

public class loginpage extends TestBaseclass {

	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//body/div[@id='ui']/div[1]/div[1]/form[1]/div[1]/div[3]")
	WebElement signin;
	
	//initializing pageobject
	public loginpage() {
		PageFactory.initElements(driver, this);//this means it intializes all findby avail above
	}
	//actions
	
public String validateloginPage()
	{
	 return driver.getTitle();
	
}
public homepage login(String un, String Pwd) {
	username.sendKeys(un);
	password.sendKeys(Pwd);
password.sendKeys(Keys.ENTER);		
	return new homepage();
}  
}