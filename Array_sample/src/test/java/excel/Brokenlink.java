package Array.Arraycommand;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.sql.DriverManager;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Brokenlink {
	public static void main(String[] args) throws IOException {


		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.railwireinternet.com/tamilnadu");
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		try {
			for (WebElement link : links) {
				String linkURL = link.getAttribute("href");
				
				URL url = new URL(linkURL);
				
				URLConnection urlconnection = url.openConnection();
				HttpURLConnection httpURlconnection = (HttpURLConnection) urlconnection;
				httpURlconnection.connect();
				
				if(httpURlconnection.getResponseCode()==200) {
					System.out.println(linkURL);
				}else {
					System.err.println(linkURL);
					httpURlconnection.disconnect();
				}
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("null point exception");
		}
		
		

	}
}














