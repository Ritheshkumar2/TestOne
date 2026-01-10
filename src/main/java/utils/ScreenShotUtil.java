package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShotUtil {
	
	public static void takeScreenShotMethod(WebDriver driver,String filename) throws IOException {
	
		TakesScreenshot ts=(TakesScreenshot) driver;	
		File source=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(System.getProperty("user.dir")+"/screenshots/"+filename+".png");
		FileUtils.copyFile(source, dest);
	}

}
