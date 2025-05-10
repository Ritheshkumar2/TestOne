import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v129.page.model.Screenshot;
import org.testng.annotations.Test;



@Test
public class TakeSS {

	public static WebDriver driver;
	public void test() {
		// TODO Auto-generated method stub
		
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		//shutter bug library
		//Shutterbug.shootpage(driver,Capture.FULL,true);
		
		//SHot library
        driver.quit();
				
	}

}
