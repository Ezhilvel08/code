package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class My10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\EZHIL\\eclipse-workspace\\selenium\\lib\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		
		//open multiple window
		WebElement multiplewindow = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		multiplewindow.click();
		int numberofwindow = driver.getWindowHandles().size();
		System.out.println("number of window open:"+numberofwindow);
		
	}

}
