package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class My9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver","C:\\Users\\EZHIL\\eclipse-workspace\\selenium\\lib\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.manage().window().maximize();

		//1,Click button to open home page in New Window
		String oldwindow=driver.getWindowHandle();
		WebElement homepage = driver.findElement(By.id("home"));
		homepage.click();

		Set<String> handles=driver.getWindowHandles();
		for (String newwindow : handles) {
			driver.switchTo().window(newwindow);

		}

		WebElement editbox = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a/img"));
		editbox.click();
		driver.close();
	}

}
