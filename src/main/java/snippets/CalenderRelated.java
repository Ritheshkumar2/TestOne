package snippets;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalenderRelated {
	
	private static WebDriver driver;

	public static void main(String[] args) {
		test();

	}

	private static void test() {
		 driver = new ChromeDriver();
	        driver.get("https://jqueryui.com/datepicker/");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

	        driver.findElement(By.id("datepicker")).click();

	        String targetMonthYear = "May 2028";

	        while (true) {
	            String month = driver.findElement(By.className("ui-datepicker-month")).getText();
	            String year = driver.findElement(By.className("ui-datepicker-year")).getText();
	            String currentMonthYear = month + " " + year;

	            if (currentMonthYear.equalsIgnoreCase(targetMonthYear)) {
	                break;
	            }

	            driver.findElement(By.xpath("//a[@data-handler='next']")).click();
	        }

	        driver.findElement(By.xpath("//a[text()='21']")).click();

	        System.out.println(driver.findElement(By.id("datepicker")).getAttribute("value"));

	        driver.quit();
	}
}
