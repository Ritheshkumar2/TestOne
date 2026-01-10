package pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import utils.ConfigFile;
import utils.ScreenShotUtil;

public class LoginPage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver,Duration.ofSeconds(3));
	}
	
	@FindBy(xpath="//a[contains(text(),'About')]")
	WebElement about;
	
	public void loginpage() throws IOException {
		System.out.println("LoginPage:"+ about.getText());
		wait.until(ExpectedConditions.elementToBeClickable(about));
		about.click();
		ScreenShotUtil.takeScreenShotMethod(driver, "homepage");
		System.out.println("URL:"+driver.getCurrentUrl());
		String userdetails=ConfigFile.getProperty("user");
		System.out.println(userdetails);
	}

	public void failtestcase() {
		Assert.fail();
	}
}
