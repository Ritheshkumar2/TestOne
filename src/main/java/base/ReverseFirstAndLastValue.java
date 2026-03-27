package base;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReverseFirstAndLastValue {

	public static void main(String[] args) throws IOException {
		//testwithStrings();
		//testwithoutStrings();
		//duplicateelementsinanArray();
		brokenlinks();

	}

	private static void brokenlinks() throws IOException {
		WebDriver driver;
		
		driver = new ChromeDriver();

		driver.get("https://example.com");

		List<WebElement> links = driver.findElements(By.tagName("a"));

		for (WebElement link : links) {

			String href = link.getAttribute("href");
			
			
			if (href == null || href.isEmpty() || href.startsWith("javascript")) {
				continue;
			}

			URL url = new URL(href);

			HttpURLConnection http = (HttpURLConnection) url.openConnection();
			http.setConnectTimeout(5000);
			http.connect();

			int statusCode = http.getResponseCode();

			if (statusCode >= 400) {
				System.out.println("Broken Link: " + href + " --> " + statusCode);
			} else {
				System.out.println("Valid Link: " + href + " --> " + statusCode);
			}
		}

		
	}

	private static void duplicateelementsinanArray() {
		int arr[]= {1,2,3,4,1,2};
		
		boolean[] visited=new boolean[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			int count=1;
			if(visited[i]) {
				continue;
			}
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					count++;
					visited[j]=true;
				}
			}
			if(count>1) {
				System.out.print(arr[i]+" ");
			}
			}
		
		
		
		
	}

	private static void testwithoutStrings() {
		int num=12345;
		
		int temp=num;
		int last=num%10;
		
		//if we use num instead of temp, it print 0, because if you are making num=0 bu counting the digits later it cannot be used.
		
		//count digits
		int digit=0;
		while(temp>0) {
			digit++;
			temp=temp/10;
		}
		//first digit
		int first=(int) (num/Math.pow(10, digit-1));
		//middle part
		int middle=(int) (num% Math.pow(10, digit-1));
		middle=middle/10;
		
		// Step 5 → build result
		int result = last * (int) Math.pow(10, digit - 1)
				+ middle * 10
				+ first;
		System.out.print(result);	
		
	}

	private static void testwithStrings() {
		int num=12345;
		
		String value=String.valueOf(num);
		
		char first=value.charAt(0);
		char last=value.charAt(value.length()-1);
		
		String middle=value.substring(1, value.length()-1);
		
		String finalstring=last+middle+first;
		
		System.out.print(finalstring);
		
	}

}
