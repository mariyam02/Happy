package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import Util.TestBaseclass;

public class homepage extends TestBaseclass {

	@FindBy(xpath="//body/div[@id='ui']/div[1]/div[1]/div[3]/a[1]/i[1]")
	WebElement contact;
	
	
	public String verifyhomepage() {
		return driver.getTitle();
		
	}
	
	public void add() {
		System.out.println("abc");
	}
	public void sub() {
		System.out.println("abc");
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
