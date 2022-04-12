package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mymousehover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\EZHIL\\eclipse-workspace\\selenium\\lib\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.get("http://www.leafground.com/pages/mouseOver.html");
		driver.manage().window().maximize();

		WebElement mousehover = driver.findElement(By.className("btnMouse"));
		Actions action = new Actions(driver);
		action.contextClick(mousehover).perform();
		
		WebElement webservice = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div/div[5]/ul/li/ul/li[3]/a"));
		webservice.click();
		
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

}
