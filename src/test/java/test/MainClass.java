package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import listeners.RetryMechanism;
import pages.LoginPage;

public class MainClass extends BaseClass{
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		setUpDriver();
		driver=BaseClass.getDriver();
		driver.get("https://www.google.com/");
	}
	
	@Test(retryAnalyzer=listeners.RetryMechanism.class)
	public void testmethod() throws IOException {
		LoginPage page=new LoginPage(driver);
		page.loginpage();
		page.failtestcase();
	}
	
	@AfterTest
	public void teardown() {
		 if (driver != null) {
		        driver.quit();
		    }
		 remove();
	}

}
