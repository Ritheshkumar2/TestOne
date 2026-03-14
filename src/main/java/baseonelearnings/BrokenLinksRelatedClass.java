package baseonelearnings;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksRelatedClass {

	private static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		test();

	}

	private static void test() throws IOException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		for(WebElement link:links) {
			String href=link.getAttribute("href");
			// skip empty or invalid links
            if (href == null || href.isEmpty() || href.startsWith("javascript")) {
                continue;
            }
            
            try {
                URL url = new URL(href);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setConnectTimeout(5000);
                conn.connect();

                int responseCode = conn.getResponseCode();

                if (responseCode >= 400) {
                    System.out.println("Broken link : " + responseCode + " --> " + href);
                } else {
                    System.out.println("Valid link  : " + responseCode + " --> " + href);
                }

            } catch (Exception e) {
                System.out.println("Invalid URL : " + href);
            }

		}
		driver.close();
	}

}
