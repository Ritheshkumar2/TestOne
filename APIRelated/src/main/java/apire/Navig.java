package apire;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

@Test
public class Navig {
	
	
	public void test() throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://mvnrepository.com/");
		driver.manage().window().maximize();
		wait(2);
		
	
		
	
	}
}
