package Array.Arraycommand;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Javatoxl {
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	    
		// find property
		FileReader fr = new FileReader(".\\config_folder\\railwire5");
		Properties pr = new Properties();
		pr.load(fr);
		
		// webdriver search
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		//driver.get("https://www.railwireinternet.com/tamilnadu");
		//driver.manage().window().maximize();
		String urlpath = pr.getProperty("URL");
		System.out.println("create url path : " + urlpath);
		driver.get(urlpath);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		
		String filepath = pr.getProperty("filelocation");
		System.out.println("file create path: " + filepath);
		File first = new File(filepath);
		//File f1 = new File("railwire3.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet();
		FileOutputStream file1 = new FileOutputStream(first);
		
		
		sheet.createRow(0);
		
		sheet.getRow(0).createCell(0).setCellValue("Active Links");
		sheet.getRow(0).createCell(1).setCellValue("non active Links");
		
		
		
		
		try {
			int i=1;
			int j=1;
			
			for (WebElement link : links) {
				String linkURL = link.getAttribute("href");
				URL url = new URL(linkURL);
				
				URLConnection urlconnection = url.openConnection();
				HttpURLConnection httpURlconnection = (HttpURLConnection) urlconnection;
				httpURlconnection.connect();
				
				sheet.createRow(i);
				if(httpURlconnection.getResponseCode()==200) {
					
						
					XSSFRow row = sheet.getRow(i);
					XSSFCell cell =row.createCell(0);
					cell.setCellValue(linkURL);
					i++;
					
			}
					else {
						
					XSSFRow row = sheet.getRow(j);
					XSSFCell cell =row.createCell(1);
					cell.setCellValue(linkURL);
					j++;
					
					httpURlconnection.disconnect();
				}
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("null point exception");
		}
		
		workbook.write(file1);	
		workbook.close();
		driver.quit();

		
	}

}
