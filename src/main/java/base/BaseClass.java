package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	private static ThreadLocal<WebDriver> driver=new ThreadLocal<>();
	
	public static void setUpDriver() {
		if(driver.get() == null) {
			driver.set(new ChromeDriver());
		}
	}
	
	public static WebDriver getDriver() 
	{
		return driver.get();
	}
	
	public static void remove() {
		driver.remove();
		
	}

}
