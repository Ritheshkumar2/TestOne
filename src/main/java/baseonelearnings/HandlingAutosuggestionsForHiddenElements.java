package baseonelearnings;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAutosuggestionsForHiddenElements {

	private static WebDriver driver;
	
	public static void main(String[] args) {
		test();

	}

	private static void test() {
		driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(2));
		wait.until(ExpectedConditions.titleContains("Shopping"));
		
		WebElement element = driver.findElement(By.xpath("//input[@name='q']"));
//		//element.sendKeys("smartphone");
//		
//		wait.until(driver -> element.getAttribute("value").length()>0);
		
//		element.sendKeys(Keys.ARROW_DOWN);
//		element.sendKeys(Keys.ARROW_DOWN);
//		element.sendKeys(Keys.ENTER);
		
//		for(int i=1;i<4;i++) {//if i want to click 10th value this will be help full
//			element.sendKeys(Keys.ARROW_DOWN);
//		}
//		element.sendKeys(Keys.ENTER);
		
		Actions action=new Actions(driver);
		action.moveToElement(element)
	       .click()
	       .sendKeys("smartphone")
	       .pause(Duration.ofSeconds(2))
	       // navigate suggestions by index
	       .sendKeys(Keys.ARROW_DOWN)
	       .sendKeys(Keys.ARROW_DOWN)
	       .sendKeys(Keys.ARROW_DOWN)
	       .sendKeys(Keys.ENTER)
	       .build()
	       .perform();
		
		
		driver.quit();
		
		
		
	}

}
