package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class My11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\EZHIL\\eclipse-workspace\\selenium\\lib\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.manage().window().maximize();

		String oldwindow=driver.getWindowHandle();
		WebElement newwindow = driver.findElement(By.id("color"));
		newwindow.click();
		
		Set<String> newwindow1 = driver.getWindowHandles();
		for (String windows : newwindow1) {
			if(!windows.equals(oldwindow)) {
				driver.switchTo().window(windows);
				driver.close();
			}
		}
		

	}

}
