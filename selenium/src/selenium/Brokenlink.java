package selenium;

import java.util.Iterator;
import java.util.List;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;

public class Brokenlink {

	public static void main(String[] args) {
		
		
        String url = "";
        HttpURLConnection huc = null;
        int respCode = 200;
		System.setProperty("webdriver.edge.driver","C:\\Users\\EZHIL\\eclipse-workspace\\selenium\\lib\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));

		Iterator<WebElement> it = links.iterator();

		while(it.hasNext()){

		url = it.next().getAttribute("href");

		System.out.println(url);

		if(url == null || url.isEmpty()){
		System.out.println("URL is either not configured for anchor tag or it is empty");
		continue;
		}

		if(!url.startsWith("https://www.google.com/")){
		System.out.println("URL belongs to another domain, skipping it.");
		continue;
		}

		try {
		huc = (HttpURLConnection)(new URL(url).openConnection());

		huc.setRequestMethod("HEAD");

		huc.connect();

		respCode = huc.getResponseCode();

		if(respCode >= 400){
		System.out.println(url+" is a broken link");
		}
		else{
		System.out.println(url+" is a valid link");
		}

		} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		}

		driver.quit();

		
	}

}
