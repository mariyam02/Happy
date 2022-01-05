package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Util.TestBaseclass;

public class LeavePage extends TestBaseclass {

	public void clikonLeaveIcon() {
		Actions actions =new Actions(driver);
		WebElement a= driver.findElement(By.xpath("//body/payasia-root[1]/app-employee[1]/div[1]/app-sidebar[1]/aside[1]/section[1]/ul[1]/li[3]/a[1]/i[1]"));
		
		actions.moveToElement(a).build().perform();
		a.click();
	
	}
	public void EmployeeLEave()
	{
		WebElement empleave = driver.findElement(By.xpath("//span[contains(text(),'Employee Leave')]"));
		empleave.click();
	}
	public void applyleave() throws InterruptedException {
		WebElement applyleave = driver.findElement(By.xpath("//span[contains(text(),'Apply Leave')]"));
		applyleave.click();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		System.out.println("applying leave here now");
		
		
		
		
		
		
		
		Select s = new Select(driver.findElement(By.xpath("//body/payasia-root[1]/app-employee[1]/div[1]/div[1]/app-leave[1]/section[1]/div[2]/div[1]/app-myrequest[1]/div[2]/div[1]/div[1]/app-manage-apply-leave[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/p-dropdown[1]/div[1]/label[1]")));
		
		s.selectByVisibleText("1stchild");
	      Thread.sleep(1000);
		
		
		
		//WebElement testDropDown = driver.findElement(By.xpath("//body/payasia-root[1]/app-employee[1]/div[1]/div[1]/app-leave[1]/section[1]/div[2]/div[1]/app-myrequest[1]/div[2]/div[1]/div[1]/app-manage-apply-leave[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/p-dropdown[1]/div[1]/label[1]"));
		//testDropDown.click();
		//Thread.sleep(3000);
		//Select dropdown = new Select(new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("body.sidebar-mini.sidebar-collapse.modal-open:nth-child(2) app-employee.ng-star-inserted:nth-child(3) div.wrapper:nth-child(1) div.content-wrapper:nth-child(4) app-leave.ng-star-inserted:nth-child(3) section.container-fluid:nth-child(2) div.row:nth-child(2) div.col-12 app-myrequest.ng-star-inserted:nth-child(2) div.row.position-relative:nth-child(2) div.col-12 div.row div.modal.right.fade.panel-from-right-side.in.show:nth-child(1) div.modal-dialog:nth-child(1) div.modal-content div.modal-body div.form-group:nth-child(3) div.row div.col-6 p-dropdown.ng-tns-c10-18.ui-inputwrapper-filled.ng-valid.ng-touched.ng-dirty:nth-child(2) > div.ng-tns-c10-18.ui-dropdown.ui-widget.ui-state-default.ui-corner-all.ui-helper-clearfix.ui-dropdown-open")))); 
		///testDropDown.click();
		//dropdown.selectByVisibleText("1stchild");
		
		//WebElement element = driver.findElement(By.xpath("//div[@class='footer']"));
		//Actions actions = new Actions(driver);
		//actions.moveToElement(element).click().build().perform();
	
		//WebElement fromdate= driver.findElement(By.xpath("//body/payasia-root[1]/app-employee[1]/div[1]/div[1]/app-leave[1]/section[1]/div[2]/div[1]/app-myrequest[1]/div[2]/div[1]/div[1]/app-manage-apply-leave[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/app-calendar[1]/p-calendar[1]"));
//	fromdate.sendKeys(Keys.ARROW_DOWN.ENTER);
		
	//WebElement todate= driver.findElement(By.xpath("//body/payasia-root[1]/app-employee[1]/div[1]/div[1]/app-leave[1]/section[1]/div[2]/div[1]/app-myrequest[1]/div[2]/div[1]/div[1]/app-manage-apply-leave[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[1]/app-calendar[1]/p-calendar[1]/span[1]/input[1]"));
	//todate.sendKeys(Keys.ARROW_DOWN.ENTER);
	driver.findElement(By.xpath("//body/payasia-root[1]/app-employee[1]/div[1]/div[1]/app-leave[1]/section[1]/div[2]/div[1]/app-myrequest[1]/div[2]/div[1]/div[1]/app-manage-apply-leave[1]/div[1]/div[1]/div[1]/div[3]/button[1]")).click();
	
	}
	
	
	
	
	
}
