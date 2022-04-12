package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Frames {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\EZHIL\\eclipse-workspace\\selenium\\lib\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		
		//frame
		driver.switchTo().frame(0);
		WebElement frame = driver.findElement(By.id("Click"));
		frame.click();
		
		//String text=driver.findElement(By.id("Click")).getText();
		//System.out.println(text);
		
		driver.switchTo().defaultContent();
		
		//nested frame
	     
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement nframe = driver.findElement(By.id("Click1"));
		nframe.click();
		
		driver.switchTo().defaultContent();
		
		//no of frame
		
		List<WebElement> totalframe = driver.findElements(By.tagName("iframe"));
		int size = totalframe.size();
		System.out.println("total no of frame:"+ size);
		
	}

}
