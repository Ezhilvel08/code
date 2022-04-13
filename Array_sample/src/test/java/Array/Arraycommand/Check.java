package Array.Arraycommand;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Check {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.get("https://www.hyrtutorials.com//");
		driver.get("https://www.railwireinternet.com/tamilnadu");
		// driver.get("http://amazon.in/");

		List<String> activeLinks = new ArrayList<>();
		List<String> brokenLinks = new ArrayList<>();
		List<String> nulValue = new ArrayList<>();

		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println("Total Links Are " + links.size());

		int item = 0;
		int item2 = 0;
		int item3 = 0;

		for (WebElement link : links) {
			String linkURL = link.getAttribute("href");

			try {
				URL url = new URL(linkURL);

				URLConnection urlConnection = url.openConnection();
				HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;
				httpURLConnection.setConnectTimeout(5000);
				httpURLConnection.connect();
				if (httpURLConnection.getResponseCode() == 200) {
					activeLinks.add(item,linkURL);
					item++;
				}

				else {
					brokenLinks.add(item2, linkURL);
					item2++;
				}

				httpURLConnection.disconnect();

			} catch (Exception e) {

				nulValue.add(item3, linkURL);
			}

		}

		System.out.println("Total ActiveLinks Are " + activeLinks.size());
		System.out.println("Total brokenLinks Are " + brokenLinks.size());
		System.out.println("Total nulValues Are " + nulValue.size());

		File file = new File("D:\\excel-practices\\ezhil.xlsx");
		FileOutputStream fos = new FileOutputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet();
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("Active Links");
		sheet.getRow(0).createCell(1).setCellValue("Broken Links");
		sheet.getRow(0).createCell(2).setCellValue("NulValues");

		try {
			for (int i = 1; i < activeLinks.size(); i++) {

				sheet.createRow(i);

				sheet.getRow(i).createCell(0).setCellValue(activeLinks.get(i));

			}

			int rowIndex2 = 1;
			for (String link : brokenLinks) {

				sheet.getRow(rowIndex2).createCell(1).setCellValue(link);
				rowIndex2++;

			}

			for (int iterate3 = 1; iterate3 < nulValue.size(); iterate3++) {

				sheet.getRow(iterate3).createCell(3).setCellValue(nulValue.get(iterate3));

			}
		} catch (Exception e) {

		}

		workbook.write(fos);
		workbook.close();

		System.out.println("Excel File Created");
		driver.quit();
	}
}
