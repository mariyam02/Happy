package stepdefintions;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;

import Pages.LeavePage;
import Pages.homepage;
import Pages.loginpage;
import Util.TestBaseclass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomepageSteps extends TestBaseclass{
	
	loginpage loginpage;
	homepage homepage;
	LeavePage leavepage;
	@Given("^user opens browser$")
	public void user_opens_browser() throws Throwable {
	    TestBaseclass.initialization();
	   
	}

	@Then("^user is on loginpage$")
	public void user_is_on_loginpage() throws Throwable {
		loginpage =new loginpage();
	 String Title=    loginpage.validateloginPage();
	 assertEquals("PayAsia", Title);
	 System.out.println(Title);
	}

	@Then("^user logs into app$")
	public void user_logs_into_app() throws Throwable {
	homepage=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	}

	
	@Then("^validate title of the homepage$")
	public void validate_title_of_the_homepage() throws Throwable {
		 String hometitle= homepage.verifyhomepage();
		    Assert.assertEquals("PayAsia", hometitle);
	}
	
	@Then("^user enters the apply leave page$")
	public void user_enters_the_apply_leave_page() throws Throwable {
	   LeavePage l= new LeavePage();
	   l.clikonLeaveIcon();
	   l.EmployeeLEave();
	   l.applyleave();
	  
	}

	
	
}
