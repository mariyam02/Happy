package Util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBaseclass {

	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBaseclass() {
		try {
			prop =new Properties();
			FileInputStream fis = new FileInputStream("C:\\Saira Maryam\\HRO\\Eclipse Testing\\mvproject"
					+ "\\src\\main\\java"
					+ "\\com\\qa\\config\\config.properties");
			prop.load(fis);
		}
		catch (IOException e) {
			e.getMessage();
		}}
			
		public static void initialization()
		{
			String browsername= prop.getProperty("browser");
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
			 driver =new ChromeDriver();
			 
			 driver.manage().window().maximize();
			 driver.manage().deleteAllCookies();
			 driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
			 driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
			 driver.get(prop.getProperty("url"));
		}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
}
