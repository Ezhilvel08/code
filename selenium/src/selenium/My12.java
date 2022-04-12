package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class My12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\EZHIL\\eclipse-workspace\\selenium\\lib\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		//1,right click
		
		WebElement rightclick = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		Actions action = new Actions(driver);
		action.contextClick(rightclick).build().perform();
		
		//2,double click
		//WebElement doubleclick = driver.findElement(By.xpath("//*[@id=\'authentication\']/button"));
		//Actions act = new Actions(driver);
		//act.contextClick(doubleclick).doubleClick().perform();
	}

}
