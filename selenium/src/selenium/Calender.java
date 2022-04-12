package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\EZHIL\\eclipse-workspace\\selenium\\lib\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.leafground.com/pages/Calendar.html");
		driver.manage().window().maximize();

		WebElement calender = driver.findElement(By.id("datepicker")); 
		//calender.sendKeys("01/08/2022"+ Keys.ENTER);
		calender.click();
		
		WebElement next = driver.findElement(By.xpath("//a[@title='Next']"));
		next.click();
		
		WebElement date =driver.findElement(By.xpath("//a[contains(text(),'4')]"));
		date.click();
		
		System.out.println("ok");
	}

}
