package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Mysecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\EZHIL\\eclipse-workspace\\selenium\\lib\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.get("https://testproject.io/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='login']")).click();
		
	}

}
