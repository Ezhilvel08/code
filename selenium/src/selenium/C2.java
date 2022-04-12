package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class C2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\EZHIL\\eclipse-workspace\\selenium\\lib\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		//driver.get("https://demo.guru99.com/test/");
		driver.get("https://demos.telerik.com/kendo-ui/datetimepicker/index");
		driver.manage().window().maximize();
		
		// guru99
		//WebElement datepicker = driver.findElement(By.xpath("//input[@name='bdaytime']"));
		//datepicker.sendKeys("02040020220930");
		//datepicker.sendKeys(Keys.TAB);
		//datepicker.sendKeys("0930");
		//WebElement botton = driver.findElement(By.xpath("//input[@type='submit']"));
		//botton.click();
		
		//jquery
		WebElement datepicker = driver.findElement(By.xpath("//*[@id=\"example\"]/div/span/button[2]/span"));
		datepicker.click();
		WebElement next = driver.findElement(By.xpath("//a[@data-action='next']"));
		next.click();
		WebElement date = driver.findElement(By.xpath("//a[@title='Friday, March 04, 2022']"));
		date.click();
		WebElement timebt = driver.findElement(By.xpath("//button[@aria-label='Open the time view']"));
		timebt.click();
		WebElement time = driver.findElement(By.xpath("//*[@id=\"datetimepicker_timeview\"]/li[13]"));
		time.click();
	}

}
