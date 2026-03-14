package snippets;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	private static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		test();

	}

	private static void test() throws IOException {
		driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/demos/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for(WebElement link:links) {
			String hreflinks=link.getAttribute("href");
			
			if(hreflinks == null ) {
				continue;
			}
			
			URL url=new URL(hreflinks);
			HttpURLConnection http=(HttpURLConnection) url.openConnection();
			http.setConnectTimeout(2000);
			http.connect();
			int responsecode=http.getResponseCode();
			
			if(responsecode >= 400) {
				System.out.println("BrokenLink->"+hreflinks+"->"+responsecode);
			}else {
				
				System.out.println("Not a BrokenLink->"+hreflinks+"->"+responsecode);
				
			}
		}
		driver.quit();
		
	}

}
