package baseonelearnings;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SwitchWindowsConcept {

	public static void main(String[] args) throws InterruptedException {
		
		test();

	}

	private static void test() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");	
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(3));
		
		System.out.println(driver.getCurrentUrl()); 	
		WebElement popButton=driver.findElement(By.xpath("//*[contains(text(),'Popup Windows')]"));
		wait.until(ExpectedConditions.visibilityOf(popButton));
		popButton.click();
		
		String pw=driver.getWindowHandle();
		Set<String> cws=driver.getWindowHandles();
		
		Iterator<String> itr=cws.iterator();
		while(itr.hasNext()) {
			String cw=itr.next();
			
			driver.switchTo().window(cw);
			 // wait until title is not empty
			
	        wait.until(driver1 -> !driver1.getTitle().isEmpty());

	        String title = driver.getTitle();

	        if (title.contains("Playwright")) {
	            System.out.println("First child window: " + driver.getCurrentUrl()); 
	            driver.close();
	            
	        }
	        else if (title.contains("Selenium")) {
	            System.out.println("Second child window: " + driver.getCurrentUrl());
	            driver.close();
	            
	        }
			
		}
		driver.switchTo().window(pw);
		Assert.assertEquals(driver.getTitle(),"Automation Testing Practice");
		driver.quit();
		
	}

}
